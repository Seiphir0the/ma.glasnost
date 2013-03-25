(ns clojure-start.form-date
 (:require [clj-time.core :refer [after?]]
           [clj-time.local :refer [local-now]]))

(defn compareWithCurrentDate [incoming-date]
  (after? incoming-date (local-now)))

(after? (date-time 1986 10 14) (local-now) )