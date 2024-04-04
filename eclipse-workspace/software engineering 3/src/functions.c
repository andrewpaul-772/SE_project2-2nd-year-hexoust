#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "functions.h"


void menu(struct Person* List, char file[]){
	int choice; // variable to hold the users input choice
	do {

			printf("What would you like to do?\n");
			fflush(stdout);

			printf("1 - Display a Board\n");
			fflush(stdout);

			printf("2 - Load a Board from a File\n");
			fflush(stdout);

			printf("3 - Edit a List\n");
			fflush(stdout);

			printf("4 - Edit a Board\n");
			fflush(stdout);

			printf("5 - Save a Board to a File\n");
			fflush(stdout);

			printf("6 - Quit\n");
			fflush(stdout);

			printf("\nEnter your Choice => ");
			fflush(stdout);

			// error handling for if user enters a non-integer
			if (scanf("%d", &choice) != 1) {
				// clear the input buffer if non-integer input is entered
				while (getchar() != '\n');
				choice = 0; // set choice to an invalid value so the user can re-enter
			}

			// error handling for if user enters incorrect number
			if (choice < 1 || choice > 6) {
				printf("\nInvalid choice! Please try again.\n\n");
				fflush(stdout);
			}

		} while (choice < 1 || choice > 6);

		switch (choice)
		{
			case 1:
				displayFile(List, file);
				menu(List, file);
				break;
				// display the board
			case 2:
				strcpy( file , loadNewFile());
				menu(List, file);
				break;
				// load the board
			case 3:
				// edit the list
			case 4:
				// edit the board
			case 5:
				// save board to a file
			case 6:
				break; // quit program
}
}

struct Person* readFile(char myFile[]){
	 FILE* fp;

	    // Initialize the linked list
	    Person* startPerson;
	    Person* currentPerson;
	    Item* currentItem ;



	    // Open the file for reading
	    fp = fopen(myFile , "r");
	    if (fp == NULL) {
	        printf("Error opening file\n");
	        return NULL;
	    }

	    startPerson = malloc(sizeof(Person));
	    startPerson->first_item = malloc(sizeof(Item));
	    startPerson->previous = NULL;



	    if(startPerson != NULL){
	    	fgets(startPerson->name, sizeof(startPerson->name), fp);
		    currentItem = startPerson->first_item;
	    }

	    while(fgets(currentItem->name, sizeof(currentItem->name), fp) != NULL){
	    	if(currentItem->name[strlen(currentItem->name)- 3] == ':'){
	    		startPerson->next = malloc(sizeof(Person));
	    		currentPerson = startPerson->next;
	    		currentPerson->previous = startPerson;
	    		goto out;
	    	}
	    	else{
	    		currentItem->previous = NULL;
	    		currentItem->next = malloc(sizeof(Item));
	    		currentItem->next->previous = currentItem;
	    		currentItem = currentItem->next;
	    	}
	    }
	    out:
		fgets(currentPerson->name, sizeof(currentPerson->name), fp);
		currentPerson->first_item = malloc(sizeof(Item));
	    currentItem = currentPerson->first_item;
	    while(fgets(currentItem->name, sizeof(currentItem->name), fp) != NULL){
	    	if(currentItem->name[strlen(currentItem->name)- 3] == ':'){
	    		currentPerson->next = malloc(sizeof(Person));
	    		currentPerson->next->previous = currentPerson;
	    		currentPerson = currentPerson->next;
	    	    strcpy(currentPerson->name, currentItem->name);
	    	    currentItem->previous->next = NULL;
	    	    currentPerson->first_item = malloc(sizeof(Item));
	    	    currentItem = currentPerson->first_item;
	    	}
	    	else{
	    		currentItem->next = malloc(sizeof(Item));
	    		currentItem->next->previous = currentItem;
	    		currentItem = currentItem->next;
	    	}
	    }

	    // Close the file
	    fclose(fp);

	    return startPerson;
}

char* loadNewFile(){
	static char newFile[30];
	printf("enter new file name:\n");
	fflush(stdout);
	scanf("%s", newFile);
	if (fopen(newFile , "r") == NULL) {
		printf("Error opening file\n");
		return NULL;
		    }
	else{
		return &newFile[0];
	}
}


void displayFile(struct Person* List, char file[]){
	struct Item* item;
	while(List != NULL){
		printf("%s", List->name);
		fflush(stdout);
		item = List->first_item;
		while(item != NULL){
			printf("%s", item->name);
			fflush(stdout);
			item = item->next;
		}
		List = List->next;
	}
	printf("\n\n");
}

