package com.common.utils;

import javax.net.ssl.*;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;

/**
 * Description: SSL相关工具
 *
 * @author songcx
 * @date 2020/7/16 15:54
 *
 * <pre>
 *              www.cloudscope.cn
 *      Copyright (c) 2019. All Rights Reserved.
 * </pre>
 */

public class SslUtil {


    /**
     * Description: spring boot 绕过ssl验证
     * <>
     * @author songcx
     * @date 15:56 2020/7/16
     **/
    private static void disableSslVerification() {
        try
        {
            TrustManager[] trustAllCerts = new TrustManager[] {new X509TrustManager() {
                @Override
                public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                    return null;
                }
                @Override
                public void checkClientTrusted(X509Certificate[] certs, String authType) {
                }
                @Override
                public void checkServerTrusted(X509Certificate[] certs, String authType) {
                }
            }
            };

            SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, trustAllCerts, new java.security.SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

            HostnameVerifier allHostsValid = new HostnameVerifier() {
                @Override
                public boolean verify(String hostname, SSLSession session) {
                    return true;
                }
            };

            HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
        } catch (NoSuchAlgorithmException | KeyManagementException e) {
            e.printStackTrace();
        }
    }
}
