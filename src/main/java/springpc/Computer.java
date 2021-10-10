package springpc;





public class Computer {
private int computerId;
private String harddiskname;
private double hdcost;
private String mbname;
private double mbcost;
private String processorname;
private double processorcost;
private String ramname;
private double ramcost;
public Computer(int computerId, String harddiskname, double hdcost, String mbname, double mbcost, String processorname,
		double processorcost, String ramname, double ramcost) {
	super();
	this.computerId = computerId;
	this.harddiskname = harddiskname;
	this.hdcost = hdcost;
	this.mbname = mbname;
	this.mbcost = mbcost;
	this.processorname = processorname;
	this.processorcost = processorcost;
	this.ramname = ramname;
	this.ramcost = ramcost;
}
public int getComputerId() {
	return computerId;
}
public void setComputerId(int computerId) {
	this.computerId = computerId;
}
public String getHarddiskname() {
	return harddiskname;
}
public void setHarddiskname(String harddiskname) {
	this.harddiskname = harddiskname;
}
public double getHdcost() {
	return hdcost;
}
public void setHdcost(double hdcost) {
	this.hdcost = hdcost;
}
public String getMbname() {
	return mbname;
}
public void setMbname(String mbname) {
	this.mbname = mbname;
}
public double getMbcost() {
	return mbcost;
}
public void setMbcost(double mbcost) {
	this.mbcost = mbcost;
}
public String getProcessorname() {
	return processorname;
}
public void setProcessorname(String processorname) {
	this.processorname = processorname;
}
public double getProcessorcost() {
	return processorcost;
}
public void setProcessorcost(double processorcost) {
	this.processorcost = processorcost;
}
public String getRamname() {
	return ramname;
}
public void setRamname(String ramname) {
	this.ramname = ramname;
}
public double getRamcost() {
	return ramcost;
}
public void setRamcost(double ramcost) {
	this.ramcost = ramcost;
}
@Override
public String toString() {
	return "Computer [computerId=" + computerId + ", harddiskname=" + harddiskname + ", hdcost=" + hdcost + ", mbname="
			+ mbname + ", mbcost=" + mbcost + ", processorname=" + processorname + ", processorcost=" + processorcost
			+ ", ramname=" + ramname + ", ramcost=" + ramcost + "]";
}
	

	
	
	

	
	
}
