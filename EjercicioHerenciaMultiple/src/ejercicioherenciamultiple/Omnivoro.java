
package ejercicioherenciamultiple;


public class Omnivoro extends Animal implements Carnivoro, Herviboro{

    private String nombre;

    public Omnivoro(String nombre, String color, String tipo, String tamaño, String genero) {
        super(color, tipo, tamaño, genero);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
       

    public void comer(){
        System.out.println("Yo como de todo");
    }

    @Override
    public String toString() {
        return "Omnivoro{" + "nombre=" + nombre + '}';
    }
    
    
}
