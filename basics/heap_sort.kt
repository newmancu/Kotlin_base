// package kotlin.random
import kotlin.random.*

open class Sort
{
  open fun sort(arr: Array<Int>, n: Int) {}
}

class HeapSort : Sort()
{
  override fun sort(arr: Array<Int>, n: Int)
  {
    for (i: Int in (n/2 - 1) downTo 0)
    {
      // println("index = ${i}")
      this.heapy(arr, n, i)
    }
    for (i: Int in (n-1) downTo 1)
    {
      // println("Sindex = ${i}")
      var tmp: Int = arr[0]
      arr[0] = arr[i]
      arr[i] = tmp
      this.heapy(arr, i, 0)
    }
  }

  fun heapy(arr: Array<Int>, n: Int, index: Int)
  {
    var largest: Int = index
    var l: Int = 2 * index + 1
    var r: Int = 2 * index + 2

    if ((l < n) && (arr[l] > arr[largest]))
    {
      largest = l 
    }

    if ((r < n) && (arr[r] > arr[largest]))
    {
      largest = r
    }
    
    if (largest != index)
    {
      var tmp = arr[index]
      arr[index] = arr[largest]
      arr[largest] = tmp
      heapy(arr, n, largest)
    }
  }
}

fun printArr(A: Array<Int>)
{
  for (ai in A)
    print("$ai ")
  println()
}

fun main()
{
  val HS: HeapSort = HeapSort()
  val seed: Int = 1123
  var rand: Random = Random(seed)
  // var A: Array<Int> = Array<Int>(10, {i -> Random(seed+i).nextInt(0, 100)})
  var A: Array<Int> = Array<Int>(10, {rand.nextInt(0, 100)})
  
  printArr(A)
  HS.sort(A, A.size)
  printArr(A)
  // print(A[-1])
}