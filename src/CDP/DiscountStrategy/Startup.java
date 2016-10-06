/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CDP.DiscountStrategy;

import OutputStrategy.ConsoleOutput;
import POSTerminal.Register;
import StorageStrategy.DataStore;
import StorageStrategy.InMemoryDatabase;

/**
 *
 * @author Chris
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Register register = new Register();
        DataStore dataStore = new InMemoryDatabase();
        
        
         //customer  #C100
        
        
        register.startNewSaleForCustomerId("C100", dataStore);
        register.addProductToSale("P100", 2, dataStore);
        register.addProductToSale("P101", 3, dataStore);
        register.addProductToSale("P102", 1, dataStore);
        register.endSale(new ConsoleOutput());
    }
    
    // OutputStrategy
        //ConsoleOutput
        //GuiOutput
    
}
