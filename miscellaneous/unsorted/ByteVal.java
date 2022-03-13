package miscellaneous.unsorted;

import java.util.Arrays;

public class ByteVal {

	byte[] data;

	public ByteVal(byte[] data) {
		if (data == null) {
			throw new NullPointerException();
		}
		this.data = data;
	}

	@Override
	public boolean equals(Object other) {
		if (!(other instanceof ByteVal)) {
			return false;
		}
		return Arrays.equals(data, ((ByteVal) other).data);
	}

	@Override
	public int hashCode() {
		return Arrays.hashCode(data);
	}
	
	@Override
	public String toString() {
		return "Value=" + Arrays.toString(data) + "";
	}

}