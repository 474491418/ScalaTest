package edu.sust.firstTest

/**
 * Created by envy15 on 2015/2/14 0014.
 */
class Rational(top: Int, bottom: Int) {
  require(bottom != 0);
  val topNumber = top;
  val bottomNumber = bottom;

  def this(top: Int) = this(top: Int, 1);

  override def toString = topNumber + "/" + bottomNumber;

  def +(that: Rational): Rational = {
    new Rational(topNumber * that.topNumber, that.bottomNumber * bottomNumber)
  }
  def +(that: Int): Rational = {
    new Rational(topNumber +that*bottomNumber,  bottomNumber)
  }

}

object Rational {
  implicit def intToRational(x: Int) = new Rational(x);
  def main(args: Array[String]) {
   val first=new Rational(1,2);
    val a=new Rational(2,5);
   println( first+1);
    println(first+a)
    println(4+a);
  }
}