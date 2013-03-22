(ns clojure-start.string)
; no need to require the use of the clojure string utility function, since it's imported automatically
(require 'clojure.string)
; still we can use an alias or a short name 
(require ['clojure.string :as 'string])
(require '(clojure  [string :as string] 
                    [test :as test]))
(require ['clojure.test :as 'test])
;give more detail about the clojure test
(require '[clojure.test :as test] :verbose))

;remember to quote "'" when you want to require a namespace and vector when you want to use an alias 
;using clojure string utility function split given a special char and join
(defn split [string splitter]
  "splitter is a regular expression pattern example"
   (string/split string splitter))

(defn test-equality [first-argument second-argument]
  (test/is (= first-argument second-argument)))

(string/join " " (clojure.string/split "fistName,name,age,civility" #","))

(class (string/join ";" "what's"))

(test/is (= 1 5))