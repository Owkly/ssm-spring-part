import com.yannick.ioc_01.XxxDao;
import com.yannick.ioc_04.JavaBean;
import com.yannick.ioc_03.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIoCAnnotationTest {
    @Test
    public void test_01() {
         ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-01.xml");
         XxxDao bean = context.getBean(XxxDao.class);
         System.out.println("bean:"+bean);

         Object xxxService = context.getBean("xxxService");
         System.out.println("xxxService:"+ xxxService);
     }

     @Test
    public void test_02() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-02.xml");
        JavaBean javaBean1 = context.getBean(JavaBean.class);
        JavaBean javaBean2 = context.getBean(JavaBean.class);
        System.out.println(javaBean1 == javaBean2);
        context.close();

     }

     @Test
    public void test_03() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-03.xml");
         UserController userController = context.getBean(UserController.class);
         userController.show();

         context.close();
     }


     @Test
    public void test_04() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-04.xml");
         JavaBean bean = context.getBean(JavaBean.class);
         System.out.println("" + bean);
         context.close();


     }
}
