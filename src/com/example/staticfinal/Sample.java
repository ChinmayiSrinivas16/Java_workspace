package com.example.staticfinal;

public class Sample {
    int x;
    final int y=100;
    final int z;
    static final int num=100;
    //final members must be initialized at the
    //time of declaration or in every constructor
    public Sample(){
        z=100;
    }
    public Sample(int a){
        z=a;
    }
    public Sample(int a,int b){
        z=a;
        x=b;
    }
}
