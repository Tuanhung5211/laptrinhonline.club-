#include<iostream>

using namespace std;

int main(){
	long long n; // Dung long long vi int khong du 
	do{
		cin>>n;
	}while(n>=1e9||n<=0);
	//Khong dung for vi so qua lon thi se chay cham
	long long s=(n*(n+1))/2;
	cout<<s;
}
