package com.rmi.conf;

import com.rmi.service.RmiManagerImpl;
import com.rmi.comm.IRmiManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

/**
 * @ClassName RmiConfig
 * @Description TODO
 * @Author zhangyq
 * @Date 2019/4/3 15:29
 **/
@Configuration
public class RmiConfig {

    @Autowired
    private RmiManagerImpl rmiManager;

    @Bean
    public RmiServiceExporter exporter(){
        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setServiceName("rmiManagerName");
        exporter.setService(rmiManager);
//        exporter.setServicePort(1234);
        exporter.setServiceInterface(IRmiManager.class);
//        RmiRegistryFactoryBean factoryBean = new RmiRegistryFactoryBean();
//        factoryBean.setHost("192.168.241.253");
//        factoryBean.setPort(4567);
//        exporter.setRegistryHost("10.170.104.248");
        exporter.setRegistryPort(4567);
        return exporter;
    }
}
