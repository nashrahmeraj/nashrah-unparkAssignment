import Car.Car;

public class parking {
String state ;
    private final Car car;
    public parking(Car car) {
        this.car=car;
    }
    public void park(){
        this.state="parked";
    }

    public String unpark() {
        if (this.state == "unparked") return "already unparked";
        this.state = "unparked";
        return null;
    }

    public String IsParkedOrNot() {
        if("parked"== this.state)
            return "parked";
        else return "unparked";
    }
}




