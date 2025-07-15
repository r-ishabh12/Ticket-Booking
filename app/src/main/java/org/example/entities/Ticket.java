package org.example.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import javax.print.attribute.standard.Destination;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Ticket {
    private String ticketId;
    private String userId;
    private String source;
    private String destination;
    private String dateOfTravel;
    private Train train;

    public Ticket(){}
    public Ticket(String ticketId,String userId,String source, String destination,String dateOfTravel,Train train){
        this.ticketId = ticketId;
        this.userId = userId;
        this.dateOfTravel = dateOfTravel;
        this.source = source;
        this.destination = destination;
        this.train = train;
    }
    public String getTicketInfo(){
        return String.format("Ticket ID: %s belongs to User %s  from %s to %s on %s", ticketId,userId,source,destination,dateOfTravel);
    }
    public String getTicketId(){
        return ticketId;
    }
    public String getUserId(){
        return userId;
    }
    public String getSource(){
        return source;
    }
    public String getDestination(){
        return destination;
    }
    public String getDateOfTravel(){
        return dateOfTravel;
    }
    public Train getTrain(){
        return train;
    }
    public void setTicketId(String ticketId){
        this.ticketId = ticketId;
    }
    public void setUserId(String userId){
        this.userId = userId;
    }
    public void setSource(String source){
        this.source = source;
    }
    public void setDestination(String destination){
        this.destination = destination;
    }
    public void setTrain(Train train){
        this.train = train;
    }

}
