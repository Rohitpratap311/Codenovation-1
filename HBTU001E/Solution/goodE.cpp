#include <bits/stdc++.h>

using namespace std;

string to_string(string s) {
 return '"' + s + '"';
}

string to_string(const char* ch) {
 return to_string((string)ch);
}

string to_string(char ch) {
 return (string)"'" + ch + (string)"'";
}

string to_string(bool b) {
 return (b ? "true" : "false");
}

template<class A, class B>
string to_string(pair<A, B> p) {
 return "(" + to_string(p.first) + ", " + to_string(p.second) + ")";
}

template<class A>
string to_string(A a) {
 string res = "{";
 bool first = true;
 for(const auto& x: a) {
  if(first == false) res += ", ";
  first = false;
  res += to_string(x);
 }
 res += "}";
 return res;
}

void debug() {cerr << "]\n";}

template<class H, class... T>
void debug(H head, T... tail) {
 cerr << to_string(head) << " ";
 debug(tail...);
}

#ifdef LOCAL
 #define debug(...) cerr << "[" << #__VA_ARGS__ << " ] = ["; debug(__VA_ARGS__);
#else 
 #define debug(...) 
#endif

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
  cin >> a[0];
  for (int i = 1; i < n; i++) {
   cin >> a[i];
   a[i] += a[i - 1];
  }
  for (int i = 1; i < n; i++) {
   if (a[i] <= a[i - 1]) {
    debug (i, a[i], a[i - 1]);
   }
   assert (a[i] > a[i - 1]);
  }
  for (int i = 0; i < m; i++) {
   int64_t M;
   cin >> M;
   cout << upper_bound (a.begin(), a.end(), M) - a.begin() << ' ';
  }
  cout << '\n';
 }
 return 0;
}