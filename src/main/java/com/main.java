package com;

import sun.nio.ch.Net;

public class main {
    public static void main(String[] args) {
        NetWorks.get("http://baidu.com", new NetWorks.Block() {
            public void success(Object response) {
                System.out.println("请求成功");
            }

            public void failure() {
                System.out.println("请求失败了");
            }
        });
    }
}
