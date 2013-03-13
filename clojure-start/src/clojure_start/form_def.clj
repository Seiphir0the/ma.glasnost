(ns clojure-start.form-def)

(defn sayHi [name]
  (println "Hello " name))

;defining a structure (class in Java) --> weak typed object
;(defstruct person :name :first-name)

(defrecord Address [street city state zip])

;defining a structure --> strong typed object
;on my todo-list
