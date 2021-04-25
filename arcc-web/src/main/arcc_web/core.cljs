(ns arcc-web.core
  (:require
    [arcc-web.view :as ac.view]
    [reagent.dom :as rdom]))


(defn ^:export init
  []
  (rdom/render
    [ac.view/main-component]
    (.-body js/document)))
