import java.util.*;

class Data {
    int val;
    int count;
    int pos;
    
    Data(int val, int count, int pos) {
        this.val = val;
        this.count = count;
        this.pos = pos;
    }
    
    @Override
    public String toString() {
        return "Value: " + val + ", Count: " + count + ", Position: " + pos;
    }
}

class Sort implements Comparator<Data>{
	public int compare(Data o1, Data o2) {
		
		if(o1.count > o2.count) {
			return -1;
		}
		else if(o1.count < o2.count) {
			return 1;
		}
		else {
			if(o1.pos < o2.pos) {
				return -1;
			}
			else {
				return 1;
			}
		}
	
	}
}
public class FrequencySortWithComparator{
    ArrayList<Data> list = new ArrayList<Data>();

   boolean findPos(int val) {
	   for(int i=0;i<list.size();i++) {
		   if(list.get(i).val == val) {
			   list.get(i).count++;
			   return false;
		   }
	   }
	   return true;
   }
   
    
    public static void main(String[] args) {
        FrequencySortWithComparator f = new FrequencySortWithComparator();
        //int[] arr = {5, 2, 3, 3, 1, 4, 4, 4, 6, 2};
		int arr[] = {-1,4,3,3,1,5,-1021033,101,101,22,3,1010101,500,500,2,3,3,1,4,1000,770,4,4,6,2};

        for (int i = 0; i < arr.length; i++) {
            Data d = new Data(arr[i], 1, i);
            boolean b = f.findPos(arr[i]);
            if(b)
            {
            	f.list.add(d);
            }            
        }
        Collections.sort(f.list, new Sort());
        
        
        for(int i=0;i<f.list.size();i++) {
        	int count = f.list.get(i).count;
        	if( count > 1) {
        		while(count-- > 0) {
        			System.out.print(f.list.get(i).val + " ");
        		}
        	}
        	else {
    			System.out.print(f.list.get(i).val + " ");
        	}
        }
       
        
    }

	
}
