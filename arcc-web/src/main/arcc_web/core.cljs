(ns arcc-web.core
  (:require
    [accountant.core :as accountant]
    [arcc-web.view.core :as ac.view]
    [re-frame.core :as rf]
    [reagent.dom :as rdom]
    [reitit.core :as r]))


(defn mount
  []
  (rf/clear-subscription-cache!)
  (let [root-element (.getElementById js/document "app")]
    (rdom/unmount-component-at-node root-element)
    (rdom/render ac.view/MainComponent root-element)))


(defn ^:export init
  []
  (mount))
