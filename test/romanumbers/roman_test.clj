(ns romanumbers.roman-test
  (:require [clojure.test :refer :all]
            [romanumbers.roman :refer :all]))

(deftest convert_number_1_to_I
  (testing "1 -> I"
    (is
     (= "I"
        (convert 1)))))

(deftest convert_number_2_to_II
  (testing "1 -> I"
    (is
     (= "II"
        (convert 2)))))
