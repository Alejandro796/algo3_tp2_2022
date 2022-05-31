package edu.fiuba.algo3.modelo.Sorpresa;
import edu.fiuba.algo3.modelo.Accionable;
import edu.fiuba.algo3.modelo.Vehiculos.Vehiculo;

public class Favorable implements Sorpresa, Accionable {


    public void sorprender(Vehiculo vehiculo){
        vehiculo.reducirMovimientosUnPorcentaje(0.8);
    }
    public void accionar(Vehiculo vehiculo) {
       sorprender(vehiculo);
    }
}
