package CDP.DiscountStrategy;

import DiscountStrategy.DiscountStrategy;

/**
 *
 * @author Chris
 */
public class Product {
    private String productName;
    private String productId;
    private double unitCost;
    private DiscountStrategy discount;

    
    public Product(String productId, String productName,  double unitCost, DiscountStrategy discount) {
        this.productId = productId;
        this.productName = productName;       
        this.unitCost = unitCost;     
        this.discount = discount;
    }
    
    public final DiscountStrategy getDiscountAmount() {
        return discount;
    }
    

    public final String getProductName() {
        return productName;
    }

    public final void setProductName(String productName) {
        this.productName = productName;
    }

    public final String getProductId() {
        return productId;
    }

    public final void setProductId(String productId) {
        this.productId = productId;
    }

    public final double getUnitCost() {
        return unitCost;
    }

    public final void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }
    
}
