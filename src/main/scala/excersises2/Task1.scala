package excersises2

object Task1 {

  /*
  1.	Wykorzystaj Pattern Matching w funkcji przyjmującej parametr typu String.
  Dla stringów odpowiadających nazwom dni tygodnia funkcja ma zwrócić „Praca” i „Weekend”
  (odpowiednio dla dni roboczych i wolnych), dla pozostałych napisów „Nie ma takiego dnia”.

  * */


  def calculate(): Unit = {
    println("------------------------------------------------------------------------------------------")
    println("Zad1")
    println("Poniedzialek => " + whatDayIsIt("Poniedzialek"))
    println("Wtorek       => " + whatDayIsIt("Wtorek"))
    println("Sobota       => " + whatDayIsIt("Sobota"))
    println("marzec       => " + whatDayIsIt("marzec"))
    println("------------------------------------------------------------------------------------------")
  }

  def whatDayIsIt(text: String): String = {
    return text match {
      case "Poniedzialek" | "Wtorek" | "Sroda" | "Czwartek" | "Piatek" => "Praca"
      case "Sobota" | "Niedziela" => "Weekend"
      case _ => "Nie ma takiego dnia"
    }
  }

}
