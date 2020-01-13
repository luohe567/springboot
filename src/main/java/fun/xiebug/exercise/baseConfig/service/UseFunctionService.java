package fun.xiebug.exercise.baseConfig.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述:
 * @author YI
 * @date 2020-01-10 14:20
 */
@Service
public class UseFunctionService {
    /**
     * 使用 @Autowired 注解声明将 FunctionService 的实体 Bean 注入到 UseFunctionService 中，
     * 让 UseFunctionService 具备 FunctionService 的功能。
     * 使用 JSR-330 的 @Inject 注解或者 JSR-250 的 @Resource 注解是等效的
     */
    @Autowired
    FunctionService functionService;

    public String SayHello(String word){
        return functionService.sayHello(word);
    }
}
