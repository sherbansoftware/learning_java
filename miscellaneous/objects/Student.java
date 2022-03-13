package miscellaneous.objects;

import java.io.Serializable;

public class Student implements Cloneable, Serializable {

	private static final long serialVersionUID = 5601712709397887065L;
	int i;

	public Student() {

		System.out.println("This class is created");
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
