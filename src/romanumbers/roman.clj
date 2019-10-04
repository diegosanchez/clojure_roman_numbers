(ns romanumbers.roman)

(defn one
  []
  "I")

(defn five
  []
  "V")

(defn succ
  [x]
  (str (first x) x))

(defn prev-symbol
  [x]
  (one))

(defn decc
  [x]
  (str (prev-symbol x) x))

(defn convert
  [x]
  (cond (= x 1) (one)
        (= x 2) (succ (one))
        (= x 3) (succ (succ (one)))
        (= x 4) (decc (five))
        (= x 5) (five)))
