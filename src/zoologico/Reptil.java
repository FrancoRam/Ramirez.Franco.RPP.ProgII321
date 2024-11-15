
package zoologico;


public class Reptil extends Animal{
    private String tipoEscama;
    private String regTemperatura;

    public Reptil(String nombre, int edad, String tipoEcama, String regTemperatura) {
        super(nombre, edad);
        this.tipoEscama = tipoEcama;
        this.regTemperatura = regTemperatura;
        
    }
    
    @Override
    public String toString() {
        return "Ave:" + super.toString()+ "tipoEscama=" + tipoEscama + ", regTemperatura=" + regTemperatura;
    }
    
}
