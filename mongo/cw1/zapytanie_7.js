print("How many people > 190 height before: ")
printjson(
db.people.find({ $expr: { $gt: [ { $toDouble: "$height" }, 190.0 ] } }).count()
);
db.people.deleteMany(
{ $expr: { $gt: [ { $toDouble: "$height" }, 190.0 ] } }
)

print("How many  people > 190 height after: ")
printjson(
db.people.find({ $expr: { $gt: [ { $toDouble: "$height" }, 190.0 ] } }).count()
);