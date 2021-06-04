package excersises2.task5

trait Pracownik {
  def podatek = 0.2


  var _salary: Int
  def salary = _salary
  def salary_= (value: Int):Unit = _salary = value
}
