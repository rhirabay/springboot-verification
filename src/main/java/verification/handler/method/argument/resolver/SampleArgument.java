package verification.handler.method.argument.resolver;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class SampleArgument {
    private String value;

    public static SampleArgument of(String value) {
        return new SampleArgument(value);
    }
}
