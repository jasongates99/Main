import java.util.*;

public class Blackjack {
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);
        P1Random rng = new P1Random();
        int gameNum = 1;
        int playerHand;
        int dealerHand;
        int optionChoice;
        int totPlayerWins = 0;
        int totDealerWins = 0;
        int numTies = 0;
        int totGamesPlayed = 0;
        int randomPlayerCard;
        double percentPlayerWins;
        boolean showMenu = true;


        System.out.println("START GAME #" + gameNum);
        randomPlayerCard = rng.nextInt(13) + 1;


        System.out.println("\nYour card is a " + randomPlayerCard + "!");
        System.out.println("Your hand is: " + randomPlayerCard);

        playerHand = randomPlayerCard;

        while (showMenu) {

            System.out.println("\n1. Get another card");
            System.out.println("2. Hold hand");
            System.out.println("3. Print statistics");
            System.out.println("4. Exit");
            System.out.print("\nChoose an option: ");
            optionChoice = inputScanner.nextInt();

            if (optionChoice == 1) {

                randomPlayerCard = rng.nextInt(13) + 1;
                System.out.print("\nYour card is a ");


                if (randomPlayerCard == 1) {

                    System.out.print("ACE!");
                } else if (randomPlayerCard == 11) {

                    System.out.print("JACK!");
                    randomPlayerCard = 10;
                } else if (randomPlayerCard == 12) {

                    System.out.print("QUEEN!");
                    randomPlayerCard = 10;
                } else if (randomPlayerCard == 13) {

                    System.out.print("KING!");
                    randomPlayerCard = 10;
                } else {
                    System.out.print(randomPlayerCard + "!");
                }

                playerHand = randomPlayerCard + playerHand;
                System.out.println("\nYour hand is: " + playerHand);

                if(playerHand > 21) {
                    System.out.println("\nYou exceeded 21! You lose.");

                        totDealerWins = totDealerWins + 1;
                        //totGamesPlayed = totGamesPlayed + totDealerWins;


                   // playerHand = 0;
                    gameNum = gameNum + 1;
                    System.out.println("\nSTART GAME #" + gameNum);

                    randomPlayerCard = rng.nextInt(13) + 1;
                    System.out.print("\nYour card is a " + randomPlayerCard + "!");
                    if (randomPlayerCard == 1) {
                        System.out.println("ACE!");
                    } else if (randomPlayerCard == 11) {

                        randomPlayerCard = 10;
                        System.out.print("JACK!");
                    } else if (randomPlayerCard == 12) {

                       randomPlayerCard = 10;
                        System.out.print("QUEEN!");
                    } else if (randomPlayerCard == 13) {

                        randomPlayerCard = 10;
                        System.out.print("KING!");

                    }
                    playerHand = 0;
                    playerHand = randomPlayerCard + playerHand;
                    System.out.println("\nYour hand is: " + playerHand);

                }

                if (playerHand == 21) {
                    System.out.println("\nBLACKJACK! You win!");
                    totPlayerWins++;
                    totGamesPlayed = totGamesPlayed + totPlayerWins;

                    playerHand = 0;
                    gameNum = gameNum + 1;
                    System.out.println("\nSTART GAME #" + gameNum);

                    randomPlayerCard = rng.nextInt(13) + 1;
                    System.out.println("\nYour card is a " + randomPlayerCard + "!");
                    playerHand = 0;
                    playerHand = randomPlayerCard + playerHand;
                    System.out.println("Your hand is: " + playerHand);


                    if (randomPlayerCard == 1) {
                        System.out.print("ACE!");
                    } else if (randomPlayerCard == 11) {

                        //randomPlayerCard = 10;
                        System.out.print("JACK!");
                    } else if (randomPlayerCard == 12) {

                        //randomPlayerCard = 10;
                        System.out.print("QUEEN!");
                    } else if (randomPlayerCard == 13) {

                        //randomPlayerCard = 10;
                        System.out.print("KING!");

                    }

                }



            } else if (optionChoice == 2) {

                dealerHand = rng.nextInt(11) + 16;
                System.out.println("\nDealer's hand: " + dealerHand);
                System.out.println("Your hand is: " + playerHand);


                if (dealerHand > 21) {
                    System.out.println("\nYou win!");
                    totPlayerWins = totPlayerWins+1;
                }

                else if (dealerHand == playerHand){
                    System.out.println("\nIt's a tie! No one wins!");
                    numTies = numTies + 1;
                    totGamesPlayed = totGamesPlayed + numTies;
                }
//                if (dealerHand == playerHand) {
//                    numTies = numTies + 1;
//                    totGamesPlayed = totGamesPlayed + numTies;
//                }

                else //(dealerHand == 21)
                     {
                    System.out.println("\nDealer wins!");
                    totDealerWins = totDealerWins + 1;
                }
//                if (dealerHand == 21) {
//                    totDealerWins = totDealerWins + 1;
//                    totGamesPlayed = totGamesPlayed + 1;
//                }


            gameNum = gameNum + 1;
            System.out.println("\nSTART GAME #" + gameNum);

            randomPlayerCard = rng.nextInt(13) + 1;
            System.out.print("\nYour card is a ");

            if (randomPlayerCard == 1) {
                System.out.print("ACE!");
            } else if (randomPlayerCard == 11) {

                randomPlayerCard = 10;
                System.out.print("JACK!");
            } else if (randomPlayerCard == 12) {

                randomPlayerCard = 10;
                System.out.print("QUEEN!");
            } else if (randomPlayerCard == 13) {

                randomPlayerCard = 10;
                System.out.print("KING!");

            } else {
                System.out.print(randomPlayerCard + "!");
            }

            playerHand = 0;
            playerHand = randomPlayerCard + playerHand;
            System.out.println("\nYour hand is: " + playerHand);

        }

              else if (optionChoice == 3) {
                System.out.println("\nNumber of Player wins: " + totPlayerWins);
                System.out.println("Number of Dealer wins: " + totDealerWins);
                System.out.println("Number of tie games: " + numTies);
                totGamesPlayed = totDealerWins + totPlayerWins + numTies;
                System.out.println("Total # of games played is: " + totGamesPlayed);
                percentPlayerWins = ((double)totPlayerWins/totGamesPlayed)*100;
                System.out.println("Percentage of Player wins: " + percentPlayerWins + "%");
            } else if (optionChoice == 4) {
                showMenu = false;
            } else {
                System.out.println("\nInvalid input!");
                System.out.println("Please enter an integer value between 1 and 4.");
            }
            }


        }


    }



