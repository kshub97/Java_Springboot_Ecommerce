package com.coupling.ioc;

public class WebServiceDataProvider implements UserDataProvider {

    @Override
    public String getUserDetails() {
        return "Fetching Data From WebService";
    }
}
