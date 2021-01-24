package com.company;

public class data {
    public void updata(){
        Covid19API c = new Covid19API();
        c.getData("China");
        c.getData("US");
        c.getData("United Kingdom");
        c.getData("Japan");
    }

}
