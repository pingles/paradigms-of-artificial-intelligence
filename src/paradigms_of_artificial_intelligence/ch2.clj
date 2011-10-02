(ns paradigms-of-artificial-intelligence.ch2)

;; Section 2.1
;; A grammar for a subset of english.

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

(defn sentence []
  (concat (noun-phrase) (verb-phrase)))

;; (sentence)
;; ("a" "woman" "took" "a" "woman")
