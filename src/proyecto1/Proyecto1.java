/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;
import java.util.Scanner;

/**
 *
 * @author Carlos Flores
 */
public class Proyecto1 {
     static Scanner principal=new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

      int opciones=0;
       
      do{
           System.out.println("Bienvenido al Consencionario de Autos");
      System.out.println("-Menú Principal- "
      +""
      +"");
      System.out.println("1. Seleccionar Automóvil");
      System.out.println("2. Salir");
      String cadena = new String();
      System.out.println("Porfavor ingrese una opción a ejecutar");
          opciones=principal.nextInt();
          switch(opciones){
          case 1:
                  seleccionar_auto();
                          break;
          case 2:
                  salir();
                          break;
          default:
              System.out.println("Error, porfavor escoja un número correcto");
                           }
      }
      while(opciones!=2); }
      /* Aquí se tiene el proceso trabajado con Do y While para que puedan escoger
    la opción correcta y de no ser así se tiene que empezar de nuevo y dando una
    advertencia, de esta forma seguira el submenú para seleccionar el vehículo.    
    */
    
    static void seleccionar_auto(){
        System.out.println("Consencionario de Autos");
        System.out.println("- Selección de Gama de Vehículo"
        +""
                + "");
        System.out.println("01. Sedán Económico");
      System.out.println("02. Sedán");
        System.out.println("03. Deportivo");
        System.out.println("04. Híbrido");
        System.out.println("05. Coupe");
       System.out.println("06. Coupe Deportivo");
       System.out.println("07. Compacto");
       System.out.println("08. Hatchback");
       System.out.println("09. Económico versión Rally");
       System.out.println("10. Regresar a menú principal"); 

        System.out.println("Porfavor ingrese la gama del vehículo");
         int opcionessele = principal.nextInt();
         
         switch(opcionessele){
                case 1:
                  sedan_economico();
                          break;
          case 2:
                  sedan();
                          break;
         case 3:
                  deportivo();
                          break;
                case 4:
                  hibrido();
                          break;
          case 5:
                  coupe();
                          break;
                case 6:
                  coupe_deportivo();
                          break;
          case 7:
                  compacto();
                          break;
                case 8:
                  hatchback();
                          break;
          case 9:
                  ecorv();
                          break;
                case 10:
                  menup();
                          break;
                          
          default:
              System.out.println("Error, porfavor escoja un número correcto");
         }
    }
    static void salir(){
        System.out.println(
                ""+
                "Gracias por su visita, esperamos verlo nuevamente");
                       }
   /* Aquí llegamos al seleccionar un vehículo y si se desea salir también tenemos
la opción para que el cliente y usuario decida cual opción escoger y de esta forma
se terminara el programa o seguimos con la compra del vehículo    
    */
     static void sedan_economico() {
                System.out.println("Consencionario de Autos");
        System.out.println("- Selección de Gama de Vehículo"
        +""
        +"");
        
        System.out.println("Ha seleccionado la gama: Sedán Económico");
        System.out.println("¿Desea agregar amenidades? (1 = Si /2 = No)");
        int opcionveh = principal.nextInt();
        switch(opcionveh)
        {
            case 1:
                 amenidad();
                break;
            case 2:
                 noamenidad();
                break;
            default:
                System.out.println("Escoger bien su respuesta");
        }  }
          static void sedan() {
                System.out.println("Consencionario de Autos");
        System.out.println("- Selección de Gama de Vehículo"+""
        +"");
        
        System.out.println("Ha seleccionado la gama: Sedán");
        System.out.println("¿Desea agregar amenidades? (1 = Si /2 = No)");
        int opcionveh= principal.nextInt();
          switch(opcionveh)
        {
            case 1:
                 amenidad1();
                break;
            case 2:
                 noamenidad1();
                break;
            default:
                System.out.println("Escoger bien su respuesta");
        }  
    }
       static void deportivo() {
                System.out.println("Consencionario de Autos");
        System.out.println("- Selección de Gama de Vehículo"+""
        +"");
        
        System.out.println("Ha seleccionado la gama: Deportivo");
        System.out.println("¿Desea agregar amenidades? (1 = Si /2 = No)");
        int opcionveh = principal.nextInt();
            switch(opcionveh)
        {
            case 1:
                 amenidad2();
                break;
            case 2:
                 noamenidad2();
                break;
            default:
                System.out.println("Escoger bien su respuesta");
        } 
         }
        static void hibrido() {
                System.out.println("Consencionario de Autos");
        System.out.println("- Selección de Gama de Vehículo"+""
        +"");
        
        System.out.println("Ha seleccionado la gama: Hibrido");
        System.out.println("¿Desea agregar amenidades? (1 = Si /2 = No)");
        int opcionveh = principal.nextInt();
            switch(opcionveh)
        {
            case 1:
                 amenidad3();
                break;
            case 2:
                 noamenidad3();
                break;
            default:
                System.out.println("Escoger bien su respuesta");
        } 
               }
        static void coupe() {
                System.out.println("Consencionario de Autos");
        System.out.println("- Selección de Gama de Vehículo"+""
        +"");
        
        System.out.println("Ha seleccionado la gama: Coupe");
        System.out.println("¿Desea agregar amenidades?(1 = Si /2 = No)");
        int opcionveh = principal.nextInt();
            switch(opcionveh)
        {
            case 1:
                 amenidad4();
                break;
            case 2:
                 noamenidad4();
                break;
            default:
                System.out.println("Escoger bien su respuesta");
        } 
                     }
        static void coupe_deportivo() {
                System.out.println("Consencionario de Autos");
        System.out.println("- Selección de Gama de Vehículo"+""
        +"");
        
        System.out.println("Ha seleccionado la gama: Coupe Deportivo");
        System.out.println("¿Desea agregar amenidades? (1 = Si /2 = No)");
        int opcionveh = principal.nextInt();
            switch(opcionveh)
        {
            case 1:
                 amenidad5();
                break;
            case 2:
                 noamenidad5();
                break;
            default:
                System.out.println("Escoger bien su respuesta");
        } 
                        }
        static void compacto() {
                System.out.println("Consencionario de Autos");
        System.out.println("- Selección de Gama de Vehículo"+""
        +"");
        
        System.out.println("Ha seleccionado la gama: Sedán Económico");
        System.out.println("¿Desea agregar amenidades?(1 = Si /2 = No)");
        int opcionveh = principal.nextInt();
            switch(opcionveh)
        {
            case 1:
                 amenidad6();
                break;
            case 2:
                 noamenidad6();
                break;
            default:
                System.out.println("Escoger bien su respuesta");
        } 
                          }
        static void hatchback() {
                System.out.println("Consencionario de Autos");
        System.out.println("- Selección de Gama de Vehículo"+""
        +"");
        
        System.out.println("Ha seleccionado la gama: Hatchback");
        System.out.println("¿Desea agregar amenidades? (1 = Si /2 = No)");
        int opcionveh = principal.nextInt();
                     switch(opcionveh)
        {
            case 1:
                 amenidad7();
                break;
            case 2:
                 noamenidad7();
                break;
            default:
                System.out.println("Escoger bien su respuesta");
        }               
        }
        static void ecorv() {
                System.out.println("Consencionario de Autos");
        System.out.println("- Selección de Gama de Vehículo"+""
        +"");
        
        System.out.println("Ha seleccionado la gama: Económico versión Rally");
        System.out.println("¿Desea agregar amenidades?(1 = Si /2 = No)");
        int opcionveh = principal.nextInt();
    switch(opcionveh)
        {
            case 1:
                 amenidad8();
                break;
            case 2:
                 noamenidad8();
                break;
            default:
                System.out.println("Escoger bien su respuesta");
        } 
 }
        static void menup() {
    int opciones=0;
       
      do{
           System.out.println("Bienvenido al Consencionario de Autos");
      System.out.println("-Menú Principal- "+""
        +"");
      System.out.println("1. Seleccionar Automóvil");
      System.out.println("2. Salir");
      String cadena = new String();
      System.out.println("Porfavor ingrese una opción a ejecutar");
          opciones=principal.nextInt();
          switch(opciones){
          case 1:
                  seleccionar_auto();
                          break;
          case 2:
                  salir();
                          break;
          default:
              System.out.println("Error, porfavor escoja un número correcto");
                           }
      }
      while(opciones!=2); }     
        
