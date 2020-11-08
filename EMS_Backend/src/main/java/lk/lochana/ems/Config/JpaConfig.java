package lk.lochana.ems.Config;

import lk.lochana.ems.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackageClasses = {EmployeeRepository.class})
@PropertySource("classpath:application.properties")
public class JpaConfig {

    @Autowired
    private Environment env;

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource ds, JpaVendorAdapter va) {
        LocalContainerEntityManagerFactoryBean lcem = new LocalContainerEntityManagerFactoryBean();
        lcem.setPackagesToScan("lk.lochana.ems.Entity");
        lcem.setDataSource(ds);
        lcem.setJpaVendorAdapter(va);
        return lcem;
    }


    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setUrl(env.getRequiredProperty("db.url"));
        ds.setUsername(env.getRequiredProperty("db.user"));
        ds.setPassword(env.getRequiredProperty("db.password"));
        ds.setDriverClassName(env.getRequiredProperty("db.driver"));
        return ds;
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        HibernateJpaVendorAdapter jpa = new HibernateJpaVendorAdapter();
        jpa.setDatabasePlatform("org.hibernate.dialect.MySQL57Dialect");
        jpa.setDatabase(Database.MYSQL);
        jpa.setShowSql(true);
        jpa.setGenerateDdl(true);
        return jpa;
    }

    @Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory managerFactory) {
        return new JpaTransactionManager(managerFactory);
    }

}
