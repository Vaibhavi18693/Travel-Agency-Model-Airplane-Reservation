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
public class Airliner {
 
    private String airlinerName;
    private String airlinerOwner;
    private int totalFlights;
    private int totalFlightsPerDay;
    private double totalflightsRevenue;
    private double totalRevenueGeneratedByAirliner;
    private ArrayList<Airplane> airplaneCatalog;
    
    public Airliner()
    {
        airplaneCatalog = new ArrayList<Airplane>();
    }

    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }

    public String getAirlinerOwner() {
        return airlinerOwner;
    }

    public void setAirlinerOwner(String airlinerOwner) {
        this.airlinerOwner = airlinerOwner;
    }

    public ArrayList<Airplane> getAirplaneCatalog() {
        return airplaneCatalog;
    }

    public void setAirplaneCatalog(ArrayList<Airplane> airplaneCatalog) {
        this.airplaneCatalog = airplaneCatalog;
    }

    public int getTotalFlights() {
        return totalFlights;
    }

    public void setTotalFlights(int totalFlights) {
        this.totalFlights = totalFlights;
    }

    public int getTotalFlightsPerDay() {
        return totalFlightsPerDay;
    }

    public void setTotalFlightsPerDay(int totalFlightsPerDay) {
        this.totalFlightsPerDay = totalFlightsPerDay;
    }

    public double getTotalflightsRevenue() {
        return totalflightsRevenue;
    }

    public void setTotalflightsRevenue(double totalflightsRevenue) {
        this.totalflightsRevenue = totalflightsRevenue;
    }

    public double getTotalRevenueGeneratedByAirliner() {
        return totalRevenueGeneratedByAirliner;
    }

    public void setTotalRevenueGeneratedByAirliner(double totalRevenueGeneratedByAirliner) {
        this.totalRevenueGeneratedByAirliner = totalRevenueGeneratedByAirliner;
    }

    public Airplane addAirplane()
    {
        Airplane airplane = new Airplane();
        airplaneCatalog.add(airplane);
        return airplane;
    }
    
    public void deleteAirplane(Airplane airplane)
    {
        airplaneCatalog.remove(airplane);
    }
    
    public int totalAirplane(ArrayList<Airplane> airplaneList)
    {
        return airplaneList.size();
    }
    
    public String toString()
    {
        return this.airlinerName;
    }
}
