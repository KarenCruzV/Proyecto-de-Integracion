
package optiuam.bc.modelo;

import java.util.LinkedList;

/**
 * Clase Multiplexor la cual contiene los atributos principales de un multiplexor
 * @author Arturo Borja
 * @see Componente
 */
public class Multiplexor extends Componente {
    
    /**Identificador del multiplexor. Es diferente al identificador del componente*/
    private int idMux;
    //string donde se actualiza el contenido de las entradas del elemento
    private StringBuilder cEntradas;
    //lista de las entradas del elemento
    private LinkedList<PuertoEntrada> conexionEntradas;
    //Numero entradas del elemento
    private int entradas;
    /**Perdida de insercion del divisor optico*/
    private double perdidaInsercion;
    /**Longitud de onda del divisor optico*/
    private int longitudOnda;

    /**
    * Metodo constructor sin parametros
    */
    public Multiplexor() {
        this.conexionEntradas=new LinkedList();
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

    public StringBuilder getcEntradas() {
        return cEntradas;
    }

    public void setcEntradas(StringBuilder cEntradas) {
        this.cEntradas = cEntradas;
    }

    public LinkedList<PuertoEntrada> getConexionEntradas() {
        return conexionEntradas;
    }

    public void setConexionEntradas(LinkedList<PuertoEntrada> conexionEntradas) {
        this.conexionEntradas = conexionEntradas;
    }

    public int getEntradas() {
        return entradas;
    }

    public void setEntradas(int entradas) {
        this.entradas = entradas;
    }

    public double getPerdidaInsercion() {
        return perdidaInsercion;
    }

    public void setPerdidaInsercion(double perdidaInsercion) {
        this.perdidaInsercion = perdidaInsercion;
    }

    public int getLongitudOnda() {
        return longitudOnda;
    }

    public void setLongitudOnda(int longitudOnda) {
        this.longitudOnda = longitudOnda;
    }
    public void modificarEntradas(int entradas){
        cEntradas=new StringBuilder();
        for(int i=0;i<entradas-1; i++){
            PuertoEntrada puerto= new PuertoEntrada();
            conexionEntradas.add(puerto);
            cEntradas.append(conexionEntradas.get(i).toString());
        }
    }
    @Override
    public String toString() {
        return super.toString()+","+ idMux + "," + entradas + "," + perdidaInsercion + "," + longitudOnda + "," + cEntradas ;
    }
    
    
    /**
     * Metodo toString que retorna los atributos del multiplexor
     * @return nombre, id, conectadoEntrada, elementoConectadoEntrada, 
     * conectadoSalida, elementoConectadoSalida, idMux
     */
    
    
}
