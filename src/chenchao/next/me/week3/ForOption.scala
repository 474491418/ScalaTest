package chenchao.next.me.week3

/**
 * Created by envy15 on 2015/6/8 0008.
 */
class ForOption {
  val m: Map[String, String] = Map("key" -> "value");
  val v1: Option[String] = m.get("key");
  val v2: Option[String] = m.get("key1");
  println(v1);
  println(v1.get)
  println(v1.isEmpty)
  println(v2.isEmpty)
  println(v2.getOrElse("666"))
  println(v1.getOrElse("666"))

  if (None == v2) println(v2); else println(v2.get);
}

object ForOption {
  def main(args: Array[String]) {
    new ForOption;
  }
}