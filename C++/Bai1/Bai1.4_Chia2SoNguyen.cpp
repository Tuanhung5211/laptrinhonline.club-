#include<iostream>
#include <iomanip>

using namespace std;
int main(){
	double a,b;
	do{
		cin>>a;
	}while(a<=0);
	
	do{
		cin>>b;
	}while(b>=1e9);
	
	cout<<fixed<<setprecision(2)<<a/b; 
	// Thêm fixed de tranh bi rut ngan khi so qua lon hoac qua be
	// setpercision de gioi han chu so thap phan thanh 2
}
