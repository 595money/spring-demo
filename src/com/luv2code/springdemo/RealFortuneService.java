package com.luv2code.springdemo;

import java.util.concurrent.ThreadLocalRandom;

public class RealFortuneService implements FortuneService {
  String[] fortune ;
  @Override
  public String getFortune() {
    int randomNum = ThreadLocalRandom.current().nextInt(0, 2);
    return fortune[randomNum];
  }

  /**
   * @param fortune the fortune to set
   */
  public void setFortune(String[] fortune) {
    this.fortune = fortune;
  }

}
