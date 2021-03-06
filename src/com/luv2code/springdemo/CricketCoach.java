package com.luv2code.springdemo;

public class CricketCoach implements Coach {
  private FortuneService fortuneService;
  // add new fields for emailAddress and team
  private String emailAddress;
  private String team;

  // create a no-arg constructor
  public CricketCoach() {
    System.out.println("CricketCoach: inside no-arg constructor");
  }

  @Override
  public String getDailyWorkout() {

    return "Practice fast bowling for 15 minutes";
  }

  @Override
  public String getDailyFortune() {

    return fortuneService.getFortune();
  }

  /**
   * our setter method
   * 
   * @param fortuneService the fortuneService to set
   */
  public void setFortuneService(FortuneService fortuneService) {
    System.out.println("CricketCoach: inside setter method - setFortuneService");
    this.fortuneService = fortuneService;
  }

  /**
   * @return the emailAddress
   */
  public String getEmailAddress() {
    return emailAddress;
  }

  /**
   * @param emailAddress the emailAddress to set
   */
  public void setEmailAddress(String emailAddress) {
    System.out.println("CricketCoach: inside setter method - setEmailAddress");
    this.emailAddress = emailAddress;
  }

  /**
   * @return the team
   */
  public String getTeam() {
    return team;
  }

  /**
   * @param team the team to set
   */
  public void setTeam(String team) {
    System.out.println("CricketCoach: inside setter method - setTeam");
    this.team = team;
  }

  
}
