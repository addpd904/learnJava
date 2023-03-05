package com.stage3;

public class Map2Properties {
    /*
    * A. properties
    * 其实就是一个Map集合，但是我们一般不会当集合使用，因为HashMap更好用。
    * a. application
    * Properties代表的是一个属性文件，可以把自己对象中的键值对信息存入到一个属性文件中去。
    属性文件：后缀是.properties结尾的文件,里面的内容都是 key=value，后续做系统配置信息的。
    b.api
        void load (InputStream inStream)    从输入字节流读取属性列表（键和元素对）
        void load (Reader reader)           从输入字符流读取属性列表（键和元素对）
        void store (OutputStream out, String comments)  将此属性列表（键和元素对）写入此 Properties表中，以适合于使用 load(InputStream)方法的格式写入输出字节流
        void store (Writer writer, String comments)     将此属性列表（键和元素对）写入此 Properties表中，以适合使用 load(Reader)方法的格式写入输出字符流
        public Object setProperty(String key, String value)     保存键值对（put）
        public String getProperty(String key)                   使用此属性列表中指定的键搜索属性值 (get)
        public Set<String> stringPropertyNames()                所有键的名称的集合  (keySet())

    *
     * */
}
