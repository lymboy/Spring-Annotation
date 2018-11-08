import com.lym.springannotation.config.MainConfigOfLifeCircle;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifeCircleTest {

//    ApplicationContext applicationContext =
//            new AnnotationConfigApplicationContext(MainConfigOfLifeCircle.class);


    @Test
    public void test00() {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MainConfigOfLifeCircle.class);
        Object car = applicationContext.getBean("car");
        ((AnnotationConfigApplicationContext) applicationContext).close();
    }
}
