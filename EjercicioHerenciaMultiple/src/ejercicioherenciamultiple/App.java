package ejercicioherenciamultiple;


public class App {
    
    public static void main(String[] args) {

        //Animal animal = new Animal("Frugívoro","Negro", "Acuatico", "Grande", "F");
        //System.out.println(animal.toString());
        
        //animal.comer();
        
        Omnivoro omni = new Omnivoro("Frugívoro","Negro", "Acuatico", "Grande", "F");
        
        //omni.comer();
        //System.out.println(omni.toString() + " " + omni.getColor());
        Animal animal1 = new Omnivoro("Frugívoro","Negro", "Acuatico", "Grande", "F");
        
        System.out.println(animal1.toString());
        
        
        Animal [] animal = new Animal[5];
        animal[0] = new Animal("Negro", "Acuatico", "Grande", "F");
        animal[1] = new Animal("Negro", "Acuatico", "Grande", "F");
        animal[2] = new Animal("Negro", "Acuatico", "Grande", "F");
        animal[3] = new Animal("Negro", "Acuatico", "Grande", "F");
        animal[4] = new Animal("Negro", "Acuatico", "Grande", "F");
        
        //animal[3].toString();
        
        
    }
}
