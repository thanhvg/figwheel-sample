(ns figmacs.main
  #_(:require [reagent.core :as r]))
(enable-console-print!)
(print "yay yay")
#_
(r/render [:p "Yay"]
          (js/document.getElementById "app"))
