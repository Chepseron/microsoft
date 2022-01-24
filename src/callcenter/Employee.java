
class Employee {

    CallHandler callHandler;
    int rank;//0 - fresher, 1 - technical lead, 2 - product manager
    boolean free;

    Employee(int rank) {
        this.rank = rank;
    }

    void receiveCall(Call call) {
    }

    void callHandled(Call call, String message) {
        call.reply(message);
        call.disconnect();
        callHandler.getNextCall(this);
    }//complete call
    //If the employee with the current rank cannot handle the call

    void cannotHandle(Call call) {
        //escalate the call to a higher rank
        call.rank = rank + 1;
        callHandler.dispatchCall(call);
        free = true;
        callHandler.getNextCall(this);
    }
}

class Fresher extends Employee {

    public Fresher() {
        super(0);
    }
}

class TechLead extends Employee {

    public TechLead() {
        super(1);
    }
}

class ProductManager extends Employee {

    public ProductManager() {
        super(2);
    }
}
