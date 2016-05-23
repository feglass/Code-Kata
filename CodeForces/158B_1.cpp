#include <iostream>
#include <vector>
using std::cout; using std::cin; using std::endl; using std::vector;

int main() {
	int num;
	int groupMem[4] = {0};
	cin >> num;
	int p, carNum = 0;
	for (int i = 0; i < num; i++) {
		cin >> p;
		groupMem[p-1]++;
	}
	
	//4
	carNum += groupMem[3];
	
	//2
	carNum += groupMem[1]/2;
	groupMem[1] = groupMem[1]%2;
	
	//3
	if (groupMem[2] <= groupMem[0]) 
		groupMem[0] = groupMem[0] - groupMem[2];
	else groupMem[0] = 0;
	carNum += groupMem[2];
	
	//2 + 1
	if (groupMem[1] == 0)
		if (groupMem[0]%4 == 0)
			carNum += groupMem[0]/4;
		else carNum += (groupMem[0]/4 + 1);
	else {
		if (groupMem[0] <= 2) {
			carNum += 1;
		} else {
			carNum += 1;
			groupMem[0] -= 2;
			if (groupMem[0]%4 == 0)
				carNum += groupMem[0]/4;
			else carNum += (groupMem[0]/4 + 1);
			
		}
	}
		

	cout << "\n" << carNum << endl;
	
	return 0;
	
}
