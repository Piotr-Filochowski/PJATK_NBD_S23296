package excersises2.task5

class Person(val name: String, val surname: String, val tax: Double) {

  override def toString(): String = {
    return "Im  : " + name + " " + surname + " my tax is " + tax + "."
  }
}