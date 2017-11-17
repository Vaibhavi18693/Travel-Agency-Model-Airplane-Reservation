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
public class Airplane {
    
    private String manufacturer;
    private int modelNum;
    private int yearOfManufacture;
    private long serialNum;
    private int numberOfSeats;
    private ArrayList<Flights> flightCatalog;
    
    public Airplane()
    {
        flightCatalog = new ArrayList<Flights>();
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getModelNum() {
        return modelNum;
    }

    public void setModelNum(int modelNum) {
        this.modelNum = modelNum;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public long getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(long serialNum) {
        this.serialNum = serialNum;
    }
    
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public ArrayList<Flights> getFlightCatalog() {
        return flightCatalog;
    }

    public void setFlightCatalog(ArrayList<Flights> flightCatalog) {
        this.flightCatalog = flightCatalog;
    }

    public Flights addFlight()
    {
        Flights flight = new Flights();
        flightCatalog.add(flight);
        return flight;
    }
    
    public void deleteFlight(Flights flight)
    {
        flightCatalog.remove(flight);
    }
    
    public int totalFlights(ArrayList<Flights> flightList)
    {
        return flightList.size();
    }
    
    public String toString()
    {
        return manufacturer;
    }
}
