object Task4 {

//  4.	Dla listy z ćwiczenia 1 napisz funkcję tworzącą w oparciu o nią stringa z elementami oddzielonymi przecinkami
//      korzystając z:
//    a.	Metody foldl
//    b.	Metody foldr
//    c.	Metody foldl wypisując tylko dni z nazwami zaczynającymi się na „P”

  val daysOfWeek = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")

  def calculate(): Unit = {
    println("Zad 4")
    println("Fold left: ")
    println(foldLeftVersion())
    println("Fold right: ")
    println(foldRightVersion())
    println("Fold right but P days only: ")
    println(foldLeftPOnlyVersion())
    println("------------------------------------------------------------------------------------------")
  }

  def foldLeftVersion(): String = {
    return daysOfWeek.foldLeft("")(_ + ", " + _)
  }

  def foldRightVersion(): String = {
    return daysOfWeek.foldRight("")(_ + ", " + _)
  }

  def foldLeftPOnlyVersion(): String = {
    return daysOfWeek.foldLeft("")((a, b) => doSomething(a, b))
  }

  private def doSomething(a: String, b: String): String = {
    if (b.startsWith("P")) {
      if(a.isBlank){
        return b
      }
      return a + ", " + b
    } else {
      return a
    }
  }
}