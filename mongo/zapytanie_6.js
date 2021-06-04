db.people.insert(
    { 
        "sex" : "Male", 
        "first_name" : "Piotr", 
        "last_name" : "Filochowski", 
        "job" : "Programmer", 
        "email" : "s23296@pjwstk.edu.pl", 
        "location" : {
            "city" : "Warsaw", 
            "address" : {
                "streetname" : "Wiejska", 
                "streetnumber" : "4/6/8"
            }
        }, 
        "description" : "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean vestibulum, magna non maximus tempus, dolor nibh malesuada quam, vel venenatis ipsum turpis eu dolor.", 
        "height" : "177.38", 
        "weight" : "100.81", 
        "birth_date" : "1997-02-21T02:55:03Z", 
        "nationality" : "Poland", 
        "credit" : [
            {
                "type" : "switch", 
                "number" : "6759888939100098699", 
                "currency" : "PL", 
                "balance" : "5117.06"
            }
        ]
    }
    )


printjson(

    db.people.find(
        {
                    first_name: "Piotr",
                    last_name: "Filochowski"
        }
        )
    .toArray())