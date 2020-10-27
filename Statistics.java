
public class Statistics {
    private int count;
    private int sum;
    
    public Statistics() {
        // initialize the variable numberCount here
        this.count = 0; 
        this.sum = 0;
    }

    public void addNumber(int number) {
       this.count++;
       this.sum += number;
    }
    

    public int getCount() {
        // write code here
        return this.count;
    }
    
     public int sum() {
        return this.sum;
    }
     
     public double average() {
         if (this.count != 0) {
            return this.sum / (double) this.count;
        }
        return 0;
     }
}