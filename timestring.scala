class MultiplicationString(var value: String) {
  def *(times: Int) = {
    var result = "";
    for(i <- 1 to times)
      result += value;
    result;
  }
}

val str = new MultiplicationString("testing 1.2.3");
println(str * 5)
