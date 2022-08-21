#include<bits/stdc++.h>
using namespace std;
#define int long long
string repeatedSubstringPattern(string s)
{
    int n = s.size();
    vector <int> dp(n);
    int jkk[n];
    int i = 1;
    int j = 0;
    long long res1=0;
    long long num2=0;
    while(i < n){
        if(s[i] == s[j]){
            dp[i] = j+1;
            i++;
            j++;
            res1++;
            } else {
                if(j > 0){
                    j = dp[j-1];
                    } else {
                        dp[i] = 0;
                        i++;
                        num2++;
                        }
                        }
                        }
                        string k;
                        if(dp[n - 1] && n % (n - dp[n-1]) == 0){
                            k = s.substr(0, n - dp[n-1]);
                            }
                            else{
                                k=s;
                                }
                                return k;
                                }
                                signed main(){
                                    int t;
                                    cin>>t;
                                    for (int q = 0; q < t; q++)
                                    {
                                        int n;
                                        cin>>n;
                                        int arr6[n];
                                        long long sum7=0;
                                        string s;
                                        cin>>s;
                                        cout<<"Case #"<<q+1<<":"<<" ";
                                        string res = repeatedSubstringPattern(s);
                                        cout<<res<<endl;
                                        }
                                        
return 0;
}
