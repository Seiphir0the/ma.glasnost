package ma.glasnost;

import java.io.StringReader;

import clojure.lang.Compiler;
import clojure.lang.RT;
import clojure.lang.Var;

public class ClojureCompiler {

	//another way of calling clojure values
	public static void main(String[] args) {
		String str = "(ns user) (defn say-hello [name]   (println \" hello \" name))";
		Compiler.load(new StringReader(str));
		// Get a reference to the say- function.
		Var sayHelloFunction = RT.var("user", "say-hello");
		// No need to catch the returned value since this function "println" return nil
		sayHelloFunction.invoke("amine");
	}

}
