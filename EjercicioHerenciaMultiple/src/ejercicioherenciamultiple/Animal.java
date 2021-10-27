package ejercicioherenciamultiple;


public class Animal implements Carnivoro, Herviboro {
    
   
    private String color;
    private String tipo;
    private String tamaño;
    private String genero;

    public Animal(String color, String tipo, String tamaño, String genero) {
        
        this.color = color;
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.genero = genero;
    }


    public String getColor() {
        return color;
    }

    public String getTipo() {
        return tipo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public String getGenero() {
        return genero;
    }
    

    @Override
    public void comer() {
        Herviboro.super.comer();
        Carnivoro.super.comer();
                
    }

    @Override
    public String toString() {
        return "Animal{" + "color=" + color + ", tipo=" + tipo + ", tama\u00f1o=" + tamaño + ", genero=" + genero + '}';
    }
    
}