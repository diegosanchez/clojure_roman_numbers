(ns romanumbers.roman)

(defn one
  []
  "I")
(conj)
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
  (cond (= x 1) (one)
        (= x 2) (succ(one))
        (= x 3) (succ(succ(one)))
        (= x 4) (succ(succ(succ(one))))
        (= x 5) (succ(succ(succ(succ(one)))))
        (= x 6) (succ(succ(succ(succ(succ(one))))))
        (= x 7) (succ(succ(succ(succ(succ(succ(one)))))))
        (= x 8) (succ(succ(succ(succ(succ(succ(succ(one))))))))
        (= x 9) (succ(succ(succ(succ(succ(succ(succ(succ(one)))))))))
        ))
