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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void recorrido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void carrera() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void estilosNatacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void distancia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "TriAtleta{" + "nombre=" + nombre + ", edad=" + edad + ", equipo=" + equipo + ", competenciaFavorita=" + competenciaFavorita + '}';
    }
    
    
    
}
