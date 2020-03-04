package com.kc.mylearnings.springbasics.basics;

import com.kc.mylearnings.springbasics.basics.basic.BinarySearchImpl;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@Configuration //Java way of telling its a spring application and NOT SPRINGBOOT
@ComponentScan("com.kc.mylearnings.springbasics.basics") //TODO: THIS DID NOT WORK
public class SpringInFewStepsBasicApplication {

    public static void main(String[] args) {

        //BinarySearchImpl bs = new BinarySearchImpl();
        // Above line is replaced with loose-coupling to which algorithm to be implemented bubblesort/quicksort by passing
        // SortAlgorithm interface as constructor parameter. This means SortAlgorithm is a dependency to BinarySearchImpl.
        // Here there 1 Bean: BinarySearchImpl and 1 Dependency: SortAlgorithm
        // In real apps, there could 1K beans and 1K dependencies
        //BinarySearchImpl bs = new BinarySearchImpl(new BubbleSortAlgorithm());

        //BinarySearchImpl bs will be created by Spring ApplicationContext

        //Springboot way of creating application context
        // ApplicationContext applicationContext = SpringApplication.run(SpringInFewStepsBasicApplication.class, args);

        //SPRING way of creating application context
        //ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringInFewStepsBasicApplication.class); //ApplicationContext does not have a close() method hence suggested to you

        try(AnnotationConfigApplicationContext  applicationContext = new AnnotationConfigApplicationContext(SpringInFewStepsBasicApplication.class)){
            BinarySearchImpl bs = applicationContext.getBean(BinarySearchImpl.class);
            BinarySearchImpl bs2 = applicationContext.getBean(BinarySearchImpl.class);
            System.out.println("\n***BEAN SCOPE****");
            System.out.println(bs);
            System.out.println(bs2);

            int result = bs.BinarySearch(new int[]{12, 30, 5, 3}, 5);
            System.out.println(result + "\n");

            //applicationContext.close(); //Recommended to close the application context
        }





    }

}
