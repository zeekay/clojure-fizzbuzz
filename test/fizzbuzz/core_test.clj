(ns fizzbuzz.core-test
  (:use clojure.test
        fizzbuzz.core))

(deftest test-fizz
  (is (= (fizzbuzz 3) "Fizz")))

(deftest test-buzz
  (is (= (fizzbuzz 5) "Buzz")))

(deftest test-fizzbuzz
  (is (= (fizzbuzz 15) "FizzBuzz")))
