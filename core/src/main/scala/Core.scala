package App

import Common._

object Core {
  def smallHello(helloTarget: String): String = {
    Common.makeSmall(sayHello(helloTarget))
  }

  private def sayHello(s: String): String = s"Hello! $s"
}
