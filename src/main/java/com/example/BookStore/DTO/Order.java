package com.example.BookStore.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.criteria.CriteriaBuilder;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    public Integer orderId;
    public String BookName;
    public String customerName;
}
