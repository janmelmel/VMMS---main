/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author Carl
 */
class User {
    private final String user_id;
    public User(String user_id){
        this.user_id=user_id;
    }
    public String getId(){
        return user_id;
    }
}
