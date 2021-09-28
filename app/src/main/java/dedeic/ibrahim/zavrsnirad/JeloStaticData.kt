package dedeic.ibrahim.zavrsnirad

import android.content.res.Resources

fun predjela(): List<Jelo> {
    return listOf(
        Jelo(1, "prs","Paradajz supa", "Domaća paradajz supa.", "Predjelo", "paradajz, tarhana", 7.0),
        Jelo(2, "tlc","Teleća čorba", "Teleća čorba sa gljivama", "Predjelo", "teletina, gljive",9.0),
        Jelo(3,"pls","Pileća salata", "Piletina sa cezar umakom", "Predjelo", "Piletina, paradajz, krastavac, luk",10.0),
        Jelo(4,"sgv","Krem supa", "Domaća krem supa od gljiva.", "Predjelo", "Gljive, začini", 7.0),
        Jelo(5, "grh","Grah", "Tradicionalno jelo spravljeno po domaćem receptu.", "Predjelo", "grah, teletina, začini", 6.0),
        Jelo(6,"tns", "Tuna salata", "Salata sa tunjevinom. ", "Predjelo", "tuna, paradajz, zelena salata, luk",10.0)
    )
}

fun glavnaJela(): List<Jelo> {
    return listOf(
        Jelo(1, "bif","Biftek", "Biftek od 400g sa raznim vrstama povrća grillovanog na roštilju.", "Glavno jelo", "Biftek, paprike, tikvice, patlidžan, gljive", 25.0),
        Jelo(2, "rol","Rolovana piletina", "Rolovana piletina sa sirom i pekarskim krompirom.", "Glavno jelo", "Piletina, krompir, sir, luk",14.0),
        Jelo(3,"nat","Piletina natur", "Natur piletina sa pekarskim krompirom i likom", "Glavno jelo", "Piletina, krompir, sir, luk",14.0),
        Jelo(4,"mar","Pizza Margarita", "Pizza Margerita napravljena od organskih sastojaka.", "Glavno jelo", "Paradajz sos, sir edamer, mozzarella", 9.0),
        Jelo(5, "mex","Pizza Mexicana", "Pizza Mexicana napravljena od organskih sastojaka.", "Glavno jelo", "Paradajz sos, sir, edamer, povrće, sudžuka, feferoni", 10.0),
        Jelo(6, "laz","Lazanje", "Lazanje sa mesom po domaćoj recepturi. ", "Glavno jelo", "Lazanje-tjestenina, faširano juneće meso",15.0)
    )
}

fun dezerti(): List<Jelo> {
    return listOf(
        Jelo(1, "plc","Palačinci nutella", "Palačinke sa nutellom i orasima.", "Desert", "/", 5.0),
        Jelo(2, "sch","Schwarzwald torta", "Black forrest čokoladna kora sa osvježavajućim višnjama i kremom", "Desert", "/", 5.0),
        Jelo(3, "pnc","Pana cotta torta", "Popularna pana cotta torta po domaćem receptu.", "Desert", "/", 5.0),
        Jelo(4, "tir","Tiramisu", "Tirsamisu sa medom i žitaricama.", "Desert", "/", 5.0),
        Jelo(5, "orh","Orah torta", "Orah torta po tradicionalnom receptu.", "Desert", "/", 5.0),
        Jelo(6, "cok","Čokoladna torta", "Čokoladna torta napravljena od tri vrste čokolade.", "Desert", "/", 5.0)
    )
}

fun pica(): List<Jelo> {
    return listOf(
        Jelo(1, "col","Coca - cola", "Coca - cola", "Pića", "/", 2.0),
        Jelo(2, "spr","Sprite", "Sprite", "Pića", "/", 2.0),
        Jelo(3, "fan","Fanta", "Fanta", "Pića", "/", 2.0),
        Jelo(4, "kis","Mineralna voda", "Mineralna voda", "Pića", "/", 2.0),
        Jelo(5, "jui","Juice", "Juice", "Pića", "/", 3.0),
        Jelo(6, "ite","Ice tea", "Ice tea", "Pića", "/", 3.0)
    )
}