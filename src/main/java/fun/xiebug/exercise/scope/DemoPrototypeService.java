package fun.xiebug.exercise.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * 描述: 编写 Prototype 的 Bean
 *
 * @author YI
 * @date 2020-01-10 16:51
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {
}
