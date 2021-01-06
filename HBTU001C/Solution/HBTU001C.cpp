//#Rohitpratap311
//#Keep Calm And Stay Happy 

#include<bits/stdc++.h>  //This header file includes all the header files.
using namespace std;
typedef long long ll;
int main()
{
    ll N,p,q,a,b,c,d,X;
    cin>>N>>p>>q>>a>>b>>c>>d;
    
    ll temp=N;
    ll digits=0;
    while(temp>0)
    {
        digits++;
        temp=temp/10;
    }
    
    ll x=N/pow(10,digits-1); //first digit of N
    ll y=N%10;               //last digit of N
    ll num=(x*10)+y;         //formed number

    if(N%num==0)             //checking if N is gap or not
    {
        X=abs(a-d)+abs(b-c)-p;
    }
    else
    {
        X=abs(a-d)+abs(b-c)+q;
    }
    
    if(X%2==0)               //checking if X is even or not
    {
        cout<<"LUCKY";
    }
    else
    {
        cout<<"UNLUCKY";
    }
    return 0;
}