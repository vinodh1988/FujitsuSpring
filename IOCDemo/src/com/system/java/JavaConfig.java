package com.system.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages={"com.system.java"})
public class JavaConfig {
	
	@Bean(name="xyz")
    public Bank getXYZ(){
    	return new XYZBank();
    }
    
	@Bean(name="abc")
	@Scope(value="prototype")
    public Bank getABC(){
    	return new ABCBank();
    }

}
