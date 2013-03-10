(ns clojure-start.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn isOld [age]
  "this function return whether this person is old or not"
  (if (< age 18)
    "this person is young"
    "this person is old"))