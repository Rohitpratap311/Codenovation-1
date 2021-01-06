#include<bits/stdc++.h>
using namespace std;

//#Rohitpratap311
//#Keep Calm And Stay Happy

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int x,y;
        cin>>x>>y;
        string s;
        cin>>s;
        int a=0,b=0;
        for(auto i:s)
        {
            if(i=='N') a++;
            if(i=='S') a--;
            if(i=='E') b++;
            if(i=='W') b--;
        }
        double displacement=sqrt(pow(a,2)+pow(b,2));
        int distance=s.size();
        double ans=(double)distance-displacement;
        cout<<fixed<<setprecision(6)<<ans<<endl;
    }
    return 0;
}