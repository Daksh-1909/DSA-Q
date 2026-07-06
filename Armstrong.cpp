#include <iostream>
using namespace std;

int main()
{
    int n, original, digits = 0, sum = 0;
    cout << "Enter a number: ";
    cin >> n;
    original = n;
    int temp = n;
    while (temp != 0)
    {
        digits++;
        temp /= 10;
    }
    temp = n;
    while (temp != 0)
    {
        int digit = temp % 10;
        int power = 1;
        for (int i = 1; i <= digits; i++)
        {
            power *= digit;
        }
        sum += power;
        temp /= 10;
    }

    if (sum == original)
    {
        cout <<"True";
    }
    else
    {
        cout <<"False";
    }

    return 0;
}
