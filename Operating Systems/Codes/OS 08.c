#include<stdio.h>
 
int MRU(int time[], int n,int pages[], int cur){
    int i, minimum = time[0], pos = 0;
 	int flag = 0;
 	for(int i = 0; i < n; i++){
 		//if the frame[i] is equal to last page, return index of page to be replaced
 		if(time[i] == pages[cur-1]){
 			pos = i;
		 }
	 }
 	
    
    return pos;
}
 
int main()
{
    int no_of_frames, no_of_pages, frames[10], pages[30], counter = 0, time[10], flag1, flag2, i, j, pos, faults = 0;
    printf("Enter number of frames: ");
    scanf("%d", &no_of_frames);
    int hit;
    printf("Enter number of pages: ");
    scanf("%d", &no_of_pages);
    
    printf("Enter reference string: ");
    
    for(i = 0; i < no_of_pages; ++i){
        scanf("%d", &pages[i]);
    }
    
    for(i = 0; i < no_of_frames; ++i){
        frames[i] = -1;
    }
    
    printf("\n");
    for(i = 0; i < no_of_frames; i++)
    	printf("F%d\t",i+1);
    
    for(i = 0; i < no_of_pages; ++i){
    	hit = 1;
        flag1 = flag2 = 0;
        
        for(j = 0; j < no_of_frames; ++j){
            if(frames[j] == pages[i]){
                counter++;
                time[j] = counter;
                   flag1 = flag2 = 1;
                   break;
               }
        }
        
        if(flag1 == 0){
            for(j = 0; j < no_of_frames; ++j){
                if(frames[j] == -1){
                    counter++;
                    faults++;
                    frames[j] = pages[i];
                    time[j] = counter;
                    flag2 = 1;
                    hit = 0;
					break;
                    
                }
            }    
        }
        
        if(flag2 == 0){
            pos = MRU(frames, no_of_frames,pages,i);
            counter++;
            faults++;
            hit = 0;
            frames[pos] = pages[i];
            time[pos] = counter;
        }
        
        printf("\n");
        
        for(j = 0; j < no_of_frames; ++j){
        	if(frames[j] == -1)
        	printf(" \t");
        	else
            printf("%d\t", frames[j]);
        }
        printf("%s\t",hit == 0 ? " Page Fault" : " Page Hit");
    }
    
    printf("\n\nTotal Page Faults = %d", faults);
      printf("\nTotal Page Hits   = %d", no_of_pages - faults);
      printf("\nPage Fault ratio  = %.2f%%",faults/(float)no_of_pages * 100);
      printf("\nPage Hit ratio    = %.2f%%",(no_of_pages - faults)/(float)no_of_pages * 100);
    return 0;
}

/*

4
20
7 0 1 2 0 3 0 4 2 3 0 3 2 1 2 0 1 7 0 1 

*/
