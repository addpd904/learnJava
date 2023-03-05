package com.LearnJunit1;

public class LearnJunit {
    /*
    * A.JUnit可以灵活的选择执行哪些测试方法，可以一键执行全部测试方法。
     Junit可以生成全部方法的测试报告。
     单元测试中的某个方法测试失败了，不会影响其他测试方法的测试。
    a. use
        将JUnit的jar包导入到项目中
        IDEA通常整合好了Junit框架，一般不需要导入。
        如果IDEA没有整合好，需要自己手工导入如下2个JUnit的jar包到模块
        编写测试方法：该测试方法必须是公共的无参数无返回值的非静态方法。
        在测试方法上使用@Test注解：标注该方法是一个测试方法
        在测试方法中完成被测试方法的预期正确性测试。
        选中测试方法，选择“JUnit运行” ，如果测试良好则是绿色；如果测试失败，则是红色
    b. common notation
        @Test       测试方法
        @Before     用来修饰实例方法，该方法会在每一个测试方法执行之前执行一次。
        @After      用来修饰实例方法，该方法会在每一个测试方法执行之后执行一次。
        @BeforeClass        用来静态修饰方法，该方法会在所有测试方法之前只执行一次。
        @AfterClass     用来静态修饰方法，该方法会在所有测试方法之后只执行一次。
        开始执行的方法:初始化资源。
        执行完之后的方法:释放资源。

    * */
}
