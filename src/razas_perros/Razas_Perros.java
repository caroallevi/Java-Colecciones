
package razas_perros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Razas_Perros {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);        
        ArrayList <String> razasPerris = new ArrayList();
        String rta, buscar;
        int cont=0;
        System.out.println("Ingrese una raza de perro");
        
        do{
            razasPerris.add(leer.nextLine());
            System.out.println("¿Desea guardar otra raza?");
            rta=leer.nextLine();
       
        }while(rta.equals("si"));
        
        System.out.println("Las razas guardadas son: "+razasPerris.toString());
        
        System.out.println("Ingrese una raza que desee buscar del array");
        buscar=leer.nextLine();
        
        Iterator it= razasPerris.iterator(); //
        while(it.hasNext()){
            String aux = (String) it.next();
            if(aux.equals(buscar)){
                it.remove();
                cont++;
            }           
        }
        
        if(cont==0){
            System.out.println("La raza que busca no esta en el array");
        }
        Collections.sort(razasPerris);
        System.out.println("Las razas resultantes son: "+razasPerris.toString());
        
    
    }
    
}
