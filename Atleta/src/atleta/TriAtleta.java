package atleta;

public class TriAtleta implements Ciclismo,Corredor,Natacion{

    private String nombre;
    private int edad;
    private String equipo;
    private String competenciaFavorita;

    public TriAtleta(String nombre, int edad, String equipo, String competenciaFavorita) {
        this.nombre = nombre;
        this.edad = edad;
        this.equipo = equipo;
        this.competenciaFavorita = competenciaFavorita;
    }

    public TriAtleta(String nombre, int edad, String competenciaFavorita) {
        this.nombre = nombre;
        this.edad = edad;
        this.competenciaFavorita = competenciaFavorita;
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

    public String getCompetenciaFavorita() {
        return competenciaFavorita;
    }

    @Override
    public void tipoCiclismo() {
        if ("INNEOS".equals(equipo)) {
            System.out.println("Tipo Ciclismo : Ciclismo de Montaña");
        } else {
            System.out.println("Tipo Ciclismo : Ciclismo de Carretera");
        }
    }

    @Override
    public void recorrido() {
        if (edad <= 19 && edad >13){
            System.out.println("- 20 KM de Recorrido");
        }else if(edad >19 && edad < 40){
            System.out.println("- 60 KM de Recorrido");
        }else{
            System.out.println("- 40 KM de Recorrido");
        }
    }

    @Override
    public void carrera() {
        if (edad <= 19 && edad > 13) {
            System.out.println("Carrera: 5 KM de Carrera");
        } else if (edad > 19 && edad < 40) {
            System.out.println("Carrera: 20 KM de Carrera");
        } else {
            System.out.println("Carrera: 10 KM de Carrera");
        }
    }

    @Override
    public void estilosNatacion() {
        if ("Movistar".equals(equipo)){
            System.out.println("Estilo de Natación: Brazada");
        }else{
            System.out.println("Estilo de Natación: Crol, Brazada, Espalda y Mariposa");
        }
        
    }

    @Override
    public void distancia() {
        if (edad <= 19 && edad >13){
            System.out.println("- 750 m de distancia");
        }else if(edad >19 && edad < 40){
            System.out.println("- 1500 m de distancia");
        }else{
            System.out.println("- 900 m de distancia");
        }
    }

    @Override
    public String toString() {
        return "TriAtleta{" + "nombre=" + nombre + ", edad=" + edad + ", equipo=" + equipo + ", competenciaFavorita=" + competenciaFavorita + '}';
    } 
    
}
