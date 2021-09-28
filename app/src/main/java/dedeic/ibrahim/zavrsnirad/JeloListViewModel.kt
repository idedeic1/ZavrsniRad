package dedeic.ibrahim.zavrsnirad

import dedeic.ibrahim.zavrsnirad.Jelo
import dedeic.ibrahim.zavrsnirad.JeloRepository


class JeloListViewModel {



    fun getPredjela():List<Jelo>{
        return JeloRepository.getPredjela();
    }

    fun getGlavnaJela():List<Jelo>{
        return JeloRepository.getGlavnaJela();
    }

    fun getDezerti():List<Jelo>{
        return JeloRepository.getDezerti();
    }

    fun getPica():List<Jelo>{
        return JeloRepository.getPica();
    }


}