package com.lc.springbootjdbc.mapper;
import com.lc.springbootjdbc.bean.food;

import java.util.List;


public interface foodMapper {
    public List<food> getFoodList();
    public food getFoodById(Integer id);
    public food addFood(food food);
}