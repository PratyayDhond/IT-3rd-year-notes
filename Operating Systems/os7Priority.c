#include<stdio.h>
#define true 1
#define false 0


struct variables{
	int n;
	int priority[100];
	int burst_time[100];
	int turn_around_time[100];
	int waiting_time[100];
	struct Total{
		float waiting_time;
		float turn_around_time;
	}total;
	struct Average{
		float waiting_time;
		float turn_around_time;
	}average;
	
}data;

void getValues(){
	for(int i = 0; i < data.n; i++){
		printf("Enter burst time for process %d : ",i+1);
		scanf("%d",&data.burst_time[i]);
		printf("Enter priority for process %d : ",i+1);
		scanf("%d",&data.priority[i]);
	}
}

void priorityScheduling(){
	int time = 0;
	int priority[data.n];
	for(int i = 0; i <data.n; i++)
		priority[i] = data.priority[i];
	int done = false;
	int arr[data.n];

		int highest_priority = 99999;	
		for(int i = 0; i < data.n; i++){
			int high = 100000;
			for(int j = 0; j < data.n; j++){
				printf("\npriority j : %d\n",priority[j]);
				if(priority[j] < high){
					arr[i] = j;
				}
			}
			priority[arr[i]] = 100001;
		}
		
//		for(int i = 0; i <data.n; i++){
//			printf("  %d  ",data.priority[arr[i]]);
//		}

		data.total.turn_around_time = 0;
		data.total.waiting_time = 0;
		for(int i = 0; i < data.n; i++){
			int n = arr[i];
			time += data.burst_time[n];
//			printf("\n%d",time);
			data.waiting_time[n] = time - data.burst_time[n];
			data.turn_around_time[n] = time;
			data.total.turn_around_time +=  data.turn_around_time[n];
			data.total.waiting_time += data.waiting_time[n];
		}

//		for(int i = 0; i < data.n; i++ ){
//			
//			if(priority[i] < highest_priority && priority[i] != -1){
//				priority[i] = 100000;
//				index = i;		
//				done = false;	
//				printf("\npriority selected\n");
//				printf("%d",data.priority[i]);	
//			}
//						
//		}
		
		
//		if(index != -1){
//		printf("\n\nindex : %d\n\n",index);
//			
//		time += data.burst_time[index];
////		printf("\n\n%d\n\n",time);
//		data.waiting_time[index] = time - data.burst_time[index];
//		data.turn_around_time[index] = data.waiting_time[index] + data.burst_time[index];
//		data.total.turn_around_time += data.turn_around_time[index];
//		data.total.waiting_time += data.waiting_time[index];
//		done = false;		
//		}
		
	
	data.average.turn_around_time = data.total.turn_around_time/(float)data.n;
	data.average.waiting_time = data.total.waiting_time/ (float) data.n;
	printf("\n\n\n%d / %f\n\n\n",data.total.waiting_time,(float)data.n);
		
}

void display(){
	
	for(int i = 0; i < data.n; i++){
		printf("%d ",data.waiting_time[i]);
	}
	
	printf("\n\n%f\n",data.average.turn_around_time);
	printf("%f\n",data.average.waiting_time);
}

int main(){
	printf("Enter number of processes (upto 100) : ");
	scanf("%d",&data.n);
	getValues();
	priorityScheduling();
	display();

}