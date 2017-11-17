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
public class TravelAgency {
 
    private ArrayList<Airliner> airlinerCatalog;

    public TravelAgency()
    {
        airlinerCatalog = new ArrayList<Airliner>();
    }

    public ArrayList<Airliner> getAirlinerCatalog() {
        return airlinerCatalog;
    }

    public void setAirlinerCatalog(ArrayList<Airliner> airlinerCatalog) {
        this.airlinerCatalog = airlinerCatalog;
    }
    
    public Airliner addAirliner()
    {
        Airliner airliner = new Airliner();
        airlinerCatalog.add(airliner);
        return airliner;
    }
    
    public void deleteAirliner(Airliner airliner)
    {
        airlinerCatalog.remove(airliner);
    }
    
    public Airliner searchAirliner(String airlinerName)
    {
        for(Airliner airliner : airlinerCatalog)
        {
            if(airliner.getAirlinerName().equalsIgnoreCase(airlinerName))
            {
                return airliner;
            }
        }
        return null;
    }
}
