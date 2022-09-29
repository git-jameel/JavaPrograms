// A simple C++ program to count number of
// substrings starting and ending with 1
#include <iostream>

using namespace std;

int countSubStr(char str[])
{
	int res = 0; // Initialize result

	// Pick a starting point
	for (int i = 0; str[i] != '\0'; i++) {
		if (str[i] == '1') {
			// Search for all possible ending point
			for (int j = i + 1; str[j] != '\0'; j++)
				if (str[j] == '1')
					res++;
		}
	}
	return res;
}

// Driver program to test above function
int main()
{
	char str[] = "00100101";
	cout << countSubStr(str);
	return 0;
}
