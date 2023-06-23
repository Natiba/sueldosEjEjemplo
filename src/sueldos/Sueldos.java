
package sueldos;

import Entidades.Vendedor;
import Servicio.VendedorServicio;

/**
 *
 * @author nataliaba
 */
public class Sueldos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        VendedorServicio vs = new VendedorServicio();
        
        // Aca tomo el vendedor recien creador 'vs' y le doy los atributos q fui creando en el alta de servicios
        Vendedor v1 = vs.altaVendedor(); 
        
        // Una vez que tengo esto puedo pasarle los metodos que hice en Servicio
        
        vs.sueldoMensual(v1);
        vs.vacaciones(v1);
    }
    
}
