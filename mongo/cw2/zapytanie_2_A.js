printjson(

    db.people.aggregate([

        {
            $unwind: "$credit"
        },
        {
             $replaceRoot: { newRoot: "$credit" } 
        },
        {
            $project: {
                currency: 1,
                balance: { $toDouble: "$balance" }
            }
        },
        {
            $group: {
                _id: "$currency",
                  totalAmount: { $sum: "$balance" },
            }
        }
        ]).toArray()

)