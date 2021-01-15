package com.gtech.project.models;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 50)
    private String productName;

    @Column(length = 25)
    private String productCode;

    @Column
    private Double productPrice;

    @Column(length = 50)
    private String storeName;

    @Column(length = 35)
    private String brandName;

    @Column(length = 35)
    private String categoryName;

    @Column
    private String categoryDescription;

    public Product(String productName, String productCode, Double productPrice, String storeName, String brandName, String categoryName, String categoryDescription) {
        this.productName = productName;
        this.productCode = productCode;
        this.productPrice = productPrice;
        this.storeName = storeName;
        this.brandName = brandName;
        this.categoryName = categoryName;
        this.categoryDescription = categoryDescription;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productCode='" + productCode + '\'' +
                ", productPrice=" + productPrice +
                ", storeName='" + storeName + '\'' +
                ", brandName='" + brandName + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", categoryDescription='" + categoryDescription + '\'' +
                '}';
    }


}
