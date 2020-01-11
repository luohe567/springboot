package fun.xiebug.exercise.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 描述: aop 配置类
 *      使用 @EnableAspectJAutoProxy 注解开启 Spring 对 AspectJ 的支持
 * @author YI
 * @date 2020-01-10 16:12
 */
@Configuration
@ComponentScan("fun.xiebug.exercise.aop")
@EnableAspectJAutoProxy
public class AopConfig {

}
