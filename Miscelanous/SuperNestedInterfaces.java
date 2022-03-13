package Miscelanous;


public interface SuperNestedInterfaces<T> {
	int v = 4;
	int s = v*v;

	@Override
	public int hashCode();

	void superNestedInterfaceMethod(T t);

	static void staticNestedInterfaceMethod() {
		System.out.println("From statictSuperNestedInterfaceMethod");
	}

	default void defaultSuperNestedInterfaceMethod() {

		System.out.println("From defaultSuperNestedInterfaceMethod");
	}

	interface NestedSuperInterface {
		void normalnestedSuperInterface();

		
	}

	public class classSuperNestedInterface {

		public void classSuperNestedInterfaceMethod() {

			System.out.println("from classSuperNestedInterfaceMethod()");
		}
	}
}
