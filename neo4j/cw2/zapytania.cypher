// print all nodes
Match (n {name: 'Darjeeling'})-[r]->(m {name: 'Sandakphu'})
Return n,r,m


MATCH (n:town {name: 'Darjeeling'}), (m:peak {name: 'Sandakphu'})
WITH n,m
MATCH path = ShortestPath((n)-[*...5]-(m))
Return n, r, m


Match (n )-[r]->(m )
Return n,r,m


// przykladowe lotnisko
SEA:Airport { name: 'SEA'}

// przykladowy lot 
(f0:Flight {
  date:'11/30/2015 04:24:12', 
  duration:218, 
  distance:1721, 
  airline:'19977'
})

(f0)-[:ORIGIN]->(SEA), 
(f0)-[:DESTINATION]->(ORD)

// przykladowy ticket
(t1f0:Ticket {
  class:'economy', 
  price:1344.75
}), 

(t1f0)-[:ASSIGN]->(f0)

// relacje pomocnicze:
// HELPER_FLIGHT 
airportA - [relationship: ] -> airportB
// za ile można polecieć max i min 


// zwróć mi takie airporty pomiędzy którymi jest lot 
MATCH r1 =(airportB) <- [:DESTINATION] - (flight:Flight) - [:ORIGIN] -> (airportA:Airport)
RETURN airportA, airportB


MATCH r1 =(airportB) <- [:DESTINATION] - (flight:Flight) - [:ORIGIN] -> (airportA:Airport)
WITH
    r1,
    (:Ticket) - [:ASSIGN] -> (flight) AS myTicket

RETURN r1, myTicket
