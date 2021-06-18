// 2.	Wszystkie filmy, w których grał Hugo Weaving 
MATCH (person:Person {name: 'Hugo Weaving'})-[:ACTED_IN]->(movie:Movie)
RETURN movie