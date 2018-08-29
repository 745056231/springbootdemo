package com.javasm.springbootdemo.book.service.impl;

import com.javasm.springbootdemo.book.dao.RoseMapper;
import com.javasm.springbootdemo.book.model.Rose;
import com.javasm.springbootdemo.book.service.IRoseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements IRoseService {
    @Autowired
    RoseMapper roseMapper;
    public List<Rose> selectAllRose(){
        return roseMapper.selectAllRose();
    }


}
