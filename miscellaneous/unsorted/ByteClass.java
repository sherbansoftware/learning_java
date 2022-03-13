package miscellaneous.unsorted;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

public class ByteClass {

	public static void main(String[] args) {

		// create an array of 100 byte elements

		byte[] data1 = new byte[100];
		for (int i = 80; i < 100; i++) {
			data1[i] = (byte) i;

			// System.out.println(i);
		}

		 Byte b =22;
		// System.out.println(b);
		
		// create an array of 1000 byte elements

		byte[] data2 = new byte[1000];

		for (int i = 0; i < 1000; i++) {
			data2[i] = (byte) i;
			// System.out.println(i);
		}

		ByteKey bk = new ByteKey(data1);
		ByteVal bv = new ByteVal(data2);

		Map<ByteKey, ByteVal> mapByte = new HashMap<>();
		mapByte.put(bk, bv);

		for (Map.Entry<ByteKey, ByteVal> entry : mapByte.entrySet()) {

			//System.out.println(entry.getKey() + " " + entry.getValue());

		}

		HashMap<ByteBuffer, ByteBuffer> bu = new HashMap<>();

		ByteBuffer u = ByteBuffer.wrap(data1);

		bu.put(ByteBuffer.wrap(data1), ByteBuffer.wrap(data2));
		// System.out.println(bu);

		for (ByteBuffer i : bu.keySet()) {
			// System.out.println(bu.get(i).hashCode());
		}
		
		  
	}
	
}
