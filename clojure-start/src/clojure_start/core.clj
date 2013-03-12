(ns clojure-start.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

;this function uses if (expression) (true return result 1) (false return result 2)
(defn isOld [age]
  "this function return whether this person is old or not"
  (if (< age 18)
    "this person is young"
    "this person is old"))

(defn sayHi [name]
  (println "Hello " name))

;forms
;the IF form
(defn isAString [ argument ]
 (if (= String (class argument)) " a string your good to go" (str " naaaah, not a string, it's a " (class argument))))