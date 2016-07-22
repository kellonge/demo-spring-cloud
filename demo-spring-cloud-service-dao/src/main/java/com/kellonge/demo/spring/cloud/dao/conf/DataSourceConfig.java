package com.kellonge.demo.spring.cloud.dao.conf;

import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.support.TransactionTemplate;

import javax.sql.DataSource;

@Configuration
@MapperScan("com.kellonge.demo.spring.cloud.dao.mapper")
public class DataSourceConfig {

    //数据库连接
    @Value("${datasource.jdbcUrl}")
    private String  jdbcUrl;
    @Value("${datasource.username}")
    private String  username;
    @Value("${datasource.password}")
    private String  password;

    //数据库公共配置
    @Value("${datasource.driverClassName}")
    private String  driverClassName;
    @Value("${datasource.connectionTestQuery}")
    private String  connectionTestQuery;
    @Value("${datasource.connectionTimeoutMs}")
    private Long    connectionTimeoutMs;
    @Value("${datasource.idleTimeoutMs}")
    private Long    idleTimeoutMs;
    @Value("${datasource.maxLifetimeMs}")
    private Long    maxLifetimeMs;
    @Value("${datasource.maxPoolSize}")
    private Integer maxPoolSize;
    @Value("${datasource.minIdle}")
    private Integer minIdle;

    //事务超时
    @Value("${datasource.transactionTimeoutS}")
    private Integer transactionTimeoutS;

    /**
     * 获取返回数据源
     *
     * @return
     */
    private HikariDataSource getAbstractDataSource() {
        final HikariDataSource ds = new HikariDataSource();
        ds.setDriverClassName(this.driverClassName);
        ds.setConnectionTestQuery(this.connectionTestQuery);
        ds.setConnectionTimeout(this.connectionTimeoutMs);
        ds.setIdleTimeout(this.idleTimeoutMs);
        ds.setMaxLifetime(this.maxLifetimeMs);
        ds.setMaximumPoolSize(this.maxPoolSize);
        ds.setMinimumIdle(this.minIdle);
        return ds;
    }

    /**
     * 数据库数据源
     *
     * @return
     */
    public DataSource getDataSource() {
        HikariDataSource ds = this.getAbstractDataSource();
        ds.setJdbcUrl(this.jdbcUrl);
        ds.setUsername(this.username);
        ds.setPassword(this.password);
        return ds;
    }

    /**
     * 数据源事务管理器
     *
     * @return
     */
    @Bean
    public DataSourceTransactionManager getTransactionManager() {
        return new DataSourceTransactionManager(getDataSource());
    }

    /**
     * 编程式事务
     *
     * @return
     */
    @Bean
    public TransactionTemplate getTransactionTemplate() {
        TransactionTemplate transactionTemplate = new TransactionTemplate();
        transactionTemplate.setTimeout(this.transactionTimeoutS);
        transactionTemplate.setTransactionManager(this.getTransactionManager());
        return transactionTemplate;
    }

    /**
     * mybatis 的sessionFactory
     *
     * @return
     * @throws Exception
     */
    @Bean
    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {

        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(this.getDataSource());
        //扫描mapper.xml
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean
                .setMapperLocations(resolver.getResources("classpath*:sql/*.xml"));
        return sqlSessionFactoryBean.getObject();
    }
}
