import com.kwang.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author yan
 * @version 1.0
 * @date 2020/6/14 14:33
 */
public class MyTest {
    public static void main(String[] args) {
        //如果完全通过配置类方式去做，我们就只能通过AnnotationConfig上下文来获取容器，通过配置类的class对象加载！
        ApplicationContext context = new AnnotationConfigApplicationContext("kwangConfig.class");
        User user = (User) context.getBean("getUser");
        System.out.println(user.getName());
    }
}
