#include <time.h>
#include <iostream>

using namespace std;

int main(void)
{
	clock_t startTime = clock();

	// �ð� ������ ���� �ڵ�

	clock_t endTime = clock();

	cout << "Time: " << (double)((endTime - startTime) / CLOCKS_PER_SEC) << "s(" << endTime - startTime << "ms)" << "\n";

	return 0;
}