(ns romanumbers.roman)

(defn one
  []
  "I")

(defn succ
  [x]
  (def nextOf {
               "III" "IV"
               "IV" "V"
               "VIII" "IX"
               })
  (cond (= (get nextOf x nil) nil) (str x (one))
        :else (get nextOf x)))

(defn convert
  [x]
  (def succ-fns (apply comp (repeat (- x 1) succ)))
  (succ-fns (one)))
