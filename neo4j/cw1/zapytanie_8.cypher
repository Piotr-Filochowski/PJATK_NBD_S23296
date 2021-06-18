// 8.	Listę filmów, w których grał zarówno Hugo Weaving jak i Keanu Reeves 

MATCH (person:Person {name: 'Hugo Weaving'})-[:ACTED_IN]->(movie:Movie)
WHERE EXISTS { 
   MATCH  (p: Person {name: 'Keanu Reeves'})-[:ACTED_IN]->(movie)
}
RETURN movie.title
