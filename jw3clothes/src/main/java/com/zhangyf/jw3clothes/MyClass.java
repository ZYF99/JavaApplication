package com.zhangyf.jw3clothes;

import com.baidu.aip.imagesearch.AipImageSearch;

import org.json.JSONObject;

import java.util.HashMap;

public class MyClass {
    //设置APPID/AK/SK
    public static final String APP_ID = "23644210";
    public static final String API_KEY = "SdUYKX1GQzQMxhGsKSErpYCP";
    public static final String SECRET_KEY = "MuCtDzjMjosvjWQ7Z0YXHlbbXQm6lfeG";

    public static void main(String[] args) {
        // 初始化一个AipImageSearch
        AipImageSearch client = new AipImageSearch(APP_ID, API_KEY, SECRET_KEY);

        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);

        /*// 可选：设置代理服务器地址, http和socket二选一，或者均不设置
        client.setHttpProxy("proxy_host", proxy_port);  // 设置http代理
        client.setSocketProxy("proxy_host", proxy_port);  // 设置socket代理*/

        // 可选：设置log4j日志输出格式，若不设置，则使用默认配置
        // 也可以直接通过jvm启动参数设置此环境变量
        System.setProperty("aip.log4j.conf", "path/to/your/log4j.properties");

        // 调用接口
        String path = "E://test.jpg";
        JSONObject res = client.sameHqSearch(path, new HashMap<String, String>());
        System.out.println(res.toString(2));

    }
}