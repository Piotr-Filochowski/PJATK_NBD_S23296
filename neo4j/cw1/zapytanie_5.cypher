// 5.	Wszystkie filmy osób, które grały w Matrix

MATCH (person:Person)-[:ACTED_IN]->(movie:Movie)
WHERE EXISTS { 
   MATCH  (person)-[:ACTED_IN]->(m:Movie {title: 'The Matrix'})
}
RETURN  movie

