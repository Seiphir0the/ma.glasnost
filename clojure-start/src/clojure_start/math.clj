(ns clojure-start.math)

;addition
(+ 1 5 8 9)

;substraction
(- 5 874 1)

;multiplication
(* 1 5 8 7 9 6)

;division
(/ 25 5)

;the remnant (reste) of the division 
(rem 5 5)

;return a ratio if the result of the division isn't a natural number (float)
(/ 1 2)

;you have to specify that you want the float value
(/ 1 2.0)

;0.000000000000000000000001 will be ignored, so you have
(+ 30 0.000000000000000000000001)

;by adding M for math, the value is not ignored anymore
(+ 30 0.000000000000000000000001M)