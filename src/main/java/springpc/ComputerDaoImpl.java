package springpc;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
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
	public void addItem(Computer computer) {
		String sql="insert into comp values(?,?,?,?,?,?,?,?,?)";
		int i = jdbcTemplate.update(sql, new Object[] {computer.getComputerId(),computer.getHarddiskname(),computer.getHdcost(), computer.getMbname(),computer.getMbcost(),computer.getProcessorname(),computer.getProcessorcost(),computer.getRamname(),computer.getRamcost()});
		if(i>0) {System.out.println("Computer Added");}
		
	}

}
