package chenchao.next.me.week1

/**
 * Created by envy15 on 2015/5/19 0019.
 */
object TestTrait extends App {

}

trait Logged {
  def log(msg: String);
}

trait Logger extends Logged {

  def warning(msg: String) = log("Warn:" + msg);

  def info(msg: String) = log("Info:" + msg);

  def server(msg: String) = log("Server:" + msg);
}

trait TimeStampLogger extends Logged {
  override def log(msg: String) = println(new java.util.Date() + ":" + msg);
}

class SavingAccount extends Logged {
  def log(msg: String) = println(msg);
}

object SavingAccount {
  def apply()= new SavingAccount() with Logger;
}

object TestDateLogged {
  def main(args: Array[String]) {
    val s=SavingAccount();
     s.warning("出错啦");

  }
}