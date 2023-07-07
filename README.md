# Springboot 快速入门

## 包含内容

### 1. Json数据的返回(api接口的基础)

注解介绍：

- @RestController：相当于@Controller+@ResponseBody两个注解的结合，返回json数据不需要在方法前面加@ResponseBody注解了，但使用@RestController这个注解，就不能返回jsp,html页面，视图解析器无法解析jsp,html页面
- @RequestMapping：提供路由信息，负责URL到Controller中的具体函数的映射。

能返回的Json数据类型：list,map,Object,String

### 2. 日志配置

- 使用依赖为 

```xml
    <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-logging</artifactId>
    </dependency>
```
- 日志级别：由低到高 trace<debug<info<warn<error
- 可以调整输出的日志级别，日志就只会在这个级别以以后的高级别生效
- 使用slf4j+logback的方式进行日志输出
- 配置文件在resources下的logback-spring.xml

### 3. api文档的生成

- 使用springdoc-openapi-ui生成api文档
- io.swagger.v3
- 访问地址：http://localhost/swagger-ui/index.html

### 4. MVC

- @PathVariable：获取url中的数据
- @RequestParam：获取请求参数的值

使用了python来模拟post请求，代码如下：

```python
import requests
import json

url = 'http://localhost/doc/form'
headers = {
    'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) '
                    'AppleWebKit/537.36 (KHTML, like Gecko) '   
                    'Chrome/91.0.4472.124 Safari/537.36',
    'Content-Type': 'application/json;charset=UTF-8',
}

data = {
    'id' : 564564,
    'username': 'admin',
    'password': '123456',
    'email': 'admin@gmail.com'
}

data = json.dumps(data)

response = requests.post(url=url, headers=headers, data=data)
print(response.text)
```

### 5. 页面展示

- 使用thymeleaf模板引擎
- @Controller：处理http请求
- model：将后端的数据传递到前端

### 6. SQL的配置

- 使用mybatis + mysql
- mapper文件在resources下的mapper文件夹下
- 接口文件在java下的com.zhangpy.springLearn.dao下


