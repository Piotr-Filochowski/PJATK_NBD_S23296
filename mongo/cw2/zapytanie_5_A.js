//4.	Średnie, minimalne i maksymalne BMI (waga/wzrost^2) dla osób w bazie, w podziale na narodowości; 


printjson(

    db.people.aggregate([
        {
            $match: {
                nationality: "Poland",
                sex: "Female"
            }
        },
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
                avgAmount: { $avg: "$balance" },
            }
        }
    ]).toArray()

)