package com.example.learn.spring_profile;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 *
 */
@Component
public class ApplicationConfig {

  @Value("${spring.application.name}")
  private String name;

  @Value("${server.port}")
  private Integer port;

  @Value("${spring.profiles.active:unknown}")
  private List<String> activeProfile;


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public List<String> getActiveProfile() {
    return activeProfile;
  }

  public void setActiveProfile(List<String> activeProfile) {
    this.activeProfile = activeProfile;
  }

  @Override
  public String toString() {
    return "ApplicationConfig{" + "name='" + name + '\'' + ", port=" + port + ", activeProfile='" + activeProfile + '\'' + '}';
  }
}
