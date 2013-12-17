package com.sample.twitter4j;

import org.apache.commons.lang3.StringUtils;

import twitter4j.Paging;
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws TwitterException {
		Twitter twitter = new TwitterFactory().getInstance();
		String screenName = args[0];
		ResponseList<Status> statuses = twitter.getUserTimeline(screenName,
				new Paging(1, 200));
		for (Status status : statuses) {
			if (!status.isRetweet()
					&& !StringUtils.contains(status.getText(), "@")) {
				System.out.println(status.getText());
			}
		}
	}
}
