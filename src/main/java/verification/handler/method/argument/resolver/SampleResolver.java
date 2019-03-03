package verification.handler.method.argument.resolver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

@Component
@Slf4j
public class SampleResolver implements HandlerMethodArgumentResolver {

    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return true;
    }

    @Override
    public Object resolveArgument(
            MethodParameter       parameter,
            ModelAndViewContainer mavContainer,
            NativeWebRequest      webRequest,
            WebDataBinderFactory  binderFactory
    ) throws Exception {

        String value = webRequest.getParameter("value");
        return SampleArgument.of(value);
    }
}
