```scala
class MyClass[T](val value: T) {
  def myMethod(x: Int): T = {
    if (x > 0) {
      value 
    } else {
      value match{
        case i:Int => i
        case _ => value
      }
    }
  }
}

val myIntInstance = new MyClass[Int](5)
println(myIntInstance.myMethod(1)) // Output: 5
println(myIntInstance.myMethod(-1)) // Output: 5

val myStringInstance = new MyClass[String]("hello")
println(myStringInstance.myMethod(1)) // Output: hello
println(myStringInstance.myMethod(-1)) // Output: hello
```