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
//������Ƽ�ҽ� �������¹�
@EnableTransactionManagement
//Ʈ����ǰ���, Ʈ����� ������ �����ڸ� bean���� ��Ͻ�Ű���.
public class RootConfig {
	//{}properties�̸��̶� �����ؾ���
	//value��
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
	//spring jdbc���̺귯�� �߰�����
	@Bean
	@Autowired
	public JdbcTemplate jdbcTemplate(DataSource ds) {
		return new JdbcTemplate(ds);
		//������̾���ؼ� ����Ÿ�ҽ��� ����ϴ¹��
		//�ƴϸ� ���� ���.()�ȿ�
	}
	@Bean
	@Autowired
	public PlatformTransactionManager txManager(DataSource ds) {
		return new DataSourceTransactionManager(ds);
	}
}
