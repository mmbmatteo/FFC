package it.ffc; /**
 * Write a description of class Notification here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public abstract class Notification
{
    private     User        user;    
    // post, message, transaction.....
    public abstract void newNotification(Post post, Message message);
}
