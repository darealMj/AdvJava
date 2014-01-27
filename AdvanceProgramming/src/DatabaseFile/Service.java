package DatabaseFile;
// Generated May 4, 2013 2:19:07 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Service generated by hbm2java
 */
public class Service  implements java.io.Serializable {


     private Integer id;
     private String service;
     private Set customers = new HashSet(0);

    public Service() {
    }

    public Service(String service, Set customers) {
       this.service = service;
       this.customers = customers;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getService() {
        return this.service;
    }
    
    public void setService(String service) {
        this.service = service;
    }
    public Set getCustomers() {
        return this.customers;
    }
    
    public void setCustomers(Set customers) {
        this.customers = customers;
    }




}


