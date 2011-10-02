(ns paradigms-of-artificial-intelligence.core)

;; chapter 2

(defn Article []
  (list (rand-nth ["the" "a"])))

(defn Noun []
  (list (rand-nth ["man" "ball" "woman" "table"])))

(defn Verb []
  (list (rand-nth ["hit" "took" "saw" "liked"])))

(defn noun-phrase []
  (concat (Article) (Noun)))

(defn verb-phrase []
  (concat (Verb) (noun-phrase)))

(defn sentance []
  (concat (noun-phrase) (verb-phrase)))
