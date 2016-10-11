/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CDP.DiscountStrategy;

import OutputStrategy.OutputStrategy;
import StorageStrategy.DataStore;
import java.util.Date;
import java.text.SimpleDateFormat;



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
        addItemToLineItems(item);
        
    }
    
    private void addItemToLineItems(LineItem item){
        LineItem[] temp = new LineItem[lineItems.length + 1];
        
        System.arraycopy(lineItems, 0, temp, 0, lineItems.length);

        temp[temp.length - 1] = item;
        lineItems = temp;
        temp = null;
    }
    public final void printReceipt(OutputStrategy os){
        os.printReceipt(customer, lineItems);
    }
        
    
}
