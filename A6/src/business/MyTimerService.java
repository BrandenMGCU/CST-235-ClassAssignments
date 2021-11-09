package business;

import javax.annotation.Resource;
import javax.ejb.Schedule;
import javax.ejb.Stateless;
import javax.ejb.Timeout;
import javax.ejb.Timer;
import javax.ejb.TimerService;

import org.jboss.logging.Logger;

@Stateless
public class MyTimerService 
{	
	@Resource
	TimerService timerService; 

    /**
     * Default constructor. 
     */
    private static final Logger logger = Logger.getLogger("business.MyTimerService"); 
  
    public MyTimerService()
    {
    	
    }
	
    public void setTimer(long interval)
    {
    	timerService.createTimer(interval, "Setting a Programmic Timer");
    }
    
    @Timeout
    public void programmicTimeout(Timer timer)
    {
    	logger.info("@Timeout in programmicTimeout() called at: " + new java.util.Date());
    }
    
	//@SuppressWarnings("unused")
	@Schedule(second="*/10", minute="*", hour="0-23", dayOfWeek="Mon-Fri",
      dayOfMonth="*", month="*", year="*", info="MyTimer")
    private void scheduledTimeout(final Timer t) 
	{
        logger.info("@Schedule called at: " + new java.util.Date());
    }
}

/*
 * This will be our timer java file
 */
