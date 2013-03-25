(ns clojure-start.import)

;import let you import Java classes for you to use into your namespace
;simple use of import
(import 'java.util.Date)
;importing many classes at once
(import '(java.util StringTokenizer GregorianCalendar))

(Date.)
(GregorianCalendar.)

;(import '(com.thoughtworks.selenium DefaultSelenium))

;(defn start-new-selenium [] 
 ; (let [s (DefaultSelenium. "localhost" 4444 "chrome*" "http://localhost:8080/wassil-web/login.xhtml")]
  ;  (.start s)
  ;  s))