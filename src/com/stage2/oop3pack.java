/*
A.package
a.create package and import package
package com.stage2;
导包格式：import 包名.类名;
b.ruler
相同包下的类可以直接访问，不同包下的类必须导包,才可以使用！导包格式：import 包名.类名;
假如一个类中需要用到不同类，而这个两个类的名称是一样的，那么默认只能导入一个类，另一个类要带包名访问。

*/
/*
B.
修饰符    同一个类中       同一个包中其他类        不同包下的子类     不同包下的无关类
private     √
缺省         √               √
protected   √               √                   √
public      √               √                   √               √
*/
package com.stage2;

public class oop3pack {
}
