import com.sx.service.DemoService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * <p>Title:WebAppTestMain </p>
 * <p>Description:</p>
 * Created with IntelliJ IDEA.
 * User: qxy
 * Date: 2018/3/13
 * Time: 9:49
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-mvc.xml"})
@WebAppConfiguration
public class WebAppTestMain {

    private MockMvc mockMvc;

    @Autowired
    private DemoService demoService;

    @Autowired
    WebApplicationContext webApplicationContext;

    @Autowired
    MockHttpSession mockHttpSession;

    @Autowired
    MockHttpServletRequest mockHttpServletRequest;


    @Before
    public  void setup(){
        this.mockMvc= MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }



    @Test
    public void test1() throws Exception {




        this.mockMvc.perform(get("/normal"))
                .andExpect(status().isOk())
                .andExpect(view().name("jsp"))
                .andExpect(forwardedUrl("/WEB-INF/jsp/jsp.jsp"))
                .andExpect(model().attribute("msg",demoService.sayHello()));
    }






}
