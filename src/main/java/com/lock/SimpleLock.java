package com.lock;

/**
 * 业务锁
 * 
 * 备注：利用java的synchronized机制进行封装，做了一个业务锁。
 * 1、关键数据必须经过锁定才可以访问
 * 2、锁定时间越小越好
 * */
public class SimpleLock {
	
	/**内部锁：支持mutex,semphore*/
	// 锁住任何东西都可以，只要是Object子类的就行，因为只是一个锁，无所谓是什么，有什么，所以new int[0]
	private int[] lock = new int[0];
	
	/**由用户锁保护的计数器，所有访问技术器的锁必须经过内部锁，无论是读取，还是修改。
	 * 
	 * 备注：
	 * 1、请思考和直接使用synchronized的区别？
	 * 2、
	 * 
	 * */
	private int lockCount = 0;
	
	/**获取内部锁的当前锁定数量*/
	public int getLockCount(){
		synchronized(lock){
			return lockCount;
		}
	}
	
	/**对内部锁进行锁定，并返回当前锁定数量*/
	public int lock(){
		synchronized(lock){
			return ++lockCount;
		}
	}
	/**对内部锁进行解锁，并返回当前锁定数量*/
	public int unLock(){
		synchronized(lock){
			return --lockCount;
		}

	}
}
