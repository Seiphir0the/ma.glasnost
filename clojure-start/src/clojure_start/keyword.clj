(ns clojure-start.keyword)

;syntaxe of keyword is (colon name of the keyword): example --> :key 
(def my-map {:key "value"})

;this syntaxe
(get my-map :key)

;is the same as this one
(my-map :key)

;and that one
(:key my-map)