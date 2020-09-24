package com.github.jsoncat.factory;

import com.github.jsoncat.handler.GetRequestHandler;
import com.github.jsoncat.handler.PostRequestHandler;
import com.github.jsoncat.handler.RequestHandler;
import io.netty.handler.codec.http.HttpMethod;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shuang.kou
 * @createTime 2020年09月24日 14:28:00
 **/
public class RequestHandlerFactory {
    public static final Map<HttpMethod, RequestHandler> requestHandlers = new HashMap<>();

    static {
        requestHandlers.put(HttpMethod.GET, new GetRequestHandler());
        requestHandlers.put(HttpMethod.POST, new PostRequestHandler());
    }

    public static RequestHandler create(HttpMethod httpMethod) {
        return requestHandlers.get(httpMethod);
    }
}