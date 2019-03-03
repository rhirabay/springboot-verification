package verification.handler.method.argument.resolver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/HandlerMethodArgumentResolver")
@Slf4j
public class HandlerMethodArgumentResolverController {
    /**
     * http://localhost:8080/HandlerMethodArgumentResolver/sample?value=HelloWorld
     */
    @GetMapping("/sample")
    @ResponseBody
    public String sample(SampleArgument sampleArgument) {
        log.info("sampleArgument: {}", sampleArgument);
        return sampleArgument.getValue();
    }
}
