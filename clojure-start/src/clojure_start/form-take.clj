(ns clojure-start.form-take)

;return the first n number --> (1 2 3 4 5)
(take 5 [1 2 3 4 5 6 7])

;return the availiable number if n < count(number of element in the vector) --> (1 2)
(take 5 [1 2])