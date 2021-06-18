// 3.	Reżyserzy filmów, w których grał Hugo Weaving 
MATCH (person:Person)-[:DIRECTED]->(movie:Movie)
WHERE EXISTS { 
   MATCH  (p:Person {name: 'Hugo Weaving'})-[:ACTED_IN]->(movie)
}
RETURN person, movie


