package ma.glasnost;

import java.io.IOException;

import org.joda.time.DateMidnight;

import clojure.lang.RT;
import clojure.lang.Var;

public class ClojureCaller {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		DateMidnight dateMidnight = new DateMidnight();
		// loading clojure script from classpath
		RT.loadResourceScript("clojure_start/form-date.clj");
		// first way of invoking clojure from java
		Var myClojureFunction = RT.var("clojure-start.form-date",
				"compareWithCurrentDate");
		// another way of invoking clojure
		clojure.lang.IFn f = RT.var("clojure-start.form-date",
				"compareWithCurrentDate");
		// invoking clojue function
		Boolean anotherValue = (Boolean) f.invoke(dateMidnight);
		Boolean value = (Boolean) myClojureFunction.invoke(dateMidnight);
		System.out.println(value + " seconde value " + anotherValue);
	}
	
}
