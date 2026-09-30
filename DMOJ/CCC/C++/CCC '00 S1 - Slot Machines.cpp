// Source: https://usaco.guide/general/io

#include <bits/stdc++.h>
using namespace std;

int main() {
	int quarters, firstPlays, secondPlays, thirdPlays;
    cin >> quarters >> firstPlays >> secondPlays >> thirdPlays;
    int timesPlayed = 0;
    int firstLeft = 35 - firstPlays, secondLeft = 100 - secondPlays, thirdLeft = 10 - thirdPlays, machine = 1;
    bool running = true;

    while (running) {
        
        if (machine == 1) {
            quarters--;
            firstLeft--;
            timesPlayed++;

            if (firstLeft == 0) {
                quarters += 30;
                firstLeft = 35;
            }

            machine = 2;

        } else if (machine == 2) {
            quarters--;
            secondLeft--;
            timesPlayed++;

            if (secondLeft == 0) {
                quarters += 60;
                secondLeft = 100;
            }

            machine = 3;

        } else if (machine == 3) {
            quarters--;
            thirdLeft--;
            timesPlayed++;

            if (thirdLeft == 0) {
                quarters += 9;
                thirdLeft = 10;
            }

            machine = 1;
        }

        if (quarters == 0) {
            running = false;
        }
    }

    cout << "Martha plays " << timesPlayed << " times before going broke." << "\n";
}
