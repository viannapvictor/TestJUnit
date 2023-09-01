package br.com.victor;

import main.br.com.victor.ListCollectionExample;
import main.br.com.victor.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestClass {

    @Test
    public void classPersonTest() {
        List<Person> lista = new ArrayList<Person>();
        Person person = new Person("Joao", "Masculino");
        lista.add(person);
        Person person1 = new Person("Maria", "Feminino");
        lista.add(person1);
        Person person2 = new Person("Fernanda", "Feminino");
        lista.add(person2);
        Person person3 = new Person("Rafael", "Masculino");
        lista.add(person3);

        Stream<Person> women = lista.stream().filter(persons -> persons.getGender().equals("FEMININO"));

        women.forEach( woman -> Assert.assertEquals("FEMININO",woman.getGender()));
    }

}