/* En esta sección extensa se obtienen las 10 opciones de los vehiculos que se
        ofrecen para que pueda escoger el cliente y con ello se ofrece amenidades
        o simplemente regresar al menú principal y comenzar de nuevo*/
 
        static void amenidad() {
System.out.println("Consencionario de Autos");
        System.out.println("- Selección de Amenidades"
        +""
        );
          System.out.println("Ha seleccionado la gama: Sedán Económico");
        System.out.println("01. Tipo de transmisión");
      System.out.println("02. Color de pintura exterior");
        System.out.println("03. Aros");
        System.out.println("04. Accesorios exteriores");
        System.out.println("05. Accesorios interiores");
       System.out.println("06. Accesorios electrónicos");
       System.out.println("07. Regresar a selección de gama de vehículo");

       
       System.out.println(""
               + "Ingrese porfavor el tipo de amenidad");
       int opcioname=principal.nextInt();
       switch(opcioname){  
                case 1:
                   transmision();
                          break;
               case 2:
                   pintura();
                          break;
               case 3:
                   aros();
                          break;
               case 4:
                   exteriores();
                          break;
               case 5:
                   interiores();
                          break;
               case 6:
                   electronicos();
                          break;
               case 7:
                   regresar_gama();
                          break;
                   

 } } 
                static void amenidad1() {
System.out.println("Consencionario de Autos");
        System.out.println("- Selección de Amenidades"
        +""
        );
          System.out.println("Ha seleccionado la gama: Sedán Económico");
        System.out.println("01. Tipo de transmisión");
      System.out.println("02. Color de pintura exterior");
        System.out.println("03. Aros");
        System.out.println("04. Accesorios exteriores");
        System.out.println("05. Accesorios interiores");
       System.out.println("06. Accesorios electrónicos");
       System.out.println("07. Regresar a selección de gama de vehículo");

       
       System.out.println(""
               + "Ingrese porfavor el tipo de amenidad");
       int opcioname=principal.nextInt();
       switch(opcioname){  
          case 1:
                   transmision();
                          break;
               case 2:
                   pintura();
                          break;
               case 3:
                   aros();
                          break;
               case 4:
                   exteriores();
                          break;
               case 5:
                   interiores();
                          break;
               case 6:
                   electronicos();
                          break;
               case 7:
                   regresar_gama();
                          break;
                   
 } }
                  static void amenidad2() {
System.out.println("Consencionario de Autos");
        System.out.println("- Selección de Amenidades"
        +""
        );
          System.out.println("Ha seleccionado la gama: Sedán Económico");
        System.out.println("01. Tipo de transmisión");
      System.out.println("02. Color de pintura exterior");
        System.out.println("03. Aros");
        System.out.println("04. Accesorios exteriores");
        System.out.println("05. Accesorios interiores");
       System.out.println("06. Accesorios electrónicos");
       System.out.println("07. Regresar a selección de gama de vehículo");

       
       System.out.println(""
               + "Ingrese porfavor el tipo de amenidad");
       int opcioname=principal.nextInt();
       switch(opcioname){  
              case 1:
                   transmision();
                          break;
               case 2:
                   pintura();
                          break;
               case 3:
                   aros();
                          break;
               case 4:
                   exteriores();
                          break;
               case 5:
                   interiores();
                          break;
               case 6:
                   electronicos();
                          break;
               case 7:
                   regresar_gama();
                          break;
                     

 } } 
                    static void amenidad3() {
System.out.println("Consencionario de Autos");
        System.out.println("- Selección de Amenidades"
        +""
        );
          System.out.println("Ha seleccionado la gama: Sedán Económico");
        System.out.println("01. Tipo de transmisión");
      System.out.println("02. Color de pintura exterior");
        System.out.println("03. Aros");
        System.out.println("04. Accesorios exteriores");
        System.out.println("05. Accesorios interiores");
       System.out.println("06. Accesorios electrónicos");
       System.out.println("07. Regresar a selección de gama de vehículo");

       
       System.out.println(""
               + "Ingrese porfavor el tipo de amenidad");
       int opcioname=principal.nextInt();
       switch(opcioname){  
                case 1:
                   transmision();
                          break;
               case 2:
                   pintura();
                          break;
               case 3:
                   aros();
                          break;
               case 4:
                   exteriores();
                          break;
               case 5:
                   interiores();
                          break;
               case 6:
                   electronicos();
                          break;
               case 7:
                   regresar_gama();
                          break;
                   

 } } 
                      static void amenidad4() {
System.out.println("Consencionario de Autos");
        System.out.println("- Selección de Amenidades"
        +""
        );
          System.out.println("Ha seleccionado la gama: Sedán Económico");
        System.out.println("01. Tipo de transmisión");
      System.out.println("02. Color de pintura exterior");
        System.out.println("03. Aros");
        System.out.println("04. Accesorios exteriores");
        System.out.println("05. Accesorios interiores");
       System.out.println("06. Accesorios electrónicos");
       System.out.println("07. Regresar a selección de gama de vehículo");

       
       System.out.println(""
               + "Ingrese porfavor el tipo de amenidad");
       int opcioname=principal.nextInt();
       switch(opcioname){  
               case 1:
                   transmision();
                          break;
               case 2:
                   pintura();
                          break;
               case 3:
                   aros();
                          break;
               case 4:
                   exteriores();
                          break;
               case 5:
                   interiores();
                          break;
               case 6:
                   electronicos();
                          break;
               case 7:
                   regresar_gama();
                          break;
                   

 } } 
                        static void amenidad5() {
System.out.println("Consencionario de Autos");
        System.out.println("- Selección de Amenidades"
        +""
        );
          System.out.println("Ha seleccionado la gama: Sedán Económico");
        System.out.println("01. Tipo de transmisión");
      System.out.println("02. Color de pintura exterior");
        System.out.println("03. Aros");
        System.out.println("04. Accesorios exteriores");
        System.out.println("05. Accesorios interiores");
       System.out.println("06. Accesorios electrónicos");
       System.out.println("07. Regresar a selección de gama de vehículo");

       
       System.out.println(""
               + "Ingrese porfavor el tipo de amenidad");
       int opcioname=principal.nextInt();
       switch(opcioname){  
               case 1:
                   transmision();
                          break;
               case 2:
                   pintura();
                          break;
               case 3:
                   aros();
                          break;
               case 4:
                   exteriores();
                          break;
               case 5:
                   interiores();
                          break;
               case 6:
                   electronicos();
                          break;
               case 7:
                   regresar_gama();
                          break;
                   
                   

 } } 
                          static void amenidad6() {
System.out.println("Consencionario de Autos");
        System.out.println("- Selección de Amenidades"
        +""
        );
          System.out.println("Ha seleccionado la gama: Sedán Económico");
        System.out.println("01. Tipo de transmisión");
      System.out.println("02. Color de pintura exterior");
        System.out.println("03. Aros");
        System.out.println("04. Accesorios exteriores");
        System.out.println("05. Accesorios interiores");
       System.out.println("06. Accesorios electrónicos");
       System.out.println("07. Regresar a selección de gama de vehículo");

       
       System.out.println(""
               + "Ingrese porfavor el tipo de amenidad");
       int opcioname=principal.nextInt();
       switch(opcioname){  
                case 1:
                   transmision();
                          break;
               case 2:
                   pintura();
                          break;
               case 3:
                   aros();
                          break;
               case 4:
                   exteriores();
                          break;
               case 5:
                   interiores();
                          break;
               case 6:
                   electronicos();
                          break;
               case 7:
                   regresar_gama();
                          break;
                   

 } } 
                            static void amenidad7() {
System.out.println("Consencionario de Autos");
        System.out.println("- Selección de Amenidades"
        +""
        );
          System.out.println("Ha seleccionado la gama: Sedán Económico");
        System.out.println("01. Tipo de transmisión");
      System.out.println("02. Color de pintura exterior");
        System.out.println("03. Aros");
        System.out.println("04. Accesorios exteriores");
        System.out.println("05. Accesorios interiores");
       System.out.println("06. Accesorios electrónicos");
       System.out.println("07. Regresar a selección de gama de vehículo");

       
       System.out.println(""
               + "Ingrese porfavor el tipo de amenidad");
       int opcioname=principal.nextInt();
       switch(opcioname){  
                case 1:
                   transmision();
                          break;
               case 2:
                   pintura();
                          break;
               case 3:
                   aros();
                          break;
               case 4:
                   exteriores();
                          break;
               case 5:
                   interiores();
                          break;
               case 6:
                   electronicos();
                          break;
               case 7:
                   regresar_gama();
                          break;
                   

 } } 
                              static void amenidad8() {
System.out.println("Consencionario de Autos");
        System.out.println("- Selección de Amenidades"
        +""
        );
          System.out.println("Ha seleccionado la gama: Sedán Económico");
        System.out.println("01. Tipo de transmisión");
      System.out.println("02. Color de pintura exterior");
        System.out.println("03. Aros");
        System.out.println("04. Accesorios exteriores");
        System.out.println("05. Accesorios interiores");
       System.out.println("06. Accesorios electrónicos");
       System.out.println("07. Regresar a selección de gama de vehículo");

       
       System.out.println(""
               + "Ingrese porfavor el tipo de amenidad");
       int opcioname=principal.nextInt();
       switch(opcioname){  
               case 1:
                   transmision();
                          break;
               case 2:
                   pintura();
                          break;
               case 3:
                   aros();
                          break;
               case 4:
                 exteriores();
                          break;
               case 5:
                   interiores();
                          break;
               case 6:
                   electronicos();
                          break;
               case 7:
                   regresar_gama();
                          break;
                   

 } } 
  static void noamenidad(){
System.out.println("Consencionario de Autos");
        System.out.println("- Selección de Amenidades"
        +"" );
System.out.println("Gama Seleccionada: Sedán Económico"+ "     USD 18,940");
System.out.println("Amenidades: Ninguna");
System.out.println("Total:"+"                                 USD 18.940");
System.out.println(""+
        ""+
        "Presiona cualquier número para regresar al menú principal");

int opciofinal=principal.nextInt();
       switch(opciofinal){                
            case 1:
                  menup();
                          break;

         }
  }
 static void noamenidad1(){
System.out.println("Consencionario de Autos");
        System.out.println("- Selección de Amenidades"
        +"" );
System.out.println("Gama Seleccionada: Sedán"+ "     USD 23,570");
System.out.println("Amenidades: Ninguna");
System.out.println("Total:"+"                       USD 23,570");
System.out.println(""+
        ""+
        "Presiona cualquier número para regresar al menú principal");

int opciofinal=principal.nextInt();
       switch(opciofinal){                
            case 1:
                  menup();
                          break;

         }
  }
  static void noamenidad2(){
System.out.println("Consencionario de Autos");
        System.out.println("- Selección de Amenidades"
        +"" );
System.out.println("Gama Seleccionada: Sedán"+ "     USD 24,100");
System.out.println("Amenidades: Ninguna");
System.out.println("Total:"+"                       USD 24,100");
System.out.println(""+
        ""+
        "Presiona cualquier número para regresar al menú principal");

int opciofinal=principal.nextInt();
       switch(opciofinal){                
            case 1:
                  menup();
                          break;

         }
  }
   static void noamenidad3(){
System.out.println("Consencionario de Autos");
        System.out.println("- Selección de Amenidades"
        +"" );
System.out.println("Gama Seleccionada: Hibrido"+ "     USD 24,100");
System.out.println("Amenidades: Ninguna");
System.out.println("Total:"+"                         USD 24,100");
System.out.println(""+
        ""+
        "Presiona cualquier número para regresar al menú principal");

int opciofinal=principal.nextInt();
       switch(opciofinal){                
            case 1:
                  menup();
                          break;

         }
  }
    static void noamenidad4(){
System.out.println("Consencionario de Autos");
        System.out.println("- Selección de Amenidades"
        +"" );
System.out.println("Gama Seleccionada: Coupe"+ "     USD 19,350");
System.out.println("Amenidades: Ninguna");
System.out.println("Total:"+"                       USD 19.350");
System.out.println(""+
        ""+
        "Presiona cualquier número para regresar al menú principal");

int opciofinal=principal.nextInt();
       switch(opciofinal){                
            case 1:
                  menup();
                          break;

         }
  }
     static void noamenidad5(){
System.out.println("Consencionario de Autos");
        System.out.println("- Selección de Amenidades"
        +"" );
System.out.println("Gama Seleccionada: Coupe Deportivo"+ "     USD 24,100");
System.out.println("Amenidades: Ninguna");
System.out.println("Total:"+"                                 USD 24,100");
System.out.println(""+
        ""+
        "Presiona cualquier número para regresar al menú principal");

int opciofinal=principal.nextInt();
       switch(opciofinal){                
            case 1:
                  menup();
                          break;

         }
  }
      static void noamenidad6(){
System.out.println("Consencionario de Autos");
        System.out.println("- Selección de Amenidades"
        +"" );
System.out.println("Gama Seleccionada: Compacto"+ "     USD 16,190");
System.out.println("Amenidades: Ninguna");
System.out.println("Total:"+"                          USD 16.190");
System.out.println(""+
        ""+
        "Presiona cualquier número para regresar al menú principal");

int opciofinal=principal.nextInt();
       switch(opciofinal){                
            case 1:
                  menup();
                          break;

         }
  }
       static void noamenidad7(){
System.out.println("Consencionario de Autos");
        System.out.println("- Selección de Amenidades"
        +"" );
System.out.println("Gama Seleccionada: Hatchback"+ "     USD 20,150");
System.out.println("Amenidades: Ninguna");
System.out.println("Total:"+"                           USD 20,150");
System.out.println(""+
        ""+
        "Presiona cualquier número para regresar al menú principal");

int opciofinal=principal.nextInt();
       switch(opciofinal){                
            case 1:
                  menup();
                          break;

         }
  }
        static void noamenidad8(){
System.out.println("Consencionario de Autos");
        System.out.println("- Selección de Amenidades"
        +"" );
System.out.println("Gama Seleccionada: Económico versión Rally"+ "     USD 34,700");
System.out.println("Amenidades: Ninguna");
System.out.println("Total:"+"                                         USD 34,700");
System.out.println(""+
        ""+
        "Presiona cualquier número para regresar al menú principal");

int opciofinal=principal.nextInt();
       switch(opciofinal){                
            case 1:
                  menup();
                          break;

         }
  }
       
