package com.yannick.pojo;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias(value = "order")
public class Order {
    private Integer orderId;
    private String orderName;
    private Integer customerId;

    private Customer customer;
}
