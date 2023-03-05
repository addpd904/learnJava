package com.fileAndIO;

public class IO2 {

    /*
    * A.character stream 最小单位是按照单个字符读取的。
    * a Reader (character input stream)
    * a.1 constructor
    public FileReader(File file)        创建字符输入流管道与源文件对象接通
    public FileReader(String pathname)  创建字符输入流管道与源文件路径接通
    a.2 method
    public int read()               每次读取一个字符返回，如果字符已经没有可读的返回-1
    public int read(char[] buffer)  每次读取一个字符数组，返回读取的字符个数，如果字符已经没有可读的返回-1

    * b. FileWriter (character output stream )
    *b.1 constructor
    public FileWriter(File file)                        创建字符输出流管道与源文件对象接通
    public FileWriter   (File file，boolean append)      创建字符输出流管道与源文件对象接通，可追加数据
    public FileWriter   (String filepath)               创建字符输出流管道与源文件路径接通
    public FileWriter   (String filepath，boolean append)    创建字符输出流管道与源文件路径接通，可追加数据

    * b.2 method
    void write  (int c)         写一个字符
    void write  (char[] cbuf)   写入一个字符数组
    void write  (char[] cbuf, int off, int len) 写入字符数组的一部分
    void write  (String str)                    写一个字符串
    void write  (String str, int off, int len)  写一个字符串的一部分
    b.3 other
    字符输出流如何实现写出去的数据能换行  fw.write(“\r\n”)
    *
    * */

    /*
    * B.buffer stream
    * 缓冲流也称为高效流、或者高级流。之前学习的字节流可以称为原始流。
    作用：缓冲流自带缓冲区、可以提高原始字节流、字符流读写数据的性能
    a. 字节缓冲输入流： BufferedInputStream and 字节缓冲输出流：BufferedOutputStream
    a.1     constructor
    public BufferedInputStream  (InputStream is)    可以把低级的字节输入流包装成一个高级的缓冲字节输入流管道，从而提高字节输入流读数据的性能
    public BufferedOutputStream (OutputStream os)   可以把低级的字节输出流包装成一个高级的缓冲字节输出流，从而提高写数据的性能
    b. BufferedReader
        b.1 constructor
        public BufferedReader(Reader r)    可以把低级的字符输入流包装成一个高级的缓冲字符输入流管道，从而提高字符输入流读数据的性能
        b.2 api
        public String readLine()    读取一行数据返回，如果读取没有完毕，无行可读返回null
    * */

    /*
    * C.transformation stream (可以解决字符流读取不同编码乱码的问题)
    *a. background
    * a.1question
    * 如果代码编码和文件编码不一致,会乱码。文件编码和读取的编码必须一致才不会乱码。
    a.2 solution
    * 使用字符输入转换流
    可以提取文件（GBK）的原始字节流，原始字节不会存在问题。
    然后把字节流以指定编码转换成字符输入流，这样字符输入流中的字符就不乱码了
    b.字符输入转换流：InputStreamReader，可以把原始的字节流按照指定编码转换成字符输入流。
    * b.1constructor
    public InputStreamReader(InputStream is)                        可以把原始的字节流按照代码默认编码转换成字符输入流。几乎不用，与默认的FileReader一样。
    public InputStreamReader(InputStream is ，String charset)        可以把原始的字节流按照指定编码转换成字符输入流，这样字符流中的字符就不乱码了(重点)
    c.字符输出转换流OutputStreamWriter
    public OutputStreamWriter(OutputStream os，String charset)
    可以指定编码把字节输出流转换成字符输出流，从而可以指定写出去的字符编码！
    * */

    /*
    * D. object serialization
    * a.ObjectOutputStream
    * a.1 constructor
    * public ObjectOutputStream(OutputStream out)   把低级字节输出流包装成高级的对象字节输出流
    a.2 api
        public final void writeObject(Object obj)   把对象写出去到对象序列化流的文件中去
    a.3 caution
    * 序列化对象的要求是怎么样的？对象必须实现序列化接口
    *
    b. ObjectInputStream omit
    *
    * */

    /*
    * E. PrintStream and PrintWriter
    * 作用：打印流可以实现方便、高效的打印数据到文件中去。打印流一般是指：PrintStream，PrintWriter两个类。
        可以实现打印什么数据就是什么数据，例如打印整数97写出去就是97，打印boolean的true，写出去就是true。
     a. PrintStream
     * a.1 constructor
     * public PrintStream(OutputStream os)  打印流直接通向字节输出流管道
        public PrintStream(File  f)         打印流直接通向文件对象
        public PrintStream(String filepath) 打印流直接通向文件路径
    a.2 api
    * public void print(Xxx xx) 打印任意类型的数据出去
    b.PrintWriter
    * b.1constructor
    * public PrintWriter(OutputStream os)       打印流直接通向字节输出流管道
    public PrintWriter (Writer w)               打印流直接通向字符输出流管道
    public PrintWriter (File  f)                打印流直接通向文件对象
    public PrintWriter (String filepath)        打印流直接通向文件路径
    *
    c. summary :PrintStream and PrintWriter
    * 打印数据功能上是一模一样的，都是使用方便，性能高效（核心优势）
    PrintStream继承自字节输出流OutputStream，支持写字节数据的方法。
    PrintWriter继承自字符输出流Writer，支持写字符数据出去。
    * */


    /*
    * . F. summary
    字节流、字符流的使用场景总结？
    字节流适合做一切文件数据的拷贝（音视频，文本）
    字节流不适合读取中文内容输出
    字符流适合做文本文件的操作（读，写）

    *
    * */
}
