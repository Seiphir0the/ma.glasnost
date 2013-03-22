(ns clojure-start.form-do)

;do execute the expression in a sequential way and return the last value
(defn addition [first-operande seconde-operande]
  (do
   (println "LOG:.......Calculating")
   (+ first-operande seconde-operande)))

(defn addition-nodo [first-operande seconde-operande]
   (println "LOG:.......Calculating")
   (+ first-operande seconde-operande))

(let 
  [a (cons 1
           (cons 2 nil))] 
  (first a))

(let 
  [a 
   (lazy-seq (cons (do (println "one") 1) 
         (lazy-seq (cons (do (println "two") 2) nil))))] 
  (first a))

(let [a 
      (cons (do (println "one") 1) 
            (cons (do (println "two") 2) nil))] 
  (first a))