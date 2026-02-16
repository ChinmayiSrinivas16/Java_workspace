package com.example.dependencyinjection.laptop;

import org.springframework.stereotype.Component;

@Component("hitachi")
public class Hitachi implements Harddisk {

    @Override
    public String getType() {
        return "Hitachi Harddisk";
    }
}
