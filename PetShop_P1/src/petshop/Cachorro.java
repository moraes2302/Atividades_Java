package petshop;


public class Cachorro extends Animal {
public Cachorro(String nome, int idade) {
super(nome, idade, "Cachorro");
}


@Override
public void emitirSom() {
System.out.println(getNome() + " esta latindo: Au Au!");
}


public void buscarBolinha() {
System.out.println(getNome() + " correu atras da bolinha!");
}
}