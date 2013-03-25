(ns clojure-start.require)
;BEST PRACTICE
;i would go with require since it doesn't shadow (override functions by default), no side effect
;REMARK
;1) no need to require the use of the clojure string utility function, since it's imported automatically
;2) we can emulate use by doing so (:require [my.lib :refer :all]), shadowing existing function with the same name 
(require 'clojure.string)
; still we can use an alias or a short name with the option :as
(require ['clojure.string :as 'string])
(require '(clojure  [string :as string] 
                    [test :as test]))
(require ['clojure.test :as 'test])
;the option :verbose, gives more detail about the clojure test
(require '[clojure.test :as test] :verbose)
;**BEST WAY TO IMPORT CLOJURE LIB
(require '[clojure.stacktrace :refer [print-stack-trace]]) 

;remember to quote "'" when you want to require a namespace and vector [] when you want to use an alias 
(defn split [string splitter]
  "splitter is a regular expression pattern example"
  "using clojure string utility function split given a special char and join"
   (string/split string splitter))

(defn test-equality [first-argument second-argument]
  (test/is (= first-argument second-argument)))

(string/join " " (clojure.string/split "fistName,name,age,civility" #","))

(class (string/join ";" "what's"))

(test/is (= 1 5))
