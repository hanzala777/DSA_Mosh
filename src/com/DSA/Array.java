package com.DSA;
public class Array{
    private int[] items;
    private int count;
    public Array(int size){
        items=new int[size];
    }
    public void print(){
        for(int i=0;i< items.length;i++){
            System.out.println(items[i]);
        }
    }
    public void insert(int item){
        //If the array is full resize it
        if(items.length==count){
            //create a new array(Twice the size)
            int[] newItems=new int[count*2];
            //copy all the existing items
            for(int i=0;i<count;i++){
                newItems[i]=items[i];
            }
            //Set "items" to this new array
            items=newItems;
        }
        //Add the new item at the end
        items[count++]=item;
        /*
        the above line is similar to :
            items[count]=item;
            count++;
        */
    }
    public void removeAt(int index){
            //Validate the index
        int[] newItems = new int[items.length - 1];
        //Shift the items to the left to fill the hole
        for (int i = 0, k = 0; i < items.length; i++) {
            if (i == index) {
                continue;
            }
            newItems[k++]=items[i];
        }
        items=newItems;
    }
}
