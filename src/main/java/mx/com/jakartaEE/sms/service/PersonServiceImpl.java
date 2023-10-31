package mx.com.jakartaEE.sms.service;

import jakarta.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;
import mx.com.jakartaEE.sms.domain.Person;

@Stateless
public class PersonServiceImpl implements PersonServiceRemote{

    @Override
    public List<Person> listPerson() {
        List<Person> people = new ArrayList<>();
        people.add(new Person(1, "Juan", "Perez","jp@email.com", "2299001122"));
        people.add(new Person(2, "Karla", "Gomez","kg@email.com", "2299223344"));
        people.add(new Person(3, "Jose", "Torres","jt@email.com", "2299334455"));
        
        return people;
    }

    @Override
    public Person findPersonById(Person person) {
        return null;
    }

    @Override
    public Person findPersonByEmail(Person person) {
        return null;
    }

    @Override
    public void addPerson(Person person) {
    
    }

    @Override
    public void modifyPerson(Person person) {
       
    }

    @Override
    public void deletePerson(Person person) {
       
    }
    
}
