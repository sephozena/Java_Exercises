package Abstraction;

import java.sql.Timestamp;

public class AccountTransferEvent implements Event{
    private  Long createTimeStamp;
    private  String id;

    public AccountTransferEvent (String id){
        this.createTimeStamp = new Timestamp(System.currentTimeMillis()).getTime();
        this.id = id;
    }


    @Override
    public Long getTimeStamp() {
        return this.createTimeStamp;
    }

    @Override
    public void process() {
        System.out.println("Customer " + id + " needs to transfer " + 
        "Their service.");
    }

}
