package atleta;

public class DuAtleta implements Ciclismo, Corredor {

    private String nombre;
    private int edad;
    private String equipo;

    public DuAtleta(String nombre, int edad, String equipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEquipo() {
        return equipo;
    }
    
    @Override
    public void tipoCiclismo() {

        if (!"Movistar".equals(equipo) && !"Claro".equals(equipo)){
            System.out.println("Ciclismo de Montaña");
        }else{
            System.out.println("Ciclismo de Carretera");
        }
        
    }

    @Override
    public void recorrido() {
        if (edad <= 19 && edad >13){
            System.out.println("20 KM de Recorrido");
        }else if(edad >19 && edad < 40){
            System.out.println("60 KM de Recorrido");
        }else{
            System.out.println("40 KM de Recorrido");
        }
    }

    @Override
    public void carrera() {
        if (edad <= 19 && edad > 13) {
            System.out.println("5 KM de Carrera");
        } else if (edad > 19 && edad < 40) {
            System.out.println("20 KM de Carrera");
        } else {
            System.out.println("10 KM de Carrera");
        }
    }

    @Override
    public String toString() {
        return "DuAtleta{" + "nombre=" + nombre + ", edad=" + edad + ", equipo=" + equipo + '}';
    }
    
}
