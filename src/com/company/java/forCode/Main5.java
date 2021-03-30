package com.company.java.forCode;

import java.io.*;
import java.util.StringTokenizer;

public class Main5 {
    public static void main(String[] args) throws IOException, NullPointerException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 문자열 쪼개기 => 쪼개진 문자열(token)

        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            if ( a < x ) {
                sb.append(a).append(" ");
            }
        }
//        bw.write(sb.toString());
//        bw.close();
        System.out.println(sb);
        br.close();
    }
}