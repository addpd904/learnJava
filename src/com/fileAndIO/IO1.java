package com.fileAndIO;

public class IO1 {
    /*
    * A.
    * a.classification
    * way1
    * 1.character stream:只能操作纯文本文件,包括java文件，txt文件等
     * 2.byte stream :操作所有类型的文件,包括音频视频图片等
    way2
        字节输入流流 InputStream：以内存为基准，来自磁盘文件/网络中的数据以字节的形式读入到内存中去的流称为字节输入流。
        字节输出流 OutoutStream：以内存为基准，把内存中的数据以字节写出到磁盘文件或者网络中去的流称为字节输出流。
        字符输入流 Reader：以内存为基准，来自磁盘文件/网络中的数据以字符的形式读入到内存中去的流称为字符输入流。
        字符输出流 Writer：以内存为基准，把内存中的数据以字符写出到磁盘文件或者网络介质中去的流称为字符输出流。
     *
     * */
    /*
    * B. byte stream
    * a.文件字节输入流：FileInputStream
    * a.1 constructor
        public FileInputStream(File file)创建字节输入流管道与源文件对象接通
        public FileInputStream (String pathname)创建字节输入流管道与源文件路径接通
      a.2 method
        public int read()       每次读取一个字节返回，如果字节已经没有可读的返回-1
        public int read(byte[] buffer)  每次读取一个字节数组返回，如果字节已经没有可读的返回-1
        *
      b. FileOutputStream
        b.1constructor
            public FileOutputStream (File file)                     创建字节输出流管道与源文件对象接通
            public FileOutputStream (File file，boolean append)      创建字节输出流管道与源文件对象接通，可追加数据
            public FileOutputStream (String filepath)               创建字节输出流管道与源文件路径接通
            public FileOutputStream (String filepath，boolean append)        创建字节输出流管道与源文件路径接通，可追加数据
        b.2
    public void write(int a)                    写一个字节出去
    public void write(byte[] buffer)            写一个字节数组出去
    public void write(byte[] buffer , int pos , int len)写一个字节数组的一部分出去。
        b.3caution
            字节输出流如何实现写出去的数据能换行
            os.write(“\r\n”.getBytes())
            如何让写出去的数据能成功生效？
            flush()刷新数据
            close()方法是关闭流，关闭包含刷新，关闭后流不可以继续使用了。
     * * */

    /*
    * C.release file resource
    *a. way 1 try-catch-finally
    * finally：放在try-catch后面的，无论是正常执行还是异常执行代码，最后一定要执行，除非JVM退出。
        作用：一般用于进行最后的资源释放操作（专业级做法）

    * b. way 2 try-with-resource
        1.try(定义流对象){可能出现异常的代码;}catch(异常类名 变量名){   异常的处理代码;}
        2.定义输入流对象;
        定义输出流对象;
        try(输入流对象；输出流对象){可能出现异常的代码;}catch(异常类名 变量名){  异常的处理代码;}
       c. what is resource ?
       * 资源都是实现了Closeable/AutoCloseable接口的类对象
     * */
}
