package fun.xiebug.exercise.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 描述: 编写切面
 *      通过 @Aspect 声明一个切面
 *      注解式拦截和方法规则拦截的区别在于注解式拦截可以添加提示信息
 * @author YI
 * @date 2020-01-10 15:47
 */
@Aspect
@Component
public class LogAspect {

    /**
     * 通过 @Pointcut 注解声明一个切点
     */
    @Pointcut("@annotation(fun.xiebug.exercise.aop.Action)")
    public void annotationPointCut(){}

    /**
     * 通过 @After 注解声明一个建言，并使用 @PointCut 定义的切点
     * @param joinPoint
     */
    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        /**
         * 通过反射可获得注解上的属性，然后做日志记录相关的操作，下面相同。
         */
        System.out.println("注解式拦截 " + action.name() + "\n------->" + method.getName());
    }

    /**
     * 通过 @Before 注解声明一个建言，此建言直接使用拦截规则作为参数
     * @param joinPoint
     */
    @Before("execution(* fun.xiebug.exercise.aop.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则式拦截 " + method.getName());
    }
}
