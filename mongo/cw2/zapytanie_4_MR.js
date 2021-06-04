
var mapFunction = function () {
    var height = parseInt(this.height) / 100
    var weight = parseInt(this.weight)
    var bmi = weight / (height * height)
    emit(this.nationality, bmi)
}

var reduceFunction = function (key, values) {

    var sumBmi = 0;
    var maxBmi = 0;
    var minBmi = 10000;
    for (i = 0; i < values.length; i++) {
        sumBmi += values[i]
        if (values[i] < minBmi) {
            minBmi = values[i]
        }
        if (values[i] > maxBmi) {
            maxBmi = values[i]
        }
    }
    return {
        nationality: key,
        maxBmi: maxBmi,
        minBmi: minBmi,
        avgBmi: sumBmi / values.length
    }
}

db.people.mapReduce(
    mapFunction,
    reduceFunction,
    { out: "outCollection" }
)


printjson(
    db.getCollection("outCollection").find({}).toArray()
)

