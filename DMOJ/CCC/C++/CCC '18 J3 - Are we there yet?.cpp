// Source: https://usaco.guide/general/io

#include <bits/stdc++.h>
using namespace std;

int main() {
	int a = 0, b, c, d, e; cin >> b >> c >> d >> e;
    cout << a << ' ' << a + b << ' ' << b + c << ' ' << b + c + d << ' ' << b + c + d + e << '\n';
    cout << a + b << ' ' << a << ' ' << c << ' ' << c + d  <<' ' << c + d + e << '\n';
    cout << b + c << ' ' << c << ' ' << a << ' ' << d << ' ' << d + e << ' ' << '\n';
    cout << b + c + d << ' ' << c + d << ' ' << d << ' ' << a << ' ' << e << '\n';
    cout << b + c + d + e << ' ' << c + d + e << ' ' << d + e << ' ' << e << ' ' << a << '\n';
}
