package com.vighnesh.example;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Order {
  //  @JsonProperty("p")
    private String productName;
   // @JsonProperty("c")
    private String customerName;
    //@JsonProperty("q")
    private  int quantity;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "productName='" + productName + '\'' +
                ", customerName='" + customerName + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
