package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
  private FortuneService fortuneService;
//  private SleepService sleepService;

  public BaseballCoach() {};

  public BaseballCoach(FortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }
//
//  public BaseballCoach(FortuneService fortuneService, SleepService sleepService) {
//    this.fortuneService = fortuneService;
//    this.sleepService = sleepService;
//  }

  @Override
  public String getDailyWorkout() {
    return "Spend 30 minutes on batting practice";
  }

  @Override
  public String getDailyFortune() {
    // TODO Auto-generated method stub
    return null;
  }
}
