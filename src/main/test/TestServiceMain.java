import com.sx.swagger.api.SwaggerConfig;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.web.WebAppConfiguration;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * <p>Title:TestServiceMain </p>
 * <p>Description:</p>
 * Created with IntelliJ IDEA.
 * User: qxy
 * Date: 2018/3/12
 * Time: 15:35
 */

public class TestServiceMain extends BaseTest {

    @Autowired
    private SwaggerConfig swaggerConfig;

    @Test
    public void test1(){
        Docket docket = swaggerConfig.createUserInfo();

        String aa = docket.getGroupName();
        System.out.println(aa);

    }

}
