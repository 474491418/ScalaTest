package chenchao.first

/**
 * Created by envy15 on 2015/5/11 0011.
 */
class Basic4 {

}

object Basic4 extends App {
  val value = 1;
  val result = value match {
    case 1 => "one";
    case 2 => "two"
    case _ => "other"
  }
  val result2 = value match {
    case i if i == 1 => "one to result2";
    case i if i == 2 => "two";
    case _ => "other";
  }
  println(result);
  println(result2);

  def typeOf(obj: Any) = obj match {
    case x: Int => println("Int");
    case s: String => println("String")
    case f: Float => println("float")
    case _ => println("any type")

  }

  typeOf(new Basic2);
  typeOf(2);
  typeOf(1L);

}
