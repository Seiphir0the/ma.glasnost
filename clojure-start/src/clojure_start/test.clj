(ns clojure-start.test)

(require '[clojure.test :as test] :verbose))

(test/report (test/is (= 1 1)))

;assertion
(test/is (= 1 1))

