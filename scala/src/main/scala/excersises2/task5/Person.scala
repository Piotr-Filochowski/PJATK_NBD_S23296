package excersises2.task5

abstract class Person(val name: String, val surname: String, val tax: Double) {


//  def getTax() = tax;

  override def toString(): String = {
    return "Im  : " + name + " " + surname + " my tax is " + tax + "."
  }


}