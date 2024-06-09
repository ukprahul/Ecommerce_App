package com.ecommerce.ProductService.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class createProductRequestDto {
    private String title;
    private double price;
    private String description;
    private String image;
    private String category;
}
