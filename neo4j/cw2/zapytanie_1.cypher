MATCH (n:town {name: 'Darjeeling'}), (m:peak {name: 'Sandakphu'})
WITH n,m
MATCH path = ShortestPath((n)-[*..5]-(m))
Return path