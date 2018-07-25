package singleton_pattern;

/**
 * @ClassName SingLeton2
 * @Description 单例模式-懒汉式 线程不安全
 * @Author xiamu
 * @Email 768840822@qq.com
 * @Date 2018/7/19 15:46
 * @VERSION 1.0
 **/
public class SingLeton2 {
    private static SingLeton2 singLeton2 = null;
    private SingLeton2() {
    }
    public static SingLeton2 getSingLeton2() {
        if (singLeton2 == null) {
            singLeton2 = new SingLeton2();
        }
        return singLeton2;
    }
}