class Solution {
private:
    vector<int> profitCache;
    using Time = pair<int, int>;
    using Profit = int;
    using Job = pair<Time, Profit>;
   
    int maxProfitFrom(int i, vector<Job>& jobs) {
        
        if(i >= jobs.size())
            return 0;
        
        if(profitCache[i] != -1) {
            return profitCache[i];
        }
        
        int mxProfit = 0;
        
        // Take the job[i]
        
        // Find j where job[j].first.first >= job[i].first.second
        int low = i;
        int high = jobs.size();

        while(low + 1 < high) {
            
            int mid = (low + high) >> 1;
            
            if(jobs[mid].first.first >= jobs[i].first.second) {
                high = mid;
            } else {
                low = mid;
            }
            
        }
        
        mxProfit = max(mxProfit, jobs[i].second + maxProfitFrom(high, jobs));
        
        //Don't take the job[i]
        mxProfit = max(mxProfit, maxProfitFrom(i + 1, jobs));
        
        
        return profitCache[i] = mxProfit;
    }
    
public:
    int jobScheduling(vector<int>& startTime, vector<int>& endTime, vector<int>& profit) {
        
        int n = startTime.size();
        vector<Job> jobs(n);
        profitCache = vector<int>(n, -1);
        
        for(int i = 0; i < n; ++i) {
            Time time =  { startTime[i], endTime[i] };
            jobs[i] = { time , profit[i] };
        }
        
        sort(jobs.begin(), jobs.end());
 
        return maxProfitFrom(0, jobs);
        
    }
};
