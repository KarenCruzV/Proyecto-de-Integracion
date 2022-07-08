
package optiuam.bc.modelo;

/**
 * Clase MatrizTransferencia la cual contiene la implementación de la matriz de 
 * transferencia para obtener el comportamiento de la rejilla de Bragg en la 
 * fibra optica.
 * @author Karen Cruz
 */
public class MatrizTransferencia {
    
    /**Numero de cambios de indice de refraccion*/
    private int numCambio = 0;
    /**Indice de refraccion en el nucleo de la fibra smf-28*/
    private float refSmf = (float) 1.45205;
    /**Indice de refraccion de cada rejilla*/
    private float refBragg = (float) 1.41;
    
    public void calculoMatriz(){
        float eta=refSmf/refBragg;
        float eps1=(1/2)*(eta+1/eta);
        float eps2=(1/2)*(eta-1/eta);
        float lamda0 = (float) (1550*(Math.pow(10, -9)));
        float r=lamda0/4*refBragg;
        float l=lamda0/4*refSmf;
               
        /*
        %Transmitividad y reflectividad en una fibra ptica con rejilla de ...
        Bragg usando el m t o d o de la matriz de transferencia
        clear
        close all
        clc
        
        %Datos a introducir:
        %l=input('Escriba el espacio entre los cambios de ndice de ...
        refracci n [um]: '); %espacio entre cada potencial
        %l=l*10ˆ−6;
        N=input('Numero de cambios de ndice de refracci n: '); ...
        %cantidad de rejillas
        %r=input('Grosor de cada cambio [um]:'); %Ancho de cada rejilla
        %r=r*10ˆ−6;
        
        %Definici n de valores fijos
        nc=1.45205; % ndide de refracci n en el n c l e o de la fibra SMF−28
        nr=1.41; % ndide de refracci n de cada rejilla (valor propuesto)
        %nr=1.02249; ndide calculado con neff
        eta=nc/nr;
        eps1=(1/2)*(eta+1/eta);
        eps2=(1/2)*(eta−1/eta);
        lamda0=1550*10ˆ−9;
        r=lamda0/4*nr;
        l=lamda0/4*nc;
        lamda=linspace(1567.*10ˆ−9,1607.*10ˆ−9,1000);
        kc=2*pi*nc./lamda;
        kr=2*pi*nr./lamda;
        n=length(lamda);
        
        for i=1:1:n
        xi(i)=cos(r*kr(i))*cos(l*kc(i))−(eps1*sin(r*kr(i))*sin(l*kc(i)));
        gamma(i)=acos(xi(i));
        %Definici n de la transmitividad
        %T1=1/(1+(abs(1j*eps2*sin(kr*r))*chebyshevU(N,xi))ˆ2);
        u(i)=sin((N)*gamma(i))/sin(gamma(i));
        tp(i)=abs(1j*eps2*sin(kr(i)*r));
        T2(i)=(1/(1+(tp(i)*u(i))ˆ2));
        %Definici n de la reflectitividad
        %R1=1−T1;
        R2(i)=(1−T2(i));
        end
        
        figure(1)
        plot(lamda,T2)
        grid on
        title('Transmitividad')
        xlabel('lamda[m]')
        ylabel('Intensidad')
        ylim([−0.1,1.1])
        
        figure(2)
        plot(lamda,R2)
        grid on
        title('Reflectividad')
        xlabel('lamda[m]')
        ylabel('Intensidad')
        ylim([−0.1,1.1])

        */
    }
    
    /**
     * Clase linspace (a,b,c) que genera un vector linealmente espaciado entre 
     * los valores a y b con c elementos.
     */
    public class linspace {
        private float current;
        private final float end;
        private final float step;
        
        public linspace(float start, float end, float totalCount) {
            this.current=start;
            this.end=end;
            this.step=(end - start) / totalCount;
        }
        
        public boolean hasNext() {
            return current < (end + step/2); //MAY stop floating point error
        }
        
        public float getNextFloat() {
            current+=step;
            return current;
        }
    }
    
}
