object Task6 {

  def calculate(): Unit = {
    println("Zad 6")
    val t = Tuple3("Hello", 1, true)
    printTuple(t)
    println("------------------------------------------------------------------------------------------")
  }

  def printTuple(t: (String, Int, Boolean)): Unit = {
    println(t._1)
    println(t._2)
    println(t._3)
  }
}

/*
- to jest gotowe
* */