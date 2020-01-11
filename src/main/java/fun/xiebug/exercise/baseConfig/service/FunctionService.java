package fun.xiebug.exercise.baseConfig.service;

import org.springframework.stereotype.Service;

/**
 * 描述: 使用该主键生申明当前类是 Spring 管理的一个 Bean
 *      其中使用@Component、@Service、@Repository 和@Controller 是等效的。
 * @author YI
 * @date 2020-01-10 14:13
 */
@Service
public class FunctionService {
    public String sayHello(String word){
        return "Hello " + word + "!";
    }
}
