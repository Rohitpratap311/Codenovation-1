//#Rohitpratap311
//Keep_Calm_And_Stay_Happy

#include<bits/stdc++.h> 
using namespace std;

int main() 
{ 
	srand(time(NULL));
	long long MAX=1e9-1;  
	int x=100000;
	cout<<x<<endl;
	while(x--)
	{
	    int n=(rand() % MAX)+1;
        cout<<n<<" ";
	}
	return(0); 
} 
