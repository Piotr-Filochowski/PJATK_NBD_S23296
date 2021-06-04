//4.	Średnie, minimalne i maksymalne BMI (waga/wzrost^2) dla osób w bazie, w podziale na narodowości; 


printjson(

    db.people.aggregate([
        {
            $project: {
                nationality: 1,
                height: { $toDouble: "$height" },
                weight: { $toDouble: "$weight" }
            }
        },
        {
            $project: {
                nationality: 1,
                height2: { $multiply: ["$height", 0.01] },
                weight: { $toDouble: "$weight" }
            }
        },
        {
            $project: {
                nationality: 1,
                height: { $toDouble: "$height2" },
                weight: { $toDouble: "$weight" },
                temp: { $multiply: ["$height2", "$height2"] }
            }
        },
        {
            $project: {
                nationality: 1,
                bmi: { $divide: ["$weight", "$temp"] }
            }
        },
        {
            $group: {
                _id: "$nationality",
                avgBMI: { $avg: "$bmi" },
                maxBMI: { $max: "$bmi" },
                minBMI: { $min: "$bmi" }
            }
        }
    ]).toArray()

)