package chenchao.first

/**
 * Created by envy15 on 2015/5/9 0009.
 */
class Basic2 {

}

abstract class Person3 {
  val name: String;
  var age: Int;

  def speak
}

class Student3 extends Person3 {
  def speak: Unit = {
    println("Hello " + name + "==" + age);
  }

  val name = "Tom";
  var age = 18;
}


trait Logger {
  println("I'm Logger");

  def log(message: String): Unit = {
    println("save money " + message)
  };
}

class ConsoleLogger extends Logger {
  println("I'm ConsoleLogger");

  override def log(message: String): Unit = {
    println(message);
  }
}

class Test extends ConsoleLogger {
  println("I'm Test");

  def test {
    log("ppp")
  }
}

trait MessageLog extends Logger {
  override def log(message: String): Unit = {
    println("save money to bank" + message)
  }
}

abstract class Count {
  def save;
}

class MyCount extends Count with Logger {
  def save {
    log(": 100");
  }
}

object Basic2 {
  def main(args: Array[String]) {
    //    val s = new Test;
    //    s.test;
    val acc = new MyCount() with MessageLog ;
    acc.save;

  }

}