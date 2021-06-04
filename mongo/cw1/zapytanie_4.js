printjson(

    db.people.find(
        {
            $expr:
                {
                    $gte: [
                        { $toDouble: "$weight" }, 68.0
                    ]
                },
            $expr:
                {
                    $lt: [
                        { $toDouble: "$weight" }, 71.5
                    ]
                }
    
    
        }
    )
    
    
    .toArray())