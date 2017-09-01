
/**
 * @author Raul Gonzalez Gonzalez
   @version 3.5.1
 */
class Casa
{
   
    //variables de instancia
    Circle ventana;
    Triangle techo;
    Square pared;
    Square puerta;
    Casa(){
       ventana=new Circle();
       techo=new Triangle();
       pared=new Square();
       puerta=new Square();
    }
    /**metodo que permite dibujar cada uno de los elementos que conforman la 
     * casa.
     */
    void dibujate(){
         ventana.makeVisible();
         techo.makeVisible();
         pared.makeVisible();
         puerta.makeVisible();
    }
    /**
     * metodo que permite acomodar los elementos que conforman una casa para
     * poder representar la misma.ademas de cambiar aspectos de la casa.
     */
    void acomodate(){
       techo.moveHorizontal(100);
       techo.changeSize(60,60);
       techo.moveVertical(50);
       techo.changeColor("black");
       ventana.moveHorizontal(120);
       ventana.changeSize(20);
       ventana.moveVertical(40);
       ventana.changeColor("blue");
       pared.moveHorizontal(60);
       pared.changeSize(60);
       pared.moveVertical(75);
       pared.changeColor("green");
       puerta.moveHorizontal(75);
       puerta.changeColor("red");
       puerta.changeSize(30);
       puerta.moveVertical(105);
    
    
    }
    /**
     * metodo que permite mostrar una segyunda casa en diferente posicion a
     * la primer casa mostrada.
     */
    void mueveIzquierda()
    {
        pared.moveHorizontal(100);
        techo.moveHorizontal(100);
        puerta.moveHorizontal(100);
        ventana.moveHorizontal(100);
    }
}    