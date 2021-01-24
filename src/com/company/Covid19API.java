package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Map;
import java.util.Scanner;
import java.util.zip.ZipFile;

public class Covid19API {
    private static final DateFormat JSON = null;
    Scanner scanner = new Scanner(System.in); // 创建Scanner对象
    static private String load(String url, String query) throws Exception{
        URL rurl = new URL(url);
        HttpURLConnection conn = (HttpURLConnection) rurl.openConnection();
        // 提交模式
        conn.setRequestMethod("GET");// POST GET PUT DELETE
        conn.setDoOutput(true);// 是否输入参数
        conn.setAllowUserInteraction(false);
        ZipFile myURLConnection = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(myURLConnection.getInputStream()));
        String line;
        String ans = null;
        StringBuilder response = new StringBuilder();
        while ((line = br.readLine()) != null) {
            response.append(line);
            response.append('\r');
            ans+=line;
           // System.out.println(line);
        }
        br.close();
        return ans;
    }
    static public <JSONObject, JdbcTemplate> void pushCountrytIntodb(String country){
        String url = "https://covid-api.mmediagroup.fr/v1/cases?country=" + country;
        try {
            String resultString = load(url, "");
            JSONObject jsonObject = (JSONObject) JSON.parseObject(resultString);
            JdbcTemplate template = new JdbcTemplate(JDBC.getData());
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }
}
