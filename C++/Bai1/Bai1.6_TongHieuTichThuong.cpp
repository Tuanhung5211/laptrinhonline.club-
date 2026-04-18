#include<iostream>
#include <iomanip>

using namespace std;
int main(){
	long long a,b;
	do{
		cin>>a;
	}while(a<=0);
	
	do{
		cin>>b;
	}while(b>=1e9);
	cout<<a+b<<" ";
	cout<<a-b<<" ";
	cout<<fixed<<a*b<<" ";
	cout<<fixed<<setprecision(2)<<(double)a/b;
}
