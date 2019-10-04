(ns romanumbers.roman)

(defn convert
  [x]
  (cond (= x 1) "I"
        (= x 2) "II"
        (= x 3) "III"
        (= x 4) "IV"
        (= x 5) "V"))
