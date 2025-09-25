package petshop;


public class Gato extends Animal {
public Gato(String nome, int idade) {
super(nome, idade, "Gato");
}


@Override
public void emitirSom() {
System.out.println(getNome() + " esta miando: Miau!");
}


public void arranhar() {
System.out.println(getNome() + " arranhou o sofa!");
}
}