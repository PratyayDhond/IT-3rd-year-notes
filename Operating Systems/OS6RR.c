#include<stdio.h>
#define true 1
#define false 0


void CalculateWaitingTime(int size, int burstTime[], int waitingTime[],int timeQuantum){
	int burstTimeRemaining[size];
	for(int i = 0; i < size; i++){
		burstTimeRemaining[i] = burstTime[i];
	}
	
	int time = 0;
	int flag = true;
	while(flag){
		
		int done = true;
		
		for(int i = 0; i < size; i++){
			
			if(burstTimeRemaining[i] > 0){
				done = false;
				
				if(burstTimeRemaining[i] > timeQuantum){
					time += timeQuantum;
					burstTimeRemaining[i] -= timeQuantum;
				}else{
					time = time + burstTimeRemaining[i];
					burstTimeRemaining[i] -= burstTimeRemaining[i]; ///
					waitingTime[i] = time - burstTime[i];
				}
				
			}
			
		}
		
		if(done == true){
			flag = false;				
		}
		
	}
	
}

void CalculateTurnAroundTime(int turnAroundTime[],int waitingTime[], int burstTime[],int size){
	
	for(int i = 0; i <size; i++){
		turnAroundTime[i] = waitingTime[i] + burstTime[i];	
	}
		
}

void println(char ch){
	for(int i = 0; i < 68 ; i++)
		printf("%c",ch);
	printf("\n");
}

void CalculateAverageTime(int process[], int size, int burstTime[], int timeQuantum){
	int waitingTime[size];
	int turnAroundTime[size];
	float totalWaitingTime = 0, totalTurnAroundTime = 0;
	
	CalculateWaitingTime(size,burstTime,waitingTime,timeQuantum);

	CalculateTurnAroundTime(turnAroundTime,waitingTime,burstTime,size);
	
	for(int i = 0; i < size; i++){
		totalWaitingTime += waitingTime[i]; 
	}
	
	for(int i = 0; i < size; i++){
		totalTurnAroundTime += turnAroundTime[i];		
	}
	system("cls");
	printf("\t");
	println('_');
	printf("\t|Process ID\t|Burst Time\t|Waiting Time\t|Turn Around Time |\n");
	for(int i = 0; i < size; i++ ){
		printf("\t|%5d\t\t|%5d\t\t|%5d\t\t|%10d\t  |\n",process[i],burstTime[i],waitingTime[i],turnAroundTime[i]);
	}
	
	
	totalTurnAroundTime = totalTurnAroundTime/(float) size;
	totalWaitingTime = totalWaitingTime/(float) size;
	printf("\n\tTotal Turnaround Time : %.3fms\n",totalTurnAroundTime);
	printf("\tTotal Waiting Time    : %.3fms\n",totalWaitingTime);
}

void input(int arr[], int n, char* name){
	
	for(int i = 0; i<n; i++){
		printf("%s %d : ",name,i+1);
		scanf("%d",&arr[i]);		
	}
	
	
	
}

int main(){
	
	int sizeOfProcess;
	int timeQuantum;
	
	printf("Enter number Of Process : ");
	scanf("%d",&sizeOfProcess);
	int process[sizeOfProcess];
	int burstTime[sizeOfProcess];

	input(process,sizeOfProcess,"Process id (Integer) for process");
//	for(int i = 0; i<sizeOfProcess; i++){
//		printf("%d ",process[i]);
//	}

	input(burstTime,sizeOfProcess,"Burst time (seconds) : ");
//	for(int i = 0; i<sizeOfProcess; i++){
//		printf("%d ",burstTime[i]);
//	}

	printf("Input time quantum (in milliseconds): ");
	scanf("%d",&timeQuantum);
	
	CalculateAverageTime(process,sizeOfProcess,burstTime,timeQuantum);
	return 0;

	return 0;
}
