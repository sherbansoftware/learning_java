package lang.classes.StringBuffer.StringVsStringBuffer;


import org.junit.jupiter.api.Test;

public class StringVsStringBuffer {

	@Test
	public void testWithStringBuffer() {
		StringBuffer s3 = new StringBuffer("Value1");
		String s2 = "Value2";
		for (int i = 0; i < 100000; ++i) {
			s3.append(s2);
		}
		System.out.println(s3);  // 128 milliseconds
	}

	@Test
	public void testWithString() {
		String s3 = "Value1";
		String s2 = "Value2";
		for (int i = 0; i < 100000; ++i) {
			s3 = s3 + s2;
		}
		System.out.println(s3);   // 5 seconds
	}

}