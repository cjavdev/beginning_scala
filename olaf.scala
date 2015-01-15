class TextHelper {
  val suffix = "..."

  def elipses(original: String, maxLength: Int) : String = {
    if(original.length <= maxLength)
      return original;

    original.substring(0, maxLength - suffix.length) + suffix
  }
}
val helper = new TextHelper()
println(helper.elipses("This is something to test", 10))
