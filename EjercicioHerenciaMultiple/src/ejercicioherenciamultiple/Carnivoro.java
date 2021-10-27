package ejercicioherenciamultiple;


public interface Carnivoro {
     
    public default void comer(){
       System.out.println("Hola, me gusta comer carne");
    }
   
    public default void caza(){
       System.out.println("Me gusta cazar");
    }
    
}
