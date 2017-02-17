package SaveFileAnnotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by PRO on 15.02.2017.
 */
@Retention(value = RetentionPolicy.RUNTIME)
public @interface SaveTo {
    String path();
}
