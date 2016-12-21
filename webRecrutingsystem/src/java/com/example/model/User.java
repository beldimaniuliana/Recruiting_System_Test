/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.model;

 public class User {
     private  String name;
     private  String email;
     private  String password;
     private  String reference;
     private  String gender;
     private  String[] interests;
     
     public User(String name, String email, String password, String reference, 
         String gender, String[] interests) {
         this.name = name;
         this.email = email;
         this.password = password;
         this.reference = reference;
         this.gender = gender;
         this.interests = interests;
     }
 
     public  String getName() {
       return name;
     }
     
     public  String getEmail() {
       return email;
     }
 
     public  String getPassword() {
       return password;
     }
 
     public  String getReference() {
         return reference;
     }
 
     public String getGender(){
         return gender;
     }
 
     public String[] getInterests() {
         return interests;
     }
 
}
