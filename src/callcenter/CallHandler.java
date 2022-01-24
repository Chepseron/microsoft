
import java.util.List;
import java.util.Queue;


public class CallHandler {

    static final int LEVELS = 3;
    static final int NUM_FRESHERS; //assume we have 5 freshers
    List[] employeeLevels;
    Queue[] callQueues;//enqueue waiting calls

    public CallHandler(int NUM_FRESHERS) {
        this.NUM_FRESHERS = NUM_FRESHERS;
        employeeLevels = new ArrayList[LEVELS];
        callQueues = new LinkedList[LEVELS];
    }
 //return the first available person equal or higher than 
    //current call rank
    Employee getCallHandler(Call call) {
        for (int level = call.rank; level < LEVELS - 1; level++) {
            List employeeLevel = employeeLevels[level];
            for (Employee emp : employeeLevel) {
                if (emp.free) {
                    return emp;
                }
            }
        }
        return null;
    }

    void dispatchCall(Call call) {
        //try to route the call to an employee with minimal rank
        Employee emp = getCallHandler(call);
        if (emp != null) {
            emp.ReceiveCall(call);
        } //if no one is available for the call, put the call on the queue
        //waiting for the next available employee
        else {
            callQueues[call.rank].add(call);
        }
    }

    //look for call at e's rank
    void getNextCall(Employee e) {
        if (callQueues[e.level].size() != 0) {
            Call next = callQueues[e.level].poll();
            e.receiveCall(next);
        }
    }
}
