(ns clojure-start.macro-for)

;DEFINITION: for is the mechanism for producing a sequence based on other sequence(s)

;apply a lazy sequence of x over y
;apply a to 1, and a to 2, and a to 3 and so on
(for [x ['a 'b 'c]
             y [1 2 3 4 5 6]] [x y])

(def digits (seq [1 2 3]))

(for [x1 digits x2 digits] (println x1 x2))

(for [x ['a 'b 'c]
             y [1 2 3]]
          (println x y))

;for accept :when and :while
(for [x [0 1 2 3 4 5]
             :let [y (* x 3)]
             :when (even? y)]
         y)

;for accept :while
(for [x [0 1 2 3 4 5]
             :let [y (* x 3)]
             :while (even? y)]
         y)

;bind x to the range (1 2 3 .. to 19)
;bind y to (current value x * x * x)
;bind z to (x * y)
(for [x (range 1 20)
      :let [y (* x x x)
      z (* x y)]]
      [x y z])

(iterate )