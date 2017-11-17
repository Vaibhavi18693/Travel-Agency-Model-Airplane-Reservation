/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Vaibhavi
 */
public class Flights implements Comparable<Flights>{
   
    private String source;
    private String destination;
    private String flightDate;
    private String flightTime;
    private String flightNum;
    private String dateTime;
    private Seats[][] seatsAvailable;
    private int totalSeats;
    private int seatsRemaining;
    private double flightRate;
    private double totalRate;
    private ArrayList<Client> clientCatalog;
    
    public Flights()
    {
        clientCatalog = new ArrayList<Client>();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }

    public String getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(String flightTime) {
        this.flightTime = flightTime;
    }

    public String getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public Seats[][] getSeatsAvailable() {
        return seatsAvailable;
    }

    public void setSeatsAvailable(Seats[][] seatsAvailable) {
        this.seatsAvailable = seatsAvailable;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public int getSeatsRemaining() {
        return seatsRemaining;
    }

    public void setSeatsRemaining(int seatsRemaining) {
        this.seatsRemaining = seatsRemaining;
    }

    public double getFlightRate() {
        return flightRate;
    }

    public void setFlightRate(double flightRate) {
        this.flightRate = flightRate;
    }

    public double getTotalRate() {
        return totalRate;
    }

    public void setTotalRate(double totalRate) {
        this.totalRate = totalRate;
    }

    public ArrayList<Client> getClientCatalog() {
        return clientCatalog;
    }

    public void setClientCatalog(ArrayList<Client> clientCatalog) {
        this.clientCatalog = clientCatalog;
    }
    
    public Client addClient()
    {
        Client client = new Client();
        clientCatalog.add(client);
        return client;
    }
    
    public void deleteClient(Client client)
    {
        clientCatalog.remove(client);
    }
    
    public String toString()
    {
        return flightNum;
    }
    
    public int compareTo(Flights flight)
    {
        return (this.getFlightRate() < flight.getFlightRate() ? -1 :
                (this.getFlightRate() == flight.getFlightRate() ? 0 : 1));
    }
}
