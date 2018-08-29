package com.javasm.springbootdemo.book.service;

import com.javasm.springbootdemo.book.model.Rose;

import java.util.List;

public interface IRoseService {
    List<Rose> selectAllRose();
}
