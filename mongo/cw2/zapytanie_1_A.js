printjson(
db.people.aggregate(
    [

        {

            $project: {
                weight: { $toDouble: "$weight" },
                height: { $toDouble: "$height" },
                sex: 1
            }
        }
        ,
        {
            $group:
                {
                    _id: "$sex",
                    avgHeight: { $avg: "$height" },
                    avgWeight: { $avg: "$weight" },
                }
        }
    ]
).toArray()
)