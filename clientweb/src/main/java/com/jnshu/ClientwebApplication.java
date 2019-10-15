package com.jnshu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jnshu.service.Say;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

@SpringBootApplication
public class ClientwebApplication {

    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        SpringApplication.run(ClientwebApplication.class, args);
        Say say= (Say) Naming.lookup("rmi://localhost:8099/tuscany");
    }

}
