package springpractise;

public class Computer {
	private String company;
	private String category;
	private int cost;
	private HardDisk hd;
	private Motherboard MD;
	private Processor PS;
	private Ram ram;
	
	
	public HardDisk getHd() {
		return hd;
	}

	public void setHd(HardDisk hd) {
		this.hd = hd;
	}

	public Motherboard getMD() {
		return MD;
	}

	public void setMD(Motherboard mD) {
		MD = mD;
	}

	public Processor getPS() {
		return PS;
	}

	public void setPS(Processor pS) {
		PS = pS;
	}

	public Ram getRam() {
		return ram;
	}

	public void setRam(Ram ram) {
		this.ram = ram;
	}

	public Computer() {
		System.out.println("Your pc is being assembled");
	}
	
	

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	public void displayComputer() {
		
		
		
		
		int computercost = getHd().getCost() + getMD().getCost() + getPS().getCost() + getRam().getCost();
		System.out.println("Cost of computer is : " + computercost);
	}

	@Override
	public String toString() {
		return "Computer [company=" + company + ", category=" + category + ", cost=" + cost + ", hd=" + hd + ", MD="
				+ MD + ", PS=" + PS + ", ram=" + ram + "]";
	}
}
