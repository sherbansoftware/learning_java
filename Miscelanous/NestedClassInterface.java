package Miscelanous;



public class NestedClassInterface<T> extends SuperNestedInterfaces.classSuperNestedInterface
		implements NestedInterface<T>, NestedInterface.Nested {

	T u;

	interface InterfaceNested {
		void nestClassMethod();
	}

	@Override
	public void nestedMethod() {
		// TODO Auto-generated method stub

	}

	@Override
	public void normalNestedMethod() {
		// TODO Auto-generated method stub

	}

	@Override
	public void classSuperNestedInterfaceMethod() {
		System.out.println("from classSuperNestedInterfaceMethod()");
	}

	/*@Override
	public void defaultSuperNestedInterfaceMethod() {
		System.out.println(" for class NestedClassInterface defaultSuperNestedInterfaceMethod()");

	}*/

	@Override
	public void normalnestedSuperInterface() {
		// TODO Auto-generated method stub

	}

	@Override
	public void superNestedInterfaceMethod(T t) {
		// TODO Auto-generated method stub
		
	}

}
