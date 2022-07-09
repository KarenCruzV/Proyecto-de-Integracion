
package optiuam.bc.modelo;

/**
 * Clase Demultiplexor la cual contiene los atributos principales de un demultiplexor
 * @author Arturo Borja
 * @see Componente
 */
public class Demultiplexor extends Componente {
    
    /**Identificador del demultiplexor. Es diferente al identificador del componente*/
    private int idDemux;

    /**
    * Metodo constructor sin parametros
    */
    public Demultiplexor() {
    }
    
    /**
    * Metodo constructor con parametros
     * @param nombre Nombre del componente
     * @param id Identificador del componente
     * @param elementoConectado Nombre del componente el cual se encuentra conectado con el demultiplexor
     * @param conectado Indica si el componente esta conectado
    */
    public Demultiplexor(String nombre, int id,String elementoConectado, boolean conectado) {
        this.nombre = nombre;
        this.id = id;
    }

    /**
     * Metodo que muestra el identificador del demultiplexor, no el del componente
     * @return idDemux
     */
    public int getIdDemux() {
        return idDemux;
    }

    /**
     * Metodo que modifica el identificador del demultiplexor, no el del componente
     * @param idDemux Identificador del demultiplexor
     */
    public void setIdDemux(int idDemux) {
        this.idDemux = idDemux;
    }
    
    /**
     * Metodo toString que retorna los atributos del demultiplexor
     * @return nombre, id, conectadoEntrada, elementoConectadoEntrada, 
     * conectadoSalida, elementoConectadoSalida, idDemux
     */
    @Override
    public String toString() {
        return super.toString()+","+idDemux;
    }
    
}
