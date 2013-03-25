(ns clojure-start.java-interoperability
  (:import ma.glasnost.memoymodel.Person ))

;calling java function with dot preceeded with java function
(.toUpperCase "wolverine")

(.trim ( str "in the darkest night in the brightest day " ". Green lantern              "))

(.toLowerCase "SHADOW")

;CREATING NEW INSTANCES
;creating a new instance of class Person assigned to the symbol amine
;calling constructor (String, long)
(def amine (Person. "amine" 29))

;calling constructor (String)
(def simo (Person. "Smaugel"))

;another way of calling constructor
(def superman (new Person "The house of El"))

;CALLING METHODES
;calling method
(. simo getName)

;calling method of an instance
;(. instance method/field args)
(. amine getDescription "Bioman")
(.getDescription amine "X-OR")
(let [khalil (Person.)]
  (doto khalil 
    (.setName "jrindou")
    (.setAge 28)))

;CALLING STATIC METHODS

;calling static method
;(. Class staticMethod/field args)
(. Person numberOfInstance)

;another way of calling static methods
(System/getProperty "java.vm.version")