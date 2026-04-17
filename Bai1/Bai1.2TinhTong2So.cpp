#include<iostream>

using namespace std;
int main(){
	long long a,b;
	do{
		cin>>a;
	}while(a<=0);
	
	do{
		cin>>b;
	}while(b>=1e18);
	
	cout<<a+b;
}
