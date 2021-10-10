package springjdbc;

import java.util.List;

public interface ComputerDao {
	public void buildPC(Computer computer);
	public List<Computer> getInfo();
}
