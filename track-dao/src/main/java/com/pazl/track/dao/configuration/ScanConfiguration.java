package com.pazl.track.dao.configuration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.pazl.track.dao")
public class ScanConfiguration {
}
