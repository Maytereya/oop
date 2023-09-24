package org.example;

import java.util.List;

public class HotDrinkVendingMashine implements VendingMashine{
List<hotDrink> productList;

    public HotDrinkVendingMashine(List<hotDrink> productList) {
        this.productList = productList;
    }

    public List<hotDrink> getProductList() {
        return productList;
    }

    public void setProductList(List<hotDrink> productList) {
        this.productList = productList;
    }
    public hotDrink getProduct(String name, int temperature, int volume) {
        for (hotDrink hDrink: productList){
            if(hDrink.getName().equals(name) && hDrink.getTemperature() == temperature && hDrink.getVolume() == volume){
                return hDrink;
            }
        }
        return null;
    }
    @Override
    public product getProduct(String name) {
        for (product Product: productList){
            if(Product.getName().equals(name)){
                return Product;
            }
        }
        return null;
    }

    public void addHotDrink(hotDrink hDrink){
        this.productList.add(hDrink);
    }

}
