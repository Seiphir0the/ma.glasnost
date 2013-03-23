(defproject clojure-start "0.1.0-SNAPSHOT"
  ; a brief description of the project
  :description "My first clojure application"
  ;the url of the application
  :url "http://example.com/FIXME"
  ; the license you are using apache etc
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  ;how to add dependencies
  ;look for them on https://clojars.org
  ;syntaxe it's quite similare to Maven's 
  ;[group-id/artifact-id "version"]  
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [org.clojars.nathell/clojure-contrib "1.2.0"]
                 [joda-time/joda-time "2.0"]
                 [clj-time "0.4.5"]])
