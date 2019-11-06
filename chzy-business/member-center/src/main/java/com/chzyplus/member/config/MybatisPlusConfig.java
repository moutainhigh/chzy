package com.chzyplus.member.config;

import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import com.baomidou.mybatisplus.extension.injector.LogicSqlInjector;
import com.central.db.config.DefaultMybatisPlusConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ligy7
 * @date 2018/12/10
 */
@Configuration
@MapperScan({"com.chzyplus.member.mapper*"})
public class MybatisPlusConfig extends DefaultMybatisPlusConfig {
    /**
     * 逻辑删除注入器
     */
    @Bean
    public ISqlInjector sqlInjector(){
        return new LogicSqlInjector();
    }
}
