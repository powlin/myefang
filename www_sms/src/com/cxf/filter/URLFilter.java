package com.cxf.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter("/URLFilter")
public class URLFilter implements Filter {

    public URLFilter() {
    	
    }

	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		//获取url
		String url = req.getRequestURI().substring(req.getContextPath().length());
		if(!url.contains("TestServlet.do")){//不允许放行的链接
			System.out.println(url + "链接不允许访问");
			res.sendRedirect(req.getContextPath() + "/sys/forbiddenurl.jsp");
			return;
		}else{
			System.out.println(url + "链接允许访问");
		}
		chain.doFilter(req, res);
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
