import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    //context holds some data inside the coroutine
    //GlobalScope contains the coroutineContext
    runBlocking {
        launch (CoroutineName("myCoroutine")){
         println("this is run from ${coroutineContext[CoroutineName.Key]}")
        }
    }
}