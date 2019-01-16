#配置中心

##消息总线
安装RabiitMq [windows版](http://www.rabbitmq.com/install-windows.html)  
rabbitmq-plugins enable rabbitmq_management rabbitmq管理界面 默认账号密码guest  
4369 -- erlang发现口  
5672 -- client端通信口  
15672 -- 管理界面ui端口  
25672 -- server间内部通信

http://localhost:7005/actuator/bus-refresh  POST方法刷新消息总线上配置