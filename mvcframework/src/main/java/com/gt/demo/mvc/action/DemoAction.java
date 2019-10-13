package com.gt.demo.mvc.action;

import com.gt.demo.mvcframework.annotation.AutoWried;
import com.gt.demo.mvcframework.annotation.Controller;
import com.gt.demo.mvcframework.annotation.RequestMapping;
import com.gt.demo.mvcframework.annotation.RequestParam;
import com.gt.demo.mvc.service.IDemoService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author gt
 */
@Controller
@RequestMapping("/demo")
public class DemoAction {

    @AutoWried
    IDemoService demoService;

    @RequestMapping("/add")
    public void add(HttpServletRequest request, HttpServletResponse response, @RequestParam("name") String name ){

    }
}
