package com.eviac.blog.application;


import org.glassfish.jersey.server.ResourceConfig; 
public class RestApplication extends ResourceConfig { 
    public RestApplication() {
     //���������ڵİ�·��
     packages("com.eviac.blog.restws");
      //��ӡ������־�����ڸ��ٵ��ԣ���ʽ��������� 
     //register(LoggingFilter.class);
    } 
} 