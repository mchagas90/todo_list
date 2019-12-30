(ns todo-list.database
  (:require [korma.db :as korma]))

(def db-connection-info
  (korma/mysql
   {:classname "com.mysql.jdbc.Driver"
    :subprotocol "mysql"
    :user "root"
    :password "toor"
    :subname "//localhost:3306/menagerie"}))

; set up korma
(korma/defdb db db-connection-info)