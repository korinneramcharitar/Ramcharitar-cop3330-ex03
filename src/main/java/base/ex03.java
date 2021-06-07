/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Korinne Ramcharitar
 */
package base;
//Quotation marks are often used to denote the start and end of a string. But sometimes we need to print out the quotation marks themselves by using escape characters.
//Create a program that prompts for a quote and an author. Display the quotation and author as shown in the example output
//
//What is the quote? These aren't the droids you're looking for.
//Who said it? Obi-Wan Kenobi
//Obi-Wan Kenobi says, "These aren't the droids you're looking for."

//Use a single output statement to produce this output, using appropriate string-escaping techniques for quotes.
//If your language supports string interpolation or string substitution, don’t use it for this exercise. Use string concatenation instead.


import java.util.Scanner;
public class ex03 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("What is the Quote?");
                String quote = in.nextLine();
        System.out.println("Who said it?");
                String author = in.nextLine();
                System.out.println(author + " says," + "\""+quote+"\"");

    }

}
