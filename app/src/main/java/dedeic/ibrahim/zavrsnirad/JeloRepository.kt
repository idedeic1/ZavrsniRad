package dedeic.ibrahim.zavrsnirad


object JeloRepository {

    fun getPredjela() : List<Jelo> {
        return predjela();
    }

    fun getGlavnaJela() : List<Jelo> {
        return glavnaJela();
    }

    fun getDezerti() : List<Jelo> {
        return dezerti();
    }

    fun getPica() : List<Jelo> {
        return pica();
    }
}