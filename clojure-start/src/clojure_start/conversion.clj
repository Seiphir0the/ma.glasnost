(ns clojure-start.conversion)

;convet a list into a vector
(into [] '(1 2 3 4))

;convert a list into a set
(into #{} '(1 2 3 4))

;concert list of vector into a map
(into {} '([1 "firstValue"] [2 "secondValue"]))

;convert vector  [] into list
(lazy-seq '() [1 2 3 4])