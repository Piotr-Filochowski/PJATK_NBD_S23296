// 4.	Wszystkie osoby, z którymi Hugo Weaving grał w tych samych filmach 

MATCH (person:Person)-[:ACTED_IN]->(movie:Movie)
WHERE EXISTS { 
   MATCH  (p:Person {name: 'Hugo Weaving'})-[:ACTED_IN]->(movie)
}
RETURN person,  movie

