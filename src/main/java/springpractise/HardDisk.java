package springpractise;

public class HardDisk {
	private String name;
	private String space;
	private int cost;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpace() {
		return space;
	}
	public void setSpace(String space) {
		this.space = space;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "HardDisk [name=" + name + ", space=" + space + ", cost=" + cost + "]";
	}
}
