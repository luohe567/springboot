package fun.xiebug.exercise;

import fun.xiebug.exercise.baseConfig.config.JavaConfig;
import fun.xiebug.exercise.baseConfig.service.ConfigService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ExerciseApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(JavaConfig.class);

        /**
         * 获取声明配置的 UseFunctionService 的 Bean
         */
//        UseFunctionService useFunctionService =
//                context.getBean(UseFunctionService.class);
//        System.out.println(useFunctionService.SayHello("H"));

        ConfigService configService = context.getBean(ConfigService.class);
        System.out.println(configService.sayHello("Jave config"));

        context.close();
    }

}
