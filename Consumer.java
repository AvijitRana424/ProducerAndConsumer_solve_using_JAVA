//consumer
class Consumer extends Thread{

   Company c;
   Consumer(Company c)
  {
     this.c = c;
  }
  public void run()
  {
    while(true)
    {
      this.c.consume_item();
      try{
          Thread.sleep(1000);
        }catch(Exception e){};
    }
  }


}