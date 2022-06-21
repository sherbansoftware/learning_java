package Functional_Programming.Streams.Operations.Terminal_Operations.Finding.Exercise;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.List;
import java.util.Optional;

public class TicketReservation {

	private static final int CONFIRMEDLIST_LIMIT = 10;
	private static final int WAITINGLIST_LIMIT = 3;

	private List<Passenger> confirmedList = new ArrayList<>();
	private Deque<Passenger> waitingList = new ArrayDeque<>();

	public List<Passenger> getConfirmedList() {
		return confirmedList;
	}

	/**
	 * Returns true if passenger could be added into either confirmedList or
	 * waitingList. Passenger will be added to waitingList only if passengerList is
	 * full.
	 * 
	 * Return false if both passengerList & waitingList are full
	 */
	public boolean bookFlight(String firstName, String lastName, int age, String gender, String travelClass,
			String confirmationNumber) {
		if (confirmedList.size() == CONFIRMEDLIST_LIMIT && waitingList.size() == WAITINGLIST_LIMIT) {
			return false;
		}

		Passenger passenger = new Passenger(firstName, lastName, age, gender, travelClass, confirmationNumber);

		if (confirmedList.size() < CONFIRMEDLIST_LIMIT) {
			return confirmedList.add(passenger);
		} else {
			return waitingList.add(passenger);
		}
	}

	/**
	 * Removes passenger with the given confirmationNumber. Passenger could be in
	 * either confirmedList or waitingList.
	 * 
	 * If passenger is in confirmedList, then after removing that passenger, the
	 * passenger at the front of waitingList (if not empty) must be moved into
	 * confirmedList. Use poll() method (not remove()) to extract the passenger from
	 * waitingList.
	 */

	public boolean cancel(String confirmationNumber) {
		Optional<Passenger> opt = findPassenger(confirmedList, confirmationNumber);

		if (opt.isPresent()) {
			confirmedList.remove(opt.get());
			if (!waitingList.isEmpty())
				confirmedList.add(waitingList.poll());
			return true;
		} else {
			opt = findPassenger(waitingList, confirmationNumber);
			if (opt.isPresent()) {
				waitingList.remove(opt.get());
				return true;
			}
		}
		return false;
	}

	// This version uses Optional.ifPresentOrElse
	public boolean cancel2(String confirmationNumber) {
		Optional<Passenger> opt = findPassenger(confirmedList, confirmationNumber);
		opt.ifPresentOrElse(p -> {
			confirmedList.remove(p);
			if (!waitingList.isEmpty())
				confirmedList.add(waitingList.poll());
		}, () -> {
			findPassenger(waitingList, confirmationNumber).ifPresent(waitingList::remove);
		});

		return true;
	}

	
	public Optional<Passenger> findPassenger(Collection<Passenger> list, String confirmationNumber) {
		return list.stream()
				.filter(p -> p.getConfirmationNumber().equals(confirmationNumber))
				.findAny();
	}

}
