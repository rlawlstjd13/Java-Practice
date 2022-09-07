package kr.co.greenart.config;

import javax.sql.DataSource;
import javax.validation.Valid;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@PropertySource("classpath:kr/co/greenart/config/mysql.properties")
@ComponentScan("kr.co.greenart.model.car")
//프라퍼티소스 가져오는법
@EnableTransactionManagement
//트랜잭션관리, 트랜잭션 관리할 관리자만 bean으로 등록시키면됨.
public class RootConfig {
	//{}properties이름이랑 동일해야함
	//value로
	@Value("${jdbc.drivername}")
	private String drivername;
	@Value("${jdbc.url}")
	private String url;
	@Value("${jdbc.username}")
	private String username;
	@Value("${jdbc.password}")
	private String password;

	//@Autowired
	//private DataSource ds;
	@Bean
	public DataSource dataSource() {
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName(drivername);
		ds.setUrl(url);
		ds.setUsername(username);
		ds.setPassword(password);
		return ds;
	}
	//spring jdbc라이브러리 추가했음
	@Bean
	@Autowired
	public JdbcTemplate jdbcTemplate(DataSource ds) {
		return new JdbcTemplate(ds);
		//오토와이얼드해서 데이타소스를 사용하는방법
		//아니면 지금 방법.()안에
	}
	@Bean
	@Autowired
	public PlatformTransactionManager txManager(DataSource ds) {
		return new DataSourceTransactionManager(ds);
	}
}
