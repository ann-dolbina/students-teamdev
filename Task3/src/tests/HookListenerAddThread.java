package tests;



import hook.Hook;
import hook.HookEventObject;
import hook.HookListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * A thread which adds listeners to the specified hook in random moments of time
 * 
 * @author anna.dolbina
 *
 */
public class HookListenerAddThread extends Thread {
	private final Hook hook;
	private final static Logger logger;
	static{
		logger = LoggerFactory.getLogger(HookListenerAddThread.class);
	}
	/**
	 * Constructs and initializes the instance of this class
	 * 
	 * @param h the hook to add listeners to
	 */
	public HookListenerAddThread(Hook h){
		hook=h;
	}

	public void run() {
		while (!isInterrupted()) {
			hook.addListener(new HookListener() {

				@Override
				public void onHookEvent(HookEventObject event)
						throws Exception {
					logger.info("Thread listener:Event on window "
									+ event.getSourceWindowHandle());

				}

			});
			try {
				Thread.sleep((long) (Math.random() * 10));
			} catch (InterruptedException e) {
				break;
			}
		}
	}
}
