#include <iostream>
using std::cout; using std::cin; using std::endl;

int main() {
	int proNum;
	int p = 0, v = 0, t = 0;
	int resultNum = 0;
	cin >> proNum;
	for(int i = 0; i < proNum; i++) {
		cin >> p >> v >> t;
		if ((p + v + t) >= 2)
			resultNum++;
	}
	cout << resultNum << endl;
	
	return 0;
	
}
