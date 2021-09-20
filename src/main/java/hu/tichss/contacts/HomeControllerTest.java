package hu.tichss.contacts;

import hu.tichss.contacts.controller.HomeController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(HomeController.class)  // Web teszt a HomeController osztályhoz
public class HomeControllerTest {

    @Autowired
    private MockMvc mockMvc;  // Injektáljuk a MockMvc

    @Test
    public void testHomePage() throws Exception{
        mockMvc.perform(get("/"))   // GET kérés
                .andExpect(status().isOk())  // 200-at kell visszaadjon
                .andExpect(view().name("home"))  // a home view-ra kell hogy menjünk
                .andExpect(content().string(containsString("Hello")));  // elvárt szöveg
    }
}
