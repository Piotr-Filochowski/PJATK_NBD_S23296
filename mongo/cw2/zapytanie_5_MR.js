
var mapFunction = function () {
    for (i = 0; i < this.credit.length; i++) {
        
        var out = {
            count: 1,
            sumBalance: parseFloat(this.credit[i].balance)
        }
        emit(this.credit[i].currency, out)
    }
}

var reduceFunction = function (key, values) {

    var sumBalance = 0;
    var sumCount= 0;
    for (i = 0; i < values.length; i++) {
        sumBalance += values[i].sumBalance
        sumCount += values[i].count; 
    }
    return {
        sumBalance: sumBalance,
        count: sumCount
    }
}

var finalize2 = function (key, reducedValue) {
    return {
       sumBalance: reducedValue.sumBalance,
       avgBalance: reducedValue.sumBalance / reducedValue.count,
    }
}

printjson(
    db.people.mapReduce(
        mapFunction,
        reduceFunction,
        {
            out: { inline: 1 },
            query: { sex: "Female", "nationality": "Poland" },
            finalize: finalize2
        }
    )
)

// 5.	Średnia i łączna ilość środków na kartach kredytowych kobiet narodowości polskiej w podziale na waluty. ,