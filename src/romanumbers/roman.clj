(ns romanumbers.roman)

(defn one
  []
  "I")

(defn five
  []
  "V")

(defn prev-symbol
  [x]
  (one))

(defn next-symbol
  [x]
  (one))

(defn succ
  [x]
  (str x (next-symbol x)))

(defn decc
  [x]
  (str (prev-symbol x) x))

(defn convert
  [x]
  (cond (= x 1) (one)
        (= x 2) (succ (one))
        (= x 3) (succ (succ (one)))
        (= x 4) (decc (five))
        (= x 5) (five)
        (= x 6) (succ (five))
        (= x 7) (succ (succ (five)))
        (= x 8) (succ (succ (succ (five))))
        ))
