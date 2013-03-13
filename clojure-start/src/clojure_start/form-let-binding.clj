(ns clojure-start.binding)

;add a hint ^:dynamic to tell the compiler that this variable can be dynamically rebound
(def ^:dynamic x 7)

(def ^:dynamic y 3)

;sequential binding x-->99 y --> x
;return y value --> 99
(let [x 99 y x] y)

;parallele binding x --> 5 at the same time y --X (7)
;x --> 5, y --> 7
;return y value 7
(binding [x 5 y x] y)

; the range of binding is limited to the enclosing parenthsis
(binding [x 88 y x] (showSomething))

; the range of let is limited to that of the form
(let [x 88 y x] (showSomething)) 

(defn showSomething []
                 (println "Hi i'm a function that show something " x))