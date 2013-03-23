(ns clojure-start.stm)

(def total-amount (ref 0))

;create an exception because you are trying to update a reference outside a transaction
(defn add-amount [amount]
  (ref-set total-amount (+ amount @total-amount)))

(defn add-amount-stm [amount]
  (dosync 
    (ref-set total-amount (+ amount @total-amount))))