/* Aquí se ofrecen una sección de amenidades en las cuales el usuario cuando
pulse el vehículo cual necesita, se le brindarán todos los datos o simplemente
seguir sin amenidades*/


     static void transmision() {
        System.out.println("Consencionario de Autos");
        System.out.println("- Selección de Amenidades"
        +"" );
             System.out.println("Selección de Tipo de Transmisión");
      System.out.println("01. Manual:"+"                                      USD 00.00");
      System.out.println("02. CVT:"+"                                         USD 800.00");
      System.out.println("03. Manual con Turbo:"+"                            USD 00.00");
      System.out.println("04. CVT con Turbo:"+"                               USD 800.00");
      
      System.out.println("05. Regresar a selección de amenidades");
      int opciotr=principal.nextInt();
       switch(opciotr){                
            case 1:
                  manual(); 
                          break;
            case 2:
                  cvturbo();
                          break;
            case 3:
                  manualt();
                          break;                          
            case 4:
                  cvtturbo();
                          break;
            case 5:
                  amenidades();
                          break;
       }
  }

    private static void pintura() {
    System.out.println("Consencionario de Autos");
        System.out.println("- Selección de Amenidades"
        +"" );
             System.out.println("Selección de Tipo de Pintura");
      System.out.println("01. Cosmic Blue:"+"                         USD 00.00");
      System.out.println("02. Burgundy Night:"+"                      USD 00.00");
      System.out.println("03. Rallye Red:"+"                          USD 00.00");
      System.out.println("04. Crystal Black:"+"                       USD 00.00");
      System.out.println("05. Mordern Steel:"+"                       USD 00.00");
      System.out.println("06. Taffeta White:"+"                       USD 00.00");
      System.out.println("07. Energy Green:"+"                        USD 00.00");
      System.out.println("08. Kona Coffee:"+"                         USD 00.00");      
      System.out.println("09. Orange Fury:"+"                         USD 00.00");
      System.out.println("10. Helios Yellow:"+"                       USD 00.00");
      System.out.println("11. Sonic Gray:"+"                          USD 00.00");
      System.out.println("12. Polished Metal:"+"                      USD 00.00");       
      System.out.println("13. Regresar a selección de amenidades");
      int opciopin=principal.nextInt(); 
         switch(opciopin){                
            case 1:
                 p1();
                          break;
            case 2:
                  p2();
                          break;
            case 3:
                  p3();
                          break;                          
            case 4:
                  p4();
                          break;
            case 5:
                  p5();
                          break;
            case 6:
                 p6();
                          break;
            case 7:
                  p7();
                          break;
            case 8:
                  p8();
                          break;                          
            case 9:
                  p9();
                          break;
            case 10:
                  p10();
                          break;                          
            case 11:
                  p11();
                          break;
                case 12:
                  p11();
                          break;
            case 13:
                   amenidades();
                          break;                          
       }
    }

    private static void aros() {
System.out.println("Consencionario de Autos");
        System.out.println("- Selección de Amenidades"
        +"" );
             System.out.println("Selección de Tipo de Aros");
      System.out.println("01. 15´:"+"                      USD 00.00");
      System.out.println("02. 16´:"+"                      USD 00.00");
      System.out.println("03. 17´:"+"                      USD 1,688.00");
      System.out.println("04. 18´:"+"                      USD 1,700.00");
      System.out.println("05. 19´:"+"                      USD 3,011.00");  
      System.out.println("06. Regresar a selección de amenidades"); 
 int opcioar=principal.nextInt(); 
         switch(opcioar){                
            case 1:
                 a1();
                          break;
            case 2:
                  a2();
                          break;
            case 3:
                  a3();
                          break;                          
            case 4:
                  a4();
                          break;
            case 5:
                  a5();
                          break;
            case 6:
                  amenidades();
                          break;      
    }}

    private static void exteriores() {
    System.out.println("Consencionario de Autos");
        System.out.println("- Selección de Amenidades"
        +"" );
             System.out.println("Selección de Tipo de exteriores");
      System.out.println("01. Body Side Molding:"+"              USD 217.00");
      System.out.println("02. Car Cover:"+"                      USD 230.00");
      System.out.println("03. Decklid Spoiler:"+"                USD 299.99");
      System.out.println("04. Door Edge Film:"+"                 USD 42.00");
      System.out.println("05. Door Edge Guards:"+"               USD 84.00");
      System.out.println("06. Door Trim Chrome:"+"               USD 285.00");
      System.out.println("07. Door Visor:"+"                     USD 185.00");
      System.out.println("08. Front Fender Emblems:"+"           USD 50.00");      
      System.out.println("09. Rear Bumper Applique:"+"           USD 70.00");
      System.out.println("10. Fog Lights:"+"                     USD 325.00");
      System.out.println("11. Nose Mascs:"+"                     USD 158.00");
      System.out.println("12. Moonrof Visor:"+"                  USD 138.00"); 
      System.out.println("13. Splash Guard Set:"+"               USD 104.00");
      System.out.println("14. Dust Cover:"+"                     USD 350.00"); 
      System.out.println("15. Door Mirror Cover-Carbon Fiber:"+" USD 520.00");       
      System.out.println("16. Regresar a selección de amenidades");        
    int opcioext=principal.nextInt(); 
         switch(opcioext){                
            case 1:
                 e1();
                          break;
            case 2:
                  e2();
                          break;
            case 3:
                  e3();
                          break;                          
            case 4:
                  e4();
                          break;
            case 5:
                  e5();
                          break;
            case 6:
                 e6();
                          break;      
            case 7:
                 e7();
                          break;
            case 8:
                  e8();
                          break;
            case 9:
                  e9();
                          break;                          
            case 10:
                  e10();
                          break;
            case 11:
                  e11();
                          break;
            case 12:
                 e12();
                          break; 
            case 13:
                 e13();
                          break;
            case 14:
                  e14();
                          break;
            case 15:
                  e15();
                          break;                          
            case 16:
                   amenidades();
                          break;                        
    }
    }

    private static void interiores() {
            System.out.println("Consencionario de Autos");
        System.out.println("- Selección de Amenidades"
        +"" );
             System.out.println("Selección de Tipo de interiores");
      System.out.println("01. All-Seasons Floor Mats:"+"             USD 142.00");
      System.out.println("02. Automatic-Dimming Mirror:"+"           USD 219.00");
      System.out.println("03. Cargo Hook:"+"                         USD 12.00");
      System.out.println("04. Cargo net:"+"                          USD 49.00");
      System.out.println("05. Console Illumination:"+"               USD 250.00");
      System.out.println("06. Cargo Organizer:"+"                    USD 87.00");
      System.out.println("07. Door Panel Protector:"+"               USD 149.00");
      System.out.println("08. Armrest Compartiment:"+"               USD 337.00");      
      System.out.println("09. Door Sill Trim-Illuminated:"+"         USD 290.00");
      System.out.println("10. Cargo Cover:"+"                        USD 166.00");
      System.out.println("11. Cargo Liner:"+"                        USD 187.00");
      System.out.println("12. Regresar a selección de amenidades:");
     int opcioint=principal.nextInt(); 
         switch(opcioint){                
            case 1:
                 i1();
                          break;
            case 2:
                  i2();
                          break;
            case 3:
                  i3();
                          break;                          
            case 4:
                  i4();
                          break;
            case 5:
                  i5();
                          break;
            case 6:
                 i6();
                          break;      
            case 7:
                 i7();
                          break;
            case 8:
                  i8();
                          break;
            case 9:
                  i9();
                          break;                          
            case 10:
                  i10();
                          break;
            case 11:
                  i11();
                          break;
            case 12:
                  amenidades();
                          break; 
 
    }}

    private static void electronicos() {
            System.out.println("Consencionario de Autos");
        System.out.println("- Selección de Amenidades"
        +"" );
             System.out.println("Selección de Tipo de Electrónicos");
      System.out.println("01. Wireless Phone Charger:"+"          USD 305.00");
      System.out.println("02. USB Charger - 2.1 Amp:"+"           USD 120.00");
      System.out.println("03. Puddle Light:"+"                    USD 185.00");
      System.out.println("04. Parking Sensors:"+"                 USD 514.00");
      System.out.println("05. Regresar a selección de amenidades:");    
         int opcioacc=principal.nextInt(); 
         switch(opcioacc){                
            case 1:
                 acc1();
                          break;
            case 2:
                  acc2();
                          break;
            case 3:
                  acc3();
                          break;                          
            case 4:
                  acc4();
                          break;
            case 5:
                  amenidades();
                          break;
     }
}
    private static void regresar_gama() {
        int gama=principal.nextInt();
       switch(gama){                
            case 7:
                  seleccionar_auto();
                          break; 
       }
         }
