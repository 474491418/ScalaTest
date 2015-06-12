package chenchao.first

import scala.io.Source

/**
 * Created by envy15 on 2015/5/12 0012.
 * case class实例
 */
object CaseClassDemo extends App {
  def m(p: PersonCase): Unit = {
    p match {
      case TeacherCase("ab") => println("I'm teacher");
      case StudentCase(_) => println("I'm student");
      case _ => println("I'm unknown");
    }
  }

  val source = Source.fromFile("H://1.txt");
  for (line <- source.getLines()) println(line);
  //  m(TeacherCase("ab"));
}

abstract class PersonCase;

case class StudentCase(name: String) extends PersonCase;

case class TeacherCase(name: String) extends PersonCase