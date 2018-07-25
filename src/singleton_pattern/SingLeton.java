package singleton_pattern;

/**
 * @ClassName SingLeton
 * @Description 单例类-饿汉式线程安全
 * @Author xiamu
 * @Email 768840822@qq.com
 * @Date 2018/7/19 15:31
 * @VERSION 1.0
 **/
public class SingLeton {
    private static String name="SingLeton";
    //程序启动时实例化一个SingLeton对象
    private static SingLeton singLeton=new SingLeton();
    //构造方法私有化,确保别的类不能实例化SingLeton
    private SingLeton(){};
    //调用此方法获取启动时实例化的对象
    public static SingLeton getSingLeton(){
        return singLeton;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        SingLeton.name = name;
    }
}