/* INICIO DE LAS VARIABLES, CODEC 1 POR 1 */

    private static void manual() {
         float sedan_economico = 18940;
         float manual = 0;
float preciototalmanual= sedan_economico + manual;
          System.out.println("Consencionario de Autos");
                 System.out.println("Venta de Vehículos");
      System.out.println("Gama seleccionada:                         Sedan Económico $$"+ sedan_economico);
      System.out.println("Amenidades:                                Manual $$"+ manual);
      System.out.println("Total:..................................................$$"+ preciototalmanual);
      System.out.println("Gracias por acompañarnos, esperamos verlo nuevamente");      
      
    }

    private static void manualt() {
         float sedan_economico = 18940;
         float manualt = 0;
float preciototalmanual2= sedan_economico + manualt;
          System.out.println("Consencionario de Autos");
                 System.out.println("Venta de Vehículos");
      System.out.println("Gama seleccionada:                         Sedan Económico $$"+ sedan_economico);
      System.out.println("Amenidades:                                Manual con Turbo $$"+ manualt);
      System.out.println("Total:                                     $$"+ preciototalmanual2);
      System.out.println("Gracias por acompañarnos, esperamos verlo nuevamente");  
    }

    private static void cvturbo() {
         float sedan_economico = 18940;
         float CVT = 800;
float preciototalmanual1= sedan_economico + CVT;
          System.out.println("Consencionario de Autos");
                 System.out.println("Venta de Vehículos");
      System.out.println("Gama seleccionada:                         Sedan Económico $$"+ sedan_economico);
      System.out.println("Amenidades:                                CVT $$"+ CVT);
      System.out.println("Total:                                     $$"+ preciototalmanual1);
      System.out.println("Gracias por acompañarnos, esperamos verlo nuevamente");  
    }

    private static void cvtturbo() {
                 float sedan_economico = 18940;
         float cvt = 800;
float preciototalmanual3= sedan_economico + cvt;
          System.out.println("Consencionario de Autos");
                 System.out.println("Venta de Vehículos");
      System.out.println("Gama seleccionada:                         Sedan Económico $$"+ sedan_economico);
      System.out.println("Amenidades:                                CVT con Turbo $$"+ cvt);
      System.out.println("Total:                                     $$"+ preciototalmanual3);
      System.out.println("Gracias por acompañarnos, esperamos verlo nuevamente"); 
      
     }

    private static void amenidades() {
    System.out.println("Consencionario de Autos");
        System.out.println("- Selección de Amenidades"
        +""
        );
          System.out.println("Ha seleccionado la gama: Sedán Económico");
        System.out.println("01. Tipo de transmisión");
      System.out.println("02. Color de pintura exterior");
        System.out.println("03. Aros");
        System.out.println("04. Accesorios exteriores");
        System.out.println("05. Accesorios interiores");
       System.out.println("06. Accesorios electrónicos");
       System.out.println("07. Regresar a selección de gama de vehículo");

       
       System.out.println(""
               + "Ingrese porfavor el tipo de amenidad");
       int opcioname=principal.nextInt();
       switch(opcioname){  
                case 1:
                   transmision();
                          break;
               case 2:
                   pintura();
                          break;
               case 3:
                   aros();
                          break;
               case 4:
                   exteriores();
                          break;
               case 5:
                   interiores();
                          break;
               case 6:
                   electronicos();
                          break;
               case 7:
                   regresar_gama();
                          break;
                   

    } }
