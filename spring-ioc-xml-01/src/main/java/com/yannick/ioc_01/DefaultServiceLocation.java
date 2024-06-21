package com.yannick.ioc_01;

public class DefaultServiceLocation {
    private static ClientServiceImp clientService = new ClientServiceImp();
    public ClientServiceImp createClientServiceInstance(){
        return clientService;
    }
}
