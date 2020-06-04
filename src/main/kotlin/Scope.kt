import kotlinx.coroutines.*

fun main() {
    //scope provides lifecycle for coroutines and you can start and stop it
    // run blocking for blocking
     //GlobalScope for whole app
    //coroutineScope completed when all its children complete
    println("the program execution will blocked now")

    runBlocking {
       launch {
           delay(1000)
           println("Task1")
       }

        GlobalScope.launch {
            delay(500)
            println("Task2")
        }

     coroutineScope {
         launch {
             delay(1500)
             println("Task3")
         }
     }
    }

    println("the program execution will stop now")
}