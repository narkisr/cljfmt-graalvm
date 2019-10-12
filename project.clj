(defproject cljfmt-graalvm "0.1.0"
  :description "Clojure formatter using cljfmt built with GraalVM"
  :url "https://gitlab.com/konrad.mrozek/cljfmt-graalvm"
  :license {:name "Eclipse Public License" :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [
      [org.clojure/clojure "1.8.0"]
      [cljfmt "0.6.0"]
  ]

  :plugins [
     [io.taylorwood/lein-native-image "0.3.1"]
  ]

  :profiles {
      :uberjar {
          :jvm-opts ["-Dclojure.compiler.direct-linking=true"] 
          :aot :all
      }
  }


  :native-image {
      :name "cljfmt"
      :graal-bin "/opt/graalvm-ce-19.2.0.1/bin/native-image"
      :opts [
        "--no-server"
        "--report-unsupported-elements-at-runtime"
        "--initialize-at-build-time"
      ]
  }

  :main cljfmt-graalvm.core
)
