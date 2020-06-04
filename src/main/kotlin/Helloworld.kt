import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main(){
    GlobalScope.launch {
        delay(1000)
        print("World")
    }

    print("Hello, ")
    //wait for coroutines until it finishes
    Thread.sleep(2000)

}