/* TIPOS DE TRANSMISIÓN FINALIZADO */
    
    private static void p1() {
                 float sedan_economico = 18940;
         float  p1 = 0;
float preciototalp1= sedan_economico + p1;
          System.out.println("Consencionario de Autos");
                 System.out.println("Venta de Vehículos");
      System.out.println("Gama seleccionada:                         Sedan Económico $$"+ sedan_economico);
      System.out.println("Amenidades:                                Cosmic Blue $$"+ p1);
      System.out.println("Total:                                     $$"+ preciototalp1);
      System.out.println("Gracias por acompañarnos, esperamos verlo nuevamente"); 
    }

    private static void p2() {
                 float sedan_economico = 18940;
         float  p2 = 0;
float preciototalp2= sedan_economico + p2;
          System.out.println("Consencionario de Autos");
                 System.out.println("Venta de Vehículos");
      System.out.println("Gama seleccionada:                         Sedan Económico $$"+ sedan_economico);
      System.out.println("Amenidades:                                Burgundy Night $$"+ p2);
      System.out.println("Total:                                     $$"+ preciototalp2);
      System.out.println("Gracias por acompañarnos, esperamos verlo nuevamente"); 
    }

    private static void p3() {
                 float sedan_economico = 18940;
         float  p3 = 0;
float preciototalp3= sedan_economico + p3;
          System.out.println("Consencionario de Autos");
                 System.out.println("Venta de Vehículos");
      System.out.println("Gama seleccionada:                         Sedan Económico $$"+ sedan_economico);
      System.out.println("Amenidades:                                Rallye Red $$"+ p3);
      System.out.println("Total:                                     $$"+ preciototalp3);
      System.out.println("Gracias por acompañarnos, esperamos verlo nuevamente"); 
    }

    private static void p4() {
                 float sedan_economico = 18940;
         float  p4 = 0;
float preciototalp4= sedan_economico + p4;
          System.out.println("Consencionario de Autos");
                 System.out.println("Venta de Vehículos");
      System.out.println("Gama seleccionada:                         Sedan Económico $$"+ sedan_economico);
      System.out.println("Amenidades:                                Crystal Black $$"+ p4);
      System.out.println("Total:                                     $$"+ preciototalp4);
      System.out.println("Gracias por acompañarnos, esperamos verlo nuevamente"); 
    }

    private static void p5() {
                 float sedan_economico = 18940;
         float  p5 = 0;
float preciototalp5= sedan_economico + p5;
          System.out.println("Consencionario de Autos");
                 System.out.println("Venta de Vehículos");
      System.out.println("Gama seleccionada:                         Sedan Económico $$"+ sedan_economico);
      System.out.println("Amenidades:                                Modern Steel $$"+ p5);
      System.out.println("Total:                                     $$"+ preciototalp5);
      System.out.println("Gracias por acompañarnos, esperamos verlo nuevamente"); 
    }

    private static void p6() {
                 float sedan_economico = 18940;
         float  p6 = 0;
float preciototalp6= sedan_economico + p6;
          System.out.println("Consencionario de Autos");
                 System.out.println("Venta de Vehículos");
      System.out.println("Gama seleccionada:                         Sedan Económico $$"+ sedan_economico);
      System.out.println("Amenidades:                                Taffeta White $$"+ p6);
      System.out.println("Total:                                     $$"+ preciototalp6);
      System.out.println("Gracias por acompañarnos, esperamos verlo nuevamente"); 
    }

    private static void p7() {
                 float sedan_economico = 18940;
         float  p7 = 0;
float preciototalp7= sedan_economico + p7;
          System.out.println("Consencionario de Autos");
                 System.out.println("Venta de Vehículos");
      System.out.println("Gama seleccionada:                         Sedan Económico $$"+ sedan_economico);
      System.out.println("Amenidades:                                Energy Green $$"+ p7);
      System.out.println("Total:                                     $$"+ preciototalp7);
      System.out.println("Gracias por acompañarnos, esperamos verlo nuevamente"); 
    }

    private static void p8() {
                 float sedan_economico = 18940;
         float  p8 = 0;
float preciototalp8= sedan_economico + p8;
          System.out.println("Consencionario de Autos");
                 System.out.println("Venta de Vehículos");
      System.out.println("Gama seleccionada:                         Sedan Económico $$"+ sedan_economico);
      System.out.println("Amenidades:                                Kona Coffee $$"+ p8);
      System.out.println("Total:                                     $$"+ preciototalp8);
      System.out.println("Gracias por acompañarnos, esperamos verlo nuevamente"); 
    }

    private static void p9() {
                 float sedan_economico = 18940;
         float  p9 = 0;
float preciototalp9= sedan_economico + p9;
          System.out.println("Consencionario de Autos");
                 System.out.println("Venta de Vehículos");
      System.out.println("Gama seleccionada:                         Sedan Económico $$"+ sedan_economico);
      System.out.println("Amenidades:                                Orange Fury $$"+ p9);
      System.out.println("Total:                                     $$"+ preciototalp9);
      System.out.println("Gracias por acompañarnos, esperamos verlo nuevamente"); 
    }

    private static void p10() {
                 float sedan_economico = 18940;
         float  p10 = 0;
float preciototalp10= sedan_economico + p10;
          System.out.println("Consencionario de Autos");
                 System.out.println("Venta de Vehículos");
      System.out.println("Gama seleccionada:                         Sedan Económico $$"+ sedan_economico);
      System.out.println("Amenidades:                                Helios Yellow $$"+ p10);
      System.out.println("Total:                                     $$"+ preciototalp10);
      System.out.println("Gracias por acompañarnos, esperamos verlo nuevamente"); 
    }

    private static void p11() {
                 float sedan_economico = 18940;
         float  p11 = 0;
float preciototalp11= sedan_economico + p11;
          System.out.println("Consencionario de Autos");
                 System.out.println("Venta de Vehículos");
      System.out.println("Gama seleccionada:                         Sedan Económico $$"+ sedan_economico);
      System.out.println("Amenidades:                                Sonic Gray $$"+ p11);
      System.out.println("Total:                                     $$"+ preciototalp11);
      System.out.println("Gracias por acompañarnos, esperamos verlo nuevamente"); 
    }   
    private static void p12() {
                 float sedan_economico = 18940;
         float  p12 = 0;
float preciototalp12= sedan_economico + p12;
          System.out.println("Consencionario de Autos");
                 System.out.println("Venta de Vehículos");
      System.out.println("Gama seleccionada:                         Sedan Económico $$"+ sedan_economico);
      System.out.println("Amenidades:                                Polished Metal $$"+ p12);
      System.out.println("Total:                                     $$"+ preciototalp12);
      System.out.println("Gracias por acompañarnos, esperamos verlo nuevamente"); 
    }
