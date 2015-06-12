package chenchao.first

import scala.collection.mutable.ArrayBuffer

/**
 * Created by envy15 on 2015/5/14 0014.
 */
class Basic5 {

}

class NetWork {
  private val members = new ArrayBuffer[Member]();

  class Member(name: String) {
    val contact = new ArrayBuffer[Member]();
  }

  def join(name: String): Member = {
    val m = new Member(name);
    members += m;
    m
  }


}

object Basic5 extends App {
  val move = new NetWork;
  val conn = new NetWork;

  val fred = move.join("Fred");
  val bob = move.join("Bob");
  fred.contact += bob;

  val tom = conn.join("Tom");
  //fred.contact += tom; //虽然是new的同一个类，但是因为不是一个对象出来的所以不能这样加
}