package com.sist.spring;

import twitter4j.FilterQuery;
import twitter4j.TwitterStream;
import twitter4j.TwitterStreamFactory;

public class TwitterMain {

	public static void main(String[] args) {
		
		try{
			TwitterStream ts = new TwitterStreamFactory().getInstance();
			
			String[] data={"용인확진자"};
			
			TwitterListener listener = new TwitterListener();
			ts.addListener(listener);
			
			
			FilterQuery fq = new FilterQuery();
			fq.track(data);
			
			ts.filter(fq);
		}catch(Exception ex){
			ex.printStackTrace();
			
			
		}

	}

}
