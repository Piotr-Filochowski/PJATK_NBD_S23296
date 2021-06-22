// print all nodes
Match (n {name: 'Darjeeling'})-[r]->(m {name: 'Sandakphu'})
Return n,r,m


MATCH (n:town {name: 'Darjeeling'}), (m:peak {name: 'Sandakphu'})
WITH n,m
MATCH path = ShortestPath((n)-[*...5]-(m))
Return n, r, m


Match (n )-[r]->(m )
Return n,r,m