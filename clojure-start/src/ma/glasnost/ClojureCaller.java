package ma.glasnost;

import java.io.IOException;

import org.joda.time.DateMidnight;

import clojure.lang.RT;
import clojure.lang.Var;

public class ClojureCaller {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DateMidnight dateMidnight = new DateMidnight();
		try {
			RT.loadResourceScript("form_date.clj");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Var aClojureFunction = RT.var("clojure-start.form-date", 
                "a-clojure-function");
//        aClojureFunction.invoke("an argument" "another one");
	}
}
