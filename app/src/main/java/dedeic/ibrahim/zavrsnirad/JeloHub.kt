package dedeic.ibrahim.zavrsnirad


import android.content.Context
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.withContext
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


sealed class Result<out R> {
    data class Success<out T>(val data: T) : Result<T>()
    data class Error(val exception: Exception) : Result<Nothing>()
}

object JeloHub {
    suspend fun getJela(context:Context):List<Jelo>{
        return withContext(Dispatchers.IO){
            var db = AppDatabase.getInstance(context)
            var jela = db!!.jeloDao().getAll()
            return@withContext jela
        }
    }

    suspend fun writeJela(context: Context,jelo:Jelo) : String?{
        return withContext(Dispatchers.IO){
            try {
                var db = AppDatabase.getInstance(context)
                db!!.jeloDao().insertAll(jelo)
                return@withContext "success"
            }
            catch (error:Exception){
                return@withContext null
            }
        }
    }
}