package com.sist.spring;

import twitter4j.StallWarning;
import twitter4j.Status;
import twitter4j.StatusDeletionNotice;
import twitter4j.StatusListener;

public class TwitterListener implements StatusListener{

	@Override
	public void onException(Exception ex) {
		
		System.out.println(ex.getMessage());
	}

	@Override
	public void onDeletionNotice(StatusDeletionNotice arg0) {
		
	}

	@Override
	public void onScrubGeo(long arg0, long arg1) {
		
	}

	
	
	@Override
	public void onStallWarning(StallWarning arg0) {
		
	}

	@Override
	public void onStatus(Status status) {
		// 실제 데이터를 가져오는 것
		
		System.out.println(status.getUser().getScreenName());
		System.out.println(status.getText());
		System.out.println(status.getCreatedAt());
		System.out.println(status.getFavoriteCount());
		System.out.println(status.getUser().getProfileImageURL());
		System.out.println("======================================");
	}

	@Override
	public void onTrackLimitationNotice(int arg0) {
		
	}

}
