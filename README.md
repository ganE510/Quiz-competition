

# Quiz-competition
</p>
Our project is to create an entertaining application that supports two users paired with each other randomly and trying to answering as many questions correctly as they could in a given period. Users need to sign in to the app before starting competition. The triumph is evaluated by the answering speed and correctness.The questions' number and content will be maintained by using cloud storage.
<p>
</p>
We will use server to store questions and user's information. Web server will also compute users' experience and rank ,then retuen to clients.
<p>
</p>
—————————————————————————————————————————

build/classes/com/eviac/blog 中的 UserInfoClient 是客户端，
UserInfo 是Web Service 
http://localhost:8080/RESTfulWS/rest/UserService/getInfo 可以得到字符串“Hello,RESTful web service!” http://localhost:8080/RESTfulWS/rest/UserService/name/xxx 返回用户名 xxx 
http://localhost:8080/RESTfulWS/rest/UserService/age/23   返回年龄 23 
运行UserInfoClient.java, 得到当前用户名 

配置：jersey 2.26-b07, Tomcat 7.0 

--------------------------------------
搭建了zookeeper+Dubbo 框架
配置：zookeeper 3.4.12
      Dubbo 2.5.4
      Spring 5.0.0
