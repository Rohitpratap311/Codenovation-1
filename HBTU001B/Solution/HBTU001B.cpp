//#Rohitpratap311
//#Keep Calm And Stay Happy 

#include<bits/stdc++.h>  //This header file includes all the header files.
using namespace std;

typedef long long ll;    

int main()
{
    int t;
    cin>>t;             //TestCases
    while(t--)
    {
        ll N,P,X;
        cin>>N>>P>>X;
        ll arr[N];
        for(ll i=0;i<N;i++)
        {
            cin>>arr[i];
        }
        ll curr=0;
        string ans="YES";
        for(ll i=0;i<N;i++)
        {
            if(arr[i]-curr>X)
            {
                if(P>0)
                {
                    P=P--;
                }
                else
                {
                    ans="NO";
                }
            }
            curr=arr[i];
        }
        cout<<ans<<endl;
    }
    return 0;
}