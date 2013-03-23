(ns clojure-start.use)

;require and use are pretty the same
;but use is more powerful than require
;(*1) in this case use will shadow/replace the "replace" and "reverse" function 
;that alrady existe in clojure.core wich may be confusing
;(use 'clojure.string)

;specify that use namespace uses the clojure.string/split function
;with the option :only
;(use '[clojure.string :only [split]])
;(split "the shadow lingering in the dark alley" #" ")

;exclude the "replace" and "reverse" function so the function are not overriden
;thus not having the problem (*1), having only use function from the clojure core
(use '[clojure.string :exclude [replace reverse]])
(replace {0 "DOOM" 1 "DARKNESS" 2 "HAPPINESS" 3 "LIGHT"} [2 3])

;but if we want to use the "reverse" or "replace" function on both core and string namespace
;we need to rename them
;(use '[clojure.string :rename {replace str-replace  reverse str-reverse}])
;(str-reverse "DARKNESS")