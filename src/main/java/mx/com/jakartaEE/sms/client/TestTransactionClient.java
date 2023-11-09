package mx.com.jakartaEE.sms.client;


import javax.naming.*;
import mx.com.jakartaEE.sms.domain.Person;
import mx.com.jakartaEE.sms.service.PersonServiceRemote;
import org.apache.logging.log4j.*;


public class TestTransactionClient {
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        try {
            Context jndi = new InitialContext();
            PersonServiceRemote personService = (PersonServiceRemote) jndi.lookup("java:global/sms-jee-web3/PersonServiceImpl!mx.com.jakartaEE.sms.service.PersonServiceRemote");
            
            log.debug("Iniciando prueba transaccional PersonService");
            
            Person persona1 = personService.findPersonById(new Person(1));
            
            log.debug("Persona recuperada: " + persona1);
            
        } catch (NamingException ex) {
            log.debug(ex.getMessage());
        }
                
    }
}
