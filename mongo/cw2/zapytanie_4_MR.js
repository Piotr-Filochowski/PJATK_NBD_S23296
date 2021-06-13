
var mapFunction = function () {
    var height = parseFloat(this.height) / 100
    var weight = parseFloat(this.weight)
    var myBmi = weight / (height * height)
    var out = {
        sumBmi: myBmi,
        count: 1,
        maxBmi: myBmi,
        minBmi: myBmi,
    }
    emit(this.nationality, out)
}

var reduceFunction = function (key, values) {
    var maxBmi = 0.0;
    var minBmi = 10000.0;
    var sumBmi = 0.0;
    var sumCount = 0;
    for (i = 0; i < values.length; i++) {
         sumBmi += values[i].sumBmi
         sumCount += values[i].count; 
         if (values[i].sumBmi < minBmi) {
            minBmi = values[i].sumBmi
        }
        if (values[i].sumBmi > maxBmi) {
            maxBmi = values[i].sumBmi
        }
    }
    return {
        sumBmi: sumBmi,
        count: sumCount,
        maxBmi: maxBmi,
        minBmi: minBmi,
    }
}

var finalize2 = function (key, reducedValue) {
    return {
       maxBmi: reducedValue.maxBmi,
       minBmi: reducedValue.minBmi,
       avgBmi: reducedValue.sumBmi / reducedValue.count,
//       count: reducedValue.count,
//       sumBmi: reducedValue.sumBmi
    }
}


printjson(
    db.people.mapReduce(
        mapFunction,
        reduceFunction,
        {
            out: { inline: 1 },
            finalize: finalize2
        }
    )
)