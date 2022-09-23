package javapracticing;

public class Persona {
    String name;
    boolean happy = true;
    public void changeName(String myName){
        name = myName;
        System.out.println("> Successful name change, your character's name: " + name);
    }
    public void speak(){
        if (happy == true){
            System.out.println(name + " say: Hi, nice to meet you <3");
        } else if (happy == false) {
             System.out.println(name + " say: Sorry, I'm not ok to talk now :/");
        }
    }
    public void sad(){
        happy = false;
        System.out.println("> Successful state of mind: " + name + " is sad now");
    }
    public void happy(){
        happy = true;
        System.out.println("> Successful state of mind: " + name + " is happy now");
    }
}
