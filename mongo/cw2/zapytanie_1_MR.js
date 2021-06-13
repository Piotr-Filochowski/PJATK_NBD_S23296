var mapFunction = function () {
    emit(
        this.sex,
        {
            height: parseFloat(this.height),
            weight: parseFloat(this.weight),
            count: 1
        }
    )
}

var reduceFunction = function (key, values) {
    var sumHeight = 0;
    var sumWeight = 0;
    var sumCount = 0;
    for (i = 0; i < values.length; i++) {
        sumHeight += values[i].height
        sumWeight += values[i].weight
        sumCount += values[i].count
    }
    return {
        "height": sumHeight,
        "weight": sumWeight,
        "count": sumCount
    }
}


var finalize2 = function (key, reducedValue) {
    return {
        sex: key,
        avgHeight:  reducedValue.height / reducedValue.count,
        avgWeight:  reducedValue.weight / reducedValue.count
    }
}

db.people.mapReduce(
    mapFunction,
    reduceFunction,
    {
        out: { inline: 1 },
        finalize: finalize2
    }
)