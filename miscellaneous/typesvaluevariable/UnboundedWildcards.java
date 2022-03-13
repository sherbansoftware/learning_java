package miscellaneous.typesvaluevariable;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;

/*
 * Note that using Collection<lang.classes.Object> as the type of the incoming parameter, c, would
not be nearly as useful; the method could only be used with an argument expression that
had type Collection<lang.classes.Object>, which would be quite rare. In contrast, the use of an
unbounded wildcard allows any kind of collection to be passed as an argument.
 */

public class UnboundedWildcards {

	static void printCollection(Collection<?> c) {
		// a wildcard collection
		for (Object o : c) {
			System.out.print(o);
		}
	}

	public static void main(String[] args) {
		Collection<String> cs = new ArrayList<>();
		cs.add("This is ");
		cs.add("a string collection");
		printCollection(cs);

	}

	public Method getMethod(Class<?>[] parameterTypes) {
		return null;
	};

}
