package chenchao.first

/**
 * Created by envy15 on 2015/5/8 0008.
 */
object FirstTest {
  def add(x: Int, y: Int): Int = {
    x + y
  }

  def add(): Unit = {
    println("say hello")
  }

  def sum(ele: Int*): Unit = {
    var j = 0;

    for (i <- ele) {
      j = j + i;
    }
    println(j)
  }

  def main(args: Array[String]) {
    //println(add(4, 5));
    sum(1, 5, 3, 4);

  }

}

object Traffic extends Enumeration {
  val red = Value;
}

class Tract {

}