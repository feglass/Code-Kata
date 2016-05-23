#include <iostream>
using std::cout; using std::cin; using std::endl;

int main() {
	int num;
	char statement[3];
	int finalVal = 0;
	cin >> num;
	for (int i = 0; i < num; i++) {
		cin >> statement[0] >> statement[1] >> statement[2];
		if (statement[0] == '-') {
			finalVal--;
		} else if(statement[0] == '+') {
			finalVal++;
		} else if(statement[0] == 'X') {
			if (statement[1] == '+')
				finalVal++;
			else finalVal--;
		}
	}
	cout << finalVal << endl;
	
	return 0;
	
}
