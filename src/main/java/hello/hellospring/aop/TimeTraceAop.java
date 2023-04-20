package hello.hellospring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
//@Component
public class TimeTraceAop {
    //중간에 인터셉팅해서 풇어내는 기술이 AOP임


    @Around("execution(* hello.hellospring..*(..)) && !target(hello.hellospring.SpringConfig)")
//    @Around("execution(* hello.hellospring..*(..))")  //이건 컴포넌트 어노테이션일때
    public Object execute(ProceedingJoinPoint joinPoint) throws  Throwable{
        long start = System.currentTimeMillis();
        System.out.println("START: " + joinPoint.toString());
        try {
            return joinPoint.proceed();
        }finally {
            long finish = System.currentTimeMillis();
            long timeMs= finish-start;
            System.out.println("END: " + joinPoint.toString() + " " + timeMs + "ms");

        }
    }


}
