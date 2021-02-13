(ns bowling.core-test
  (:require [clojure.test :refer [deftest testing is]]
            [bowling.core :refer [score]]))

(deftest bowling

  (testing "all misses"
    (is (=   0 (score [0 0, 0 0, 0 0, 0 0, 0 0, 0 0, 0 0, 0 0, 0 0, 0 0]))))

  (testing "all ones"
    (is (=  20 (score [1 1, 1 1, 1 1, 1 1, 1 1, 1 1, 1 1, 1 1, 1 1, 1 1]))))

  (testing "one spare"
    (is (=  16 (score [5 5, 3 0, 0 0, 0 0, 0 0, 0 0, 0 0, 0 0, 0 0, 0 0]))))

  (testing "one strike"
    (is (=  24 (score [10 , 3 4, 0 0, 0 0, 0 0, 0 0, 0 0, 0 0, 0 0, 0 0]))))

  (testing "perfect game"
    (is (= 300 (score [10 , 10 , 10 , 10 , 10 , 10 , 10 , 10 , 10 , 10 10 10]))))

  (testing "sample score"
    (is (= 133 (score [1 4, 4 5, 6 4, 5 5, 10 , 0 1, 7 3, 6 4, 10 , 2 8 6])))))
