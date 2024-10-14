package Abstraction;

public interface Event {

    Long getTimeStamp();
    void process();
/**
 * any class that wants to use 'Event' Interface must implement the
 * 'getTimeStamp' and 'process' methods and return the appropriate types.
 */
}
