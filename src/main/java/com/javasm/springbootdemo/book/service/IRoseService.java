package com.javasm.springbootdemo.book.service;

import com.javasm.springbootdemo.book.model.Rose;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

public interface IRoseService {
    @Cacheable(cacheNames = "roseList", unless = "#result==null")//注:model类要实现序列化,里面还可以写比如key="#rose.id",condition="#rose.id>0",试验了一下,写在实现方法里也可以生效
    List<Rose> selectAllRose();
}
