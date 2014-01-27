/*
 * Hibernate Connection field 
 * Hibernate basic delete, retrieve,updaten and creation function
 * 
 */
package advanceprogramming;

import DatabaseFile.Customer;
import DatabaseFile.HibernateUtil;
import DatabaseFile.Service;
import java.util.List;
import java.util.Set;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Dacorie Smith
 */
public class DatabaseFunctions {

    public boolean create(Customer cust, Set services) 
    {
        cust.setServices(services);
        HelperSession().save(cust);
        HelperSession().getTransaction().commit();
        return true;
    }
   
    public Customer RetrivebyId(int idValue) {
    
        String queryString = "from Customer where id = " + idValue;
        Query query = HelperSession().createQuery(queryString);
        Object queryResult = query.uniqueResult();
        Customer user = (Customer) queryResult;
        HelperSession().getTransaction().commit();
        return user;
    }
   
    public List<Customer> RetrieveAllCustomers() {
        Query queryResult = HelperSession().createQuery("from Customer");
        List allCustomer;
        allCustomer = queryResult.list();
        return allCustomer;
    }

    public boolean updateById(int id, String name, String surname,int serviceId, boolean active)
    {
        Customer customer = RetrivebyId(id);
        HelperSession().beginTransaction();
        customer.setName(name);
        customer.setActive(active);
        customer.setSurname(surname);
        customer.setService(serviceId);
        HelperSession().update(customer);
        HelperSession().getTransaction().commit();
        return true;
    }

    public boolean deletebyId(int idValue)
    {
        String queryString = "from Customer where id = " + idValue;
        Query query = HelperSession().createQuery(queryString);
        Object queryResult = query.uniqueResult();
        Customer user = (Customer) queryResult;
        HelperSession().delete(user);
        HelperSession().getTransaction().commit();
        return true;
    }
    
    public Session HelperSession()// a helper function has code that is repeated through out the class.
    {
        AnnotationConfiguration config = new AnnotationConfiguration();
        config.addAnnotatedClass(Customer.class);
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        return session;
    }

}
