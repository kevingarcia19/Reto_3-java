
import java.util.ArrayList;

public class Obra {
    
     public ArrayList<Integer> clases(ArrayList<Integer> listaCategorias){
        
        ArrayList<Integer> categorias = new ArrayList<>();
        
        for(int categoria: listaCategorias){
            
            if(!categorias.contains(categoria)){
                
                categorias.add(categoria);
            }
            
        }
        return categorias;
    }
     
    public ArrayList<Integer> meFaltanDeLaClase(ArrayList<Integer> obras, ArrayList<Integer> listaCategorias, int categoria){
        
        ArrayList<Integer> numObra = new ArrayList<>();
        
        for(int posicion: obras){
            
            if(listaCategorias.get(posicion)==categoria){
                
                numObra.add(posicion);
            }
        }
        return numObra;
    }
    public ArrayList<Integer> noTengo(ArrayList<Integer> museoA, ArrayList<Integer>museoB){
        
        ArrayList<Integer> diferencia= new ArrayList<>();
        
        for( int obra: museoA){
            
            if(!museoB.contains(obra)){
                
                diferencia.add(obra);    
            }
        }
        
        return diferencia;
    }
    
    public Integer puedoCambiar(ArrayList<Integer> dupMuseoA, ArrayList<Integer> dupMuseoB){
        
        int numObra1=0;
        int numObra2=0;
        
        for( int obra1: dupMuseoA){
            
            if(!dupMuseoB.contains(obra1)){
                
                numObra1++;
            }
        }
        for( int obra2: dupMuseoB){
            
            if(!dupMuseoA.contains(obra2)){
                
                numObra2++;
            }
        
        }
        if(numObra1<=numObra2){
            
            return numObra1;
            
        }else{
        
            return numObra2; 
        }        
    }

}    