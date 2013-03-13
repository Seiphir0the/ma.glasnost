(ns clojure-start.form-if)

;forms
;the IF form
(defn isString [ argument ]
 (if (= String (class argument)) " a string your good to go" (str " naaaah, not a string, it's a " (class argument))))

;this function uses if (expression) (true return result 1) (false return result 2)
(defn isOld [age]
  "this function return whether this person is old or not"
  (if (< age 18)
    "this person is young"
    "this person is old"))

;defining a vector
(def vector [1 5 8 22])

;return the string at the specified position if no value exist return an "index out of bound, my friend"
(defn get-result-at-position [position]
  (if (= (get vector position) nil)
           ("index out of bound, my friend") ;then
           (get vector position)))           ;else

(defn get-result-at-position-fn [vect position]
  (if (= (get vect position) nil)
           ("index out of bound, my friend") ;then
           (get vect position)))           ;else


(def doctors {:Pasteur "vaccin de la rage" :Jener "vaccin de la variole"})