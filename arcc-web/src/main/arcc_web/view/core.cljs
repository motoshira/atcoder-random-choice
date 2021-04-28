(ns arcc-web.view.core
  (:require
    [arcc-web.view.components :as ac.c]
    [reagent.core :as r]))


(def ^:private styles nil)


(defn main-component
  []
  (let [show-result? false]
    [:<>
     [ac.c/NavBar]
     [ac.c/submit-form]
     (when (true? show-result?)
       [ac.c/result-form])]))
