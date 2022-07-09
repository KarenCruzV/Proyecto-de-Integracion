
package optiuam.bc.modelo;

/**
 * Clase Multiplexor la cual contiene los atributos principales de un multiplexor
 * @author Arturo Borja
 * @see Componente
 */
public class Multiplexor extends Componente {
    
    /**Identificador del multiplexor. Es diferente al identificador del componente*/
    private int idMux;

    /**
    * Metodo constructor sin parametros
    */
    public Multiplexor() {
    }
    
    /**
    * Metodo constructor con parametros
     * @param nombre Nombre del componente
     * @param id Identificador del componente
     * @param elementoConectado Nombre del componente el cual se encuentra conectado con el multiplexor
     * @param conectado Indica si el componente esta conectado
    */
    public Multiplexor(String nombre, int id,String elementoConectado, boolean conectado) {
        this.nombre = nombre;
        this.id = id;
    }

    /**
     * Metodo que muestra el identificador del multiplexor, no el del componente
     * @return idMux
     */
    public int getIdMux() {
        return idMux;
    }

    /**
     * Metodo que modifica el identificador del multiplexor, no el del componente
     * @param idMux Identificador del multiplexor
     */
    public void setIdMux(int idMux) {
        this.idMux = idMux;
    }
    
    /**
     * Metodo toString que retorna los atributos del multiplexor
     * @return nombre, id, conectadoEntrada, elementoConectadoEntrada, 
     * conectadoSalida, elementoConectadoSalida, idMux
     */
    @Override
    public String toString() {
        return super.toString()+","+idMux;
    }
    
}
