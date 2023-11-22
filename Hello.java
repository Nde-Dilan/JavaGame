/*
 * The purpose of this project is to create a text-based role-playing game in the terminal.
•	The game features two players: you and an enemy.
•	Both of you start with 50 hit points.
•	Your character has 3 potions that allow you to recover hit points. The enemy has no potions. Each potion allows you to recover a random number of hit points, ranging from 9 to 20.
•	Your attack inflicts random damage on the enemy, between 5 and 10 hit points.
•	The enemy's attack inflicts random damage on you, between 5 and 15 hit points.
•	When you use a potion, you skip the next turn.
Gameplay:
When you launch the script, you should ask the user whether they want to attack (1) or use a potion (2):
"Do you want to attack (1) or use a potion (2)?"
This sentence will be asked to the user at the beginning of each turn. If the user chooses the first option (1), you inflict damage on the enemy. This damage will range from 5 to 10 hit points and will be randomly determined by the program. If option (2) is chosen, the player receives a certain number of hit points, between 9 and 20, and their turn is skipped.

 */

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

// Untracked(Unstaged) -> Staged -> Committed

// git add -> git commit -> git push
// 0011

// A JDK is a software package that contains libraries, tools for developing and
// testing Java applications (development tools), and tools for running
// applications on the Java platform (Java Runtime Environment — JRE).

/*
 * git pull origin main -> is to pull the latest changes from the remote
 * repository
 * git pull origin main --allow-unrelated-histories -> is to pull the latest
 * changes from the remote repository if the first one shows an error(refusing
 * to merge unrelated histories)
 * Maybe you will need to accept the changes inside VScode
 * git add -A -> is to add all the files to the staging area
 * git commit -m "Fixing conflicts"
 * git push -u origin main -> is to push the latest changes to the remote
 * repository
 * Now you are done.
 */