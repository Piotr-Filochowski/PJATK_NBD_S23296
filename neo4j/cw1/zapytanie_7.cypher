// 7.	Listę osób, które napisały scenariusz filmu, 
// które wyreżyserowały wraz z tytułami takich filmów (koniunkcja – ten sam autor scenariusza i reżyser) 

MATCH (person:Person)-[:DIRECTED]->(movie:Movie)
WHERE EXISTS { 
   MATCH  (person)-[:WROTE]->(movie)
}
RETURN  person, movie.title
