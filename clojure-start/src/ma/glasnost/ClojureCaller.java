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
			RT.loadResourceScript("form-date.clj");
		} catch (IOException e) {
			e.printStackTrace();
		}
		Var aClojureFunction = RT.var("clojure-start.form-date", 
                "");
        aClojureFunction.invoke(dateMidnight);
	}
}
