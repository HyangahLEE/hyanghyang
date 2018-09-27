package com.util;

import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

//쿠키를 다루는 클래스 
public class Cookies {
	
	// key(쿠키이름), value(쿠키객체)
	private Map<String, Cookie> cookieMap = new HashMap<>();
	
	//생성자
	//모든 쿠키객체(getCookies())를 얻어오기위해 request를 인자값으로 넣어줌
	public Cookies(HttpServletRequest request) {
		javax.servlet.http.Cookie[] cookies = request.getCookies();
		if(cookies != null) {
			for(int i=0; i<cookies.length; i++){
				cookieMap.put(cookies[i].getName(),cookies[i]);
			}

		}
		
	}
	
	//
	public Cookie getCookie(String name) {
		return cookieMap.get(name);
	}
	
	public String getValue(String name) throws IOException {
		Cookie cookie = cookieMap.get(name);
		if(cookie ==null) {
			return null;
		}
		return URLDecoder.decode(cookie.getValue(), "utf-8");
	}
	
	public boolean exists(String name) {
		return cookieMap.get(name) != null;
	}
	
	public static Cookie createCookie(String name, String value) throws IOException {
		return new Cookie(name, URLEncoder.encode(value, "utf-8"));		
	}
	
	public static Cookie createCookie(String name, String value, String path, int maxAge) throws IOException {
		Cookie cookie = new Cookie(name, URLEncoder.encode(value,"utf-8"));
		cookie.setPath(path);
		cookie.setMaxAge(maxAge);
		return cookie;		
	}
	
	public static Cookie createCookie(String name, String value, String domain,String path, int maxAge)
	throws IOException {
		Cookie cookie = new Cookie(name, URLEncoder.encode(value,"utf-8"));
		cookie.setDomain(domain);
		cookie.setPath(path);
		cookie.setMaxAge(maxAge);
		return cookie;		
	}
	
	
}
