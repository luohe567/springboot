package fun.xiebug.exercise.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 描述:
 * @author YI
 * @date 2020-01-10 17:04
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ScopeConfig.class);

        DemoSingletonService s1 = context.getBean(DemoSingletonService.class);
        DemoSingletonService s2 = context.getBean(DemoSingletonService.class);

        DemoPrototypeService p1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService p2 = context.getBean(DemoPrototypeService.class);

        System.out.println("s1 与 s2 是否相等： " + s1.equals(s2));
        System.out.println("p1 与 p2 是否相等： " + p1.equals(p2));
    }
}
