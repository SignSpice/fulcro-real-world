(ns app.mobile-ui.native-base
  "Convenience wrappers for Native Base components"
  (:require
   [com.fulcrologic.fulcro-native.alpha.components :as c :refer [react-factory]]
   ["native-base" :refer [NativeBaseProvider Box Input Button Card Spinner]]))

(def ui-body (react-factory Box))
(def ui-button (react-factory Button))
(def ui-card (react-factory Card))
(def ui-card-item (react-factory Box))
(def ui-container (react-factory NativeBaseProvider))
(def ui-content (react-factory Box))
(def ui-form (react-factory Box))
(def ui-header (react-factory Box))
(def ui-input (c/wrap-text-input (react-factory Input)))
(def ui-item (react-factory Box))
(def ui-label (react-factory Box))
(def ui-left (react-factory Box))
(def ui-right (react-factory Box))
(def ui-spinner (react-factory Spinner))
(def ui-tab (react-factory Box))
(def ui-tabs (react-factory Box))

(defn ui-heading
  "A ui-header with the specified string as the single body element"
  [title]
  (ui-header {} (ui-body {} title)))

