
package com.example.cdi;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class UserSessionImpl {//implements UserSession {
    public String welcomeUser (String name){
        return "Welcome: " + name + "!";
    }
}