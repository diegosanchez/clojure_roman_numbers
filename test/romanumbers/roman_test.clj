
(ns romanumbers.roman-test
  (:require [clojure.test :refer :all]
            [romanumbers.roman :refer :all]))

(deftest convert-number-1-to-I
  (testing "1 -> I"
    (is
     (= "I"
        (convert 1)))))

(deftest convert-number-2-to-II
  (testing "2 -> II"
    (is
     (= "II"
        (convert 2)))))

(deftest convert-number-3-to-III
  (testing "3 -> III"
    (is
     (= "III"
        (convert 3)))))

(deftest convert-number-4-to-IV
  (testing "4 -> IV"
    (is
     (= "IV"
        (convert 4)))))


(deftest convert-number-5-to-V
  (testing "5 -> V"
    (is
     (= "V"
        (convert 5)))))

(deftest convert-number-6-to-VI
  (testing "6 -> VI"
    (is
     (= "VI"
        (convert 6)))))

(deftest convert-number-7-to-VII
  (testing "7 -> VII"
    (is
     (= "VII"
        (convert 7)))))

(deftest convert-number-8-to-VIII
  (testing "8 -> VIII"
    (is
     (= "VIII"
        (convert 8)))))

(deftest convert-number-9-to-IX
  (testing "9 -> IX"
    (is
     (= "IX"
        (convert 9)))))
