```scala
class MyClass[T](val value: T) {
  def myMethod(x: Int): T = {
    if (x > 0) {
      value 
    } else {
      // This will throw a MatchError if T is not a subtype of Int and
      // x is not greater than 0
      value.asInstanceOf[Int] match {
        case i: Int => i
        case _ => throw new MatchError("Unexpected type")
      }
    }
  }
}

val myIntInstance = new MyClass[Int](5)
println(myIntInstance.myMethod(1)) // Output: 5
println(myIntInstance.myMethod(-1)) // Output: 5

val myStringInstance = new MyClass[String]("hello")
println(myStringInstance.myMethod(1)) // Output: hello
println(myStringInstance.myMethod(-1)) // Output: java.lang.MatchError: Unexpected type
```