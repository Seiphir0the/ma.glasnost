(ns clojure-start.foo
  :gen-class
    :name ma.exported.function
    :methods [#^{:static true} [is-courageous [int boolean] Object]])

(defn is-courageous [number-of-achievements paradigm-shift]
  (if (and (< number-of-achievements 20) (paradigm-shift))
    (println "Indeed you have some worth my son!!")
    (println "Courage !! is it eatable !!??")))