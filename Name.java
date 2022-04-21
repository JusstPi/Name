/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package name;

/**
 *
 * @author user
 */
public class Name {
    public String firstName;
    public String middleName;
    public String lastName;
    
    
    public Name(){ }

    public Name(String firstName, String middleName, String lastName){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public String getMiddleName() {
	return middleName;
    }

    public void setMiddleName(String middleName) {
	this.middleName = middleName;
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }
    public String toString(){
        return "Name: " + firstName + middleName  + lastName;
    }
    public boolean obj(Object e) {
        if(e instanceof Name) {
            Name temp = (Name) e;
            if(this.getFirstName().equals(temp.getFirstName()) == true && this.getMiddleName().equals(temp.getMiddleName()) == true && this.getLastName().equals(temp.getLastName()) == true)
                return true;
        }
        return false;
    }
}
