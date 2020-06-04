import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    //running 10^6 coroutines takes a few seconds
    runBlocking {
        repeat(1000000){
            launch {
                print(",")
            }
        }
    }
}