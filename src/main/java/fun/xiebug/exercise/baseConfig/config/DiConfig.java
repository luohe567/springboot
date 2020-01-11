package fun.xiebug.exercise.baseConfig.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 描述: 使用 @Configuration 声明当前类是一个配置类
 *      使用 @ComponentScan ，自动扫描包下所有使用 @Service、@Component、@Repository
 *      和 @Controller 的类，并注册为 Bean。
 * @author YI
 * @date 2020-01-10 14:29
 */
@Configuration
@ComponentScan("fun.xiebug.exercise.baseConfig")
public class DiConfig {

}
