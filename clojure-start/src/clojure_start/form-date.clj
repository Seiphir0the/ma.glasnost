(ns clojure-start.form-date)
 (:require [clj-time.core :as time])


(defn compare-to-current-date [incoming-date]
  after? (local-now))