public class DeckOfCards {


    String[] suits={"Club", "Diamond", "Heart", "Spade"};
    String[] ranks={"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    String[][] deck=new String[4][13];


    /*Main Method*/
    public static void main(String[] args) {
        System.out.println("Welcome to the Game of Cards!!");
        DeckOfCards deckOfCards = new DeckOfCards();
        deckOfCards.shufflingOfCards();
    }
    /* shuffling of cards */
    public  void shufflingOfCards() {


        for (int i=0; i < suits.length; i++) {
            for (int j=0; j < ranks.length; j++) {
                deck[i][j]=suits[i] + ranks[j];

            }


        }
    }


}

