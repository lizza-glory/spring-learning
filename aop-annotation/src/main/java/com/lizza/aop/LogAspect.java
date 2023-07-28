package com.lizza.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Desc:
 * @author: lizza.liu
 * @date: 2021-05-25
 */
@Aspect
@Component
public class LogAspect {

    @After("execution(* com.lizza.dao..*.save*(..)) || " +
            "execution(* com.lizza.dao..*.delete*(..)) || " +
            "execution(* com.lizza.dao..*.select*(..)) || " +
            "!execution(* com.lizza.dao.UserDao.select*(..))")
    public void daoLog(JoinPoint joinPoint) {
        try {
            System.out.println(">>>>>>Class Method: " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName()
                            + ", Args: " + Arrays.toString(joinPoint.getArgs()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
