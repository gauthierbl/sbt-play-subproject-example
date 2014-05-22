package App

object Common {
 def makeSmall(s: String): String = s.replace(" ", "").reverse.take(5).takeRight(3)
}
