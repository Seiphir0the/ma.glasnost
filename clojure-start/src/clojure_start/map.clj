(ns clojure-start.map)

(def xs (range 0 15))

;applying the predicat (anonymous function to the list)
(map #(+ % 2) xs)

