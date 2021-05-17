package exercises1

object Task9 {

  val listOfInts = List(
    1,
    2,
    3,
    0,
    4,
    0,
    123,
    12335234,
    0)


  def calculate(): Unit = {
    print(getListIncrementedByOne(listOfInts))
  }

  def getListIncrementedByOne(list: List[Int]): List[Int] = {
    return list.map( x => x + 1)
  }
}
