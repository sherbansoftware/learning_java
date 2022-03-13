package Miscelanous;


public abstract class TestInterface {

	public static void main(String[] args) {
		NestedClassInterface<String> nci = new NestedClassInterface<>();
		// nci.defaultNestedSuperInterface();
		// nci.classSuperNestedInterfaceMethod();

		//Nested.staticNestedMethod();
		nci.defaultSuperNestedInterfaceMethod();
		
	}
}
