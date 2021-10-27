package atleta;

public class App {
    
    public static void main(String[] args) {
        
        TriAtleta[] triAtleta = new TriAtleta[5];
        triAtleta[0] = new TriAtleta("Daniel Medina", 19, "INNEOS", "Natacion");
        triAtleta[1] = new TriAtleta("Laura Ricaurte", 26, "Ciclismo");
        triAtleta[2] = new TriAtleta("Luisa Bustamante", 48, "Natacion");
        triAtleta[3] = new TriAtleta("Andres Rodriguez", 35, "Movistar","Carrera a pie");
        triAtleta[4] = new TriAtleta("Edwin Sanchez", 15, "Claro", "Ciclismo");

        System.out.println("Resumen: TRIATLETAS");
        System.out.println("----------------------------------------------");
        
        for (TriAtleta triAtletas: triAtleta){
            if (triAtletas.getEquipo()==null){
                System.out.println("\tNombre: "+ triAtletas.getNombre());
                System.out.println("Equipo: No pertenece a ningun equipo "+
                        " - Competencia Favorita: "+ triAtletas.getCompetenciaFavorita());
                triAtletas.tipoCiclismo();
                triAtletas.recorrido();
                triAtletas.carrera();
                triAtletas.estilosNatacion();
                triAtletas.distancia();
                System.out.println("\n");
            }else{
                System.out.println("\tNombre: "+ triAtletas.getNombre());
                System.out.println("Equipo: "+triAtletas.getEquipo() +
                        " - Competencia Favorita: "+ triAtletas.getCompetenciaFavorita());
                triAtletas.tipoCiclismo();
                triAtletas.recorrido();
                triAtletas.carrera();
                triAtletas.estilosNatacion();
                triAtletas.distancia();
                System.out.println("\n");   
            }
        }
        
        DuAtleta[] duAtleta = new DuAtleta[3];
        duAtleta[0] = new DuAtleta("Felipe Moreno", 28, "Movistar");
        duAtleta[1] = new DuAtleta("Alejandra Osorio", 48, "Claro");
        duAtleta[2] = new DuAtleta("Juliana Beltran", 19, "INNEOS");
        
        System.out.println("Resumen: DUATLETAS");
        System.out.println("----------------------------------------------");
        
        for (DuAtleta duAtletas: duAtleta){
            System.out.println("\tNombre: "+duAtletas.getNombre());
            System.out.println("Equipo: " + duAtletas.getEquipo() + " - Edad: " + duAtletas.getEdad());
            duAtletas.tipoCiclismo();
            duAtletas.recorrido();
            duAtletas.carrera();
            System.out.println("\n");
        }
    }
}
