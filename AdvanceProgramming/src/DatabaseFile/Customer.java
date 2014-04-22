package DatabaseFile;
// Generated May 4, 2013 2:19:07 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Customer generated by hbm2java
 */
public class Customer  implements java.io.Serializable {


     private Integer id;
     private String name;
     private String surname;
     private Boolean active;
     private Integer service;
     private Set services = new HashSet(0);

    public Customer() {
    }

    public Customer(String name, String surname, Boolean active, Integer service, Set services) {
       this.name = name;
       this.surname = surname;
       this.active = active;
       this.service = service;
       this.services = services;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return this.surname;
    }
    
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public Boolean getActive() {
        return this.active;
    }
    
    public void setActive(Boolean active) {
        this.active = active;
    }
    public Integer getService() {
        return this.service;
    }
    
    public void setService(Integer service) {
        this.service = service;
    }
    public Set getServices() {
        return this.services;
    }
    
    public void setServices(Set services) {
        this.services = services;
    }




}

