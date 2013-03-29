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
  ;inserting function documentation
  "this function get the value at the specified position"
  (if (= (get vector position) nil)
           ("index out of bound, my friend") ;then
           (get vector position)))           ;else

(def doctors {:Pasteur "vaccin de la rage" :Jener "vaccin de la variole"})

(def pays {:france 18 :maroc 25})

;or sample 
(defn is-adult [country age name]
  (class age)
  (if (or (> age (pays country)) (= (.toLowerCase name) "amine"))
    (println (str "if you realy leave in " country " Your an adult now my dear"))
    (println (str "Sorry to break it to you but your still young"))))

;and sample
(defn is-courageous [number-of-achievements paradigm-shift]
  (if (and (< number-of-achievements 20) (paradigm-shift))
    (println "Indeed you have some worth my son!!")
    (println "Courage !! is it eatable !!??")))
