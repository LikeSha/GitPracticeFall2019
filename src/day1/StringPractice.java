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
 * git add .
 * next step, commit it and don't forget about message.
 * git commit -m "my first commit"
 * if you didnt ignore some files/folders, its not too late to fix it.
 * execute following command:
 * for example : git rm --cached .idea
 * and git rm --cached *.iml
 *
 * Once we staged files ,it's time to commit them L
 * git commit -m "commit message'
 * -m - stands for message and will be followed by" message"
 * commit message has to describe changes in a nutshell. At work, I usually was
 * specifying Jira issue number, for example L
 * git commit -m "VYT-4122 User should be able to reset password"
 *
 * If you committed .idea folder- don't worry, it's just a practice. Next time, you
 * will know what to do. We learn from mistakes.
 *
 * Then , we need to create remote repository
 * Repository ---- creates only once
 *
 * This line of code , connects local repository with remote.
 *
 * Local--your computer
 * remote--github
 * git remote add origin https://github.com/LikeSha/GitPracticeFall2019.git
 * Following command should be exectued only once at the beginning.
 * Not before every commit .Only Once. To establish connection
 *
 * Last command to send your code to the github:
 * git push -u origin master
 * If, you are getting popup, that is asking username and password, please enter your github
 * username and password, You should get this popup onl once
 *
 * If you are getting....remote: Invalid username or password.
 * Your credentials are wrong :(
 * if you have entered username and password, password will be INVISIBLE
 * IN UNIX system(Mac OS, Linux) and Windows password is always INVISIBLE
 * Your terminal is asking for password:
 * Enter your password :( any kind of input will be invisble)
 * Its not only about git. Its for any program due to security
 * If you failed first attempt, push again and try to enter username and password
 *
 * summary :
 * git init
 * create .gitignore file and ignore .idea and *.iml. Save and close file
 * git add .
 * git commit -m "first commit"
 * git remote add origin https://github.com/LikeSha/GitPracticeFall2019.git
 * git push -u origin master
 *
 *master------default branch name
 * origin---refers to name of remote branch
 *
 *
 * If everything was successful, further you will need just 3 commands:
 * git add .
 * git commit -m 'commit message"
 * git push
 *
 * only 3 commands. First time , it's always more complicated to setup repository
 * and connect it .
 *
 *
 * If you are getting this error: The current branch master has no upstream branch.
 * Because you have missed last step : git push -u origin master
 *
 * Git allows to track multiple versions of the project at the same time. IT calls branching.
 * Currently ,we have only 1--master. We have to map our master local branch with master
 * remote aka origin master, that is located in github.
 *
 * upstream--
 *
 *
 */
public class StringPractice {

    public static void main(String[] args) {

        System.out.println("Hello, world!");
        String str = "Java is fun!";
        System.out.println(str);

    }
}
