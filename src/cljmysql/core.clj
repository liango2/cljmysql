(ns cljmysql.core
(:require [clojure.java.jdbc :as sql]))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; 使用clojure连接mysql数据库
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(def db {:classname "com.mysql.jdbc.Driver"
         :subprotocol "mysql"
         :subname "//localhost:3306/hibernate"
         :user "root"
         :password "root"})

(defn list-users []
  (sql/with-connection db
    (sql/with-query-results rows
      ["select * from test"]
      (println rows))))
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
