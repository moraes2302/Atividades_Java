package petshop;


public class Veterinario {
// Polimorfismo simples
public void examinar(Animal animal) {
System.out.println("Veterinario esta examinando " + animal.getNome() + " (" + animal.getEspecie() + ")");
}


// Sobrecarga de método
public void examinar(Animal animal, String observacao) {
System.out.println("Veterinario esta examinando " + animal.getNome() + " (" + animal.getEspecie() + ")");
System.out.println("Observacao: " + observacao);
}
}
