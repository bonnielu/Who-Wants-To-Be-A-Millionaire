/*File Name: Lu,Bonnie_WW2BAM.java
 *Create a game show similar to WWTBAM where the user is asked 15 questions
 *Author: Bonnie Lu
 *Date: Oct.9, 2017
 */
import java.util.Scanner; 
import java.util.Random;

class Lu_Bonnie_WW2BAM {
  
  public static void main(String args[])
  {
    
    Scanner myScanner = new Scanner(System.in);
    
    int question = 0;
    String answer = "";
    String name;
    int expert = 0, fifty = 0, poll = 0; //counter-variables 
    String quit;
    int random, random2, random3, random4;
    int wage = 0;
    //Declaring boolean variables to keep track of which question have been asked
    boolean question0selected = false, question1selected = false, question2selected = false, question3selected = false, question4selected = false, question5selected = false, question6selected = false, question7selected = false, question8selected = false;
    boolean question9selected = false, question10selected = false, question11selected = false, question12selected = false, question13selected = false, question14selected = false, question15selected = false, question16selected = false, question17selected = false;
    boolean question18selected = false, question19selected = false, question20selected = false, question21selected = false, question22selected = false, question23selected = false;
    
    //Instructions on how to play the game, and welcoming the user 
    System.out.println ("Hello, welcome to the game Who Wants to Be a Millionaire! You will be asked 15 questions, and you must enter either A,B,C, or D depending on the answer that you think is correct.");
    System.out.println ("If you don't know the answer, don't worry! You have three lifelines that you are able to use: Enter 1 for Ask an expert, 2 for 50/50, and 3 for Poll the audience. Once you use a lifeline, you may not use it again.");
    System.out.println ("There are two safe levels, one at $1000 dollars and one at $200 000");
    System.out.println ("You can quit the game at any time and take the winnings home");
    System.out.println ("Please enter your name.");
    name = myScanner.nextLine();
    System.out.println ("Ready to play? The theme is Harry Potter. Here comes the first question!");
    for (int i = 0; i <15; i++)
    {
      System.out.println ("If you want to quit the game, you can keep your current winnings. To quit, input y.");
      while (i <= 4)
        
      {
        
        question = (int)(Math.random () * 8);
        
        if ((question == 0) && (question0selected == false)) //Using boolean to determine whether or not a question has been asked
        {
          System.out.println ("What are the four houses in Hogwarts?");
          System.out.println ("(A) Huffleclaw, Ravendoor, Gryffindor, Slytherbird  (B) Gryffindor, Ravenclaw, Hufflepuff, Slytherin  (C) Thunderbird, Horned Serpent, Wampus, Pukwudgie (D) District 1, District 2, District 3, District 4");
          question0selected = true;
          break; //Breaks out of while loop and moves on to lifelines
        }
        
        else if ((question == 2) && (question2selected == false))
        {
          System.out.println ("In the new film, Fantastic beasts and Where to Find Them, there are four main protagonists. Who are they?");
          System.out.println ("(A) The Niffler, Pickett the bowtruckle, Fred, and the Thunderbird  (B) Harry Potter, Hermione Granger, Ron Weasley, Albus Potter  (C) Niffler, Theseus Scamander, Gellert Grindelwald, Percival Graves  (D) Newt Scamander, Tina Goldstein, Queenie Goldstein, Jacob Kowalski");
          question2selected = true;
          break;
        }
        else if ((question == 3) && (question3selected == false))
        {
          System.out.println ("Which train station and platform is Harry Potter required to board in the first novel, Harry Potter and the Philosopher’s Stone?");
          System.out.println ("(A) King’s Cross Station, at platform 9 ¾  (B) The London Station, at platform 5  (C) The Ministry of Magic. It is not a platform, rather, a telephone booth  (D) The Three Broomsticks, at platform 10 ¾");
          question3selected = true;
          break;
        }
        else if ((question == 4) && (question4selected == false))
        {
          System.out.println ("Which of the following is not an example of Voldemort’s Horcruxes?");
          System.out.println ("(A) Tom Riddle’s Diary  (B) Helga Hufflepuff’s Cup  (C) The Raven Pendant  (D) Nagini");
          question4selected = true;
          break;
        }
        
        else if ((question == 5) && (question5selected == false))
        {
          System.out.println ("Complete this quote by Hermione Granger. “Just because you have the emotional range of a _______ doesn’t mean we all have.");
          System.out.println ("(A) Robot  (B) Dead mouse  (C) Textbook  (D) Teaspoon");
          question5selected = true;
          break;
        }
        else if ((question == 6) && (question6selected == false))
        {
          System.out.println ("What wand does Harry Potter have in Harry Potter and the Philosopher’s Stone?");
          System.out.println ("(A) 11 inches long, made of holly, and possessing a phoenix feather core  (B) 13 ½ inches long, made of yew, and possessing a phoenix feather core  (C) 10¾, made of vine wood, and possessing a dragon heartstring core  (D) 12 inches,  made of ash wood, and possessing a unicorn tail hair core");
          question6selected = true;  
          break;    
        }
        else if ((question == 7) && (question7selected == false))
        {
          System.out.println ("What type of car is Mr.Weasley’s flying car?");
          System.out.println ("(A) Volkswagon  (B) Ford Anglia  (C) Honda  (D) Audi");
          question7selected = true;
          break;
        }
      } 
      
      //question = (int)(Math.random () * 23); //There are 24 questions in total, numbered 0 to 23. 15 questions will be randomly chosen.
      
      while ((i >= 5) && (i <= 9)) 
      {
        question = (int)(Math.random () * 8) + 16;
        
        if ((question == 16) && (question16selected == false))
        {
          System.out.println ("Who played Lord Voldemort in the movies?");
          System.out.println ("(A) Jeremy Irons  (B) Tom Hiddleston (C) Gary Oldman (D) Ralph Fiennes");
          
          question16selected = true;
          break;
        }
        else if ((question == 17) && (question17selected == false))
        {
          System.out.println ("What does Ron see in the Mirror of Erised?");
          System.out.println ("(A) Himself kissing Hermione  (B) Himself with lots of money (C) Himself with Harry's lightning scar (D) Himself holding the Quidditch cup");
          
          question17selected = true;
          break;
        }
        else if ((question == 18) && (question18selected == false))
        {
          System.out.println ("How many broomsticks are flown in a full game of Quiditch?");
          System.out.println ("(A) 15  (B) 16 (C) 14 (D) 267");
          
          question18selected = true;
          break;
        }
        else if ((question == 19) && (question19selected == false))
        {
          System.out.println ("Of which Hogwarts house is Terry Boot a member?");
          System.out.println ("(A) Gryffindor  (B) Ravenclaw (C) Hufflepuff (D) Slytherin");
          
          question19selected = true;
          break;
        }
        else if ((question == 20) && (question20selected == false))
        {
          System.out.println ("Which Polyjuice Potion ingredients must be acquired at the full moon?");
          System.out.println ("(A) Fluxweed  (B) Knotgrass (C) Newt spleen (D) A bit of whoever you wish to turn into");
          
          question20selected = true;
          break;
        }
        else if ((question == 21) && (question21selected == false))
        {
          System.out.println ("What type of creature is an Ashwinder?");
          System.out.println ("(A) Bird (B) Fish (C) Serpent (D) Dog");
          
          question21selected = true;
          break;
        }
        else if ((question == 22) && (question22selected == false))
        {
          System.out.println ("Which team from the Ministry of Magic is responsible for modifying the memories of Muggles who have been exposed to magic?");
          System.out.println ("(A) Obliviators (B) The Wizengamot (C) Unspeakables (D) Aurors");
          
          question22selected = true;
          break;
        }
        else if ((question == 23) && (question23selected == false))
        {
          System.out.println ("What year was Ollivanders founded?");
          System.out.println ("(A) 712 BC (B) 382 BC (C) 57 BC (D) 465 BC");
          
          question23selected = true;
          break;
        }
      }
      
      while ((i >= 10) && (i <= 15))
      {
        question = (int)(Math.random () * 8) + 8;
        
        if ((question == 8) && (question8selected == false))
        {
          System.out.println ("In Harry Potter and The Philosopher’s Stone, which Gringotts vault was the Philosopher’s Stone kept in?");
          System.out.println ("(A) 276  (B) 592  (C) 713  (D) 766");
          question8selected = true;
          break;
        }
        else if ((question == 9) && (question9selected == false))
        {
          System.out.println ("How does Felix Felicis behave when in the caldron?");
          System.out.println ("(A) It spills over the sides (B) Droplets leap out like goldfish above the surface  (C) It bubbles merrily  (D) Droplets whizz through the air");
          question9selected = true;
          break;
        }
        else if ((question == 10) && (question10selected == false))
        {
          System.out.println ("What is the name of the fountain inside the Ministry of Magic?");
          System.out.println (" (A) Fountain of Fair Fortune  (B) Fountain of Eros  (C) Magic is Might (D) Fountain of Magical Brethren");
          question10selected = true;
          break;
        }
        else if ((question == 11) && (question11selected == false))
        {
          System.out.println ("Which is NOT a password to get into Dumbledore's office?");
          System.out.println ("(A) Liquorice Wand (B) Cockroach Cluster (C) Sherbet Lemon (D)Fizzing Whizzbee");
          question11selected = true;
          break;
        }
        else if ((question == 12) && (question12selected == false))
        {
          System.out.println ("How much do Fred and George Weasley bet on the Quidditch World Cup?");
          System.out.println ("(A) 37 Galleons, 3 Sickles and 3 Knuts (B) 15 Galleons, 39 Sickles and 8 Knuts  (C) 37 galleons, 15 Sickles and 3 Knuts (D) 22 galleons, 5 Sickles and 7 Knuts");
          question12selected = true;
          break;
        }
        else if ((question == 13) && (question13selected == false))
        {
          System.out.println ("How does Harry manage to breathe underwater during the second task of the Triwizard Tournament?");
          System.out.println ("(A) He transfigures into a shark  (B) He kisses a mermaid  (C) He eats Gillyweed  (D) He performs a bubble head charm");
          
          question13selected = true;
          break;
        }    
        else if ((question == 14) && (question14selected == false))
        {
          System.out.println ("What is the name of Fred and George's joke shop?");
          System.out.println ("(A) Weasley Joke Emporium  (B) Weasley's Wizard Wheezes  (C) Fred and George's Wonder Emporium  (D) Zonko's Joke Shop");
          
          question14selected = true;
          break;
        }
        else if ((question == 15) && (question15selected == false))
        {
          System.out.println ("Which of these is NOT one of the Unforgivable Curses?");
          System.out.println ("(A) Cruciatus Curse  (B) Imperius Curse  (C) Sectumsempra  (D) Avada Kedavra");
          
          question15selected = true;
          break;
        }
      }
      
      //Lifelines           
      
      if ((expert != 0) && (poll!= 0) && (fifty != 0)) //Uses if and counter variables to determine if lifeline has been used
      {
        System.out.println ("You have no lifelines left! Sorry.");
      }
      
      if (expert == 0)
      {
        System.out.print (" 1.Ask an expert"); //Outputs ask an expert if the counter variable expert has a value of 0
      } 
      if (fifty == 0)
      {
        System.out.print (" 2.50/50"); //Outputs 50/50 if the counter variable fifty has a value of 0
      }
      if (poll == 0)
      {
        System.out.println (" 3.Poll the audience "); //Outputs Poll the audience if the counter variable poll has a value of 0
      }
      
      answer = myScanner.next();
      
      //Option for user to quit game
      
      if (answer.equals ("y"))
      {
        break;
      }
      
      if (answer.equals ("1")) //Answer that is outputted depends on the question number and the lifline chosen 
      {
        if (expert != 0)
        {
          System.out.println ("Sorry, you have already used this lifeline");
        }
        else if ((question == 0) || (question == 7) || (question == 9) || (question == 14) || (question == 19) || (question == 23))
        {
          System.out.println ("Professor Mcgonagall, a Transfiguration teacher at Hogwarts responds that she is almost certain that the answer is B!");
        }
        else if ((question == 1) || (question == 4) || (question == 8) || (question == 12) || (question == 13) || (question == 15) || (question == 21))
        {
          System.out.println ("Hermione Granger flips through her stack of textbooks, before declaring that the answer is probably C!");
        }
        else if ((question == 2) || (question == 5) || (question == 10) || (question == 16) || (question == 17))
        {
          System.out.println ("Headmaster Dumbledore strokes his beard, before saying that he is almost certain that the answer is D!");
        }
        else if ((question == 3) || (question == 6) || (question == 11) || (question == 18) || (question == 20) || (question == 22))
        {
          System.out.println ("Newt Scamander, a British magizoologist fumbles with his wand before rambling that he is almost certain that the answer is A!");
        }
        expert++; //Adds one to the countervariable 
        System.out.println ("Please enter your final answer");
        answer = myScanner.next();
      }
      else if (answer.equals ("2"))
      {
        if (fifty != 0)
        {
          System.out.println ("Sorry, you have already used this lifeline");
        }
        else if ((question == 0) || (question == 7) || (question == 9) || (question == 14) || (question == 19) || (question == 23))
        {
          System.out.println ("Fred and George have narrowed the answers down. Fred says it is A while George says it is B.");
        }
        else if ((question == 1) || (question == 4) || (question == 8) || (question == 12) || (question == 13) || (question == 15) || (question == 21))
        {
          System.out.println ("Fred and George have narrowed the answers down. Fred argues that it is A while George says it is C.");
        }
        else if ((question == 2) || (question == 5) || (question == 10) || (question == 16) || (question == 17))
        {
          System.out.println ("Fred and George have narrowed the answers down. Fred argues that it is D while George says it is B");
        }
        else if ((question == 3) || (question == 6) || (question == 11) || (question == 18) || (question == 20) || (question == 22))
        {
          System.out.println ("Fred and George have narrowed the answers down. Fred argues that it is A while George says it is B");
        }
        fifty++;
        System.out.println ("Please enter your final answer");
        answer = myScanner.next();
      }
      else if (answer.equals ("3")) 
      {
        if (poll != 0)
        {
          System.out.println ("Sorry, you've already used this lifeline");
        }
        else if ((question == 0) || (question == 7) || (question == 9) || (question == 14) || (question == 19) || (question == 23))
        {
          //Randomizes the percentage outputted, but ensures that the highest percentage will still be the correct answer 
          
          random = (int)(Math.random () *20) + 60;
          random2 = (int)(Math.random ()*10);
          random3 = (int)(Math.random ()*10);
          random4 = 100 - random - random2 -random3 - random3;
          
          System.out.println ("The audience has voted. " + random + "% of the audience believes that the answer is B," + random2 + "% believe that the answer is A," + random3 + "% say that the answer is C, and " + random4 + "% say that it is answer D.");
        }
        else if ((question == 1) || (question == 4) || (question == 8) || (question == 12) || (question == 13) || (question == 15) || (question == 21))
        {
          random = (int)(Math.random () *20) + 60;
          random2 = (int)(Math.random ()*10);
          random3 = (int)(Math.random ()*10);
          random4 = 100 - random - random2 -random3 - random3;
          
          System.out.println ("The audience has voted. " + random + "% of the audience believes that the answer is C," + random2 + "% believe that the answer is A," + random3 + "% say that the answer is B, and " + random4 + "% say that it is answer D.");
        }
        else if ((question == 2) || (question == 5) || (question == 10) || (question == 16) || (question == 17))
        {
          random = (int)(Math.random () *20) + 60;
          random2 = (int)(Math.random ()*10);
          random3 = (int)(Math.random ()*10);
          random4 = 100 - random - random2 -random3 - random3;
          
          System.out.println ("The audience has voted. " + random + "% of the audience believes that the answer is D," + random2 + "% believe that the answer is A," + random3 + "% say that the answer is B, and " + random4 + "% say that it is answer C.");
        }
        else if ((question == 3) || (question == 6) || (question == 11) || (question == 18) || (question == 20) || (question == 22))
        {
          random = (int)(Math.random () *20) + 60;
          random2 = (int)(Math.random ()*10) + 10;
          random3 = (int)(Math.random ()*10) + 10;
          random4 = 100 - random - random2 -random3 - random3;
          
          System.out.println ("The audience has voted. " + random + "% of the audience believes that the answer is A." + random2 + "% believe that the answer is C." + random3 + "% say that the answer is B, and " + random4 + "% say that it is answer D.");
        }
        poll++;
        System.out.println ("Please enter your final answer.");
        answer = myScanner.next();
      }
      else if (!((answer.equals ("1") || (answer.equals ("2")) || (answer.equals ("3")) || (answer.equals ("A")) || (answer.equals ("B")) || (answer.equals ("C")) || (answer.equals ("D")))))
      {
        System.out.println ("Invalid answer.");
      }
      
      //Using a counter variable to keep track of the monetary value for each question
      
      if (i == 0)  
      {
        wage = 100;
      }
      else if (i == 1)
      {
        wage = 200;
      }
      else if (i == 2)
      {
        wage = 500;
      }
      else if (i == 3)
      {
        wage = 1000;
      }
      else if (i == 4)
      {
        wage = 2000;
      }
      else if (i == 5)
      {
        wage = 5000;
      }
      else if (i == 6)
      {
        wage = 10000;
      }
      else if (i == 7)
      {
        wage = 20000;
      }
      else if (i == 8)
      {
        wage = 50000;
      }
      else if (i == 9)
      {
        wage = 100000;
      }
      else if (i == 10)
      {
        wage = 200000;
      }
      else if (i == 11)
      {
        wage = 500000;
      }
      else if (i == 12)
      {
        wage = 600000;
      }
      else if (i == 13)
      {
        wage = 750000;
      }
      else if (i == 14)
      {
        wage = 1000000;
      }
      
      //Comparing user input with the correct answer. 
      
      if ((question == 0) || (question == 7) || (question == 9) || (question == 14) || (question == 19) || (question == 23))
      {
        if (answer.equals ("B"))
        {
          System.out.println ("Congratulations! You got the correct answer!");
          System.out.println ("This question was worth " + wage + " dollars.");
        }
        else //incorrect answers
        {
          if(i<3)
          {
            System.out.println ("Sorry, " + name + " you lost! You didn't win any money. Thanks for playing!");
          } 
          else if ((3 <= i) && (i < 11)) //Safe level once you answer the 1000 dollars question correctly
          {
            System.out.println ("Sorry, " + name + " you lost. However, you do get to take home $1000");
          }
          else if (i >= 11) //Safe level once you answer the 200 000 dollars question correctly
          {
            System.out.println ("Sorry, " + name + " you lost. However, you do get to take home $200 000");
          }
          break;
        }
      }
      else if ((question == 1) || (question == 4) || (question == 8) || (question == 12) || (question == 13) || (question == 15) || (question == 21))
      {
        if (answer.equals ("C")) //Compares it to the correct answer 
        {
          System.out.println ("Congratulations! You got the correct answer!");
          System.out.println ("This question was worth " + wage + " dollars");
        }
        else
        {
          if(i<3)
          {
            System.out.println ("Sorry, " + name + " you lost! You didn't win any money. Thanks for playing!");
          } 
          else if ((3 <= i) && (i < 11))
          {
            System.out.println ("Sorry, " + name + " you lost. However, you do get to take home $1000");
          }
          else if (i >= 11)
          {
            System.out.println ("Sorry, " + name + " you lost. However, you do get to take home $200 000");
          }
          break; //Breaks out of loop if answer is incorrect and ends the game
        }
      }
      else if ((question == 2) || (question == 5) || (question == 10) || (question == 16) || (question == 17))
      {
        if (answer.equals ("D"))
        {
          System.out.println ("Congratulations! You got the correct answer!");
          System.out.println ("This question was worth " + wage + " dollars");
        }
        else 
        {
          if(i<3)
          {
            System.out.println ("Sorry, you lost! You didn't win any money. Thanks for playing!");
          } 
          else if ((3 <= i) && (i < 11))
          {
            System.out.println ("Sorry, " + name + "you lost. However, you do get to take home $1000");
          }
          else if (i >= 11)
          {
            System.out.println ("Sorry," + name + " you lost. However, you do get to take home $200 000");
          }
          break;
        }
      }
      else if ((question == 3) || (question == 6) || (question == 11) || (question == 18) || (question == 20) || (question == 22))
      { 
        if (answer.equals ("A"))
        {
          System.out.println ("Congratulations! You got the correct answer!");
          System.out.println ("This question was worth " + wage + " dollars");
        }
        else 
        {
          if(i<3)
          {
            System.out.println ("Sorry, you lost! You didn't win any money. Thanks for playing!");
          } 
          else if ((3 <= i) && (i < 11))
          {
            System.out.println ("Sorry," + name + " you lost. However, you do get to take home $1000");
          }
          else if (i >= 11)
          {
            System.out.println ("Sorry," + name + " you lost. However, you do get to take home $200 000");
          }
          break;
        }
      }
      else if (wage == 1000000)
      {
        System.out.println ("Congratulations! You are the winner! You won ONE MILLION DOLLARS!"); //When the user wins the program and gets all of the questions right it outputs that
      }
    }
    if (answer.equals ("y"))
    {
      System.out.println ("Congratulations " + name + "! You have won " + wage + " dollars!");
    }
  }
}