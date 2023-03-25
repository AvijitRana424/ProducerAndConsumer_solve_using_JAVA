
class Company{

     int item;
     boolean flag = false;
     //false -> producer execute
     //true -> consumer Execute
     synchronized public void produce_item(int item) throws Exception 
      {
         if(flag)
         {
           wait();
         }
         this.item = item;
         System.out.println("Produce Item: "+this.item);
         flag = true;
         notify();
        }

     synchronized public int consume_item() throws Exception
     {
       if(!flag)
       {
          wait();
       }
       System.out.println("Consumed Item: "+this.item);
       flag = false;
       notify();
       return this.item;
     }


}