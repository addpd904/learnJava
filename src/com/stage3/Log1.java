package com.stage3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log1 {
    /*
    * A.basic
    * a.
    * 日志技术应该具备哪些特点和优势
    可以将系统执行的信息，方便的记录到指定的位置（控制台、文件中、数据库中）。
    可以随时以开关的形式控制是日志的记录和取消，无需侵入到源代码中去进行修改。
    * */
    /*
    * B. Logback
    * a. component
    * Logback日志框架分为以下模块：
         logback-core： 该模块为其他两个模块提供基础代码。 （必须有）
         logback-classic：完整实现了slf4j API的模块。（必须有）
         logback-access 模块与 Tomcat 和 Jetty 等 Servlet 容器集成，以提供 HTTP 访问日志功能（可选模块，以后接触）
    *
    * b. use
    * b.1  想使用Logback日志框架，至少需要在项目中整合如下三个模块：
        slf4j-api：日志接口
        logback-core：基础模块
        logback-classic：功能模块，它完整实现了slf4j API
    b.2 实现步骤：
    ①：导入Logback框架到项目中去。在项目下新建文件夹lib，导入Logback的jar包到该文件夹下
    ②：将存放jar文件的lib文件夹添加到项目依赖库中去。
    ③：将Logback的核心配置文件logback.xml直接拷贝到src目录下（必须是src下）。
    ④：创建Logback框架提供的Logger日志对象，后续使用其方法记录系统的日志信息。
    c. config
    * c.1 append
    * 通过logback.xml 中的<append>标签可以设置输出位置。
    通常可以设置2个日志输出位置：一个是控制台、一个是系统文件中
       example 输出到系统文件的配置标志
        <appender name="FILE" class="ch.qos.logback.core.rolling.RollingFileAppender">
    *
    * c.2 level 用于控制系统中哪些日志级别是可以输出的。
    * ALL < TRACE <  DEBUG <  INFO < WARN < ERROR < OFF ; 默认级别是DEBUG
    * */
//    create a logger object
//    polymorphic write
    public static Logger LOGGER= LoggerFactory.getLogger("a test log");
    public void testLog(){
        LOGGER.debug("a debug log");
        LOGGER.trace("a trace log");
    }
    public static void main(String[] args){
        Log1 Log1=new Log1();
        Log1.testLog();
    }
}
