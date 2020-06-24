import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        println("starting receiving numbers")
        generateNums().collect {
            println("receiving num $it")
        }

        generateOddNums().collect {
            println("receiving odd num $it")
        }
        println("receiving end")
    }
}

//convert collection into flow
fun generateNums() = listOf(1,2,3,4).asFlow()

//creating flow using flow of
fun generateOddNums() = flowOf(1,3,5)