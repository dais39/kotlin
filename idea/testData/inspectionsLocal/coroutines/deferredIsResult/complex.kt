// WITH_RUNTIME
// FIX: Add '.await()' to function result (breaks use-sites!)

package kotlinx.coroutines

interface Deferred<T> {
    suspend fun await(): T
}

interface CoroutineContext

object DefaultDispatcher : CoroutineContext

enum class CoroutineStart {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED
}

interface Job

fun <T> async(
    context: CoroutineContext = DefaultDispatcher,
    start: CoroutineStart = CoroutineStart.DEFAULT,
    parent: Job? = null,
    f: suspend () -> T
): Deferred<T> {
    TODO()
}

fun <T> runBlocking(
    context: CoroutineContext = DefaultDispatcher,
    f: suspend () -> T
) {
    TODO()
}

suspend fun <T> withContext(
    context: CoroutineContext,
    start: CoroutineStart = CoroutineStart.DEFAULT,
    f: suspend () -> T
) {
    TODO()
}

fun <caret>myFunction(context: CoroutineContext, switch: Int): Deferred<Int> {
    when (switch) {
        0 -> return async {
            val x = 123
            x * x
        }
        1 -> return async(context) { -1 }
        else -> return async(context, fun(): Int {
            return 9
        })
    }
}
