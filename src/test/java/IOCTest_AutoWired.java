import com.lym.springannotation.config.MainConfigOfAutowired;
import com.lym.springannotation.service.BookService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest_AutoWired {

    private AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);

    @Test
    public void test00() {
        BookService bean = applicationContext.getBean(BookService.class);
        System.out.println(bean);
//        BookDao bean1 = applicationContext.getBean(BookDao.class);
//        System.out.println(bean1);
    }
}
