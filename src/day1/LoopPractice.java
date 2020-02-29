package day1;

/**
 *C:\Users\Owner\IdeaProjects\GitPracticeFall2019>git status
 * On branch master
 * Your branch is up to date with 'origin/master'.
 *
 *Changes to be committed:
 *   (use "git restore --staged <file>..." to unstage)
 *         new file:   src/day1/LoopPractice.java
 *
 * Git shows you difference with last commit
 * How to send this file to github?\
 * same steps:
 * git add .                                    |prepare all new files for commit
 * git commit -m "Added loop prctice file"      |commit (take a snapshot of the project)
 * git push                                     |
 *
 */
public class LoopPractice {

    public static void main(String[] args) {
        // some random code
        for(int i = 0; i<10; i+=2){
            System.out.println("Counter :: " + i);
            System.out.println("#######");
        }

    }
}
