(defproject clj-bonecp-url "0.1.0-SNAPSHOT"
  :description "Create BoneCP JDBC connection pools from URLs"
  :url "https://github.com/myfreweeb/clj-bonecp-url"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [com.jolbox/bonecp "0.7.1.RELEASE"]
                 [org.slf4j/slf4j-api "1.7.2"]]
  :profiles {:dev {:dependencies [[org.slf4j/slf4j-nop "1.7.2"]
                                  [postgresql "9.1-901-1.jdbc4"]
                                  [org.clojure/java.jdbc "0.2.3"]]}})
