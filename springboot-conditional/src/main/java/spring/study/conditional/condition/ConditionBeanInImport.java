package spring.study.conditional.condition;

import org.springframework.boot.autoconfigure.condition.ConditionalOnJava;
import org.springframework.stereotype.Component;

/**
 * Created by Format on 2017/5/11.
 */
@ConditionalOnJava(ConditionalOnJava.JavaVersion.NINE)
public class ConditionBeanInImport {


    public SimpleBean simpleBean() {
        return new SimpleBean();
    }

    class SimpleBean {

    }

}
