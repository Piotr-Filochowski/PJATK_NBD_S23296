package excersises2.task5

trait Employee {

  var salary = 1000.0

  def getTax() = 0.2;
//  def tax = 0.2
  def setSalary(newSalary: Double): Unit = {
    salary = newSalary;
  }

  def getSalary(): Double = {
    return salary
  }
}
