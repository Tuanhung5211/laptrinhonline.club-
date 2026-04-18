#include<iostream>

using namespace std;
int main(){
	long long a;
	do{
		cin>>a;
	}while(a<=-10e8||a>=10e8);
	
	cout<<a*a;
}
