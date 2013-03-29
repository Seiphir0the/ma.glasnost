(ns clojure-start.tco)

;tco for "tail call optimization", it doesn't use the stack trace (like recurvsive call) so it's more optimized than
;you can use recur only if the last expression is a recursive call

;using tail call optimization (tco)
(defn remove-items-evolved [xs remnant]
  (if (zero? remnant)
    xs
    (recur (rest xs) (dec remnant))))