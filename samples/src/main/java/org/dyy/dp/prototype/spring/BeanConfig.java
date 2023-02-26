package org.dyy.dp.prototype.spring;

import org.dyy.dp.prototype.uc.Color;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {

    @Bean("sheep")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Sheep sheep() {
        return new Sheep("Tom", 1, Color.WHITE);
    }

}
