
import javax.swing.JOptionPane;


public class ciclosIMC {
    
    public static void main( String [] args){
        
        float peso,estatura,imc;
        byte resp;
        do{
        
        peso=Float.parseFloat(JOptionPane. showInputDialog("ingresa tu peso"));
        estatura=Float.parseFloat(JOptionPane. showInputDialog("ingresa tu estatura" + "en fomato de metros"));
        
        imc=(peso/(estatura*estatura)); 
        JOptionPane.showInputDialog(null," El indice de masa corporal" + imc);
        
        if(imc<18.49){
        
            System.out.println("PESO BAJO");
            
        }else if (imc>=18.50 && imc<=24.99){
                
            System.out.println( "Peso normal"); 
                
        }else if ( imc>= 25 && imc<=29.99){
                    
            System.out.println( " sobrepeso");
            
        }else if ( imc>= 30 && imc<=34.99){                
                    
            System.out.println(" obObesidad grado 1");
                        
        }else if ( imc>= 35 && imc<=39.99){
        
            System.out.println(" obesidad grado 2");
            
        }else{
                     
             System.out.println( "obesidad morbida");
                         
        }
        resp= Byte.parseByte( JOptionPane.showInputDialog("ESCRIBE 1 SI QUIRES QUE REALiSE UN" + "NUEVO CALCULO")); 
        }while(resp==1);                  
                             
        } // cierra el metodo principal   
        
    }// cierra la clase 
    

