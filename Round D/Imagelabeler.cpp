#include <bits/stdc++.h>
using namespace std;
void img() 
{ 
    
    long long t;
    cin >> t;
    long long count1;
    for ( int tk = 1 ; tk <= t ; tk++ ) 
    {
        int n, m;
        int o;
        cin >> n >> m;
        vector<int> arr(n), vk;
        vector<int> hg;
        for(int i = 0; i < n; i++)
        {
            cin >> arr[i];
            }
            int arr1[n];
            long double num = 0.0;
            double jh=0.0;
            sort(arr.begin(), arr.end());
            reverse(arr.begin(),arr.end());
            
            for(int i = 0; i < m - 1; i++)
            {
                num += arr[i];
            }
                int i = m - 1;
                while(i < n){
                    vk.push_back(arr[i]);
                    ++i;
                    count1++;
                    }
                    long long fd;
                    int k = vk.size();
                    if(vk.size() % 2)
                    {
                    num = num + vk[k / 2];
                    }
                    else 
                    {
                    num = num+ ((double)(vk[k / 2] + (double)vk[k / 2 - 1]) / 2);
                    }
                    cout << "Case #" << tk << ": ";
                    cout << fixed << setprecision(6) << num << endl;
                    }
    
}
int main() 
{
    img();
    }
