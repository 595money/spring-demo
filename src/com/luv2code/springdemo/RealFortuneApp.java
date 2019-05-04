package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RealFortuneApp {

  public static void main(String[] args) {
    // load the spring config file
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    // retrieve bean from spring container
    Coach theCoach = context.getBean("mySoftballCoach", SoftballCoach.class);
    Coach theCoach1 = context.getBean("mySoftballCoach", SoftballCoach.class);
    // call method on the bean
    System.out.println(theCoach.getDailyFortune());
    System.out.println(theCoach == theCoach1);
    // close the context
    context.close();
  }

}
