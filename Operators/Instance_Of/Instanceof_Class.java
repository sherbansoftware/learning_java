package Operators.Instance_Of;

public class Instanceof_Class {
	public static void main(String[] args) {

		int i = 10;
		//int n = i++ % 5;
		int v = ++i % 5;

		//System.out.println(v);
		int bitmask = 0x000F;
		int val = 0x2222;
		// prints "2"
		// System.out.println(val & bitmask);

		Parent parent = new Parent();
		Parent obj2 = new Child();
		Child obj3 = new Child();
		MyInterface mInterface = new Child();


		System.out.println("parent instanceof Parent: " + (parent instanceof Parent));
		System.out.println("obj2 instanceof Child: " + (obj2 instanceof Child));
		System.out.println("obj3 instanceof Child: " + (obj3 instanceof Child));
		System.out.println("mInterface instanceof Child: " + (mInterface instanceof Child));
		System.out.println("parent instanceof MyInterface: " + (parent instanceof MyInterface));
		System.out.println("obj2 instanceof Parent: " + (obj2 instanceof Parent));

//		System.out.println("obj2 instanceof MyInterface: " + (obj2 instanceof MyInterface));
//
//
//		//mInterface.smile();
//		if (mInterface instanceof Child) {
//			System.out.println(mInterface.toString() + " is instance Child");
//		} else {
//			System.out.println(mInterface + " is not instance Child");
//		}
	}
}
