MATCH 
    (n {name: 'Darjeeling'}), 
    (m {name: 'Sandakphu'}),
    path = ShortestPath((n)-[*]-(m))
    WHERE all(r in relationships (path) WHERE r.winter = "true")
Return path