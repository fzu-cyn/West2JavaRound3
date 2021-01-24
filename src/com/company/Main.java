package com.company;

import java.util.Scanner;

public class Main {
    public Main(){};
    Scanner scanner = new Scanner(System.in); // 创建Scanner对象
    public static void main(String[] args) {
	// write your code here
        updating();
        query("Beijing");
        query("New York");
        query("England");
        query("Tokyo");
    }
    public static void updating(){
        data d = new data();
        d.updata();
    }
    public static void query(String area){
        JDBC d = new JDBC();
        d.Query(area);
    }
}
