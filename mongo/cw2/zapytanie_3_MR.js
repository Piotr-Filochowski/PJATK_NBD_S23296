
var mapFunction = function () {
    emit(this.job, 1)    
}

var reduceFunction = function (key, values) {

    var sum = 0;
    for (i = 0; i < values.length; i++) {
        sum += values[i]
    }
    return {
    job: key,
    value: sum
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

