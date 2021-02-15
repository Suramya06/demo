package com.example.demo.service;

import java.util.concurrent.locks.ReentrantLock;

import javax.persistence.LockModeType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;


import com.example.demo.entity.Demo;
import com.example.demo.repository.DemoRepository;

/**----**/
@Service
public class DemoService {
	private ReentrantLock mutex = new ReentrantLock();
	private static boolean lock = false;
	@Autowired
	
	private DemoRepository demoRepository; 
	
	/**---**/
	public int updateCount(int number) {
		mutex.lock();
		
		
		Demo demo =demoRepository.findById(number).get();
        demo.setCount(demo.getCount()+1);
        demoRepository.save(demo);
        
        mutex.unlock();
        return demo.getCount();
        
}
}
