#include <bits/stdc++.h>
using namespace std;

string printRandomString(int n)
{
    char alphabet[4] = {'N','S','E','W'};
    string res = "";
    for (int i = 0; i < n; i++)
        res = res + alphabet[rand() % 4];

    return res;
}

int main()
{

   srand(time(NULL));
   int t = rand()%1000;
   cout<<t<<endl;
   while(t--)
   {
       int x = rand()%1000;
       int y = rand()%1000;
       int n = (rand()%100)+1 ;
       cout<<x<<" "<<y<<endl;
       cout << printRandomString(n);
       cout<<endl;
   }
   return 0;
}