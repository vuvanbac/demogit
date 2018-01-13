/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chieuthi;

/**
 *
 * @author Asus
 */
public class Ngoc_Lam {
    public String ProductCode;
    public String ProductName;
    public String Category;
    public int Price;

    public Ngoc_Lam() {
    }

    public Ngoc_Lam(String ProductCode, String ProductName, String Category, int Price) {
        this.ProductCode = ProductCode;
        this.ProductName = ProductName;
        this.Category = Category;
        this.Price = Price;
    }

    public String getProductCode() {
        return ProductCode;
    }

    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }


    @Override
    public String toString() {
        return "Ngoc_Lam{" + "ProductCode=" + ProductCode + ", ProductName=" + ProductName + ", Category=" + Category + ", Price=" + Price + '}';
    }
   
    
}
