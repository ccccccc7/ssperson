#配置中心

##消息总线
安装RabbitMq [windows版](http://www.rabbitmq.com/install-windows.html)  
rabbitmq-plugins enable rabbitmq_management rabbitmq管理界面 默认账号密码guest  
4369 -- erlang发现口  
5672 -- client端通信口  
15672 -- 管理界面ui端口  
25672 -- server间内部通信

/actuator/bus-refresh,methods=POST 刷新配置  

http://localhost:7005/actuator/bus-refresh  POST方法刷新消息总线上配置  
  
/actuator/bus-refresh/{destination},methods=POST 刷新某个实例的的配置  
  
ex:http://localhost:7005/actuator/bus-refresh/ssperson-provider-crm:9020