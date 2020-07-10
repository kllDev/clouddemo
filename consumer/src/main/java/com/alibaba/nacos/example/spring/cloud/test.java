package com.alibaba.nacos.example.spring.cloud;


public class test{

    private static final int _1MB=1024*1024;

    public static void main(String[] args) throws InterruptedException {
        byte[] a1,a2,a3,a4;
        a1 = new byte[2 * _1MB];
        Thread.sleep(10000);

        a2 = new byte[2 * _1MB];
        Thread.sleep(10000);

        a3 = new byte[2 * _1MB];
        Thread.sleep(10000);

        a4 = new byte[4 * _1MB];
        Thread.sleep(10000);
    }
}
