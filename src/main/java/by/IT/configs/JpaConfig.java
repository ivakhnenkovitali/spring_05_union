package by.IT.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

public class JpaConfig {
    @Bean
    public JpaVendorAdapter vendorAdapter(){
        return new HibernateJpaVendorAdapter();

    }
    @Bean
    public LocalContainerEntityManagerFactoryBean factory(JpaVendorAdapter vendorAdapter){
        var container = new  LocalContainerEntityManagerFactoryBean();
        container.setJpaVendorAdapter(vendorAdapter);
        container.setPackagesToScan("by.IT.model.entities");
        return container;
    }

}
