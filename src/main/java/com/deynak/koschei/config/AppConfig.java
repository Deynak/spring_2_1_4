package com.deynak.koschei.config;

import com.deynak.koschei.models.Egg6;
import com.deynak.koschei.models.Island2;
import com.deynak.koschei.models.Needle7;
import com.deynak.koschei.models.Wood3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.deynak.koschei")
public class AppConfig {

    @Bean
    public static Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }

    @Bean
    public static Egg6 getEgg(Needle7 needle) {
        return new Egg6(needle);
    }
}
