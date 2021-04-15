
package com.ocp.day12;
//超載，或稱之為負載
public class OverloadingDemo {
    public void calc(int x){
        System.out.println("int: "+x);
    }
    public void calc(Integer x){
        System.out.println("Integer: "+x);
    }
    public void calc(float x){
        System.out.println("float: "+x);
    }
    public void calc(double x){
        System.out.println("double: "+x);
    }
    
    public static void main(String[] args) {
        OverloadingDemo o=new OverloadingDemo();
        o.calc(100);
    }
    
}
