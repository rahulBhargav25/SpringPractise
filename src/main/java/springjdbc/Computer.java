package springjdbc;

public class Computer {
	private int computerId;
	private String motherboard;
	private String memory;
	private String randommemory;
	private String processor;
	private String gpu;

	public int getComputerId() {
		return computerId;
	}
	public void setComputerId(int computerId) {
		this.computerId = computerId;
	}
	public Computer(int computerId, String motherboard, String memory, String randommemory, String processor,
			String gpu) {
		super();
		this.computerId = computerId;
		this.motherboard = motherboard;
		this.memory = memory;
		this.randommemory = randommemory;
		this.processor = processor;
		this.gpu = gpu;
	}
	public String getMotherboard() {
		return motherboard;
	}
	public void setMotherboard(String motherboard) {
		this.motherboard = motherboard;
	}
	public String getMemory() {
		return memory;
	}
	public void setMemory(String memory) {
		this.memory = memory;
	}
	public String getRandommemory() {
		return randommemory;
	}
	public void setRandommemory(String randommemory) {
		this.randommemory = randommemory;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public String getGpu() {
		return gpu;
	}
	public void setGpu(String gpu) {
		this.gpu = gpu;
	}
	@Override
	public String toString() {
		return "Computer [computerId=" + computerId + ", motherboard=" + motherboard + ", memory=" + memory
				+ ", randommemory=" + randommemory + ", processor=" + processor + ", gpu=" + gpu + "]";
	}
	
}
