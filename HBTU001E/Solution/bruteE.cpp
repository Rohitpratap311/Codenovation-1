#include <bits/stdc++.h>

using namespace std;

int main() 
{
 ios_base::sync_with_stdio(0);
 cin.tie(0);
 int t;
 cin >> t;
 while (t--) {
  int n, m;
  cin >> n >> m;
  vector<int64_t> a (n);
  for (int i = 0; i < n; i++) cin >> a[i];
  for (int i = 0; i < m; i++) {
   int64_t sum;
   cin >> sum;
   int ans = -1;
   int64_t cur_sum = 0;
   for (int j = 0; j < n; j++) {
    cur_sum += a[j];
    if (cur_sum > sum) {
     ans = j;
     break;
    }
   }
   if (ans == -1 && cur_sum <= sum) ans = n;
   assert (ans >= 0 && ans <= n);
   cout << ans << ' ';
  }
  cout << '\n';
 }
 return 0;
}