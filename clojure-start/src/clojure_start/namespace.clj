(ns clojure-start.namespace
  "Namespace"
  (:require [clojure.string :refer [split]]
            [clojure.test :refer :all])
  (:import  [java.util.Date]))

;BEST PRACTICE
;import and require should be used inside a namespace, and used as macro's, making it easy to read and
;understand which lib are used by the namespace
;the :refer option was added so that require overide use

