

# Quiz-competition
</p>
Our project is to create an entertaining application that supports two users paired with each other randomly and trying to answering as many questions correctly as they could in a given period. Users need to sign in to the app before starting competition. The triumph is evaluated by the answering speed and correctness.The questions' number and content will be maintained by using cloud storage.
<p>
</p>
We will use server to store questions and user's information. Web server will also compute users' experience and rank ,then retuen to clients.
<p>
</p>
—————————————————————————————————————————
Restful Web Service:

build/classes/com/eviac/blog 中的 UserInfoClient 是客户端，
UserInfo 是Web Service 
http://localhost:8080/RESTfulWS/rest/UserService/getInfo 可以得到字符串“Hello,RESTful web service!” http://localhost:8080/RESTfulWS/rest/UserService/name/xxx 返回用户名 xxx 
http://localhost:8080/RESTfulWS/rest/UserService/age/23   返回年龄 23 
运行UserInfoClient.java, 得到当前用户名 

配置：jersey 2.26-b07, Tomcat 7.0 

--------------------------------------
功能场景：
服务A负责用户的登录注册，登录或注册成功之后，则向服务B发送消息，由服务B来从数据库中随机抽取题目返回给用户。

Detail：
Zookeeper搭建集群环境，见截图《zookeeper集群环境截图》


配置：zookeeper 3.4.12
      Dubbo 2.5.4
      Spring 5.0.0
      
   
