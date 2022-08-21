#include <bits/stdc++.h> 
using namespace std; 
int main() 
{  

 int t; 
 cin>>t; 
for (int f = 0; f < t; f++) 
 { 
cout<<"Case #"<<f+1<<":"<<" "; 
 int n; 
 long long num=0;
 long long count=0;
cin>>n; int akk[n]; int jrr[n]; 
int arr1[n];
for (int i = 0; i < n; i++) cin>>akk[i]; 
 for (int i = 0; i < n; i++) jrr[i]=akk[i]; 
 sort(jrr,jrr+n); 
 for (int i = 0; i < n; ++i) 
 { auto ykk=upper_bound(jrr,jrr+n,akk[i]*2)-jrr;
 count++;
 ykk--; 
 if(jrr[ykk]==akk[i]) ykk--;if(ykk>=0) cout<<jrr[ykk]<<" "; 
else cout<<"-1"<<" "; 
 } 
 cout<<endl; 

 } 

 return 0; 
}
