(ns clojure-start.zipper
  (use [clojure.zip :rename {next zip-next, replace zip-replace}]))

;declaring a zip-map, a tree data structure,
;trees are best suited when we want to change functinally datatstructure without removing items from the list
(def my-zip-map (zipmap  [:a :b :c] ["firstValue" "secondeValue" "thirdValue"]))

