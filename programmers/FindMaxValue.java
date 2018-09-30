static boolean com(int a, int b){
      

      String a1 = Integer.toString(a);
      String a2 = Integer.toString(b);
      
      int b1 = Integer.parseInt(a1+a2);
      int b2 = Integer.parseInt(a2+a1);

      if(b1>b2){
         return true;
      }else
         return false;
   }
   
static void swap(int[] a,int idx1,int idx2){
      
      int t = a[idx1]; a[idx1]=a[idx2]; a[idx2]=t;
   }
   
   static void quickSort(int [] a, int left, int right){
      
      Stack lstack = new Stack();
      Stack rstack = new Stack();
      
      lstack.push(left);
      rstack.push(right);
      
      while(lstack.isEmpty() != true){
         
         int pl = left = (int) lstack.pop();
         int pr = right= (int) rstack.pop();
         int x = a[(pl+pr)/2];
         
         
         do{
            while(com(a[pl],x))pl++;
            while(com(x,a[pr]))pr--;
            if(pl<=pr)
               swap(a,pl++,pr--);
            
         }while(pl<=pr);
         
         if(pr-left>=right-pl){
            if(left<pr) {
               lstack.push(left);
               rstack.push(pr);
            }
            if(pl<right){
               lstack.push(pl);
               rstack.push(right);
            }
            
         }else{
            if(pl<right){
               lstack.push(pl);
               rstack.push(right);
            }
            
            if(left<pr) {
               lstack.push(left);
               rstack.push(pr);
            }
         }
      }
   }
