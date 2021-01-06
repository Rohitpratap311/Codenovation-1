#include <bits/stdc++.h>

using namespace std;

template<class X, class Y>
X bpow(X a , Y b, int P) {
 X res(1);
 while(b) {
  if(b % 2 == 1) (res *= a) %= P;
  (a *= a) %= P;
  b /= 2;
 }
 return res;
}

int main() 
{
 ios_base::sync_with_stdio(0);
 cin.tie(0);
 const int P = static_cast <int> (1e9 + 7);
 string s;
 cin >> s;
 int n = static_cast <int> (s.size());
 int64_t ans = 0;
 int64_t pre_sum = 0;
 for (int i = 0; i < n - 1; i++) {
  (pre_sum *= 10) %= P;
  (pre_sum += int (s[i] - '0')) %= P;
  int N = n - 1 - i - 1;
  if (N < 0) continue;
  (ans += (pre_sum % P) * ((bpow<int64_t, int64_t> (10, N + 1, P) - 1) % P * bpow<int64_t, int64_t> (9, P - 2, P) % P)) %= P;
 }
 int64_t suf_sum = 0;
 for (int i = n - 1; i >= 1; i--) {
  (suf_sum += (static_cast<int> (s[i] - '0') * bpow<int64_t, int64_t> (10, n - i - 1, P) % P)) %= P; 
  (ans += suf_sum % P * (i)) %= P; 
 }
 cout << ans << '\n';
 return 0;
}