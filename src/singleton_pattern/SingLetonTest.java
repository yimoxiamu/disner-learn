package singleton_pattern;

/**
 * @ClassName SingLetonTest
 * @Description TODO
 * @Author xiamu
 * @Email 768840822@qq.com
 * @Date 2018/7/19 15:36
 * @VERSION 1.0
 **/
public class SingLetonTest {
    public static void main(String[] args) {
        SingLeton singLeton= SingLeton.getSingLeton();
        System.out.println(singLeton.getName());
    }
}
