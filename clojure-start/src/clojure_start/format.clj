(ns clojure-start.format)

;it's all about formatting 

;will insert the second word in the char sequence, insert string
(format "Hello, %s!" "Dave")  

;same as earlier, with the slight difference that now the second word is in capital letters
(format "Hello, %S!" "Dave")

;insert numbers
(format "%d" 7)

;adding 5 space to a number
(format "%5d" 6)

;look out for all the matching expression in the seconde argument
(re-seq #"[a-z]+" "bA1B3Ce ")
 
;padding with zero, the size of the number is 10 digit
(format "%010d" 5432)

;format to float
(format "%.3f" (double 2))