
// zapytanie 1

MATCH (n:town {name: 'Darjeeling'}), (m:peak {name: 'Sandakphu'})
WITH n,m
MATCH path = ShortestPath((n)-[*]-(m))
Return path


// zapytanie 2

MATCH 
    (n {name: 'Darjeeling'}), 
    (m {name: 'Sandakphu'}),
    path = ShortestPath((n)-[*]-(m))
    WHERE all(r in relationships (path) WHERE r.winter = "true")
Return path


// zapytanie 3

MATCH p = (n {name: 'Darjeeling'}) - [*] -> (m {name: 'Sandakphu'})
WITH
    p,
    REDUCE(x = 0, a IN relationships(p) | x + a.distance)  AS duration 
ORDER BY duration DESC
RETURN  duration


// zapytanie 4

MATCH  (n) - [:ORIGIN] -> (m)
RETURN m, count(*)
ORDER BY count(*) DESC


// zapytanie 5

// Relacja pomocnicza:

MATCH 
r1 =(airportB) <- [:DESTINATION] - (flight:Flight) - [:ORIGIN] -> (airportA:Airport),
r2 = (ticket:Ticket) - [:ASSIGN] -> (flight)
CREATE (airportA) - [r:FLIGHT_HELPER {ticketPrice: ticket.price}] -> (airportB) 

// zapytanie:
MATCH
r = (airportA:Airport) - [flight:FLIGHT_HELPER *..3] -> (airportB:Airport {name: 'LAX'})
WITH
r,
REDUCE(x = 0, a IN relationships(r) | x + a.ticketPrice)  AS sumTicketPrice
RETURN r, min(sumTicketPrice)
