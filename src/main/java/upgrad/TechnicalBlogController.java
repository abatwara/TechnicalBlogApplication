package upgrad;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
public class TechnicalBlogController {

    @RequestMapping("/techblog")
    @ResponseBody
    public String techblog()
    {
        return "Welcome to technical Blog";
    }
}
