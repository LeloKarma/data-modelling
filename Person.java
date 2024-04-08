package modelling;

import java.util.Scanner;

public class Person {
    private String name;
    private String email;
    private String password;
    private String confirmPassword;

    
    public Person() {
        this.name = name;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public void setName(String name) {
        this.name = name;
    } 

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    } 

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }
    
    public boolean isPasswordValid() {
        return password.length() >= 8;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();

        System.out.print("Enter name: ");
        person.setName(scanner.nextLine());

        System.out.print("Enter email: ");
        person.setEmail(scanner.nextLine());

        System.out.print("Enter password: ");
        person.setPassword(scanner.nextLine());
     /* Validate password
        if (person.isPasswordValid()) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is not valid. It must be at least 8 characters long.");
        } */

        System.out.print("Confirm password: ");
        person.setConfirmPassword(scanner.nextLine());
        
        
        
        System.out.println("\nPersonal Information:");
        System.out.println("Name: " + person.getName());
        System.out.println("Email: " + person.getEmail());
        System.out.println("Password: " + person.getPassword());
        //System.out.println("Confirm Password: " + person.getConfirmPassword());
    
    }
    
