(ns cljfmt-graalvm.core
  (:require [cljfmt.core :as fmt])
  (:gen-class))

(defn -main
  []
  (let [s (fmt/reformat-string (slurp *in*))]
    (println s)))
