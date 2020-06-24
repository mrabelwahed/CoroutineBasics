import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
//        mapOperator()
//        filterOperator()
      //  transformOperator()
        takeOperator()
    }
}

suspend  fun mapOperator() {
    listOf(1,2,3,4).asFlow().map {
        delay(500L)
        (it * 100)
    }.collect {
        println("receiving $it")
    }
}


suspend  fun filterOperator() {
    (1..10).asFlow().filter{
        it%2 == 0
    }.collect {
        println("printing $it")
    }
}

//transform is a general transformation
suspend fun  transformOperator(){
    (1..10).asFlow().transform {
        emit("emitting string val $it")
        emit(it)
    }.collect {
        println(it)
    }
}


// take the first two numbers only
 suspend fun takeOperator(){
     (1..10).asFlow().take(2).collect{
         println(it)
     }
 }