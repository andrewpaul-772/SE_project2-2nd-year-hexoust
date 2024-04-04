
// Struct for an item
typedef struct Item {
    char name[50]; // Name of the item
    struct Item* next; // Pointer to the next item
    struct Item* previous; //pointer to previous argument
} Item;

// Struct for a person
typedef struct Person {
    char name[50]; // Name of the person
    Item* first_item; // Pointer to the first item in the list
    struct Person* next; // Pointer to the next person
    struct Person* previous; //pointer to previous person
} Person;

void menu(struct Person* List, char file[]);
struct Person* readFile(char myFile[]); //done
void displayFile(struct Person* List, char file[]); //done
char* loadNewFile();
void editList();
void editBoardMenu();
void editItem();
void addItem();
void deleteItem();
void saveBoard();