/* TIPOS DE PINTURA FINALIZADO */
    
    
    private static void a1() {
                 float sedan_economico = 18940;
         float  a1 = 0;
float preciototala1= sedan_economico + a1;
          System.out.println("Consencionario de Autos");
                 System.out.println("Venta de Vehículos");
      System.out.println("Gama seleccionada:                         Sedan Económico $$"+ sedan_economico);
      System.out.println("Amenidades:                                Aro 15 $$"+ a1);
      System.out.println("Total:                                     $$"+ preciototala1);
      System.out.println("Gracias por acompañarnos, esperamos verlo nuevamente"); 
    }

    private static void a2() {
                 float sedan_economico = 18940;
         float  a2 = 0;
float preciototala2= sedan_economico + a2;
          System.out.println("Consencionario de Autos");
                 System.out.println("Venta de Vehículos");
      System.out.println("Gama seleccionada:                         Sedan Económico $$"+ sedan_economico);
      System.out.println("Amenidades:                                Aro 16 $$"+ a2);
      System.out.println("Total:                                     $$"+ preciototala2);
      System.out.println("Gracias por acompañarnos, esperamos verlo nuevamente"); 
    }

    private static void a3() {
                 float sedan_economico = 18940;
         float  a3 = 1688;
float preciototala3= sedan_economico + a3;
          System.out.println("Consencionario de Autos");
                 System.out.println("Venta de Vehículos");
      System.out.println("Gama seleccionada:                         Sedan Económico $$"+ sedan_economico);
      System.out.println("Amenidades:                                Aro 17 $$"+ a3);
      System.out.println("Total:                                     $$"+ preciototala3);
      System.out.println("Gracias por acompañarnos, esperamos verlo nuevamente"); 
    }

    private static void a5() {
                 float sedan_economico = 18940;
         float  a5 = 3011;
float preciototala5= sedan_economico + a5;
          System.out.println("Consencionario de Autos");
                 System.out.println("Venta de Vehículos");
      System.out.println("Gama seleccionada:                         Sedan Económico $$"+ sedan_economico);
      System.out.println("Amenidades:                                Aro 19 $$"+ a5);
      System.out.println("Total:                                     $$"+ preciototala5);
      System.out.println("Gracias por acompañarnos, esperamos verlo nuevamente"); 
    }
    private static void a4() {
                 float sedan_economico = 18940;
         float  a4 = 1700;
float preciototala4= sedan_economico + a4;
          System.out.println("Consencionario de Autos");
                 System.out.println("Venta de Vehículos");
      System.out.println("Gama seleccionada:                         Sedan Económico $$"+ sedan_economico);
      System.out.println("Amenidades:                                Aro 18 $$"+ a4);
      System.out.println("Total:                                     $$"+ preciototala4);
      System.out.println("Gracias por acompañarnos, esperamos verlo nuevamente"); 
    }
       
