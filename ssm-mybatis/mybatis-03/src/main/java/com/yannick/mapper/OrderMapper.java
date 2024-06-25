package com.yannick.mapper;

import com.yannick.pojo.Order;

public interface OrderMapper {
    Order queryOrderById(Integer id);
}
