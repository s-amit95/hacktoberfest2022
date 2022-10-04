#include<bits/stdc++.h>
using namespace std;
int solve(string s, int k)
{
    unordered_map<char, int>map;
  int answer = 0;
  int distinct =0;
  int release =0;

  for(int i = 0; i<s.size(); i++){
    char currentchar = s[i];

    if(map.find(currentchar) != map.end())
        map[currentchar] += 1;

    else{
        distinct += 1;
        map[currentchar] = 1;
    }
    while(release <=i && distinct>k){
        char distinctchar = s[release];
        map[distinctchar] -= 1;
        release +=1;

        if(map[distinctchar] == 0){
            map.erase(distinctchar);
            distinct -= 1;
        }
    }
    answer += (i-release+1);
  }
  return answer;
}

int main()
{
    string s;
    cin>>s;
    int n;
    cin>>n;
    cout<<solve(s,n);
    
}
