
# Quiz-competition
</p>
Our project is to create an entertaining application that supports two users paired with each other randomly and trying to answering as many questions correctly as they could in a given period. Users need to sign in to the app before starting competition. The triumph is evaluated by the answering speed and correctness.The questions' number and content will be maintained by using cloud storage.
<p>
</p>
We will use server to store questions and user's information. Web server will also compute users' experience and rank ,then retuen to clients.
<p>
</p>

------------------------------------------------------------
功能场景：
服务1负责用户的登录注册，登录或注册成功之后，则向服务2发送消息，由服务B来从数据库中随机抽取题目返回给用户。

-------------------------------------------------------------
HTML前端, 见WebContent文件夹

服务1：见src/com/eviac/blog文件夹
其中，UserInfo 是Web Service, UserInfoClient 是测试demo客户端，
http://localhost:8080/RESTfulWS/rest/UserService/getInfo 可以得到字符串“Hello,RESTful web service!” http://localhost:8080/RESTfulWS/rest/UserService/name/xxx 返回用户名 xxx 
http://localhost:8080/RESTfulWS/rest/UserService/age/23   返回年龄 23 
运行UserInfoClient.java, 得到当前用户名 
配置：jersey 2.26-b07, Tomcat 7.0.85 

服务2：见build/classes/com/eviac/blog文件夹

服务间通信：应用Dubbo框架基于RPC协议实现

Detail：

应用zookeeper封装各个服务，部署在服务器上，向客户端提供接口，并搭建集群环境, 见截图《zookeeper集群环境截图》

项目所用到的jar包, 见文件夹jars

配置：zookeeper 3.4.12, Dubbo 2.5.4

语言：java

-------------------------------------------------------------
Docker

创建两个镜像image，分别为 jamtur01/tomcat 与 jamtur02/tomcat,见截图image.jpg
并分别部署 Cookiewinner-Server.jar 和 quiz-competition.jar，
分别创建两个container（见截图），均配置tomcat

建立docker-machine，实例有default,myvm,myvm1,myvm2
创建clusters，并初始化一个swarm（“dockerized” cluster）。为swarm manager配置shell，并将app部署到swarm manager管辖的各台机器节点上。
建立的swarm详见截图swarm.jpg，设定default为machine manager

Docker模型（见截图）
