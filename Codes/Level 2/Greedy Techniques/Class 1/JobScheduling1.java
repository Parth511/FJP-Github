// { Driver Code Starts
    import java.io.*;
    import java.util.*;
    
    class Job {
        int id, profit, deadline;
        Job(int x, int y, int z){
            this.id = x;
            this.deadline = y;
            this.profit = z; 
        }
    }
    
    class GfG {
        public static void main(String[] args) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            //testcases
            int t = Integer.parseInt(br.readLine().trim());
            while(t-->0){
                String inputLine[] = br.readLine().trim().split(" ");
                
                //size of array
                int n = Integer.parseInt(inputLine[0]);
                Job[] arr = new Job[n];
                inputLine = br.readLine().trim().split(" ");
                
                //adding id, deadline, profit
                for(int i=0, k=0; i<n; i++){
                    arr[i] = new Job(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
                }
                
                Solution ob = new Solution();
                
                //function call
                int[] res = ob.JobScheduling(arr, n);
                System.out.println (res[0] + " " + res[1]);
            }
        }
    }// } Driver Code Ends
    
    
    class Solution
    {
        public static class MyComparator implements Comparator<Job>{
            public int compare(Job obj1, Job obj2){
                if(obj1.profit != obj2.profit)
                    return obj2.profit - obj1.profit;
                return obj1.deadline - obj1.deadline;
            }
        }
        //Function to find the maximum profit and the number of jobs done.
        int[] JobScheduling(Job arr[], int n)
        {
            // Your code here
            Arrays.sort(arr, new MyComparator());
            int maxDeadline = arr[0].deadline;
            for(int i=0; i<n; i++)
                maxDeadline = Math.max(arr[i].deadline, maxDeadline);
            
            int maxProfit = 0, jobsAllocated = 0;
            boolean[] slots = new boolean[maxDeadline];
            
            for(int i=0; i<n; i++){
                for(int j = arr[i].deadline - 1; j>=0; j--){
                    if(slots[j] == false){
                        slots[j] = true;
                        maxProfit += arr[i].profit;
                        jobsAllocated++;
                        break;
                    }
                }
            }
            
            return new int[]{jobsAllocated, maxProfit};
        }
    }