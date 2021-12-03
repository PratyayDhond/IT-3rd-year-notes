
#include<stdio.h>
int main()
{
    int no_of_frames, no_of_pages, frames[10], pages[30], temp[10], hit_miss_flag = 0,flag1, flag2, flag3, i, j, k, pos, max, faults = 0;
    int isfault = 0, ishit = 0;
	printf("Enter number of frames: ");
    scanf("%d", &no_of_frames);
    
    printf("Enter number of pages: ");
    scanf("%d", &no_of_pages);
    
    printf("Enter page reference string: ");
    
    for(i = 0; i < no_of_pages; ++i){
        scanf("%d", &pages[i]);
    }
    
    for(i = 0; i < no_of_frames; ++i){
        frames[i] = -1;
    }
    
    for(i = 0; i < no_of_pages; ++i){
    	isfault = 0;
        flag1 = flag2 = 0;
        
        for(j = 0; j < no_of_frames; ++j){
            if(frames[j] == pages[i]){
                   flag1 = flag2 = 1;
                   break;
               }
        }
        
        if(flag1 == 0){
            for(j = 0; j < no_of_frames; ++j){
                if(frames[j] == -1){
                    faults++;
                    isfault = 1;
                    frames[j] = pages[i];
                    flag2 = 1;
                    break;
                }
            }    
        }
        
        if(flag2 == 0){
         flag3 =0;
        
            for(j = 0; j < no_of_frames; ++j){
             temp[j] = -1;
            
             for(k = i + 1; k < no_of_pages; ++k){
             if(frames[j] == pages[k]){
             temp[j] = k;
             break;
             }
             }
            }
            
            for(j = 0; j < no_of_frames; ++j){
             if(temp[j] == -1){
             pos = j;
             flag3 = 1;
             break;
             }
            }
            
            if(flag3 ==0){
             max = temp[0];
             pos = 0;
            
             for(j = 1; j < no_of_frames; ++j){
             if(temp[j] > max){
             max = temp[j];
             pos = j;
             }
             }            
            }
frames[pos] = pages[i];
faults++;
        }
        
        printf("\n");
        int prevFrames[no_of_frames];
        int hit_miss_flag[no_of_frames] ;
        int sum = 0;
        for(j = 0; j < no_of_frames; ++j){
        
        	if(frames[j] == -1)
        	printf("\t ");
        	else
            printf("\t%d", frames[j]);
            
        }
       
    }
    
    printf("\n\nTotal Page Faults = %d", faults);
    printf("\nTotal Page Hits   = %d", no_of_pages-faults);
    printf("\nPage fault ratio  = %0.2f%%",faults/(float)no_of_pages * 100);
    printf("\nPage Hit ratio    = %0.2f%%",(no_of_pages-faults)/(float)no_of_pages * 100);
    
    return 0;
}

