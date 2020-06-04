import kotlinx.coroutines.*

fun main() {

    runBlocking {
        val myHandler = CoroutineExceptionHandler { coroutineContext, throwable ->
            println("Exception handled ${throwable.localizedMessage}")
        }

        val job = GlobalScope.launch(myHandler) {
            println("throwing an exception")
            throw  IndexOutOfBoundsException()
        }

        job.join()

        val deferred = GlobalScope.async {
            println("throwing an exception")
            throw ArithmeticException("exception from async")
        }
        try {
            deferred.await()
        }catch (e:java.lang.ArithmeticException){
            println("caught arithmetic exception")
        }

    }
}