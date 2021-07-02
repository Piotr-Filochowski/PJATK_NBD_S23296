// zapytanie 1
MATCH ()-[]->(movie:Movie)
RETURN movie

// zapytanie 2
MATCH (person:Person {name: 'Hugo Weaving'})-[:ACTED_IN]->(movie:Movie)
RETURN movie

// zapytanie 3
MATCH (person:Person)-[:DIRECTED]->(movie:Movie)
WHERE EXISTS { 
   MATCH  (p:Person {name: 'Hugo Weaving'})-[:ACTED_IN]->(movie)
}
RETURN person, movie

// zapytanie 4
MATCH (person:Person)-[:ACTED_IN]->(movie:Movie)
WHERE EXISTS { 
   MATCH  (p:Person {name: 'Hugo Weaving'})-[:ACTED_IN]->(movie)
}
RETURN person,  movie

// zapytanie 5
MATCH (person:Person)-[:ACTED_IN]->(movie:Movie)
WHERE EXISTS { 
   MATCH  (person)-[:ACTED_IN]->(m:Movie {title: 'The Matrix'})
}
RETURN  movie

// zapytanie 6
MATCH (person:Person)-[r:ACTED_IN]->(movie:Movie)
WITH person, count(r) AS howManyMovies
RETURN  person, howManyMovies

// zapytanie 7
MATCH (person:Person)-[:DIRECTED]->(movie:Movie)
WHERE EXISTS { 
   MATCH  (person)-[:WROTE]->(movie)
}
RETURN  person, movie.title


// zapytanie 8
MATCH (person:Person {name: 'Hugo Weaving'})-[:ACTED_IN]->(movie:Movie)
WHERE EXISTS { 
   MATCH  (p: Person {name: 'Keanu Reeves'})-[:ACTED_IN]->(movie)
}
RETURN movie.title


// zapytanie 9
// movie
CREATE (movie:Movie { title: 'Captain America: The First Avenger', tagline: 'When patriots become heroes'})

// actor
CREATE (chris:Person { name: 'Chris Evans',born: 1981 })
CREATE (chris) -[:ACTED_IN]->(movie)
CREATE (sam:Person { name: 'Samuel L. Jackson', born: 1948 })
CREATE (sam) -[:ACTED_IN]->(movie)

// director
CREATE (joe:Person { name: 'Joe Johnston', born: 1950 })
CREATE (joe) -[:DIRECTED]->(movie)
// writer
CREATE (christopher:Person { name: 'Christopher Markus', born: 1970 })
CREATE (christopher) -[:WROTE]->(movie)
CREATE (stephen:Person {name: 'Stephen McFeely', born: 1970 })
CREATE (stephen) -[:WROTE]->(movie)


MATCH (hugo:Person {name: 'Hugo Weaving'}), (captAmrMovie:Movie { title: 'Captain America: The First Avenger' })
CREATE (hugo) - [ACTED_IN] -> (captAmrMovie)

MATCH (a)-[r]-(b:Movie {title: 'Captain America: The First Avenger'})
RETURN  a, b, r
