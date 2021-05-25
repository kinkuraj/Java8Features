package com.quarkxwave.methodoverriding;

import java.io.IOException;

public class ParentClass {

    public Object message(int a) throws Exception {
        return "Value received in parent class :" + a;
    }
}
