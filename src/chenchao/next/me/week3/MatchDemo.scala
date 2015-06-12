package chenchao.next.me.week3

/**
 * Created by envy15 on 2015/6/8 0008.
 */
class MatchDemo {
  //  val d: Char = 'e';
  //
  //  val a = Character.isDigit(d)//判断是否是数字
  //  if (!a) {
  //    val c = Character.digit(d, 16);按照后面的进制对前面的变量进行进制转换
  //    println(c);
  //  }
  //
  //  val b = Character.digit('a', 16);
  //  println(a);
  //  println(b);

  def convert(value: Char) = {

    value match {
      case '+' => -1;
      case _ if Character.isDigit(value) => Character.digit(value, 10);
      case x: Char => "not a number:" + x; //如果没匹配上上面的，则传进来什么返回什么
      case _ => "hah1";

    }
  }

}

object MatchDemo {
  def main(args: Array[String]) {
    val md = new MatchDemo;
    println(md.convert('a'));

  }
}