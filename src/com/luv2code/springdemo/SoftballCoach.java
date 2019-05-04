package com.luv2code.springdemo;

public class SoftballCoach implements Coach {
  public FortuneService fortune;

  public SoftballCoach(FortuneService theFortune) {
    System.out.println("inside  constructor");
    this.fortune = theFortune;
  }

  @Override
  public String getDailyWorkout() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getDailyFortune() {
    return fortune.getFortune();
  }

}
