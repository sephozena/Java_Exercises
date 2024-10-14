package Abstraction;

public class Main {
    public static void main(String[] args) {
        PasswordChangeEvent eventOne = new PasswordChangeEvent("1992385528562");
        AccountTransferEvent eventTwo = new AccountTransferEvent("19939299134");
        MissedPaymentEvent eventThree = new MissedPaymentEvent("88447299273");

        Event[] events = {eventOne, eventTwo, eventThree};
        
        for (Event e: events){
            System.out.println(e.getTimeStamp());
            e.process();
            System.out.println();
        }
        
    }

}
/**
 * what we did here is we created an interface 'event'
 * we created abstract to implement some of interface event : which is the timestamp
 * we also created a constructor in abstract that can be used by other classes to make the code much cleaner
 * we created class: {PasswordChangeEvent, MissedPaymentEvent, AccountTransferEvent}
 * classes PasswordChangeEvent & MissedPaymentEvent extends the abstract and implement the unimplemented method from interface ' process'
 * 
 * 
 * we left class 'AccountTransferEvent' untouched - implementing directly from interface and without abstraction.
 */