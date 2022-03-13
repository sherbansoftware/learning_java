package Miscelanous;

public interface NestedInterface<T> extends SuperNestedInterfaces<T>, SuperNestedInterfaces.NestedSuperInterface {

	int nr = 0;

	 void normalNestedMethod();

	default void defaultlNestedInterfaceMethod() {
		System.out.println("Default NestedInterface Method");
	}
/*
	@Override
    default	void defaultSuperNestedInterfaceMethod() {
		SuperNestedInterfaces.super.defaultSuperNestedInterfaceMethod();
	}
	*/
	static void staticNestedInterfaceMethod() {
		System.out.println("Static NestedInterface Method");
	}

	interface Nested {
		void nestedMethod();

		static void staticNestedMethod() {
			System.out.println("static NestedMethod");
		}
	}

}