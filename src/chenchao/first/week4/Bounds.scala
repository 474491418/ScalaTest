package chenchao.first.week4

/**
 * Created by envy15 on 2015/5/18 0018.
 */
object Bounds extends App {
  //  val result = new Pair[String]("A", "B");

  //  println(result.smaller);
  val s1 = new Student("s1");
  val s2 = new Student("s2");
  val pair = new Pair[Student](s1, s2);
  val person = new Person("AA");
  println(pair.replaceFirst(person));

}

////泛型上添加了上界 说明T一定是Comparable的子类才能传进来
//class Pair[T <: Comparable[T]](val first: T, val second: T) {
//
//  //first.asInstanceOf[Comparable[T]];
//
//  def smaller = if (first.compareTo(second) < 0) first else second;
//
//  //添加了下界说明R一定是T的类才能传进来
//  def replaceFirst[R >: T](newFirst: R) = new Pair(newFirst, second);
//}


class Pair[T](val first: T, val second: T) {
  // 添加了下界说明R一定是T的类才能传进来
  def replaceFirst[R >: T](newFirst: R) = new Pair(newFirst, second);
}

class Person(val name: String)

class Student(name: String) extends Person(name)