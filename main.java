public class main{
    public static void main(String args[]){
        kmap km = new kmap();   
        km.setUsername("buar");
        km.setpassword("123456");
        km.setYear("2565");
        km.setFaculty("science");
        km.setDepartment("computer science");
        km.setEmailAddress("64050000@kmitl.ac.th");

        //login
        System.out.println( "-----login-----");
        System.out.println( "userid  = "+km.getuserid());
        System.out.println( "username = "+ km.getuserid());
        System.out.println( "password = "+ km.getpassword());

        //student
        System.out.println( "-----Student-----");
        System.out.println( "Year = "+ km.getYear());
        System.out.println( "Faculty = "+ km.getFaculty());
        System.out.println( "Department = "+ km.getDepartment());
        System.out.println( "Email = "+ km.getEmailAddress());

        //personal
        System.out.println( "-----Personal-----");
        System.out.println( "Name = "+ km.getuserid());
        System.out.println( "Email = "+ km.getEmailAddress());
    }
}
