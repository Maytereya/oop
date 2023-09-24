package org.example;

import java.util.List;

public class BottleOfWaterVendingMashine implements VendingMashine{
List<BottleOfWater> productList;

    public BottleOfWaterVendingMashine(List<BottleOfWater> productList) {
        this.productList = productList;
    }

    public List<BottleOfWater> getProductList() {
        return productList;
    }

    public void setProductList(List<BottleOfWater> productList) {
        this.productList = productList;
    }
    public BottleOfWater getProduct(String name, int volume) {
        for (BottleOfWater bottleOfWater: productList){
            if(bottleOfWater.getName().equals(name) && bottleOfWater.getVolume() == volume){
                return bottleOfWater;
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

    public void addBottleOfWater(BottleOfWater bottleOfWater){
        this.productList.add(bottleOfWater);
    }

}
