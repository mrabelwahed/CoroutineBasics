import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        val job1 = launch {
           // delay(3000)
            println("job1 launched")
            val job2 = launch {
                println("job2 launched")
                delay(3000)
                println("job2 finished")
            }
            job2.invokeOnCompletion { "job2 completed "}
        }

        job1.invokeOnCompletion {
            println("job1 completed")
        }

        delay(500)
        //println("job1 will be cancelled")
        job1.cancel()
    }
}