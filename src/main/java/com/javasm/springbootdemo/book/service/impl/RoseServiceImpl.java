package com.javasm.springbootdemo.book.service.impl;

import com.javasm.springbootdemo.book.dao.RoseMapper;
import com.javasm.springbootdemo.book.model.Rose;
import com.javasm.springbootdemo.book.service.IRoseService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoseServiceImpl implements IRoseService {
    Log log = LogFactory.getLog(RoseServiceImpl.class);
    @Autowired
    RoseMapper roseMapper;

    public List<Rose> selectAllRose(){
        log.debug("selectAllRose()被调用");
        return roseMapper.selectAllRose();
    }


}
