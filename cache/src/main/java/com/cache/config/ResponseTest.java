package com.cache.config;

import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import javax.sound.midi.Soundbank;
import java.io.IOException;

/**
 * Description: TODO
 *
 * @author songcx
 * @date 2019/12/16 20:48
 */
@Component
@RestControllerAdvice(basePackages = "com.cache")
public class ResponseTest implements ResponseBodyAdvice {
    @Override
    public boolean supports(MethodParameter methodParameter, Class aClass) {

        String s = methodParameter.getMethod().toString();
        return false;
    }

    @Override
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType, Class aClass,
                                  ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        System.out.println(o);
        try {
            System.out.println(serverHttpResponse.getBody().toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
