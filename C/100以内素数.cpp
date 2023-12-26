#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n, sum, day = 0, i;
    cin>>n;
    for (i = 1; n > day; i++) {
        day = i * (i + 1) / 2;
    }
    sum = i * (i - 1) * (2 * i - 1) / 6;
    sum -= (i - 1) * (day - n);
    cout<<sum;
    return 0;
}
