package com.mycompany.mainanimalproxy;
public class MainAnimalProxy {

    public static void main(String[] args) {
        System.out.println("-------------Animal Arara-------------");

        // Criando um proxy para um animal com um nome específico
        AnimalProxy proxyAraraAzul = new AnimalProxy("Arara Azul");

        // Exibindo informações da Arara Azul leão (a criação do AnimalReal ocorre aqui)
        proxyAraraAzul.mostrarInfo();

        // Exibindo informações da Arara Azul novamente (o objeto AnimalReal já foi criado, operação ocorre diretamente)
        proxyAraraAzul.mostrarInfo();

        System.out.println("-------------Animal Macaco Prego-------------");
        // Criando um proxy para outro animal
        AnimalProxy proxyMacacoPrego = new AnimalProxy("Macaco Prego");

        // Exibindo informações do Macaco Prego (a criação do AnimalReal ocorre aqui)
        proxyMacacoPrego.mostrarInfo();
    }
}
