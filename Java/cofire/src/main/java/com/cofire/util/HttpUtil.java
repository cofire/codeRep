package com.cofire.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({ "deprecation", "resource", "unused" })
public final class HttpUtil {

    private static final Logger logger = LoggerFactory.getLogger(HttpUtil.class);
    private final static int SOCKET_CONNECT_TIMEOUT = 20000;

    /**
     * 基于Http协议的post方式访问
     */
    public static String httpPost(String url, String requeststr) {

        String m_reqStr = CommonUtils.StringtoMap(requeststr);
        PrintWriter printWriter = null;
        BufferedReader bufferedReader = null;
        StringBuffer responseResult = new StringBuffer();
        HttpURLConnection httpURLConnection = null;
        String rtstr = "";
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            httpURLConnection = (HttpURLConnection) realUrl.openConnection();
            httpURLConnection.setReadTimeout(SOCKET_CONNECT_TIMEOUT);// 最长10秒的延迟
            // 设置通用的请求属性
            httpURLConnection.setRequestProperty("accept", "*/*");
            httpURLConnection.setRequestProperty("connection", "Keep-Alive");
            // httpURLConnection.setRequestProperty("Content-Length",String.valueOf(requeststr.length()));
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            // 发送POST请求必须设置如下两行
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setRequestMethod("POST");
            logger.debug("请求：" + m_reqStr + "," + url);
            // 获取URLConnection对象对应的输出流
            printWriter = new PrintWriter(new OutputStreamWriter(httpURLConnection.getOutputStream()));
            // 发送请求参数
            printWriter.write(m_reqStr);
            // flush输出流的缓冲
            printWriter.flush();

            OutputStream out = httpURLConnection.getOutputStream();
            out.write(m_reqStr.getBytes("UTF-8"));
            out.flush();
            out.close();

            // 根据ResponseCode判断连接是否成功
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != 200) {

            } else {

            }
            // 定义BufferedReader输入流来读取URL的ResponseData
            bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                responseResult.append(line);
            }
            rtstr = responseResult.toString();

            logger.debug("响应：" + rtstr);
        } catch (Exception e) {
            // LOG.error("POST请求异常", e);
        } finally {
            httpURLConnection.disconnect();
            try {
                if (printWriter != null) {
                    printWriter.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return rtstr;
    }
}
