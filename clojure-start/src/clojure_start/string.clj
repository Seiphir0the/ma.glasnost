(ns clojure-start.string)
(require '(clojure [string :as string]))

;capitalize the first word
(clojure.string/capitalize "moukhliss")
(string/capitalize "jrindou")

(def var nil)
(string/blank? var)

(def string-seq "")
(string/blank? string-seq)

(string/trim-newline "in the darkest night
                      in the brightest day")
