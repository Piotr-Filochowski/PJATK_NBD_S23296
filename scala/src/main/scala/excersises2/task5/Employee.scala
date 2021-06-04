package excersises2.task5

trait Employee {

  var salary: Double

  val tax = 0.2;

  def setSalary(newSalary: Double): Unit = {
    salary = newSalary;
  }

  def getSalary(): Double = {
    return salary
  }
}
