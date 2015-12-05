(ns reader-web-app.models.books
  (:use korma.core)
  (:require [reader-web-app.entities :as e]))

(defn find-all []
  (select e/books))

(defn find-by [field value]
  (first
    (select e/books
      (where {field value})
      (limit 1))))

(defn find-by-id [id]
  (find-by :id id))

(defn find-all-by [field value]
  (select e/books
    (where {field value})))

(defn create-book []
  (insert e/books
    (values {:title "Test"})))