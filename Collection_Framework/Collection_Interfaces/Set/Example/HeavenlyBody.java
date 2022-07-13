package Collection_Framework.Collection_Interfaces.Set.Example;


/*
* A Set is a Collection that === cannot contain duplicate elements ===
* The Java platform contains three general-purpose Set implementations: === HashSet, TreeSet, and LinkedHashSet ===
*  HashSet, which stores its elements in a === hash table, is the best-performing implementation ====;
*  however it makes ==no guarantees concerning the order of iteration==
*  TreeSet, which stores its elements in a red-black tree, === orders its elements based on their values; ===
*  it is substantially === slower  === than HashSet
*  LinkedHashSet, which is implemented as a hash table with a linked list running through it,
*  === orders its elements based on the order in which they were inserted into the set (insertion-order)  ===.
*
* Here's a simple but useful Set idiom. Suppose you have a Collection, c, and you want to create another Collection containing the same elements but with all duplicates eliminated. The following one-liner does the trick.

Collection<Type> noDups = new HashSet<Type>(c);
It works by creating a Set (which, by definition, cannot contain duplicates), initially containing all the elements in c. It uses the standard conversion constructor described in the The Collection Interface_Class section.

Or, if using JDK 8 or later, you could easily collect into a Set using aggregate operations:

 c.stream().collect(Collectors.toSet()); // no duplicates
* */

import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addMoon(HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }
}
