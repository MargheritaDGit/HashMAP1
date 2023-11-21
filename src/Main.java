import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

//Creare 3 hashmap con 3 differenti metodi di inizializzazione e stampare il contenuto.
public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Black Mamba");
        Animal animal2 = new Animal("Aquila reale");
        Animal animal3 = new Animal("Delfino");

        Map<String, Animal> listAnimal = new HashMap<>(); //metodo 1 hashmap
        listAnimal.put("Rettile", animal1);
        listAnimal.put("Uccello", animal2);
        listAnimal.put("Mammifero marino", animal3);

        System.out.println("Il primo hashmap è: " + listAnimal);

        Map<String, Animal> listAnimal2 = Map.of("Rettile", animal1, "Uccello", animal2, "Mammifero marino", animal3); //metodo 2 hashmap
        System.out.println("Il secondo hashmap è: " + listAnimal2);

        Map<String, Animal> listAnimal3 = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("Rettile", animal1),
                new AbstractMap.SimpleEntry<>("Uccello", animal2),
                new AbstractMap.SimpleEntry<>("Mammifero marino", animal3)
        );
        System.out.println("Il terzo hashmap è: " + listAnimal3);
    }
}
