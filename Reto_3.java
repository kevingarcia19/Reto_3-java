
import java.util.ArrayList;


public class Reto_3 {

   
    public static void main(String[] args) {
      
        Obra lista= new Obra();
      
        ArrayList<Integer> listCategorias= new ArrayList<>(); 
        listCategorias.add(1);
        listCategorias.add(2);
        listCategorias.add(5);
        listCategorias.add(5);
        listCategorias.add(5);
        listCategorias.add(1);
        listCategorias.add(2);
        listCategorias.add(5);
        listCategorias.add(5);
        listCategorias.add(5);
        
        ArrayList<Integer> obraMuseo= new ArrayList<>(); 
        
        obraMuseo.add(1);
        obraMuseo.add(3);
        obraMuseo.add(6);
        obraMuseo.add(8);
       
        int category=2;
        
        ArrayList<Integer> listaMuseoA= new ArrayList<>();
        
        listaMuseoA.add(3);
        listaMuseoA.add(5);
        listaMuseoA.add(7);
        listaMuseoA.add(10);
        listaMuseoA.add(15);
        listaMuseoA.add(16);
        
        ArrayList<Integer> listaMuseoB= new ArrayList<>();
        
        listaMuseoB.add(4);
        listaMuseoB.add(10);
        listaMuseoB.add(5);
        listaMuseoB.add(8);
       
        System.out.println(lista.clases(listCategorias)); 
        
        System.out.println(lista.meFaltanDeLaClase(obraMuseo, listCategorias, category));
                
        System.out.println(lista.noTengo(listaMuseoA, listaMuseoB));
        
        System.out.println(lista.puedoCambiar(listaMuseoA, listaMuseoB));
           
    
    }
    
}
