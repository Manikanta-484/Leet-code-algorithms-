//Implementing 3 Stacks in one Array

public class ThreeInOne {
  private int numberOfStacks = 3;
  private int stackCapacity;
  private int[] values;
  private int[] sizes;

  public ThreeInOne(int stackSize) {
    this.stackCapacity=stackSize;
    values=new int[stackSize*numberOfStacks];//9
    sizes=new int[numberOfStacks];//3
  }

  // isFull
  public boolean isFull(int stackNum) {
    return sizes[stackNum]==stackCapacity;
  }

  // isEmpty
  public boolean isEmpty(int stackNum) {
      return sizes[stackNum]==0;
  }

  // indexOfTop - this is helper method for push, pop and peek methods

  private int indexOfTop(int stackNum) {
    int offset=stackNum*stackCapacity;//offset returns the starting index of the stacknum
    int size=sizes[stackNum];    // it returns the size of the given stacknum
    return offset+size-1;  
  }

  // push
  public void push(int stackNum, int value) {
    if(isFull(stackNum)){
     System.out.println("stack is full");
    }else{
        values[indexOfTop(stackNum)]=value;
        sizes[stackNum]++;  
    }
  }

  // pop
  public int pop(int stackNum) {
    if(isEmpty(stackNum)){
        System.out.println("stack is empty");
        return-1;
    }else{
        int topIndex=indexOfTop(stackNum);
        int value=values[topIndex];
        values[topIndex]=0;
        sizes[stackNum]--;
        return value;
    }
  }

  // peek

  public int peek(int stackNum) {
      if(isEmpty(stackNum)){
          System.out.println("stack is empty");
          return -1;
      }
      int topIndex=indexOfTop(stackNum);
      return values[topIndex];
  }

}
