/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.controller;

/**
 *
 * @author Angel castillo
 */
public class AddData {

    private String user;
    private String pass;

    public AddData(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

   public AddData() {
       
    }

    @Override
    public String toString() {
        return "AddData{" + "user=" + user + ", pass=" + pass + '}'+ "\n";
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }
    
}


