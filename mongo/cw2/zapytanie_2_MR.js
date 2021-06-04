
var mapFunction = function () {
    for (i = 0; i < this.credit.length; i++) {
        emit(this.credit[i].currency, parseInt(this.credit[i].balance))
    }
}

var reduceFunction = function (key, values) {

    var sumBalance = 0;
    for (i = 0; i < values.length; i++) {
        sumBalance += values[i]
    }
    return {
    currency: key,
    value: sumBalance
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

