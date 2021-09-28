package dedeic.ibrahim.zavrsnirad

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView

class JeloListAdapter(

    private var jela: List<Jelo>,
    private val onItemClicked: (jelo:Jelo) -> Unit
) : RecyclerView.Adapter<JeloListAdapter.JeloViewHolder>() {

    private lateinit var filterKategorije: Spinner

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JeloViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.iteam_jelo, parent, false)
        return JeloViewHolder(view)
    }
    override fun getItemCount(): Int = jela.size
    override fun onBindViewHolder(holder: JeloViewHolder, position: Int) {
        holder.jeloTitle.text = jela[position].naziv
        holder.cijenaTitle.text = (jela[position].cijena).toInt().toString() + " KM"
        val sifraMatch: String = jela[position].sifra
        val context: Context = holder.jeloImage.getContext()
        var id: Int = context.getResources()
            .getIdentifier(sifraMatch, "drawable", context.getPackageName())
        if (id == 0) id=context.getResources()
            .getIdentifier("picture1", "drawable", context.getPackageName())
        holder.jeloImage.setImageResource(id)
        holder.itemView.setOnClickListener{ onItemClicked(jela[position]) }
    }
    fun updateJela(jela: List<Jelo>) {
        this.jela = jela
        notifyDataSetChanged()
    }
    inner class JeloViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val jeloImage: ImageView = itemView.findViewById(R.id.jeloImage)
        val jeloTitle: TextView = itemView.findViewById(R.id.jeloTitle)
        val cijenaTitle: TextView = itemView.findViewById(R.id.cijenaTitle)
    }


}