/* TIPOS DE AROS FINALIZADO */
    
    
    private static void e1() {
                 float sedan_economico = 18940;
         float  e1 = 217;
float preciototale1= sedan_economico + e1;
          System.out.println("Consencionario de Autos");
                 System.out.println("Venta de Vehículos");
      System.out.println("Gama seleccionada:                         Sedan Económico $$"+ sedan_economico);
      System.out.println("Amenidades:                                Body Side Molding $$"+ e1);
      System.out.println("Total:                                     $$"+ preciototale1);
      System.out.println("Gracias por acompañarnos, esperamos verlo nuevamente"); 
    }

    private static void e2() {
                 float sedan_economico = 18940;
         float  e2 = 230;
float preciototale2= sedan_economico + e2;
          System.out.println("Consencionario de Autos");
                 System.out.println("Venta de Vehículos");
      System.out.println("Gama seleccionada:                         Sedan Económico $$"+ sedan_economico);
      System.out.println("Amenidades:                                Car Cover $$"+ e2);
      System.out.println("Total:                                     $$"+ preciototale2);
      System.out.println("Gracias por acompañarnos, esperamos verlo nuevamente"); 
    }

    private static void e3() {
                 float sedan_economico = 18940;
         float  e3 = (float) 299.99;
float preciototale3= sedan_economico + e3;
          System.out.println("Consencionario de Autos");
                 System.out.println("Venta de Vehículos");
      System.out.println("Gama seleccionada:                         Sedan Económico $$"+ sedan_economico);
      System.out.println("Amenidades:                                Decklid Spoiler $$"+ e3);
      System.out.println("Total:                                     $$"+ preciototale3);
      System.out.println("Gracias por acompañarnos, esperamos verlo nuevamente"); 
    }

    private static void e4() {
                 float sedan_economico = 18940;
         float  e4 = 42;
float preciototale4= sedan_economico + e4;
          System.out.println("Consencionario de Autos");
                 System.out.println("Venta de Vehículos");
      System.out.println("Gama seleccionada:                         Sedan Económico $$"+ sedan_economico);
      System.out.println("Amenidades:                                Door Edge Film $$"+ e4);
      System.out.println("Total:                                     $$"+ preciototale4);
      System.out.println("Gracias por acompañarnos, esperamos verlo nuevamente"); 
    }

    private static void e5() {
                 float sedan_economico = 18940;
         float  e5 = 84;
float preciototale5= sedan_economico + e5;
          System.out.println("Consencionario de Autos");
                 System.out.println("Venta de Vehículos");
      System.out.println("Gama seleccionada:                         Sedan Económico $$"+ sedan_economico);
      System.out.println("Amenidades:                                Door Edge Guards $$"+ e5);
      System.out.println("Total:                                     $$"+ preciototale5);
      System.out.println("Gracias por acompañarnos, esperamos verlo nuevamente"); 
    }

    private static void e6() {
                 float sedan_economico = 18940;
         float  e6 = 285;
float preciototale6= sedan_economico + e6;
          System.out.println("Consencionario de Autos");
                 System.out.println("Venta de Vehículos");
      System.out.println("Gama seleccionada:                         Sedan Económico $$"+ sedan_economico);
      System.out.println("Amenidades:                                Door Trim Chrome $$"+ e6);
      System.out.println("Total:                                     $$"+ preciototale6);
      System.out.println("Gracias por acompañarnos, esperamos verlo nuevamente"); 
    }

    private static void e7() {
                 float sedan_economico = 18940;
         float  e7 = 185;
float preciototale7= sedan_economico + e7;
          System.out.println("Consencionario de Autos");
                 System.out.println("Venta de Vehículos");
      System.out.println("Gama seleccionada:                         Sedan Económico $$"+ sedan_economico);
      System.out.println("Amenidades:                                Door Visor $$"+ e7);
      System.out.println("Total:                                     $$"+ preciototale7);
      System.out.println("Gracias por acompañarnos, esperamos verlo nuevamente"); 
    }

    private static void e8() {
                 float sedan_economico = 18940;
         float  e8 = 50;
float preciototale8= sedan_economico + e8;
          System.out.println("Consencionario de Autos");
                 System.out.println("Venta de Vehículos");
      System.out.println("Gama seleccionada:                         Sedan Económico $$"+ sedan_economico);
      System.out.println("Amenidades:                                Front Fender Emblems $$"+ e8);
      System.out.println("Total:                                     $$"+ preciototale8);
      System.out.println("Gracias por acompañarnos, esperamos verlo nuevamente"); 
    }

    private static void e9() {
                 float sedan_economico = 18940;
         float  e9 = 70;
float preciototale9= sedan_economico + e9;
          System.out.println("Consencionario de Autos");
                 System.out.println("Venta de Vehículos");
      System.out.println("Gama seleccionada:                         Sedan Económico $$"+ sedan_economico);
      System.out.println("Amenidades:                                Rear Bumper Applique $$"+ e9);
      System.out.println("Total:                                     $$"+ preciototale9);
      System.out.println("Gracias por acompañarnos, esperamos verlo nuevamente"); 
    }

    private static void e10() {
                 float sedan_economico = 18940;
         float e10 = 325;
float preciototale10= sedan_economico + e10;
          System.out.println("Consencionario de Autos");
                 System.out.println("Venta de Vehículos");
      System.out.println("Gama seleccionada:                         Sedan Económico $$"+ sedan_economico);
      System.out.println("Amenidades:                                Fog Lights $$"+ e10);
      System.out.println("Total:                                     $$"+ preciototale10);
      System.out.println("Gracias por acompañarnos, esperamos verlo nuevamente"); 
    }

    private static void e11() {
                 float sedan_economico = 18940;
         float  e11 = 158;
float preciototale11= sedan_economico + e11;
          System.out.println("Consencionario de Autos");
                 System.out.println("Venta de Vehículos");
      System.out.println("Gama seleccionada:                         Sedan Económico $$"+ sedan_economico);
      System.out.println("Amenidades:                                Nose Mascs $$"+ e11);
      System.out.println("Total:                                     $$"+ preciototale11);
      System.out.println("Gracias por acompañarnos, esperamos verlo nuevamente"); 
    }

    private static void e12() {
                  float sedan_economico = 18940;
         float  e12 = 138;
float preciototale12= sedan_economico + e12;
          System.out.println("Consencionario de Autos");
                 System.out.println("Venta de Vehículos");
      System.out.println("Gama seleccionada:                         Sedan Económico $$"+ sedan_economico);
      System.out.println("Amenidades:                                Moonrof Visor $$"+ e12);
      System.out.println("Total:                                     $$"+ preciototale12);
      System.out.println("Gracias por acompañarnos, esperamos verlo nuevamente"); 
    }

    private static void e14() {
                 float sedan_economico = 18940;
         float  e14 = 350;
float preciototale14= sedan_economico + e14;
          System.out.println("Consencionario de Autos");
                 System.out.println("Venta de Vehículos");
      System.out.println("Gama seleccionada:                         Sedan Económico $$"+ sedan_economico);
      System.out.println("Amenidades:                                Dust Cover $$"+ e14);
      System.out.println("Total:                                     $$"+ preciototale14);
      System.out.println("Gracias por acompañarnos, esperamos verlo nuevamente"); 
    }

    private static void e15() {
                 float sedan_economico = 18940;
         float  e15 = 520;
float preciototale15= sedan_economico + e15;
          System.out.println("Consencionario de Autos");
                 System.out.println("Venta de Vehículos");
      System.out.println("Gama seleccionada:                         Sedan Económico $$"+ sedan_economico);
      System.out.println("Amenidades:                                Door Mirror Cover - Carbon Fiber $$"+ e15);
      System.out.println("Total:                                     $$"+ preciototale15);
      System.out.println("Gracias por acompañarnos, esperamos verlo nuevamente"); 
    }

    private static void e13() {
                 float sedan_economico = 18940;
         float  e13 = 104;
float preciototale13= sedan_economico + e13;
          System.out.println("Consencionario de Autos");
                 System.out.println("Venta de Vehículos");
      System.out.println("Gama seleccionada:                         Sedan Económico $$"+ sedan_economico);
      System.out.println("Amenidades:                                Splash Guard Set $$"+ e13);
      System.out.println("Total:                                     $$"+ preciototale13);
      System.out.println("Gracias por acompañarnos, esperamos verlo nuevamente"); 
    }

    private static void i1() {
                 float sedan_economico = 18940;
         float  i1 = 142;
float preciototali1= sedan_economico + i1;
          System.out.println("Consencionario de Autos");
                 System.out.println("Venta de Vehículos");
      System.out.println("Gama seleccionada:                         Sedan Económico $$"+ sedan_economico);
      System.out.println("Amenidades:                                All-Seasons Floor Mats $$"+ i1);
      System.out.println("Total:                                     $$"+ preciototali1);
      System.out.println("Gracias por acompañarnos, esperamos verlo nuevamente");     }

    private static void i2() {
                 float sedan_economico = 18940;
         float  i2 = 219;
float preciototali2= sedan_economico + i2;
          System.out.println("Consencionario de Autos");
                 System.out.println("Venta de Vehículos");
      System.out.println("Gama seleccionada:                         Sedan Económico $$"+ sedan_economico);
      System.out.println("Amenidades:                                Automatic-Dimming Mirror $$"+ i2);
      System.out.println("Total:                                     $$"+ preciototali2);
      System.out.println("Gracias por acompañarnos, esperamos verlo nuevamente");     }

    private static void i3() {
                 float sedan_economico = 18940;
         float  i3 = 12;
float preciototali3= sedan_economico + i3;
          System.out.println("Consencionario de Autos");
                 System.out.println("Venta de Vehículos");
      System.out.println("Gama seleccionada:                         Sedan Económico $$"+ sedan_economico);
      System.out.println("Amenidades:                                Cargo Hook $$"+ i3);
      System.out.println("Total:                                     $$"+ preciototali3);
      System.out.println("Gracias por acompañarnos, esperamos verlo nuevamente");     }

    private static void i4() {
                 float sedan_economico = 18940;
         float  i4 = 49;
float preciototali4= sedan_economico + i4;
          System.out.println("Consencionario de Autos");
                 System.out.println("Venta de Vehículos");
      System.out.println("Gama seleccionada:                         Sedan Económico $$"+ sedan_economico);
      System.out.println("Amenidades:                                Cargo Net $$"+ i4);
      System.out.println("Total:                                     $$"+ preciototali4);
      System.out.println("Gracias por acompañarnos, esperamos verlo nuevamente");     }

    private static void i5() {
                  float sedan_economico = 18940;
         float  i5 = 250;
float preciototali5= sedan_economico + i5;
          System.out.println("Consencionario de Autos");
                 System.out.println("Venta de Vehículos");
      System.out.println("Gama seleccionada:                         Sedan Económico $$"+ sedan_economico);
      System.out.println("Amenidades:                                Console Illumination $$"+ i5);
      System.out.println("Total:                                     $$"+ preciototali5);
      System.out.println("Gracias por acompañarnos, esperamos verlo nuevamente");     }

    private static void i6() {
                   float sedan_economico = 18940;
         float  i6 = 87;
float preciototali6= sedan_economico + i6;
          System.out.println("Consencionario de Autos");
                 System.out.println("Venta de Vehículos");
      System.out.println("Gama seleccionada:                         Sedan Económico $$"+ sedan_economico);
      System.out.println("Amenidades:                                Cargo Organizer $$"+ i6);
      System.out.println("Total:                                     $$"+ preciototali6);
      System.out.println("Gracias por acompañarnos, esperamos verlo nuevamente");     }

    private static void i7() {
                  float sedan_economico = 18940;
         float  i7 = 149;
float preciototali7= sedan_economico + i7;
          System.out.println("Consencionario de Autos");
                 System.out.println("Venta de Vehículos");
      System.out.println("Gama seleccionada:                         Sedan Económico $$"+ sedan_economico);
      System.out.println("Amenidades:                                Door Panel Protector $$"+ i7);
      System.out.println("Total:                                     $$"+ i7);
      System.out.println("Gracias por acompañarnos, esperamos verlo nuevamente");     }

    private static void i8() {
                 float sedan_economico = 18940;
         float  i8 = 337;
float preciototali8= sedan_economico + i8;
          System.out.println("Consencionario de Autos");
                 System.out.println("Venta de Vehículos");
      System.out.println("Gama seleccionada:                         Sedan Económico $$"+ sedan_economico);
      System.out.println("Amenidades:                                Armrest Compartiment $$"+ i8);
      System.out.println("Total:                                     $$"+ preciototali8);
      System.out.println("Gracias por acompañarnos, esperamos verlo nuevamente");     }

    private static void i9() {
                 float sedan_economico = 18940;
         float  i9 = 290;
float preciototali9= sedan_economico + i9;
          System.out.println("Consencionario de Autos");
                 System.out.println("Venta de Vehículos");
      System.out.println("Gama seleccionada:                         Sedan Económico $$"+ sedan_economico);
      System.out.println("Amenidades:                                Door Sill Trim-Illuminated $$"+ i9);
      System.out.println("Total:                                     $$"+ preciototali9);
      System.out.println("Gracias por acompañarnos, esperamos verlo nuevamente");     }

    private static void i10() {
                 float sedan_economico = 18940;
         float  i10 = 166;
float preciototali10= sedan_economico + i10;
          System.out.println("Consencionario de Autos");
                 System.out.println("Venta de Vehículos");
      System.out.println("Gama seleccionada:                         Sedan Económico $$"+ sedan_economico);
      System.out.println("Amenidades:                                Cargo Cover $$"+ i10);
      System.out.println("Total:                                     $$"+ preciototali10);
      System.out.println("Gracias por acompañarnos, esperamos verlo nuevamente");     }

    private static void i11() {
                 float sedan_economico = 18940;
         float  i11 = 187;
float preciototali11= sedan_economico + i11;
          System.out.println("Consencionario de Autos");
                 System.out.println("Venta de Vehículos");
      System.out.println("Gama seleccionada:                         Sedan Económico $$"+ sedan_economico);
      System.out.println("Amenidades:                                Cargo Liner $$"+ i11);
      System.out.println("Total:                                     $$"+ preciototali11);
      System.out.println("Gracias por acompañarnos, esperamos verlo nuevamente");     }

    private static void acc1() {
                   float sedan_economico = 18940;
         float  acc1 = 305;
float preciototalacc1= sedan_economico + acc1;
          System.out.println("Consencionario de Autos");
                 System.out.println("Venta de Vehículos");
      System.out.println("Gama seleccionada:                         Sedan Económico $$"+ sedan_economico);
      System.out.println("Amenidades:                                Wireless Phone Charger $$"+ acc1);
      System.out.println("Total:                                     $$"+ preciototalacc1);
      System.out.println("Gracias por acompañarnos, esperamos verlo nuevamente");        }

    private static void acc2() {
              float sedan_economico = 18940;
         float  acc2 = 120;
float preciototalacc2= sedan_economico + acc2;
          System.out.println("Consencionario de Autos");
                 System.out.println("Venta de Vehículos");
      System.out.println("Gama seleccionada:                         Sedan Económico $$"+ sedan_economico);
      System.out.println("Amenidades:                                USB Charger - 2.1 Amp $$"+ acc2);
      System.out.println("Total:                                     $$"+ preciototalacc2);
      System.out.println("Gracias por acompañarnos, esperamos verlo nuevamente");        }

    private static void acc3() {
              float sedan_economico = 18940;
         float  acc3 = 185;
float preciototalacc3= sedan_economico + acc3;
          System.out.println("Consencionario de Autos");
                 System.out.println("Venta de Vehículos");
      System.out.println("Gama seleccionada:                         Sedan Económico $$"+ sedan_economico);
      System.out.println("Amenidades:                                Puddle Light $$"+ acc3);
      System.out.println("Total:                                     $$"+ preciototalacc3);
      System.out.println("Gracias por acompañarnos, esperamos verlo nuevamente");       }

    private static void acc4() {
              float sedan_economico = 18940;
         float  acc4 = 187;
float preciototalacc4= sedan_economico + acc4;
          System.out.println("Consencionario de Autos");
                 System.out.println("Venta de Vehículos");
      System.out.println("Gama seleccionada:                         Sedan Económico $$"+ sedan_economico);
      System.out.println("Amenidades:                                Parking Sensors $$"+ acc4);
      System.out.println("Total:                                     $$"+ preciototalacc4);
      System.out.println("Gracias por acompañarnos, esperamos verlo nuevamente");        }


}

/* TIPOS DE Accesorios Electronicos FINALIZADO */












     
  