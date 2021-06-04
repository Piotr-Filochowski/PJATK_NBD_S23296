package exercises1

object Task10 {


  val listOfInts = List(
    1.0,
    2.2,
    3.1234,
    -10.0,
    -123.123,
    111.111,
    -6.0,
    13.0,
    -5.0,
    12.0)

  def calculate(): Unit = {
    println("Zad 10")
    println(filterList(listOfInts))
    println("------------------------------------------------------------------------------------------")
  }

  def filterList(input: List[Double]): List[Double] = {
    return input
      .filter(temp => temp >= -5)
      .filter(temp => temp <= 12)
      .map(temp => Math.abs(temp))
  }

}


/*
* filtrowanie w dwuch czesciach, najpierw >= -5 potem <= 12
* */