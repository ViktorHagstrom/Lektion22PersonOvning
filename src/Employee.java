public class Employee extends Person {
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    protected String position;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

   protected double salary;


    public double raise(){
        //double nSalary = this.salary*1.1;
        this.salary = this.salary*1.1;

        return salary;
    }

    @Override
    public String toString() {
        return getName() + "\n"
                + getPosition()+ "\n"
                + getAdress() + "\n"
                + getpNumber() + "\n"
                + getSalary() + "\n"
                ;
    }
}
