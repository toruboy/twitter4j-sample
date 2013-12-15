package com.sample.twitter4j;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws TwitterException
    {
    	Twitter twitter = new TwitterFactory().getInstance();
        User user = twitter.verifyCredentials();

        System.out.println(user.getName());
        System.out.println(user.getScreenName());
        System.out.println(user.getFriendsCount());
        System.out.println(user.getFollowersCount());
    }
}
