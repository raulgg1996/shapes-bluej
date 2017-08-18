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
    void dibujate(){
         ventana.makeVisible();
         techo.makeVisible();
         pared.makeVisible();
         puerta.makeVisible();
    }
    void acomodate(){
         
    
    
    }
}    