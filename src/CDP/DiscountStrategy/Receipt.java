/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CDP.DiscountStrategy;

/**
 *
 * @author Chris
 */
public class Receipt {
    private Customer customer;
    private DataStore dataStore;

    public Receipt(String customerId, DataStore dataStore) {
        this.dataStore = dataStore;
        customer = dataStore.findCustomerById(customerId);
    }
    
}
