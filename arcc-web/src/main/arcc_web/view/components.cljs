(ns arcc-web.view.components
  (:require
    ["@material-ui/styles" :refer [makeStyles]]
    [applied-science.js-interop :as j]
    [reagent-material-ui.components :as mui]))


;; ナビゲーション

(def ^:private navbar-styles
  (makeStyles
    (clj->js
      {:root   {:flex-grow 1}
       :title  {:flex-grow 1}
       :button {:color "textSecondary"
                :edge  "end"}})))


(defn NavBar
  []
  "常時上部に表示するナビゲーションバー"
  (let [styles navbar-styles]
    [mui/app-bar
     {:color    "primary"
      :position "fixed"
      :class-name (j/get styles :root)}

     [mui/toolbar
      [mui/typography {:class-name (j/get styles :title)
                       :variant    "h6"
                       :color :}
       "AtCoder Random Choice"]
      [mui/button {:class-name (j/get styles :button)}
       "使い方"]
      [mui/button {:class-name (j/get styles :button)}
       "GitHub"]]]))


(defn submit-form
  []
  [mui/grid
   [mui/card
    [:div
     "Hello"
     [:form {:on-submit (fn [e]
                          (.preventDefault e))}
      [mui/form-control {:full-width true}
       [mui/input-label
        "コンテスト種別"]
       [mui/input {:type :text-input}]]]]]])


(defn result-form
  []
  nil)
