(ns romanumbers.roman)

(defn convert
  [x]
  (cond (= x 1) "I"
        (= x 2) "II"))
