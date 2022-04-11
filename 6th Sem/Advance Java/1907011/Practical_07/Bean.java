import java.io.Serializable;

public class Bean implements Serializable{
    private String name;
    private int rollNo;

    Bean(){
        super();
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getRoll(){
        return this.rollNo;
    }

    public void setRoll(int rollNo){
        this.rollNo = rollNo;
    }

    public static void main(String[] args){
        Bean bean = new Bean();
        bean.setName("Pratyay Dhond");
        bean.setRoll(1907011);

        System.out.println("Name    : " + bean.getName());
        System.out.println("Roll No : " + bean.getRoll());

    }
}