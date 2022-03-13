package miscellaneous.objects;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

public class App_Objects {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
			IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException,
			InvocationTargetException, CloneNotSupportedException, IOException {

		// create class using new
		// keyword-------------------------------------------------------------------------
		// Student student = new Student();
		// System.out.println(student);

		// create new object using newInstance of class
		// Class------------------------------------------------------------------------------------------------------
		// method 1 to load a class
		// Student s2 = (Student) Class.forName("objects.Student").newInstance();
		// method 2 to load a class
		// Student s2 = Student.class.newInstance();

		// create new object using newInstance() of java.lang.reflect.Constructor
		// class--------------------------------------

		// Constructor<Student> sConstructor = Student.class.getConstructor();
		// Student s3=sConstructor.newInstance();

		// create an object by cloning
		// it---------------------------------------------------------------------------------------------
		// Student s4 = (Student) s2.clone();
		// System.out.println(s4);
		// Serialization------------------------------------------------------------------------------------------------------------------
		 FileOutputStream fos = new FileOutputStream("Student.txt");
		 ObjectOutputStream oos = new ObjectOutputStream(fos);
		 Student s = new Student();
		 oos.writeObject(s);
		// Deserialization
		FileInputStream fis = new FileInputStream("Student.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student s5 = (Student) ois.readObject();
		System.out.println(s5);

	}

}
