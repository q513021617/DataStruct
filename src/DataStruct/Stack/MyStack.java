package DataStruct.Stack;

import java.util.Arrays;

public class MyStack<T> {

    int top;
    T t;
    Object[] objectsArry;
    int length=0;

    public MyStack(int maxsize) {

        this.top = 0;
        this.length=maxsize;
        this.objectsArry=new Object[maxsize];
    }

    public boolean push(T t){



        objectsArry[this.top]=t;
        if (this.length != this.top) {
            this.top++;
        }
        return false;
    }

    public Object pop(){

        if (this.length > 0) {

            this.length--;
        }

        return this.top>0?objectsArry[--top]:this.objectsArry[0];
    }
  public void display(){
    int temnptop=this.top;
      while (temnptop!=0){
          temnptop--;
          System.out.print(objectsArry[temnptop]+" ");
      }

      System.out.println();
  }
//    public int getTop() {
//        return top;
//    }
//
//    public void setTop(int top) {
//        this.top = top;
//    }
//
//    public T[] gettArr() {
//        return tArr;
//    }
//
//    public void settArr(T[] tArr) {
//        this.tArr = tArr;
//    }

    @Override
    public String toString() {
        return "MyStack{" +
                "top=" + top +
                ", data=" + Arrays.toString(objectsArry) +
                '}';
    }
}
