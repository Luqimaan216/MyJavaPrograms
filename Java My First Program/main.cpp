#include <iostream>

using namespace std;
string name;
string age;
string* locationOfName;

int num1 = 10;
int num2 = 20;

int AddUp(int* a, int* b);

int main()
{
    /*
    cout << "Halo Reach!" << endl;
    cout << "What is Your Name?" << endl;
    cin >> name;
    cout << "How old are you?" << endl;
    cin >> age;
    cout << name << ", You are an " << age <<  " year old" << endl;

    cout << "Location of name is " << &name << endl;
    locationOfName = &name;
    cout << "locationOfName contains " << locationOfName << endl;
    cout << "Contents of location is " << *locationOfName << endl;
    locationOfName++;
    cout << "locationOfName contains " << locationOfName << endl;

    cout << "Location of name is " << &name << endl;
    cout << "locationOfName contains " << locationOfName << endl;
    cout << "locationOfName location contents " << *locationOfName << endl;
    cout << "location is stored at " << &locationOfName << endl;
    */
    cout << AddUp(&num1, &num2) << endl;
    return 0;

}
int AddUp(int* a, int* b){
cout << "a is " << *a << " and b is " << *b << endl;
return *a + *b;
}
