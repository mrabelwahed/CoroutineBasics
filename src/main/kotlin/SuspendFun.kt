import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

//update variable from two seprated coroutines
var callsNum =0

fun main() {
    GlobalScope.launch {
        task1()
    }

    GlobalScope.launch {
        task2()
    }

     print("hello ,")
    Thread.sleep(2000)
    println("there are some ${callsNum}")

}
  suspend fun task1(){
      delay(500)
      println("world")
      callsNum++
}

 suspend fun task2(){
     delay(1000)
     println("suspending fun")
     callsNum++
}