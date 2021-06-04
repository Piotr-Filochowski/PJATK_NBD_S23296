object Task4 {

  val daysOfWeek = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")

  def calculate(): Unit = {
    println("Zad 4")
    println("Fold left: ")
    println(foldLeftVersion(daysOfWeek))
    println("Fold right: ")
    println(foldRightVersion(daysOfWeek))
    println("Fold right but P days only: ")
    println(foldLeftPOnlyVersion(daysOfWeek))
    println("------------------------------------------------------------------------------------------")
  }

  def foldLeftVersion(days: List[String]): String = {
    return days.foldLeft("")(_ + ", " + _)
  }

  def foldRightVersion(days: List[String]): String = {
    return days.foldRight("")(_ + ", " + _)
  }


  /*
  * list.filter.fold
  * */
  def foldLeftPOnlyVersion(days: List[String]): String = {
    return days.foldLeft("")((a, b) => doSomething(a, b))
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

/*
podac jako parametr dats of the week
* */