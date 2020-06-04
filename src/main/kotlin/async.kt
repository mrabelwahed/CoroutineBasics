import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.random.Random

fun main() {
    runBlocking {
        val deferred1 = async { rand1() }
        val deferred2 = async { rand2() }

        delay(500)
        println("waiting for values")

        val first = deferred1.await() //blocking call
        val second  = deferred2.await()

        println(first+second)
    }
}

suspend fun rand1(): Int {
    delay(1000)
    val value1 = Random.nextInt(100);
    println("first value1 is " + value1)
    return value1
}


suspend fun rand2(): Int {
    delay(2000)
    val value2 = Random.nextInt(100);
    println("second value is " + value2)
    return value2
}