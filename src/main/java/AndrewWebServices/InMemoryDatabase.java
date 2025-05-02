package AndrewWebServices;

import java.util.concurrent.TimeUnit;

/*
 * InMemoryDatabase is a fake for the AndrewWS database which is used to improve test efficiency.
 * Remember, fakes are fully functional classes with simplified implementation.
 * What is the simplest core functionality that we need for a functional database?
 * 
 * Hint: there are two methods you need to implement
 */
public class InMemoryDatabase /* should there be something here? */ {

    // Implement your fake database here
    public int getPassword(String accountName) {
        try {
            TimeUnit.SECONDS.sleep(10);
            if (accountName == "Scotty") {
                return 17214;
            } else {
                return 0;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return -1;
    }
}
