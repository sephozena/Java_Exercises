package Abstraction;

public class PasswordChangeEvent extends AbstractEvent {

    public PasswordChangeEvent (String id){
        super(id);
    }

    @Override
    public void process() {
        System.out.println("Customer " + id + " changed their password. " + 
        "Sending confirmation email to the customer.");
    }

}
