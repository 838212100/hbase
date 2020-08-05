package com.lock;

public class LockTest implements Runnable {
	/**业务锁*/
	// 静态业务类，只要用这个LockTest类，所有线程用的就是一个锁，相当于多个线程访问同一个类
	// SimpleLock在LockTest中作为静态单独的锁 如将SimpleLock放到更大的范围内，如整个项目 则为整个项目的一把锁
	private static SimpleLock lock = new SimpleLock();
	/**业务锁可以访问的最大值*/
	private static int maxCount = 1;

	/**如下为准备测试用的临时变量,visitorName:测试者名称，success：执行结果，currentLockCount：执行时锁的数量*/
	private String visitorName = null;
	private boolean success = false;
	private int currentLockCount = 0;
	
	
	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getVisitorName() {
		return visitorName;
	}

	public void setVisitorName(String visitorName) {
		this.visitorName = visitorName;
	}

	/**
	 * 要用锁，必须使用try... catch ... finally的模式进行开发，在try中执行lock和锁定判断，在finally中执行unlock
	 * 入口方法，获取锁
	 * */
	public void test(){
		try{
			currentLockCount = lock.lock();
			if(currentLockCount>maxCount) throw new Exception(visitorName+"锁定异常!,currentLockCount="+currentLockCount);
			
			Thread.sleep(100);
			System.out.println(visitorName+"正常处理业务！,currentLockCount="+currentLockCount);
			this.setSuccess(true);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			this.setSuccess(false);
		}finally{
			lock.unLock();
		}
	}
	
	public static void main(String[] args) throws Exception {

		int threadCount = 200;
		LockTest.maxCount = 10;
				
		//多线程代码
		Thread[] threads = new Thread[threadCount]; 
		LockTest[] tests = new LockTest[threadCount];
		
		for(int i=0;i<threadCount;i++){
			tests[i] = new LockTest();
			tests[i].setVisitorName("visitor"+i);
			threads[i] = new Thread(tests[i]);
			threads[i].start();
		}
		
		
		//join会让主线程对子线程有一定依赖，可能会让主线程产生不必要的阻塞；生产系统如果不是为了收集子线程的执行情况，可考虑不使用join
		for(int i=0;i<threadCount;i++) threads[i].join();
			
		
		int succCount = 0;
		for(int i=0;i<threadCount;i++){
			if(tests[i].isSuccess()) {
				succCount++;
				System.out.println(tests[i].visitorName +" runs successfully. current="+tests[i].currentLockCount);
			}
		}
		
		
		System.out.println("main final lockcount="+lock.getLockCount());
		System.out.println("success test count="+succCount);

	}

	@Override
	public void run() {
		test();		
	}

}
