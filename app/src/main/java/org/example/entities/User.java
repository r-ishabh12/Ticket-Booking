package org.example.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
    private String name;
    private String password;
    private String hashPassword;
    private List<Ticket> ticketsbooked;
    private String userId;

    public User(String name,String password,String hashPassword,List<Ticket> ticketsbooked,String userId){
        this.name = name;
        this.password = password;
        this.hashPassword = hashPassword;
        this.userId = userId;
        this.ticketsbooked = ticketsbooked;
    }

    public User(){}

    public String getName(){
        return name;
    }
    public String getPassword(){
        return password;
    }
    public String getHashPassword(){
        return hashPassword;
    }
    public String getUserId(){
        return userId;
    }
    public List<Ticket> getTicketsbooked(){
        return ticketsbooked;
    }
    public void printTickets(){
        for (int i = 0; i < ticketsbooked.size(); i++){
            System.out.println(ticketsbooked.get(i).getTicketInfo());
        }
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setUserId(String userId){
        this.userId = userId;
    }
    public void setHashPassword(String hashPassword){
        this.hashPassword = hashPassword;
    }
    public void setTicketsbooked(List<Ticket> ticketsbooked){
        this.ticketsbooked = ticketsbooked;
    }


}
