(ns todo-list.handler
  (:require [compojure.core :refer :all]
      [compojure.route :as route]
      [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
      [compojure.handler :as handler]
      [ring.middleware.json :as json]
      [ring.util.response :refer [response]]
      [todo-list.query :refer-list :all :as repository]))

(defroutes app-routes
  (GET "/api/todos" []
       (response (repository/get-todos)))
  (GET "/api/todos/:id" [id]
       (response (repository/get-todo (Integer/parseInt id))))
  (POST "/api/todos" {:keys [params]}
        (let [{:keys [title description]} params]
          (response (repository/add-todo title description))))
  (PUT "/api/todos/:id" [id title description]
       (response (repository/update-todo (Integer/parseInt id) title description)))
  (DELETE "/api/todos/:id" [id]
          (response (repository/delete-todo (Integer/parseInt id))))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (-> (handler/api app-routes)
      (json/wrap-json-params)
      (json/wrap-json-response)))
