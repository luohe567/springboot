package fun.xiebug.exercise.baseConfig.config;

import fun.xiebug.exercise.baseConfig.service.ConfigService;
import fun.xiebug.exercise.baseConfig.service.FunctionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 描述: 配置 ConfigService 类，注入成 Bean
 *      使用 @Configuration 注解表明当前是一个配置类，这说明这个类里可能存在 0 个或多个@Bean 注解，
 *      此类不需要包扫描，所有的 Bean 都在 @Bean 下的方法中定义了
 * @author YI
 * @date 2020-01-10 14:49
 */
@Configuration
public class JavaConfig {
    @Bean
    public FunctionService functionService(){
        return new FunctionService();
    }

    @Bean
    public ConfigService configService(){
        ConfigService configService = new ConfigService();
        configService.setFunctionService(functionService());
        return configService;
    }
}
