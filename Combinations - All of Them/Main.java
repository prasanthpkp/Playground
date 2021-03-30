#include<iostream>
using namespace std;

#define SIZE 10

void print_comb(int a[], int n , int selected[],int visited_count){
    if(visited_count==n){
        for(int i=0;i<n;i++){
            if(selected[i]==1){
                cout << a[i]<<",";
            }
        }
        cout<<endl;
        return;
    }
    selected[visited_count]=1;
    print_comb(a,n,selected,visited_count+1);
    selected[visited_count]=0;
    print_comb(a,n,selected,visited_count+1);
    
}

void comb_wrap(int a[],int n){
    int selected[SIZE]={};
    int visited_count=0;
    print_comb(a,n,selected,visited_count);
}

int main()
{
  int arr[SIZE],n,i;
  cin>>n;
  
  for(i=0;i<n;i++){
      cin>>arr[i];
  }
  
  comb_wrap(arr,n);
  return 0;
}