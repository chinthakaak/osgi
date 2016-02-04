package com.examples;

/**
 * Created by ka40215 on 2/3/16.
 */
import org.apache.commons.dbcp.BasicDataSource;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

public class Activator implements BundleActivator {
    public void start(BundleContext ctx) {
//                SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
//        dataSource.setDriver(new org.hsqldb.jdbcDriver());
//        dataSource.setUrl("jdbc:hsqldb:hsql://localhost:9001/ase");
//        dataSource.setUsername("sa");
//
//        JdbcTemplate template0 = new JdbcTemplate(dataSource);
//        template0.update("INSERT INTO TS_NOTIFICATION (APPLICATION_USER_ID, CORRELATOR, SESSION_ID, ENDPOINT_URI, START_TIME, DURATION, NOTIFICATION_COUNT, ACTIVE_ADDRESS_COUNT, STATUS, VERSION) VALUES ('app1', 'correlator_1', 2652, 'http://aepona.com', '2015-09-23 12:36:11.138', 10, 5, 5, 0, 2)");


        final BasicDataSource customDataSource = new BasicDataSource();
        customDataSource.setDriverClassName("org.hsqldb.jdbcDriver");
        customDataSource.setUrl("jdbc:hsqldb:hsql://localhost:9001/ase");
        customDataSource.setUsername("sa");
//        customDataSource.setPassword(password);
//



        JdbcTemplate template = new JdbcTemplate(customDataSource);
        template.update("INSERT INTO TS_NOTIFICATION (APPLICATION_USER_ID, CORRELATOR, SESSION_ID, ENDPOINT_URI, START_TIME, DURATION, NOTIFICATION_COUNT, ACTIVE_ADDRESS_COUNT, STATUS, VERSION) VALUES ('app1', 'correlator_1', 2652, 'http://aepona.com', '2015-09-23 12:36:11.138', 10, 5, 5, 0, 2)");

        System.out.println("Hello");
        ctx.registerService(Greeting.class.getName(),
                new GreetingImpl("service"), null);
    }
    public void stop(BundleContext ctx) {

    }
}

