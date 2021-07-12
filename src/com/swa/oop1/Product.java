package com.swa.oop1;

public class Product {
    private String productID;
    private String productName;
    Product(String pid, String pname){
      productID = pid;
      productName = pname;
    }
    public String getDetail(){
      return "Product ID : "+productID+" and Product Name : "+productName;
    }
}

