import com.lym.springannotation.bean.ColorFactoryBean;
import com.lym.springannotation.bean.Person;
import com.lym.springannotation.config.MainConfig;
import com.lym.springannotation.config.MainConfig2;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

    private ApplicationContext applicationContext;

    @Before
    public void init() {
        applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
    }

    @Test
    public void test00() {
        applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
    }

    @Test
    public void test01() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        Person person = (Person) applicationContext.getBean(Person.class);
        System.out.println(person);
    }

    @Test
    public void test02() {
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

    }

    @Test
    public void test03() {
//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
//        Person person0 = (Person) applicationContext.getBean("person2");
//        Person person1 = (Person) applicationContext.getBean("person2");
//
//        System.out.println(person0 == person1);
    }

    @Test
    public void test04() {
        Person bean = applicationContext.getBean(Person.class);
        System.out.println(bean);
    }

    @Test
    public void testColorFactoryBean() {
        Object colorFactoryBean1 = applicationContext.getBean("colorFactoryBean");
        Object colorFactoryBean2 = applicationContext.getBean("colorFactoryBean");
        Object colorFactoryBean3 = applicationContext.getBean("&colorFactoryBean");

        System.out.println(colorFactoryBean1 == colorFactoryBean2);
        System.out.println(colorFactoryBean3.getClass());
        System.out.println("colorFactoryBean~~~~~~"+colorFactoryBean1.getClass());
    }

}
