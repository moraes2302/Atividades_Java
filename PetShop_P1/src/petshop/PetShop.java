package petshop;


public class PetShop {
public static void main(String[] args) {
// Criando animais
Cachorro dog = new Cachorro("Rex", 3);
Gato cat = new Gato("Mia", 2);


// Usando métodos
dog.emitirSom();
dog.buscarBolinha();


cat.emitirSom();
cat.arranhar();


// Veterinário
Veterinario vet = new Veterinario();
vet.examinar(dog);
vet.examinar(cat, "Esta saudavel e vacinado.");
}
}