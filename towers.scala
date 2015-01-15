class TowersOfHanoi {
  var tower1: List[Int] = List(1, 2, 3)
  var tower2: List[Int] = List()
  var tower3: List[Int] = List()
  var towers = List(tower1, tower2, tower3)

  def Play() {
    Display()
    var from = GetMoveTower("Pick a from tower");
    var to = GetMoveTower("Pick a to tower");
    Move(from, to)
    if(GameOver())
      return
    Play()
  }

  def Move(from: Int, to: Int) {
    val t = towers(from)
    towers(from) = t.tail
  }

  def GameOver() : Boolean = {
    tower1.length == 0
  }

  def Display() {
    println(tower1);
    println(tower2);
    println(tower3);
  }

  def GetMoveTower(message: String) : Int = {
    println(message)
    readInt
  }
}

val game = new TowersOfHanoi()
game.Play()
