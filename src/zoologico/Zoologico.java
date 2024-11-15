
package zoologico;

import java.util.ArrayList;
import zoologico.Animal;



public class Zoologico {

  private final ArrayList<Animal> animales;
  public Zoologico() 
  {
    this.animales = new ArrayList<>();
  }

  public void AgregarAnimal(Animal animal)
  {
    if(this.animales.contains(animal))
      {
          throw new AnimalDuplicadoException("El animal ya se encuentra en la lista!!");
      }
    animales.add(animal);
    System.out.println("se agregó un animal a la lista (animal)..");
  }
   
  public void MostrarAnimales()
  {
      for (Animal animal : animales) 
        {
            System.out.println(animal);
        }
  }
    
  public void VacunarAnimales()
  {
      for (Animal animal : animales)
        {
            if (animal instanceof Vacunable vacunador)
            {
                vacunador.Vacunar();
            }
            else
            {
                System.out.println(animal.getNombre() +" no puede ser vacunado!!");
            }
        }
  }
  
}
