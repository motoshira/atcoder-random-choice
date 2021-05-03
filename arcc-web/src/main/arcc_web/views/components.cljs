(ns arcc-web.views.components
  (:require
   ["@material-ui/styles" :refer [makeStyles createMuiTheme]]
   [reagent.core :as r]
   [applied-science.js-interop :as j]
   [reagent-material-ui.components :as mui]))

(defn checkbox [{:keys [:label :name :on-change]}]
  [mui/form-control
   [mui/form-control-label {:control (r/as-element
                                      [mui/checkbox {:name name
                                                     :on-change (or on-change #())}])
                            :label label}]])
