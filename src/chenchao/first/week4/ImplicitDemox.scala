package chenchao.first.week4

import java.io.File

import scala.io.Source

/**
 * Created by envy15 on 2015/5/18 0018.
 */
object ImplicitDemo extends App {

  //new File("xxx").read;
  //用隐式参数自动赋值，但是是一个不好的习惯
  // ValueTest.print("Jack")
  implicit object Line extends LineCompareByLen

  val p1 = new Pair1(1, 2);
  val p2 = new Pair1("a", "b");
  println(p1.smaller);
  println(p2.smaller);

  val l1 = new Line(3);
  val l2 = new Line(4);

  val p3 = new Pair1(l1, l2);
  println(p3.smaller);
}

class Pair1[T: Ordering](val first: T, val second: T) {
  def smaller(implicit ord: Ordering[T]) = {
    if (ord.compare(first, second) < 0) first else second
  }
}

trait LineCompareByLen extends Ordering[Line] {
  override def compare(x: Line, y: Line) = if (x.len < y.len) -1 else if (x.len == y.len) 0 else 1

}

class Line(val len: Int) {
  override def toString: String = "长度是：" + len;
}


class RichFile(val file: File) {
  def read = Source.fromFile(file.getPath).mkString;
}

object ValueTest {
  def print(content: String)(implicit prefix: String): Unit = {
    println(prefix + ": " + content);
  }

  //用下界定义
  def smaller[T <: Int](a: T, b: T) = if (a < b) a else b

  //用隐式转换来代替下界的定义 把参数转换成Ordered[T]对象 这个对象里有很多方法
  def smaller[T](a: T, b: T)(implicit order: T => Ordered[T]) = if (a < b) a else b

}

object Context {
  implicit def file2RichFile(f: File) = new RichFile(f);
  implicit val aaa: String = "Hello1";
}

