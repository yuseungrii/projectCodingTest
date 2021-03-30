package com.company.java.forCode;

import java.util.*;
import java.io.*;

//public class Main3 {
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        int testCase = Integer.parseInt(br.readLine());
//        int a, b;
////        br.close();
//        for (int i=1; i<=testCase; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            a = Integer.parseInt(st.nextToken());
//            b = Integer.parseInt(st.nextToken());
//            bw.write("Case #" + i + ": " + (a + b) + "\n");
//        }
//        bw.flush();
//        bw.close();
//
//    }
//
//}

public class Main3 {
    public static void main(String[] args) throws IOException, NullPointerException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st; // 문자열 쪼개기 => 쪼개진 문자열(token)
        StringBuilder sb = new StringBuilder();
        int sum;
        for(int i =1; i<=num; i++)  {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
//            sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
            sb.append("Case #").append(i).append(": ")
                    .append(a).append(" + ")
                    .append(b).append(" = ")
                    .append(a+b).append("\n");
        }
        bw.write(sb.toString());
        bw.close();
        br.close();

    }
}