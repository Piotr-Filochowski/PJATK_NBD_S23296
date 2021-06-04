db.people.updateMany(
    {
        "job": "Editor"
    },
    {
        $unset: { "email": "" }
    }
    )
    
    print("Editors after update:")
    
    
    printjson(
    
    db.people.find(
    {
        "job": "Editor"
    }
    ).toArray()
    
    )