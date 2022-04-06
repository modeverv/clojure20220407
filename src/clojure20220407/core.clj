(ns clojure20220407.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))


(defn cur-per
  [test-per]
  (let
    [
     test (* 10 (Math/pow test-per 100.0))
     sa (Math/abs ^double (- 20000 test))
     ]
    (if (> 1 sa)
      (println "OK: " test " -> "  test-per)
      (cur-per (+ test-per 0.000001))
      )
    )
  )

(cur-per 1.07)
