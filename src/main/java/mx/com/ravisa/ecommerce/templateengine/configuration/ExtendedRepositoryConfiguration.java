package mx.com.ravisa.ecommerce.templateengine.configuration;

import mx.com.ravisa.ecommerce.templateengine.repository.ExtendedRepositoryImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "mx.com.ravisa.ecommerce.templateengine.repository", repositoryBaseClass = ExtendedRepositoryImpl.class)
public class ExtendedRepositoryConfiguration {
    //Adittional JPA configuration here
}