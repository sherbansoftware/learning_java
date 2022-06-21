package Exceptions.Exception_Handling.Example;

public class ExceptionPropagationDemo {

	public void method4() {
		int a = 7;
		int b = 0;
		int c = a / b;
	}

	public void method3() {
		this.method4();
		System.out.println("After method 4 completions");
	}

	public void method2() {
		this.method3();
		System.out.println("After method 3 completions");
	}

	public void method1() {
		this.method2();
		System.out.println("After method 2 completions");
	}

	public static void main(String[] args) {
		ExceptionPropagationDemo exp =new ExceptionPropagationDemo();
		try {
			exp.method1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
