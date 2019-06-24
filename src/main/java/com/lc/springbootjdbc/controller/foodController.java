package com.lc.springbootjdbc.controller;

import com.lc.springbootjdbc.bean.department;
import com.lc.springbootjdbc.bean.*;
import com.lc.springbootjdbc.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class foodController {
    @Autowired
    foodMapper foodMapper;

    @GetMapping("/food")
    public List<food> getdepatmentById(){
        List<food> foods = new ArrayList<>();
        foods =foodMapper.getFoodList();
        music music = new music();
        music.setCoverImgUrl("/images/detail/carousel/1.jpg");
        music.setDataUrl("https://music.163.com/#/song?id=492722");
        music.setTitle("IF-Ken Arai");
        for ( food food: foods) {
            food.setMusic(music);
        }
        return foods;
    }




}