// ConsoleApplication8.cpp : Ten plik zawiera funkcję „main”. W nim rozpoczyna się i kończy wykonywanie programu.
//

#include "pch.h"
#include <iostream>
#include <Windows.h>

int main()
{
	using namespace std;
    cout << "Hello World!\n"; 
	int n = 0;

	int test = 1;

	do {

		cout << "To open a file type a number (1-2)\n";
		cout << "\t 1. users.txt\n";
		cout << "\t 2. books.txt\n" << endl;

		cin >> n;

		system("cls");

		cout << "Trying to open a file";
		for (int i = 0; i < 10; i++) {
			Sleep(100);
			cout << ".";
		}
		cout << endl << endl;


		if (n == 1) {
			system("users.txt");
			test = 0;
		}
		else if (n == 2) {
			system("books.txt");
			test = 0;
		}
		else {
			cout << "Wrong number" << endl;
			system("pause");
			system("cls");
			test = 1;
		}
	} while (test == 1);

	return 0;
}
