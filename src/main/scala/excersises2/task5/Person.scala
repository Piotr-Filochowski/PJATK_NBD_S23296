package excersises2.task5

class Osoba(val imie: String, val nazwisko: String, val podatek: Double) {

  override def toString(): String = {
    return "Im  : " + imie + " " + nazwisko + " my tax is " + podatek + "."
  }
}
