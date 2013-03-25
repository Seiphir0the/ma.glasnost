(ns clojure-start.collection
  (:require [clojure.set :refer :all]))

;filter count empty? first last ffirst nth map reduce interleave take
;interpose partition

;defining a list of element from 1 to 19
(def xs (range 1 20))

;return the first element
;return in this case 1
(first xs)

;return the last element
;return in this case 19
(last xs)

;return all the element apart from the first one
(rest xs)

;filter by even values
(filter even? xs)

;filter by differente values
(filter odd? xs)

;filter the values using the predicat (anonymous function)
(filter #(= % 5) xs)

;calculate the sum of all the values that can be diveded by three
;(sum (filter #(zero? (rem % 3)) xs))

;define a list named "my-list" with data
(def my-list (list 1 2 3 4))

;return the element based on it's position/value/regular expression
(nth my-list 2)

;define a map named "my-map" with key values
(def my-map (hash-map 1 "first-value" 2 "second-value" 3 "third value"))


(get my-map 2)
;result "second-value"

;is the same as get map value
(my-map 2)
;result "second-value"

;return the element at the specified position and those below it
(take 2 my-map)
;result ([1 "first-value"] [2 "second-value"])

(def xy (list xs 2 3 4))

;give back the first element of the first list
;example (def first-list (list 1 2 3))
;(def my-list  (list first-list 45 89 100))
;--> content of my-list is : (1 2 3) 45 89 100)
;(ffirst my-list) return 1
(ffirst xy)

;count the number of element inside a list
(count xs)

;(reduce function list) 
;reduce apply the function to the first element and the second then applying the function to their result
;and to the third element and so on...
(reduce + xs)

;% act as the current element of the list
;map apply the annonymous function "#(+ % 2)" to each element of the list
(map #(+ % 2)  xs)

;merge the two list into one 
;result [1 2 3 4 5 5]
(into [1 2 3] [4 5 5])

;result [1 2 3]
(into [1 2 3] '())

;will merge the two maps into one, if a key exist in both list, the one from the second list prevails
(merge {1 "some value" 2 "another value"} {2 "the second value"})
;result {1 "some value", 2 "the second value"}

;return a partition of a list passed as an argument using the given step
(partition 3 xs)
;result ((1 2 3) (4 5 6) (7 8 9) (10 11 12) (13 14 15) (16 17 18))

;defining a list of words
(def xz (list "bonjour" "tout" "le" "monde"))

;add a lazy sequence to each element of a list passed as an argument
(interpose " " (reduce str xz))

(defn give-rest [xs]
  (first (rest xs)))

;calculate the sum of the element inside a list
(defn sum [xs]
  (if (empty? xs) 
    0
    (+ (first xs)(sum (rest xs)))))

;return a list containing the size of word inside a list passed as an argument
(defn size-of-words [xz]
  (if (empty? xz)
    '()
  (cons
    (count(first xz))
    (size-of-words (rest xz)))))

;calculate the average of a list passed as an argument
(defn avg [xz]
 (/ (reduce + xz) (count xz)))
 
;function filtre
(defn get-divided-by-three [xs]  
  (if (empty? xs)
    '()
     (into
      (if (= (rem (first xs) 3) 0) [(first xs)] '())
      (get-divided-by-three (rest xs)))))

;recursive call
;this function return a map, in it the keys are xs values and their values are xs square values xs (value)² 
(defn get-map-square-values [xs]
(if (empty? xs)
   '{}
   (into 
     {(first xs)  (map (* (first xs) (first xs)) xs)}
       (get-map-square-values (rest xs)))))

;return a map with keys mapped to their respective values
;NOTE: that this sample do the same as "get-map-square-values"
(zipmap xs  (map #(* % %) xs))
 
;difference between "apply" and "reduce" is that ("apply" will apply the function to the element on the
;list in the same level, reduce works per pair
(apply hash-map 
         (interleave xs (map #(* % %) xs)))

;this function show the cube value of a number on the list that his square value is under 21
(reduce + (map #(* % % %) (filter #(< (* % %) 21) xs)))

(defn remove-items [xs remnant]
  (if (zero? remnant)
    xs
    (remove-items (rest xs) (dec remnant))))

;evolved version of remove-item with recur
;using tail call optimization (tco)
(defn remove-items-evolved [xs remnant]
  (if (zero? remnant)
    xs
    (recur (rest xs) (dec remnant))))

;evolved version :)
(defn partition-function-evolved [step xs]
 (if (< (count xs) step)
   [] 
   (conj
     (partition-function-evolved step  
                           (remove-items xs step))
     (take step xs))))

;working version of partition function
(defn partition-function-working [step xs]
  (if (< (count xs) step)
  '()
  (cons (take step xs) (lazy-seq (partition-function-evolved step (remove-items xs step))))))

;partition function, re-invented for the fun and someday for the profit
;deprecated
(defn partition-function [step xs]
 (if (< (count xs) step)
   '()
   (into
       (list (take step xs))
       (partition-function step  
                           (lazy-seq 
                             '() 
                             (difference 
                               (set  xs) 
                                         (set (take step xs))))))))