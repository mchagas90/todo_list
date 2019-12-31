(ns todo-list.database
  (:require [korma.db :as korma]))

(def db-connection-info
  (korma/mysql
   {:classname "com.mysql.jdbc.Driver"
    :subprotocol "mysql"
    :user "root"
    :password "toor"
    :subname "//db:3306/menagerie?useSSL=false"}))

; set up korma
(korma/defdb db db-connection-info)
