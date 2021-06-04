db.people.updateMany(
  {
    first_name: "Antonio",
  },
  {
    $set: { hobby: "pingpong" },
  }
);

print("Antonios after update:");
printjson(
  db.people.find({
    first_name: "Antonio",
  }).toArray()
);
