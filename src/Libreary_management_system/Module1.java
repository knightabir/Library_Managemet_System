package Libreary_management_system;

public class Module1 {
    String name, fname,unit_id,uid;
    int sem;

    public void setData(String name,String fname,String uni_id,String uid,int sem){
        this.name = name;
        this.fname = fname;
        this.unit_id= uni_id;
        this.uid = uid;
        this.sem = sem;
    }

    public void getData(){
        System.out.println("Student name: "+name);
        System.out.println("Student father name: "+fname);
        System.out.println("University id: "+unit_id);
        System.out.println("User id: "+uid);
        System.out.println("Semester: "+sem);
    }
}
