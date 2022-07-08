
package optiuam.bc.modelo;

/**
 * Clase FBG la cual contiene los atributos principales de una rejilla de Bragg 
 * (FBG)
 * @author Karen Cruz
 * @see Componente
 */
public class FBG extends Componente {
    
    /**Identificador de la rejilla de Bragg. Es diferente al identificador del componente*/
    private int idFBG;

    /**
    * Metodo constructor sin parametros
    */
    public FBG() {
    }
    
    /**
    * Metodo constructor con parametros
     * @param nombre Nombre del componente
     * @param id Identificador del componente
     * @param elementoConectado Nombre del componente el cual se encuentra conectado con la rejilla de Bragg
     * @param conectado Indica si el componente esta conectado
    */
    public FBG(String nombre, int id,String elementoConectado, boolean conectado) {
        this.nombre = nombre;
        this.id = id;
    }

    /**
     * Metodo que muestra el identificador de la rejilla de Bragg, no el del componente
     * @return idFBG
     */
    public int getIdFBG() {
        return idFBG;
    }

    /**
     * Metodo que modifica el identificador de la rejilla de Bragg, no el del componente
     * @param idFBG Identificador de la rejilla de Bragg (FBG)
     */
    public void setIdFBG(int idFBG) {
        this.idFBG = idFBG;
    }
    
    /**
     * Metodo toString que retorna los atributos de la rejilla de Bragg
     * @return nombre, id, conectadoEntrada, elementoConectadoEntrada, 
     * conectadoSalida, elementoConectadoSalida, idFBG
     */
    @Override
    public String toString() {
        return super.toString()+","+idFBG;
    }
    
}
