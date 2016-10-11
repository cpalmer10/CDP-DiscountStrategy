package CDP.DiscountStrategy;

import StorageStrategy.DataStore;

/**
 *
 * @author Chris
 */
public class LineItem {
    private Product product;
    private int quantity;

    public LineItem(String productId, int quantity, DataStore dataStore) {
        this.product = dataStore.findProductById(productId);
        this.quantity = quantity;
    }

    
    public Product getProduct() {
        return product;
    }

    public final void setProduct(Product product) {
        this.product = product;
    }

    public final int getQty() {
        return quantity;
    }

    public final void setQty(int quantity) {
        this.quantity = quantity;
    }
    
    
}
