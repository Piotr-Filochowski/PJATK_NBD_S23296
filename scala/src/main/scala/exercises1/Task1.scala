object Task1 {

  val daysOfWeek = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")

  def calculate() {
    println("------------------------------------------------------------------------------------------")
    println("Zad 1")
    println("a. For loop")
    println(forLoop(daysOfWeek))
    println("\nb. For loop with only days which name starts with P")
    println(forLoopWithPLetterDaysOnly(daysOfWeek))
    println("\nc. While loop")
    println(whileLoop(daysOfWeek))
    println("\n------------------------------------------------------------------------------------------")
  }

  private def whileLoop(days: List[String]): String = {
    var i = 0
    var out = ""
    while (i < days.length) {
      out.concat(days(i) + " ")
      i = i + 1
    }
    return out
  }

  private def forLoopWithPLetterDaysOnly(days: List[String]): String = {
    var out = ""
    for (day <- days) {
      if (day.startsWith("P") || day.startsWith("p")) {
        out.concat(day + " ")
      }
    }
    return out
  }

  private def forLoop(days: List[String]) = {
    var out = ""
    for (day <- days) {
      out.concat(day + " ")
    }
  }
}

/*
czyste funkcje, zwracac string a nie printowac ze srodka


done

* */