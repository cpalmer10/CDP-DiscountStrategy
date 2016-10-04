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
    private LineItem[] lineItems;

    public Receipt(String customerId, DataStore dataStore) {
        this.dataStore = dataStore;
        customer = dataStore.findCustomerById(customerId);
        lineItems = new LineItem[0];
    }

    public final void addProduct(String productId, int quantity, DataStore dataStore) {
        LineItem item = new LineItem(productId, quantity, dataStore);
        
    }
    
}
