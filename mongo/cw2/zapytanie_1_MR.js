
var mapFunction = function () {
    emit(this.sex, 
    {
        height: parseInt(this.height),
        weight: parseInt(this.weight)
    }
    )
}

var reduceFunction = function (key, values) {
    var sumHeight = 0;
    var sumWeight = 0;
    for (i = 0; i < values.length; i++) {
        sumHeight += values[i].height
        sumWeight += values[i].weight   
    }
    return {
     "avgWeight": sumWeight / values.length,
     "avgHeight": sumHeight / values.length,
     "length": values.length
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

