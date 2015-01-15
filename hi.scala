class Greeter(name: String) {
  def SayHi() = println(name)
}
var greeter = new Greeter()
greeter.SayHi()
greeter = new Greeter()
