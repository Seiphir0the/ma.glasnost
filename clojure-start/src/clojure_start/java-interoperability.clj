(ns clojure-start.java-interoperability)

;calling java function with dot preceeded with java function
(.toUpperCase "wolverine")

(.trim ( str "in the darkest night in the brightest day " ". Green lantern              "))