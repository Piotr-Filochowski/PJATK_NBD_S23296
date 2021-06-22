// Uszereguj trasy którymi można dostać się z Darjeeling na Sandakphu według dystansu 
// Znajdź wszystkie miejsca do których można dotrzeć przy pomocy roweru (twowheeler) z Darjeeling latem
MATCH p = (n {name: 'Darjeeling'}) - [*] -> (m {name: 'Sandakphu'})
WITH
    p,
    REDUCE(x = 0, a IN relationships(p) | x + a.distance)  AS duration 
ORDER BY duration DESC
RETURN  duration

