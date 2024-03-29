package edu.fiuba.algo3.modelo.Obstaculo;

import edu.fiuba.algo3.modelo.Accionable;
import edu.fiuba.algo3.modelo.Vehiculos.Auto;
import edu.fiuba.algo3.modelo.Vehiculos.Moto;
import edu.fiuba.algo3.modelo.Vehiculos.TodoTerreno;
import edu.fiuba.algo3.modelo.Vehiculos.Vehiculo;

public class Pozo implements Obstaculo, Accionable {

    public int aplicarPenalizacion(Vehiculo vehiculo) {
        return vehiculo.incrementarMovimientos(this);
    }


    public int aplicarPenalizacion(Moto moto){
        return 3;
    }


    public int aplicarPenalizacion(Auto auto) {
        return 3;
    }


    public int aplicarPenalizacion(TodoTerreno todoTerreno) {
        // aca hay que ver como hacer para ver si lo penalizas (si tiene dos pozos cruzados) o no
        return 0;
    }


    public void accionar(Vehiculo vehiculo) {
         aplicarPenalizacion(vehiculo);
    }

}
