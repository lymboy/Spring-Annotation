import com.lym.springannotation.bean.Person;
import com.lym.springannotation.config.MainConfigOfPropertyValue;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class IOSTest_PropertyValue {

    private AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfPropertyValue.class);

    private void printBeans(AnnotationConfigApplicationContext applicationContext) {
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String str : names) {
            System.out.println(str);
        }
    }

    @Test
    public void test00() {
        printBeans(applicationContext);
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);

        // 从环境中读取外部文件中的值
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        String property = environment.getProperty("person.nickName");
        System.out.println(property);
        applicationContext.close();
    }
}
