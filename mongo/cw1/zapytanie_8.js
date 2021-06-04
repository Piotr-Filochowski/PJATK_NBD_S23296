print("How many people people with Moscow: ")
printjson(
db.people.find(
{
    "location.city": "Moscow"
}
).count())


db.people.updateMany(
{
    "location.city": "Moscow"
},
{
    $set: { "location.city": "Moskwa" }
}
)

print("How many people people with Moscow now: ")
printjson(
db.people.find(
{
    "location.city": "Moscow"
}
).count())