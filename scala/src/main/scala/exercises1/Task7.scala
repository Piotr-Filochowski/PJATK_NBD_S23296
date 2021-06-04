

object Task7 {


  val productsWithPrices = Map(
    "Cola"  -> 1.0,
    "Pepsi" -> 1.0,
    "oreo"  -> 1.5
  )

  def calculate(): Unit = {
    println("Zad 7")
    println()
    println(getProductPriceFromProductsMap("Cola"))
    println(getProductPriceFromProductsMap("Candy"))
    println("------------------------------------------------------------------------------------------")
  }

  def getProductPriceFromProductsMap(name: String): Option[Double] = {
    return  productsWithPrices.get(name)
  }
}


/*
- to jest gotowe
* */