
package zoologico;

public class Mamifero extends Animal implements Vacunable{

    private double peso;
    private Dieta dietaMamifero;
    
    public Mamifero(double peso, Dieta dietaMamifero, String nombre, int edad) {
        super(nombre, edad);
        this.peso = peso;
        this.dietaMamifero = dietaMamifero;
    }



    @Override
    public void Vacunar() {
        
    }

    @Override
    public String toString() {
        return "Mamifero:" + super.toString()+ "peso=" + peso + ", dietaMamifero=" + dietaMamifero + '}';
    }
    
    
}
