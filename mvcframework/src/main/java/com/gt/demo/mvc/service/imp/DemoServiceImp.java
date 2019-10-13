package com.gt.demo.mvc.service.imp;

import com.gt.demo.mvcframework.annotation.Service;
import com.gt.demo.mvc.service.IDemoService;

/**
 * @author gt
 */
@Service("demoService")
public class DemoServiceImp implements IDemoService {
    @Override
    public String add(String name) {
        return "add name " + name + " is OK!";
    }
}
