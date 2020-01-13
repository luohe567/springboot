package fun.xiebug.exercise.aop;

import org.springframework.stereotype.Service;

/**
 * 描述: 使用注解的被拦截类
 * @author YI
 * @date 2020-01-10 15:44
 */
@Service
public class DemoAnnotationService {
    @Action(name = "注解式拦截的 add 操作")
    public void add(){}
}
