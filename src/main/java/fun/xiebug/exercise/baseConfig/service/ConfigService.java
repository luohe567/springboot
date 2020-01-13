package fun.xiebug.exercise.baseConfig.service;

/**
 * 描述: 不使用注解声明、注入 Bean，通过配置类注入
 * @author YI
 * @date 2020-01-10 14:46
 */
public class ConfigService {
    /**
     * 不使用@Autowired
     */
    FunctionService functionService;

    public String sayHello(String word) {
        return functionService.sayHello(word);
    }

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }
}
