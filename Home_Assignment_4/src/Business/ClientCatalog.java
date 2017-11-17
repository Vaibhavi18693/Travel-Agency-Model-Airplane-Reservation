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
public class ClientCatalog {
    
    private ArrayList<Client> clientCatalog;
    
    public ClientCatalog()
    {
        this.clientCatalog = new ArrayList<Client>();
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
}
