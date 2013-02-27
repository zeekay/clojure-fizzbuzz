(ns fizzbuzz.core)

(defn fizzbuzz [n]
  "FizzBuzz, fizz, buzz or just nnnnnnnnn"
  (cond
    (= (mod n 15) 0) "FizzBuzz"
    (= (mod n 3) 0)  "Fizz"
    (= (mod n 5) 0)  "Buzz"
    :else n))

(defn turbo-fizz-buzz-encabulator []
  "Generate FizzBuzz sequence via the relative motion of conductors and fluxes"
  (map fizzbuzz (range 1 101)))

(defn -main [& args]
  "Run the TurboFizzBuzzEncabulator"
  (doseq [n (turbo-fizz-buzz-encabulator)]
    (println n)))
