package day1;

/**
 * Project name : GitPracticeFall2019
 * git local repository and remote repository
 *
 * local--on your computer. We create local repository for specific project.
 * Then, we create remote repository on github. Last step --connect them
 *
 * Any git project starts with one command L
 * git  init( git sapce space init)--this command will create local
 *
 *
 * init- its a shortening for initialize
 * we run this command only once per project , then whats next ?
 * run command git status to see what files can be committed
 *
 * To permanentlyexclude certain files / packages from commit we use .gitignore file
 *
 *
 * anyting that is very specifi you  your computer should be ignored
 * content :
 * .idea
 * *iml
 *
 * * ----- to match any name.
 * close file
 * what does it means " staged?"
 * stating--preparation for commit. Any new file in intellij, will ook red first (untracked)
 *
 * what are the steps to commit the code ?
 *
 * stage changes ( prepare files for commit)
 * git add/path/to the file
 * or , if you want to stage all of them, just put.
 */
public class StringPractice {

    public static void main(String[] args) {

        System.out.println("Hello, world!");

    }
}
