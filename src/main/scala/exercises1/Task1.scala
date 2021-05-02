object Task1 {

  val daysOfWeek = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")

  def calculate() {
    println("------------------------------------------------------------------------------------------")
    println("Zad 1")
    println("a. For loop")
    forLoop
    println("\nb. For loop with only days which name starts with P")
    forLoopWithPLetterDaysOnly
    println("\nc. While loop")
    whileLoop
    println("\n------------------------------------------------------------------------------------------")
  }

  private def whileLoop = {
    var i = 0
    while (i < daysOfWeek.length) {
      print(daysOfWeek(i) + " ")
      i = i + 1
    }
  }

  private def forLoopWithPLetterDaysOnly = {
    for (day <- daysOfWeek) {
      if (day.startsWith("P") || day.startsWith("p")) {
        print(day + " ")
      }
    }
  }

  private def forLoop = {
    for (day <- daysOfWeek) {
      print(day + " ")
    }
  }
}