package com.yannick.pojo;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.util.List;

@Data
@Alias(value = "customer")
public class Customer {
    private Integer customerId;
    private String customerName;

    private List<Order> orderList;
}
