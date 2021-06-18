// 6.	Listę aktorów (aktor = osoba, która grała przynajmniej w jednym filmie) wraz z ilością filmów, w których grali 

MATCH (person:Person)-[r:ACTED_IN]->(movie:Movie)
WITH person, count(r) AS howManyMovies
RETURN  person, howManyMovies

