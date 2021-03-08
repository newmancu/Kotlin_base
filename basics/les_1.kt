fun main()
{
  var a : Int = 5 
  var b : Int = 14
  val PI: Double = 3.1415
  /* 
  println("hw")
  print("math.pi = ${PI}\n")
  println(add(3,5))
  println(sadd(3,5))
  */
  println("a = ${a}, b = ${b} and a - b = ${a - b}")
}

fun add(a: Int, b: Int) : Int
{
  return a + b
}

fun sadd(a: Int, b: Int) = a + b