package ma.org.licence.spring_boot_demo1.api.model;

public class User {

    //Attributes
    private int id;
    private String name;
    private int age;
    private String email;
    private String pwd;


    //Constructors

    public User(int id, String name, int age, String email, String pwd) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.pwd = pwd;
    }


    //Getters & Setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
