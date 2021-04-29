(ns arcc-web.view.core
  (:require
    ["@material-ui/styles" :refer [makeStyles createMuiTheme]]
    [applied-science.js-interop :as j]
    [reagent-material-ui.components :as mui]
    [reagent.core :as r]))


;; 全体のテーマ



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
      :position "relative"
      :class-name (j/get styles :root)}

     [mui/toolbar
      [mui/typography {:class-name (j/get styles :title)
                       :variant    "h6"}
       "AtCoder Random Choice"]
      [mui/button {:class-name (j/get styles :button)}
       "使い方"]
      [mui/button {:class-name (j/get styles :button)}
       ""]]]))


(defn SubmitForm
  []
  "必要事項を入力するフォーム"
  [mui/grid
   [mui/card
    [:div
     [:form {:on-submit (fn [e]
                          (.preventDefault e))}
      [mui/form-control {:full-width true}
       [mui/input-label
        "コンテスト種別"]
       [mui/input {:type :text-input}]]]]]])


(defn ResultForm
  []
  [:div "TODO"])


;; レイアウト

(def ^:private styles
  (makeStyles
    (clj->js {:root {:direction :column
                     :display :flex
                     :height "100vh"
                     :width "100vw"}})))


(defn MainComponent
  []
  (let [show-result? false]
    [:div {:class-name (j/get styles :root)}
     [NavBar]
     [SubmitForm]
     (when (true? show-result?)
       [ResultForm])]))


