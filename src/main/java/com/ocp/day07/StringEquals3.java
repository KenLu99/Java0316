/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day07;

/**
 *
 * @author MB-study
 */
public class StringEquals3 {
    public static void main(String[] args) {
        String s1="Java";
        String s2="Java";
        System.out.println("s1==s2");
        s1=s1+"8";
        s2=s2.concat("8");//作用與上述相等，即連接一個"8"(字串相連)
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);//false
        System.out.println(s1.intern()==s2.intern());//true
        //字串比較盡量用equals不要用雙等號(有可能錯誤)
    }
 
}
