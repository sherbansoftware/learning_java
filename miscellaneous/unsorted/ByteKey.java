package miscellaneous.unsorted;

import java.util.Arrays;

public final class ByteKey {

	byte[] data;

	public ByteKey(byte[] data) {
		if (data == null) {
			throw new NullPointerException();
		}
		this.data = data;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(data);
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof ByteKey)) {
			return false;
		}
		ByteKey other = (ByteKey) obj;
		return Arrays.equals(data, other.data);
	}

	@Override
	public String toString() {
		return "Key=" + Arrays.toString(data) + "";
	}

}