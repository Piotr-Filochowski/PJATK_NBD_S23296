// 4.	Uszereguj porty lotnicze według ilości rozpoczynających się w nich lotów

MATCH  (n) - [:ORIGIN] -> (m)
RETURN m, count(*)
ORDER BY count(*) DESC

