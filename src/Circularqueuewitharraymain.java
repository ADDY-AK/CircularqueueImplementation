public class Circularqueuewitharraymain {
  public static void main(String[] args) {
    Circularqueuewitharray obj = new Circularqueuewitharray(5);
    System.out.println(obj.isQueueEmpty());
    System.out.println(obj.isQueueFull());
    obj.enQueue(10);
    obj.enQueue(20);
    obj.enQueue(30);
    obj.enQueue(40);
    obj.enQueue(50);
    obj.enQueue(60);
    //obj.enQueue(70);
    //obj.enQueue(80);

    System.out.println(obj.isQueueFull());
   obj.deQueue();
   //obj.enQueue(70);
   //obj.deQueue();
   obj.enQueue(70);
   //obj.deQueue();
   //obj.deQueue();
   //obj.deQueue();


  }
}
