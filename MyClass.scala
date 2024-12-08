```scala
class MyClass(val name: String) {
  def greet(): String = {
    s"Hello, my name is $name"
  }
}

object Main extends App {
  val myObject = new MyClass("Alice")
  println(myObject.greet()) // Hello, my name is Alice

  val myObject2 = new MyClass(null)
  println(myObject2.greet()) // NullPointerException
}
```