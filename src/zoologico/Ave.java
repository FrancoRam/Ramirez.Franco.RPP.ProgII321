
package zoologico;

public class Ave extends Animal implements Vacunable{
    
    private double envergaduraAlas;

    public Ave(String nombre, int edad, double envergaduraAlas) {
        super(nombre, edad);
        this.envergaduraAlas = envergaduraAlas;
    }

    @Override
    public void Vacunar() {
        
    }
    
    @Override
    public String toString() {
        return "Ave:" + super.toString()+ "envergaduraAlas=" + envergaduraAlas;
    }
}
