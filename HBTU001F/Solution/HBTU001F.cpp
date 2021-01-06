//#Rohitpratap311

#include<bits/stdc++.h>
using namespace std;
int ans[1000000+20],n,a[200000+20];
int main()
{
	cin>>n;
	for(int i=1;i<=n;i++) 
	{
		cin>>a[i];
	}
	sort(a+1,a+1+n);
	for(int i=1;i<=n;i++)
	{
		if(a[i]==a[i-1])
		{
			ans[a[i]]=1;
		}
	}
	int res=0;
	vector<int> vec;
	for(int i=1;i<=n;i++)
	{
		if(!ans[a[i]])
		{
			res++;
			vec.push_back(a[i]);
		}
		if(a[i]!=a[i-1])
		{
			for(int j=2*a[i];j<=1000000;j+=a[i])
			{
				ans[j]=1;
			}
		}
	}
	if(res==0)
	{
	    cout<<-1;
	}
	else
	{
	    sort(vec.begin(),vec.end());
	    cout<<res<<endl;
	    for(auto i:vec)
	    {
	        cout<<i<<" ";
	    }
	}
	return 0;
}
