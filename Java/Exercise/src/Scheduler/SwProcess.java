package Scheduler;

public class SwProcess {
	public int PID;
	public int execTime;

	public SwProcess(int pID, int execTime) {
		super();
		PID = pID;
		this.execTime = execTime;
	}

	@Override
	public String toString() {
		return "Swprocess [PID =" + PID + ", time=" + execTime + "]";
	}
}