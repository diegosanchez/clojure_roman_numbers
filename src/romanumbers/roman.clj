
(ns romanumbers.roman)

(defn one
  []
  "I")

(defn five
  []
  "V")

(defn ten
  []
  "X")

(defn prev-symbol
  [x]
  (one))

(defn next-symbol
  [x]
  (one))

(defn succ
  [x]
  (cond (= x "III") (str (one) (five))
        (= x "IV") (five)
        (= x "VIII") (str (one) (ten))
        :else (str x (next-symbol x))
        ))

(defn convert
  [x]
  (cond (= x 1) (one)
        (= x 2) (succ(one))
        (= x 3) (succ(succ (one)))
        (= x 4) (succ(succ(succ(one))))
        (= x 5) (succ(succ(succ(succ(one)))))
        (= x 6) (succ(succ(succ(succ(succ(one))))))
        (= x 7) (succ(succ(succ(succ(succ(succ(one)))))))
        (= x 8) (succ(succ(succ(succ(succ(succ(succ(one))))))))
        (= x 9) (succ(succ(succ(succ(succ (succ(succ(succ(one)))))))))
        ))
