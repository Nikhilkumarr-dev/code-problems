import java.util.Arrays;
public class StackArray{
    static class Stack{
        int top;
        int size;
        int arr[];
        Stack(int size){
            this.size=size;
            arr=new int[size];
            top=-1;
        }
        void push(int value){
            if(top==size-1){
                System.out.println("Stack overflow");
            }else{
                arr[++top]=value;//1==5,2==5,3==8
                System.out.println(value + "Value inserted into stack");
            }
        }
        void pop(){
            if(top==-1){
                System.out.println("Stack Underflow");
            }else{
                System.out.println(arr[top]+"stack element poped");
                top--;
            }
        }
        void peek(){
            if(top==-1){
                System.out.println("stack underflow");
            }else{
                System.out.println("the peek value is " + arr[top]);
            }
        }
        void display(){
            if(top==-1){
                System.out.println("The stack is empty");
            }else{
                System.out.println("the elements are ");
                for(int i=0;i<=top;i++){
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
    public static void main(String[] args){
            Stack s = new Stack(3);
            s.push(3);
            s.push(5);
            s.push(8);
            s.push(8);
            s.pop();
            s.peek();
            s.display();
    }
}