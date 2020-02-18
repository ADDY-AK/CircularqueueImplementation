public class Circularqueuewitharray {
  int[] arr;
  int top;
  int size;
  int beginning;

// Queue Creation

  public Circularqueuewitharray(int size) {
    arr= new int[size];
    top = -1;
    beginning = -1;

  }
  public boolean isQueueEmpty() {
    if (beginning == -1)
      return true;
    else
      return false;
  }//end of method

  public boolean isQueueFull() {
//    if (top+1 == beginning) { //If we have completed a circle, then we can say that Queue is full
//      return true;
//    }else
   if ((beginning==0) && (top+1 == arr.length)) { //Trivial case of Queue being full
      return true;
    }else {
      return false;
    }
  }//end of method

  public void enQueue(int value) {
    if (isQueueFull()) {
      System.out.println("\nQueue overflow error!!");
    }else {
      if(beginning ==-1)
      {
        beginning = 0;
      }
      if (top+1 == arr.length) { //if top is already at last cell of array, then reset it to first cell
        top=0;
      }else {
        top++;
      }
      arr[top] = value;
      System.out.println("\nSuccessfully inserted "+value+" in the queue");
    }
  }//end of method
  public void deQueue() {
    if (isQueueEmpty()) {
      System.out.println("Queue underflow error!!");
    } else {
      System.out.println("Dequeued: " + arr[beginning] + " from queue");
      arr[beginning]= 0;
      if (beginning == top) { //if there is only 1 element in Queue
        beginning = top = -1;
      } else if (beginning + 1 == arr.length) { //if start has reached end of array, then start again from 0
        beginning = 0;
      } else {
        beginning++;
      }
    }

  }}

