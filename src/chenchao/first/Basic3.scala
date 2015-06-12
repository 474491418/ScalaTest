package chenchao.first

/**
 * Created by envy15 on 2015/5/11 0011.
 */
class Basic3 {

}

object Basic3 extends App {
  //  val a = ApplyTest(); //apply的方法静态方法
  //  a.test;
  val t = new ApplyTest();
  t.test;
}

class ApplyTest {
  def test = println("I'm static test");
}

object ApplyTest {
  def apply() = new ApplyTest();
}