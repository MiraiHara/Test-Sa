public class kmap{

    //log in
    private String Username;
    private String userid;
    private String password;

    public void setUsername(String Username){
        this.Username = Username;
    }

    public String getuserid(){
        return this.Username;
    }

    public void setpassword(String password){
        this.password = password;
    }
    public String getpassword(){
        return this.password;
    }
    //student
    private String Year;
    private String Faculty;
    private String Department;
    private String EmailAddress;

    public String getYear(){
        return this.Year;
    }
    public String getFaculty(){
        return this.Faculty;
    }
    public String getDepartment(){
        return this.Department;
    }
    public void setYear(String Year){
        this.Year = Year;
    }
    public void setFaculty(String Faculty){
        this.Faculty = Faculty;
    }
    public void setDepartment(String Department){
        this.Department = Department;
    }
    public void setEmailAddress(String EmailAddress){
        this.EmailAddress =EmailAddress;
    }
    //personal
    private String Name;
    public String getName(){
        return this.Name;
    }
    public String getEmailAddress(){
        return this.EmailAddress;
    }
}
