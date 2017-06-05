package boletin12_1;


public class Boletin12_1 {


  
    public static void main(String[] args) {
        Garaje garaje = new Garaje();
        Metodos metodo=new Metodos();
        
        String matricula;
        double pago,coste,devolucion;
        float numHoras;
        
        do{
            System.out.println("Aún quedan plazas");
            
            Coche car= new Coche ();
            matricula= car.pedirMatricula();
            
            numHoras = metodo.pedirDato();
            while(numHoras<=0)
            numHoras = metodo.pedirDato();
            
            coste= metodo.precio(numHoras);
            
            pago= metodo.pedirDato();
            while (pago<=1)
            pago= metodo.pedirDato();
            
            devolucion=metodo.devolucion(coste,pago);
            
            metodo.factura(numHoras, coste, pago, devolucion, matricula);
        }
        while (Garaje.numeroCoches<5);    
            System.out.println("No se pueden meter más coches");
        }

    }