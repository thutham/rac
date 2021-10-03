package QuanLyNhanVien;

public class NhanVien {
    private String Id;
    private String role;
    private double salary;
    private double phucap;
    private float dayoff;


    public NhanVien() {
        Id = Id;
        this.role = role;
        this.salary = salary;
        this.phucap = phucap;
        this.dayoff = dayoff;
    }

    public void setId(String id) {
        Id = id;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setPhucap(double phucap) {
        this.phucap = phucap;
    }
    public void setDayoff(float dayoff) {
        this.dayoff = dayoff;
    }

    public String getId() {
        return Id;
    }

    public String getRole() {
        return role;
    }

    public double getSalary() {
        return salary;
    }

    public double getPhucap() {
        return phucap;
    }

    public float getDayoff() {
        return dayoff;
    }
    // tong luong
    public void salaryofMonth(double doanhthu){
        double salaryofMonth;
        if ( role == "Intern"){
            salaryofMonth = salary + phucap;
        }
        else if ( role == "IT "){
            salaryofMonth = salary*(26-dayoff) + phucap;
        }
        else if (role=="Sale"){
            salaryofMonth = salary*1/100*doanhthu + phucap;
        }
        else{
            salaryofMonth = salary*(26-dayoff);
        }
    }
}
