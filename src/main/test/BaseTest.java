import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * <p>Title:BaseTest </p>
 * <p>Description:</p>
 * Created with IntelliJ IDEA.
 * User: qxy
 * Date: 2018/3/12
 * Time: 15:35
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({"classpath:spring/spring-mvc.xml"})
public class BaseTest {

}
