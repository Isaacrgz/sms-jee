package mx.com.jakartaEE.sms.client;

import java.util.List;
import javax.naming.*;
import mx.com.jakartaEE.sms.domain.Person;
import mx.com.jakartaEE.sms.service.PersonServiceRemote;

public class ClientPersonService {
    public static void main(String[] args) {
        System.out.println("-------------Staring call to EJB from the client------------- \n\n");
        try {
            Context jndi = new InitialContext();
            String path = "java:global/sms-jee/PersonServiceImpl!mx.com.jakartaEE.sms.service.PersonServiceRemote";
            PersonServiceRemote personServiceRemote = (PersonServiceRemote) jndi.lookup(path);
            
            List<Person> people = personServiceRemote.listPerson();
            for (Person p : people) {
                System.out.println(p);
            }
            
        } catch (NamingException e) {
            e.printStackTrace(System.out);
        }
    }
}
