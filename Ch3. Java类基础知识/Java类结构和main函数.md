## Class类
1. 一个Java文件可以有多个`class`（但不提倡一个文件里放多个类，内部类除外），只能有一个`public class`。
2. `public class`的类名必须和文件名（不是项目名）一致，大小写敏感。
3. 类是Java中最基础的逻辑单位，所有内容都需要放在类中，main函数也要写在类中。
4. 类包含成员变量&成员方法
  
## main函数
1. main函数的形参和前缀修饰符是固定写法
   ```Java
   public static void main(String[] args) {

   }S
   ```
2. main函数“寄居”在某一个class中，但不属于该class的成员函数，并且无法被其他方法调用。
3. 由于JVM在运行Java应用程序的时候，首先会调用main方法，但调用时还没实例化这个类的对象，而是通过类名直接调用，因此`static`。

## 输出函数
```Java
System.out.print    //输出
System.out.println  //输出并换行
```