printjson(

    db.people.aggregate([
        {
            
                $project: {
                    first_name: 1,
                    last_name: 1,
                    date: {
                        $dateFromString: {
                            dateString: '$birth_date',
                        }
                    }
                    ,            city: "$location.city"
                }
        },
        
        
        { $match: { 
            date: {$gte: ISODate("2001-01-01T00:00:00.0Z"), $lt: ISODate("2100-12-31T00:00:00.0Z")}
        }}
        ])
    
    
    .toArray())