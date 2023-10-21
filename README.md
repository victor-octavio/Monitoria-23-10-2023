# Prova 1 - Programação Orientada a Objetos
## Pilares de POO
## 1.  Abstração:
Utilização de abstração está presente quando nos utilizamos de classes e métodos para "esconder" determinados detalhes, 
por exemplo:
Imagine uma classe Quadrado, que tenha um método calcularArea().

    public class Quadrado {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return lado * lado;
    }

Ao observar a classe internamente vemos como ela foi modelada e não abstraímos nada, porém observe como utilizamos esse 
método em uma Main e utilizamos da abstração do método calculaArea(), para realizarmos o cálculo do quadrado.

    public static void main(String[] args) {

        Quadrado meuQuadrado = new Quadrado(5.0); // Instanciando o objeto quadrado
        
        meuQuadrado.calcularArea(); // Utilizando da abstração do método para realizar o cálculo
    }

Logo, podemos perceber que isso não é abstração 👇

    public double calcularArea() {
        return lado * lado;
    }

E isso é abstração! 👇

    meuQuadrado.calcularArea();

## 2.  Encapsulamento:
O encapsulamento trata-se de encapsular determinados comportamentos de determinados modelos dentro de classes,
por exemplo:

    public class Cliente {
        private int id;
        private String nome;
        private String endereco;
        private String email;
        private String telefone;

    // Construtor da classe Cliente
        public Cliente(int id, String nome, String endereco, String email, String telefone) {
            this.id = id;
            this.nome = nome;
            this.endereco = endereco;
            this.email = email;
            this.telefone = telefone;
    }

## 3.  Herança:
A herança permite que um objeto adquira as propriedades e métodos de outro objeto. A reutilização é o 
principal benefício aqui. Sabemos que às vezes a mesma coisa precisa ser feita em vários lugares 
e sempre de forma igual, exceto em alguma pequena parte. Esse é um problema que a herança pode resolver.
Por exemplo:

    public class Pessoa {
        private String nome;
        private int idade;

        // Método construtor
        public Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;

        public void mostrarInfo() {
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
        }
    }
Agora, vamos imaginar uma subclasse que se utiliza da classe Pessoa para herdar atributos e métodos.

    public class Estudante extends Pessoa {
        private String curso;

        public Estudante(String nome, int idade, String curso) {
            super(nome, idade); // Chama o construtor da classe base
            this.curso = curso;

        @Override
        public void mostrarInfo() {
            super.mostrarInfo(); // Chama o método mostrarInfo da classe base
            System.out.println("Curso: " + curso);
        }
    }
Neste exemplo, a classe Estudante herda da classe Pessoa. A classe Pessoa tem dois atributos (nome e idade) e um método mostrarInfo(). A classe Estudante tem um atributo adicional (curso) e sobrescreve o método mostrarInfo() para exibir informações específicas do estudante, além das informações da pessoa.

## 4.  Polimorfismo:    
Polimorfismo significa "a condição de ocorrer de várias formas diferentes", ou seja, o polimorfismo está preocupado em utilizar a herança de forma diferente, onde ao herdar método de uma superclasse
por exemplo, temos a possibilidade de modificar os métodos para que operem de forma diferente nas subclasses. 
Por exemplo:

Classe Animal (classe base):
    
    public class Animal {

        public void fazerSom() {
        System.out.println("Um animal faz um som.");
        }
    }

Classe Cachorro (classe derivada):

    public class Cachorro extends Animal {

        @Override
        public void fazerSom() {    // Sobrescreve o método da superclasse
            System.out.println("O cachorro late: Woof! Woof!");
        }
    }

Classe Gato (classe derivada):

    public class Gato extends Animal {
        @Override
        public void fazerSom() {    // Sobrescreve o método da superclasse
            System.out.println("O gato mia: Meow! Meow!");
        }
    }

Aqui, a classe Animal é a classe base que contém o método fazerSom(). As classes derivadas Cachorro e Gato herdam da classe Animal e sobrescrevem o método fazerSom() para 
fornecer comportamentos específicos para cada tipo de animal. Isso é polimorfismo!



