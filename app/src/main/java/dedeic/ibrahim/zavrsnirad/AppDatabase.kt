package dedeic.ibrahim.zavrsnirad

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import java.security.AccessControlContext

@Database(entities = arrayOf(Jelo::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun jeloDao() : JeloDao
    companion object{
        private var INSTANCE: AppDatabase? = null
        fun getInstance(context: Context): AppDatabase{
            if (INSTANCE == null){
                synchronized(AppDatabase::class){
                    INSTANCE = buildRoomDB(context)
                }
            }
            return INSTANCE !!
        }
        private fun buildRoomDB(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                AppDatabase::class.java,
                "cinaeste-db"
            ).build()
    }

}