stack<pair<int,int>> st;
    int i=0;
    
    StockSpanner() {
        
    }
    
    int next(int price) {
        
        i++;
        
        while(st.size()!=0 && st.top().first<=price)
        {
            st.pop();
        }       
               
        if(st.size()==0)
        {
            st.push({price,i});   
            return i;
        }    
        else
        {
            int a=st.top().second;
            st.push({price,i});
            return i-a;
        }
             
    }
