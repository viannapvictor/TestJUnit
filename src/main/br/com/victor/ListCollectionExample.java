package main.br.com.victor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class ListCollectionExample  {

    public static void main(String[] args) {
        String i = "";
        Scanner s = new Scanner(System.in);
        List<Person> lista = new ArrayList<Person>();

        while (!i.equalsIgnoreCase("SIM")) {
            System.out.println("****** Digite o nome e o genero de alguem ******");
            System.out.println("Digite um Nome: ");
            String name = s.next();
            System.out.println("Digite o genero (Masculino/Feminino): ");
            String gender = s.next().toUpperCase();
            Person person = new Person(name.toString(), gender.toString());
            lista.add(person);
            System.out.println("Deseja parar (Sim/Nao): ");
            i = s.next().toUpperCase();
        }

        Stream<Person> women = lista.stream().filter(person -> person.getGender().equalsIgnoreCase("feminino"));

        System.out.println("As mulheres são:");
        women.forEach(woman -> System.out.println(woman.getName()));

    }

}
