(ns clojure-start.form-conj-cons)

;conjoin to an existing list (add to the of the list)
(conj [1 2 3 4] 5)

;construct a sequence (add to the begining of the sequence)
(cons 5 [1 2 3 4])

;return a vector 
(class (conj [1 2 3 4] 5))

;return a sequence
(class (cons 5 [1 2 3 4]))

;you can add many items to the vector with conj
(conj [1 2 3] 4 5 6 7)
