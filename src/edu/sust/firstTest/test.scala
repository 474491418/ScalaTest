package edu.sust.firstTest

/**
 * Created by envy15 on 2015/2/12 0012.
 */
class test(n: Int, d: Int) {
  val one = 15;
  require(d != 0);

  override def toString = n + "/" + d;

  def sayHi(): Unit = {
    println(one);

    print("hello 1111");
  }
}
