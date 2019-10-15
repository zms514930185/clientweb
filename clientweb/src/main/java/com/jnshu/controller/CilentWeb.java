package com.jnshu.controller;


import com.jnshu.service.Say;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

@Controller
public class CilentWeb {

    @RequestMapping("/")
    @ResponseBody
    public String say() throws RemoteException, NotBoundException, MalformedURLException {
        Say say= (Say) Naming.lookup("rmi://localhost:8099/tuscany");
        return say.sayHello("开始");
    }
}
