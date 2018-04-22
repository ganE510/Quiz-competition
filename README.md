# Quiz-competition
</p>
Our project is to create an entertaining application that supports two users paired with each other randomly and trying to answering as many questions correctly as they could in a given period. Users need to sign in to the app before starting competition. The triumph is evaluated by the answering speed and correctness.The questions' number and content will be maintained by using cloud storage.
<p>
</p>
We will use server to store questions and user's information. Web server will also compute users' experience and rank ,then retuen to clients.
<p>
</p>
We will make the transmission between clients and server work until April 6th.
<p>
</p>
—————————————————————————————————————————
<p>
</p>
build/classes/com/eviac/blog 中的 UserInfoClient 是客户端，UserInfoClient 是Web Service。目前客户端中缺少jersey.client jar包，同时在tomcat运行web service时有404报错
<p>
