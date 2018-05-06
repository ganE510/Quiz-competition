package com.eviac.blog.restclient;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.ClientResponse;

import com.sun.jersey.api.client.WebResource;

public class UserInfoClient {

	public static final String BASE_URI = "http://localhost:8080/RESTfulWS/rest";
	public static final String PATH_NAME = "/UserService/name/";
	public static final String PATH_AGE = "/UserInfoService/age/";
	
	@GET
	protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
		System.out.println("hu");
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        String username = request.getParameter("name");
        if (username.isEmpty()){
        	 out.println("name is empty! We will return the dafault name.<br />");
        		String name = "Pavithra";
        		int age = 25;
        		Client client = ClientBuilder.newClient();
        		WebTarget target = client.target(BASE_URI + PATH_NAME + name);
        		Response response1 = target.request().get();
        		String value = response1.readEntity(String.class);
        		System.out.println(value);
        		response1.close();
        }
           
        else{
        	 out.println("name:" + username + "<br />");
        }
           
    }
	public static void main(String[] args) {

		String name = "Pavithra";
		int age = 25;

		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(BASE_URI + PATH_NAME + name);
		Response response = target.request().get();
		String value = response.readEntity(String.class);
		System.out.println(value);
		response.close();

	}

}