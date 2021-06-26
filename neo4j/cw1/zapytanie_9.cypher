// 9  Zestaw zapytań powodujących uzupełnienie bazy danych o film Captain America: The First Avenger wraz z 
//  uzupełnieniem informacji o 
// - reżyserze, 
// - scenarzystach i 
// - odtwórcach głównych ról (w oparciu o skrócone informacje z IMDB - http://www.imdb.com/title/tt0458339/) + 

// zapytanie pokazujące dodany do bazy film wraz odtwórcami głównych ról, scenarzystą i reżyserem. Plik SVG ma pokazywać wynik ostatniego zapytania.  




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

MATCH (a)-[r]-(b:Movie {title: 'Captain America: The First Avenger'})
RETURN  a, b, r




// można dołożyć Heugh W...
// upewnić się czy któryś z pozostałych w bazie nie jest 
