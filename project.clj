(defproject clj-bonecp-url "0.1.1"
  :description "Create BoneCP JDBC connection pools from URLs"
  :url "https://github.com/myfreeweb/clj-bonecp-url"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [com.jolbox/bonecp "0.8.0.RELEASE"]
                 [org.slf4j/slf4j-api "1.7.6"]]
  :profiles {:dev {:dependencies [[org.slf4j/slf4j-nop "1.7.6"]
                                  [postgresql "9.1-901-1.jdbc4"]
                                  [org.clojure/java.jdbc "0.3.3"]]}}
  :plugins [[lein-release "1.0.0"]]
  :lein-release {:deploy-via :lein-deploy}
  :repositories [["snapshots" {:url "https://clojars.org/repo" :creds :gpg}]
                 ["releases"  {:url "https://clojars.org/repo" :creds :gpg}]])
