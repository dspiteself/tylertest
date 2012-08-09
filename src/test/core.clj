(ns test.core
	(:use clojure.pprint clojure.data hickory.core))

(defn -main
  "I don't do a whole lot."
  [& args]
  (pprint 
  	(binding [*print-dup* true] 
  		(get (diff 
  				(as-hiccup (parse (slurp "http://firefly.cc"))) 
  				(as-hiccup (parse (slurp "http://firefly.cc/about"))))
  		2))
  	))
