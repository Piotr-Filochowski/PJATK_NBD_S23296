
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
        sumBalance: sumBalance,
        avgBmi: sumBalance / values.length
    }
}

db.people.mapReduce(
    mapFunction,
    reduceFunction,
    {
        query: { sex: "Female", "nationality": "Poland" },
        out: "outCollection"
    }
)


printjson(
    db.getCollection("outCollection").find({}).toArray()
)

