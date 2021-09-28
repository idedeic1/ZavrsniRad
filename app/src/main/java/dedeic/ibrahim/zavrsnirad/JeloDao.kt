package dedeic.ibrahim.zavrsnirad

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface JeloDao {
    @Query("SELECT * FROM jelo")
    suspend fun getAll(): List<Jelo>
    @Insert
    suspend fun insertAll(vararg jela: Jelo)
}
