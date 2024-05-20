   #include <stdio.h>

    int main(){

        int count;
        int groupwords = 0;
        
        scanf("%d",&count);

        for(int i = 0; i < count; i++){
            bool groupword = true;
            int alphabet[26] = {0};
            char word[101];
            char align[101] = {0};

            scanf("%s",word);

            int k = 0;

            for (int j = 0; word[j] != '\0'; j++) {
            if (word[j] != word[j + 1]) {
                align[k] = word[j];
                k++;
                }
            }

            for(int k = 0; align[k]; k++){
                alphabet[align[k]-97]++;
            }

            for(int k = 0; k < 26; k++){
                if(alphabet[k] > 1){
                    groupword = false;
                    break;
                }
            }

            if(groupword == true)
                groupwords++;
        }

        printf("%d",groupwords);

        return 0;
    }