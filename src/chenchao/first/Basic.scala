package chenchao.first

/**
 * Created by envy15 on 2015/5/8 0008.
 */
class Basic {

}

class Person {
  var name: String = _;
  val age = 10;
  private[this] val gender = "male";

  def printGender() = {

    println(gender)
  }
}

class Person1(val name: String, val age: Int) {
  println("我是Person1构造函数");
}

class Person2(val name: String, val age: Int) {
  println("我是Person2构造函数");
  var gender: String = _;

  def this(name: String, age: Int, gender: String) {

    this(name, age);
    this.gender = gender;
    println("我是person2的副构造函数");
  }

  override def toString = "我是Person2";
}

class Student(name: String, age: Int, val major: String) extends Person2(name, age, "hello") {
  println("我是Student构造函数");
}

object Basic {
  def main(args: Array[String]) {
    // val p = new Person
    //    p.name = "Jack"
    //    println(p.age + "==" + p.name);
    //    p.printGender();
    //val p1 = new Person1("Tom", 80);
    //  println(p1.name + "==" + p1.age);
    val p2 = new Person2("Jack", 80, "Hello");
    //    println(p2.name + "==" + p2.age + "==" + p2.gender);
    val s = new Student("Tom", 30, "CS");
    println(s.name + "==" + s.age + "==" + s.major);
    print(p2.toString());
  }
}