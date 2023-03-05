package com.fileAndIO;

public class File1 {

    /*
    * A.
    * a.get file object
    *  1.constructor
    public File (String pathname)               根据文件路径创建文件对象
    public File (String parent, String child)   根据父路径名字符串和子路径名字符串创建文件对象
    public File (File  parent, String child)    根据父路径对应文件对象和子路径名字符串创建文件对象
        2. file path
        * 绝对路径：从盘符开始
        相对路径：不带盘符，默认直接到当前工程下的目录寻找文件。
        File file3 = new File(“模块名\\a.txt”);
    * */

    /*
    * B.API
    * a.
    public boolean isDirectory()        判断此路径名表示的File是否为文件夹
    public boolean isFile()             判断此路径名表示的File是否为文件
    public boolean exists()             判断此路径名表示的File是否存在
    public long length()                 返回文件的大小（字节数量）
    public String getAbsolutePath()     返回文件的绝对路径
    public String getPath()             返回定义文件时使用的路径
    public String getName()             返回文件的名称，带后缀
    public long lastModified()          返回文件的最后修改时间（时间毫秒值）
    b. create dir
        public boolean createNewFile()      创建一个新的空的文件
        public boolean mkdir()      只能创建一级文件夹
        public boolean mkdirs()     可以创建多级文件夹
   c.delete
    public boolean delete ()删除由此抽象路径名表示的文件或空文件夹
    d. traverse dir
        public String[] list()  获取当前目录下所有的"一级文件名称"到一个字符串数组中去返回。
        public File[] listFiles()(常用)   获取当前目录下所有的"一级文件对象"到一个文件对象数组中去返回（重点）
    *
    * */
}
