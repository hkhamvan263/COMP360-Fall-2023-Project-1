#include <iostream>
#include <fstream>
#include <string>
using namespace std;

//check if character is one of these operators
bool isOperator(char c) {
    return  (c == '-' || c == '/' || c == '+' || c == '*' || c == '>' || c == '<' || c == '=');
}
// Function to check if a string is a keyword
//keywords typically found in C++
bool isKeyword(const string& word) {
    return (word == "int" || word == "float" || word == "void" || word == "if" || word == "try"||
        word == "else" || word == "while" || word == "return" || word == "do" || word == "switch" || word == "continue"
        || word == "double" || word == "break" || word == "typedef" || word == "long" || word == "short" || word == "case" || word=="char");
}

// Function to check if a string is a valid identifier
bool isValidIdentifier(const string& word) {
    if (!word.empty() || isalpha(word[0])) {
        return false;
    }
    for (char c : word) {
        if (!isalnum(c) && c != '_') {
            return false;
        }
    }
    return true;
}


// Function to perform lexical analysis and print tokens
void analysis(const string& input) {
    string lexeme = "";
    bool token = false;


    //loop to print tokens into category and make sure spaces wontg be counted as token
    for (char c : input) {
        if (isspace(c)) {
            if (token) {
                if (isKeyword(lexeme)) {
                    cout << "Keyword: " << lexeme << endl;
                }
                else if (isValidIdentifier(lexeme)) {
                    cout << "Identifier: " << lexeme << endl;
                }
                else if (isOperator(lexeme[0])) {
                    cout << "Operator: " << lexeme[0] << endl;
                }
                else {
                    cout << "Invalid: " << lexeme << endl;
                }

                lexeme.clear();
                token = false;
            }
        }
        else {
            lexeme += c;
            token = true;
        }
    }

//any of the tokens found will be printed in its proper category
    if (token) {
        if (isKeyword(lexeme)) {
            cout << "Keyword: " << lexeme << endl;
        }
        else if (isValidIdentifier(lexeme)) {
            cout << "Identifier: " << lexeme << endl;
        }
        else if (isOperator(lexeme[0])) {
            cout << "Operator: " << lexeme[0] << endl;
        }
        else {
            cout << "Invalid: " << lexeme << endl;
        }
    }
}


int main() {
    string input;
    string input2;
    string lexeme = "";
    
    //import try program txt file
    ifstream inputFile("tryInput.txt");
    ifstream inputFile2("tryInput2.txt");

    getline(inputFile, input);
    getline(inputFile2, input2);


    //fail case if file doesnt open
    if (!inputFile && !inputFile2) {
        cout << "ERROR can't open input file." << endl;
       
    }
    //prints tokens to screen
    else {
        cout << "Tokens:" << endl;
        analysis(input);//cout << "Tokens:" << endl;

        cout << "Tokens for second try:" << endl;
        analysis(input2);

        return 0;
    }
}
