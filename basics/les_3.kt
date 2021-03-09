abstract class Person
{
  var name: String
  var id: Int
  companion object ID
  {
    var personId: Int = 0
  }
  constructor(name: String)
  {
    this.name = name.toUpperCase()
    this.id = ID.personId++
  }

  fun printId()
  {
    println("ID: ${this.id}")
  }

  abstract fun voice()
}

open class Human(name: String, age: Int=10, sex: Boolean = false) 
  : Person(name)
{
  var age: Int = age
  var sex: Boolean = sex
  override fun voice()
  {
    val gender = if (sex) "Male" else "Wemale"
    println("Hello, I'm ${gender} from Earth, my name is ${this.name} and I'm ${this.age} y.o.")
  }
}

open class Robot(name: String, arc: String) : Person(name)
{
  var arc = arc
  override fun voice()
  {
    println("10111011 ${this.name}, 101101101 ${this.arc}!")
  }
}

fun printPArr(arr: Array<Person>)
{
  for (pi in arr)
  {
    pi.voice()
    pi.printId()
  }
}

fun main()
{
  val h1 = Human("Steave", 10, true)
  val r1 = Robot("Apple", "Mark1")
  val h2 = Human("Jane", 22)
  var pArr = arrayOf<Person>(h1,h2,r1)
  printPArr(pArr)
}