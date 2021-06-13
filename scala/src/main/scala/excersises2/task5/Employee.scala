package excersises2.task5

trait Employee extends Person {

  var salary = 1000.0

  override val tax = 0.2;



  def setSalary(newSalary: Double): Unit = {
    salary = newSalary;
  }

  def getSalary(): Double = {
    return salary
  }

  def calculateSalaryNet(): Double = {
    return salary * (1 - tax)
  }

  def calculateSalaryGross(): Double = {
    return getSalary()
  }
}
