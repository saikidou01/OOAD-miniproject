package Models;


import java.util.ArrayList;

public class Landlord extends User{
    private Email email;
    private ArrayList<Property> properties;
    
    /**
     * Constructor for the Landlord class
     */

    public Landlord()
    {
        super();
        this.email = new Email();
        this.properties = new ArrayList<Property>();
    }

    public Landlord(String username,String fName, String lName, int id, String password, String userType, Email email, ArrayList<Property> properties){
        super(username, fName, lName, id, password, userType);
        this.email = email;
        this.properties = new ArrayList<Property>(properties);
    }

    public Landlord(User u){
        super(u);
        this.email = new Email();
        this.properties = new ArrayList<Property>();
    }

    public Email getEmail()              //getter method for the email  
    {
        return email;
    }

    public void setEmail(Email email)      //setter method for the email
    {
        this.email = email; 
    }

    public ArrayList<Property> getProperties(){
        return this.properties;
    }

    public void setProperties(ArrayList<Property> props){
        this.properties = new ArrayList<>(props);
    }

    public void addProperty(Property p)         //add a property
    {
        properties.add(p);
    }

    public void removeProperty(Property p)   //remove a property
    {
        properties.remove(p);
    }
}
