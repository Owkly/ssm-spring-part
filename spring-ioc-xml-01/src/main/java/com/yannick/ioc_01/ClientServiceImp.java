package com.yannick.ioc_01;

public class ClientServiceImp {
    private static ClientServiceImp clientService = new ClientServiceImp();
    public ClientServiceImp createClientServiceInstance(){
        return clientService;
    }
}
