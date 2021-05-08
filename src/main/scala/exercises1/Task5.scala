object Task5 {

  /*5.	Stwórz mapę z nazwami produktów i cenami.
  Na jej podstawie wygeneruj drugą, z 10% obniżką cen. Wykorzystaj mechanizm mapowania kolekcji.
  * */

  val productsWithPrices = Map(
    "Cola"  -> 1.0,
    "Pepsi" -> 1.0,
    "oreo"  -> 1.5
  )

  def calculate(): Unit = {
    println("Zad 5")
    println("Init values: ")
    for ((k,v) <- productsWithPrices) println("key: %s, value: %s: ", k, v)
    println("Second map, with sale:  ")
    var newMap: Map[String, Double] = Map()
    for ((k,v) <- productsWithPrices) {
      var newValue = v * 0.9
      newMap += (k ->  newValue)
    }
    println("new values: ")
    for ((k,v) <- newMap) println("key: %s, value: %s: ", k, v)
  }
}