import scala.collection.mutable.MutableList

class Arr(var original: List[Int]) {

  def uniq() = {
    var result: List[Int] = List()
    for(i <- original)
      if(!result.contains(i))
        result = result ::: List(i)

    for(j <- result)
      println(j)
  }

  def TwoSum() : List[(Int, Int)] = {
    var i = 0
    var ret = for(i <- List.range(0, original.length);
      j <- i + 1 until original.length;
      if original(i) + original(j) == 0)  yield (i, j);
    ret
  }
}

// val ua = new Arr(List(1, 2, 3, 4, 1))
// ua.uniq()

val ts = new Arr(List(-1, 0, 2, -2, 1))
println(ts.TwoSum())
