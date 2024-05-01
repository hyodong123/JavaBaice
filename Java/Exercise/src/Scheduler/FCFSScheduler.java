package Scheduler;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

public class FCFSScheduler {

	private List<SwProcess> readyQue = new CopyOnWriteArrayList<>();
	
	void insert(SwProcess process) {
		readyQue.add(process);
	}
	
	void flowTime() {
		sleep(990);
	}
	
	private void sleep(int i) {
		try {
			TimeUnit.MILLISECONDS.sleep(i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		FCFSScheduler scheduler = new FCFSScheduler();
		
		scheduler.insert(new SwProcess(1, 7)); // 1번 프로세스 7초 걸림
											   // 큐에 프로세스A를 입력
		scheduler.flowTime(); 				   // 시간을 1초 흐르도록 지시
		// 큐에 프로세스B를 입력
		// 시간을 1초 흐르도록 지시
		// 큐에 프로세스C를 입력
		// 시간을 1초 흐르도록 지시
		
	}
}
