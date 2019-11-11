class Task{
    public String demo(String name1 [], String name){
for (int i=0;i<name1.length;i++){
    if(name1[i]==name){
        return name1[i];
    }
}
return "exit";
}
}
class Main{
    public static void main(String []args){
        String name[]={"Apple","Banana","Water Mellon","Orange"};
        String name1="Orangeo";
        Task t=new Task();
    System.out.println(    t.demo(name,name1));
    }
}