package com.quanjiawei.web.controller;

import com.quanjiawei.service.store.CompanyService;
import com.quanjiawei.service.store.impl.CompanyServiceImpl;
import com.quanjiawei.service.system.DeptService;
import com.quanjiawei.service.system.UserService;
import com.quanjiawei.service.system.impl.DeptServiceImpl;
import com.quanjiawei.service.system.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class BaseServlet extends HttpServlet {
    protected CompanyService companyService;
    protected DeptService deptService;
    protected UserService userService;

    @Override
    public void init() throws ServletException {
        companyService = new CompanyServiceImpl();
        deptService = new DeptServiceImpl();
        userService = new UserServiceImpl();
    }
}
