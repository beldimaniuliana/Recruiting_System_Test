/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.cdi;

import javax.faces.bean.RequestScoped;

@javax.enterprise.context.RequestScoped
public interface UserSession {
    String welcomeUser(String name);
}