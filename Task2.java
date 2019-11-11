class Task2{
    public static  char demo(char[]c,char ch){
for(int i=0;i<c.length;i++){
    if(c[i]==ch){
        return c[i];
    }
}
return 'a';
    }

}
class Main{
    public static void main(String [] args){
        char ch[]={'A','B','C','D'};
        char c='B';
        System.out.println(Task2.demo(ch,c));n
    }
}