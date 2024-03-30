package com.example.productclient.model;

import lombok.Data;
/**
 * 商品的实体
 *
 40
 * @author me
 */
@Data
public class Product {
    private Long id;
    private String productName;
    private Double price;
    private Long stock;
}