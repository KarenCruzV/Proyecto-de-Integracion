
package optiuam.bc.controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import optiuam.bc.modelo.ElementoGrafico;

/**
 * Clase VentanaFBGController la cual se encarga de proporcionar la
 * funcionalidad a la rejilla de Bragg (FBG)
 * @author Karen Cruz
 * @see ControladorGeneral
 */
public class VentanaFBGController extends ControladorGeneral implements Initializable {
    
    /**Controlador del simulador*/
    ControladorGeneral controlador;
    /**Escenario en el cual se agregaran los objetos creados*/
    Stage stage;
    /**Elemento grafico de la rejilla de Bragg (FBG)*/
    ElementoGrafico elemG;
    /**Controlador de la rejilla de Bragg (FBG)*/
    VentanaFBGController fbgControl;
    /**Posicion de la rejilla de Bragg en el eje X*/
    static double posX;
    /**Posicion de la rejilla de Bragg en el eje Y*/
    static double posY;
    
    /***/
    @FXML
    ComboBox cboxConectarA;
    /**Panel para agregar objetos*/
    @FXML
    private Pane Pane1;
    /**Espacio en el cual el usuario puede desplazarse*/
    @FXML
    private ScrollPane scroll;

    /**
     * Metodo que muestra la posicion de la rejilla de Bragg en el eje X
     * @return posX
     */
    public static double getPosX() {
        return posX;
    }

    /**
     * Metodo que modifica la posicion de la rejilla de Bragg en el eje X
     * @param posX Posicion en el eje X
     */
    public static void setPosX(double posX) {
        VentanaFBGController.posX = posX;
    }

    /**
     * Metodo que muestra la posicion de la rejilla de Bragg en el eje Y
     * @return posY
     */
    public static double getPosY() {
        return posY;
    }

    /**
     * Metodo que modifica la posicion de la rejilla de Bragg en el eje Y
     * @param posY Posicion en el eje Y
     */
    public static void setPosY(double posY) {
        VentanaFBGController.posY = posY;
    }
    
    /**
     * Metodo el cual inicializa la ventana de la rejilla de Bragg (FBG)
     * @param url La ubicacion utilizada para resolver rutas relativas para 
     * el objeto raiz, o nula si no se conoce la ubicacion
     * @param rb Los recursos utilizados para localizar el objeto raiz, o nulo 
     * si el objeto raiz no se localizo
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
    /**
     * Metodo para cerrar la ventana de la rejilla de Bragg (FBG)
     * @param event Representa cualquier tipo de accion
     */
    public void cerrarVentana(ActionEvent event){
        Node source = (Node) event.getSource();
        Stage s = (Stage) source.getScene().getWindow();
        s.close();
    }
    
    /**
     * Metodo que proporciona lo necesario para que la ventana reconozca a 
     * que elemento se refiere
     * @param controlador Controlador del simulador
     * @param stage Escenario en el cual se agregan los objetos creados
     * @param Pane1 Panel para agregar objetos
     * @param scroll Espacio en el cual el usuario puede desplazarse
     * @param elem Elemento grafico
     */
    void init(ControladorGeneral controlador, Stage stage, Pane Pane1, ScrollPane scroll, ElementoGrafico elem) {
        this.controlador=controlador;
        this.stage=stage;
        this.Pane1=Pane1;
        this.scroll=scroll;
        this.elemG=elem;
    }
    
    /**
     * Metodo que recibe el elemento y el controlador y, a partir de estos,
     * puede mostrar los valores inciales del elemento 
     * @param controlador Controlador del simulador
     * @param stage Escenario en el cual se agregan los objetos creados
     * @param Pane1 Panel para agregar objetos
     * @param elem Elemento grafico
     * @param fbgController Controlador de la rejilla de Bragg (FBG)
    */
    public void init2(ControladorGeneral controlador, Stage stage, Pane Pane1,ElementoGrafico elem, VentanaFBGController fbgController) {
        this.elemG=elem;
        this.controlador=controlador;
        this.stage=stage;
        this.Pane1=Pane1;
        this.fbgControl=fbgController;
        
        if(elemG.getComponente().isConectadoSalida()==true){
            fbgControl.cboxConectarA.getSelectionModel().select(elemG.getComponente().getElementoConectadoSalida());
        }
        else{
            fbgControl.cboxConectarA.getItems().add("Desconected");
            fbgControl.cboxConectarA.getSelectionModel().select(0);
            for(int elemento=0; elemento<controlador.getElementos().size(); elemento++){
                if("spectrum".equals(controlador.getElementos().get(elemento).getNombre())){
                    if(!controlador.getElementos().get(elemento).isConectadoEntrada()){
                        fbgControl.cboxConectarA.getItems().add(controlador.getDibujos().get(elemento).getDibujo().getText());
                    }
                }
            }
        }
    }
    
}
