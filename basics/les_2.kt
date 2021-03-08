fun main()
{
  // if_max()
  // if_max_q()
  // l_1()
  // l_2()
  l_3()
}

fun if_max()
{
  var a = intArrayOf(222, -12)
  var b = intArrayOf(124,3)
  var max: IntArray = if (a[0] > b[0])
  {
    var c = a.clone()
    c[0] = c[0] - b[0]
    c[1] = c[1] - b[1]
    c
  } else 
  {
    b
  }
  println("${max[0]}, ${max[1]}")

  println("${a[0]}, ${a[1]}")
}

fun if_max_q()
{
  var a = intArrayOf(2, -12)
  var b = intArrayOf(124,3)
  var max: IntArray ?= if (a[0] > b[0])
  {
    var c = a.clone()
    c[0] = c[0] - b[0]
    c[1] = c[1] - b[1]
    c
  } else 
  {
    null
  }
  println("${max?.get(0)}, ${max?.get(0)}")
  println("${a[0]}, ${a[1]}")
}

fun l_1()
{
  var a = 2.623123F
  println("AHAHAHAHAH: ${a} -> to int ${a.toInt()}")
  val nan: Int = (2.0 - 1e-10).toInt()
  println("Is -1 <= nan <= 6?")
  if (nan in -1..6)
    println("Yes")
  else
    println("No")

  println("Is 2 <= nan <= 6?")
  if (nan in 2..6)
    println("Yes")
  else
    println("No")
  
  val nan2 = 6

  println("Is 2 <= nan2 <= 6?")
  if (nan2 in 2..6)
    println("Yes")
  else
    println("No")   
}

fun l_2()
{
  var c: Char = '0'
  var k: Int = 122
  println(c.toInt())
  println(k.toChar())
  println("new char" + 123 + "geg")
}

fun l_3()
{
  val A = Array(5) {0f}
  A.forEach{ println(it) }
  val kek = {
    print("KEK")
    if (9 > 10)
    {
      print("HAHAHAHAHAHAH")
    }
    123
  }
  println("\n${kek()}")
  var B = IntArray(5) {i -> i+123}
  B.forEachIndexed { a,b -> print("$a, $b "); if (a%4 == 0 && a != 0) println()}
  val t = {
    x:Any ->
    print(x)
  }

  var C: IntArray ?= IntArray(5) {it%3}
  var rif = C!!.size
  println("ref: $rif")
  // rif = C!!.size
  // println("ref: $rif")
  
}