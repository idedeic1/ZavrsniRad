package dedeic.ibrahim.zavrsnirad

import dedeic.ibrahim.zavrsnirad.JeloRepository.getPredjela

class JeloDetailViewModel {
    fun getJelobyNaziv(name:String):Jelo{
        var jela: ArrayList<Jelo> = arrayListOf()
        jela.addAll(JeloRepository.getPredjela())
        jela.addAll(JeloRepository.getDezerti())
        jela.addAll(JeloRepository.getGlavnaJela())
        jela.addAll(JeloRepository.getPica())
        val jelo= jela.find { jelo -> name.equals(jelo.naziv) }
        //ako jelo ne postoji vratimo testni
        return jelo?:Jelo(0,"NULL","NULL","NULL","NULL","NULL",0.0)
    }
}