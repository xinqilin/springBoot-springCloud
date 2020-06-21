# springBoot-springCloud

### 架構
1. 連接AB服務 : Netflix Rureka
2. Load Balance : Netflix Ribbon
3. 阻斷器(斷路器) : Netflix Hystrix
4. 服務網段(過濾器) : Netflix Zuul
5. 分布式配置 : Spring Cloud Config

### 開始 
#### eureka-server
#### eureka-client(discovery) [provider]
#### eureka-client(discovery) [consumer]

## server
properties:

```

server.port=8761   (server port)
eureka.instance.hostname=eureka-server
eureka.client.register-with-eureka=false (不註冊自己到eureka)
eureka.client.fetch-registry=false (不從eureka取得註冊訊息 ，因為自己是server)
eureka.client.service-url.defaultZone=http://localhost:8761/eureka/    (server註冊的URL)

```

### 開啟使用
``@EnableEurekaServer``

Go 
<a href="http://localhost:8761/">Eureka Server</a>

## Provider

properties:

```
server.port=8001
spring.application.name=provider-ticket  (name)
eureka.instance.prefer-ip-address=true   (註冊時，使用ip進行註冊)   
eureka.client.service-url.defaultZone=http://localhost:8761/eureka/    (註冊URL)

```
