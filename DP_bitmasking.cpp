  #include<bits/stdc++.h>
  using namespace std;
  #define IOS ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
  #define endl "\n"
  #define double long double
  #define max(a,b) (a>b?a:b)
  #define min(a,b) (a<b?a:b)
  #define int long long
  #define mp make_pair
  #define pb push_back
  const int MOD=1e9+7;
  
  const int INF = 65536;


  //Number of ways of distribution of chocolates to the kids, according to their likes
  //DP+bitmasking
  //Limit of N is 22

  int32_t main(){
    #ifndef ONLINE_JUDGE
       freopen("in.txt","r",stdin);
       freopen("out.txt","w",stdout);
    #endif
       IOS
       int n;
       cin>>n;
       bool like[n][n];
       for (int i = 0; i < n; ++i)
       {
        for (int j = 0; j < n; ++j)
        {
          cin>>like[i][j];
        }
       }
       //Top-down DP ?
       int N = 1<<n;
       int dp[N];
       memset(dp,0,sizeof(dp));
       dp[N-1] = 1; //1 way to distribute all candies to all kids

       //we need N-1 1s, thats assigned, so now start mask from N-2
       for(int mask = N-2;mask>=0;mask--)
       {
         int k = __builtin_popcount(mask);
         for (int i = 0; i < n; ++i)
         {
         if(like[k][i] and ((mask>>i)&1)==0)
          dp[mask] += dp[mask | (1<<i)];  
         }
         
       }
       cout<<dp[0]; //sum of all the ways from which 11111 end state was reached accumulates in dp[0]
       return 0;
     }


