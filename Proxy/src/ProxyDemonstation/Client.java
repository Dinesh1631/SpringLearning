package ProxyDemonstation;

import java.util.Date;

public class Client {
     public static void main (String args[])
     {
    	 DialySession DS  = new StudentProxy(new Attendence(false, new Date()));
    	 DS.studentAttendence();
     }
}
/*This code  is to demonstrate who proxy works in java.We are using a proxyStudnent to do validation befor directing
 * call to actual student object.*/
 