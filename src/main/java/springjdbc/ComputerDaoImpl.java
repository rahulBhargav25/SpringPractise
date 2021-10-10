package springjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
@Component("CDI")
public class ComputerDaoImpl implements ComputerDao{
	
	private JdbcTemplate jdbcTemplate;
	private DataSource dataSource;
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	
	
	
	
	
	@Override
	public void buildPC(Computer computer) {
		String sql = "insert into computers values(?,?,?,?,?,?)";
		int i = jdbcTemplate.update(sql, new Object[] {computer.getComputerId(), computer.getMotherboard(), computer.getMemory(), computer.getRandommemory(), computer.getProcessor(), computer.getGpu()});
		if(i > 0) {System.out.println("Computer added to collection");}
	}






//	@Override
//	public List<Computer> getInfo() {
//		String sql="select * from computers";
//		return jdbcTemplate.query(sql, new RowMapper<Computer>() {
//
//			@Override
//			public Computer mapRow(ResultSet rs, int rowNum) throws SQLException {
//				Computer computer = new Computer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
//				return computer;
//			}
//			
//		});
//	}
	@Override
	public List<Computer> getInfo() {
		String sql="select * from computers";
		return jdbcTemplate.query(sql, new ResultSetExtractor<List<Computer>>() {

			@Override
			public List<Computer> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Computer> computers = new ArrayList<Computer>();
				while(rs.next()) {
					Computer computer = new Computer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
					computers.add(computer);
				}
 				return computers;
			}
			
		});
	}
	

}
