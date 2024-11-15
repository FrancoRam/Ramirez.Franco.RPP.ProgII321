
package zoologico;


public class testZoologico {


    public static void main(String[] args) {
        
        Zoologico zoologico = new Zoologico();
        
        Mamifero mamifero1 = new Mamifero(200, Dieta.HERBIVORO, "Leonino", 10);
        Ave Hornero = new Ave("hornerito", 2, 2);
        Reptil reptileano1 = new Reptil("Gizeh", 5, "queratinosa", "ectomerial");
        
        zoologico.AgregarAnimal(mamifero1);
        zoologico.AgregarAnimal(Hornero);
        zoologico.AgregarAnimal(reptileano1);
        
        
        
        zoologico.VacunarAnimales();
        System.out.println("___________________");
        System.out.println("-------------------");
        zoologico.MostrarAnimales();
        
        
        
        
    }
    
}
