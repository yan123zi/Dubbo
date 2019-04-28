package com.pxxy.bootuserserviceprovider.config;

import com.alibaba.dubbo.config.*;
import com.pxxy.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @author YZJ
 * @date 2019/4/8 - 20:40
 */
@Configuration
public class MyDubboConfig {
    @Bean
    public ApplicationConfig applicationConfig(){
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("boot-userService-provider");
        return applicationConfig;
    }
    @Bean
    public RegistryConfig registryConfig(){
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("47.100.18.197:2181");
        registryConfig.setProtocol("zookeeper");
        return registryConfig;
    }
    @Bean
    public ProtocolConfig protocolConfig(){
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(20882);
        return protocolConfig;
    }
    @Bean
    public ServiceConfig<UserService> userServiceServiceConfig(UserService userService){
        ServiceConfig<UserService> serviceConfig = new ServiceConfig<>();
        serviceConfig.setInterface(UserService.class);
        serviceConfig.setRef(userService);
        serviceConfig.setVersion("2.0.0");
        //配置每一个method的信息
        MethodConfig methodConfig = new MethodConfig();
        methodConfig.setName("getUserAddressList");
        methodConfig.setTimeout(1000);
        //将method的配置保存到service配置中
        List<MethodConfig> methodConfigs = new ArrayList<>();
        methodConfigs.add(methodConfig);
        serviceConfig.setMethods(methodConfigs);
        return serviceConfig;
    }
}
