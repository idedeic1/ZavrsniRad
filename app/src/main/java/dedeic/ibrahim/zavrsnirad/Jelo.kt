package dedeic.ibrahim.zavrsnirad

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class Jelo (
    @PrimaryKey @SerializedName("id") val id: Long,
    @ColumnInfo(name = "password") @SerializedName("password") val sifra: String,
    @ColumnInfo(name = "name") @SerializedName("name") val naziv: String,
    @ColumnInfo(name = "description") @SerializedName("description")val opis: String,
    @ColumnInfo(name = "category") @SerializedName("category") val kategorija: String,
    @ColumnInfo(name = "content") @SerializedName("content") val sastav: String,
    @ColumnInfo(name = "price") @SerializedName("price")val cijena: Double
)
