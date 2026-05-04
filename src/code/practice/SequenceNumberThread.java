package code.practice;

public class SequenceNumberThread {
  private int number=1;
  private int limit;

  SequenceNumberThread(int limit){
      this.limit=limit;
  }

  public synchronized void print(int reminder){
      while (number<=limit){
          while (number%3 !=reminder){
              try{
                  wait();
              } catch (InterruptedException e) {
                  throw new RuntimeException(e);
              }
          }
          if(number<=limit){
              System.out.println(Thread.currentThread().getName()+" -> "+number);
              number++;
              notifyAll();
          }
      }

  }
    public static void main(String[] args) {
     SequenceNumberThread printer = new SequenceNumberThread(10);
     Thread t1 = new Thread(() -> printer.print(1), "Thread-1");
     Thread t2 = new Thread(() -> printer.print(2), "Thread-2");
     Thread t3 = new Thread(() -> printer.print(0), "Thread-3");
     t1.start();
     t2.start();
     t3.start();
    }
}
