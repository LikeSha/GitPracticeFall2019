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
/**
 * Today is February 29, 2020
 * 	Agenda: Git/Github
 * 			1 hour break
 * 			First maven project and introduction to test automation with selenium webdriver.
 * 			Basic navigation: get(url), navigateTo(), close()....
 * #######################################
 * Today we gonna use terminal/powershell a lot. If you are windows user, please use powershell. Just to search and type PowerShell. Any windows has it by default.
 * #don’t worry about git version, as long as you have it you are good to go. If you don’t have a git yet, please download it from official website or use brew(for mac).
 * To check if you have a git, you need to run following command.
 * git --version
 * If you are not getting any errors, you are fine:)
 * git version 2.21.1
 * git - VCS (Version Control System)
 * SCM - Source Code Management
 * You can use git in intellij without even installing it. It’s because intellij has git too. But, even we want to use git via a CLI (Command Line Interface) we need to install it first.
 * What is VSC in action?
 * MyProject --- let’s say it’s your java project
 * public class MyFirstTest{
 * 	public void test1(){
 * 		go to google.com
 * 		get the text
 * 		assert that title is equals to “Google”
 *        }
 * }
 * Once you decide that this is a first version of your project, you can commit changes.
 * commit changes - means take a snapshot of the project at some point.
 * I would say git it’s kind of time machine for your project.
 * The main role of git is to track changes. Why tracking changes is so important?
 * Because, if something will go wrong, we can find what change in the code broke it.
 * version 2:::
 * public class MyFirstTest{
 * 	public void test1(){
 * 		go to google.com
 * 		get the text and print it
 * 		assert that title is equals to “Google”
 *    }
 * 	public void test2(){
 * 		go to facebook.com
 * 		get the text and print it
 * 		assert that title is equals to “Facebook”
 *    }
 * }
 * Once you have completed your test #2, commit this changes, just in case.
 * Git can show you the difference from version to version. When (date, time) what file, what line was added, modified or deleted. And the most important - by whom! Also, why?
 * How you can figure out why? There is something that calls “commit message”.
 * Every single commit must be followed by commit message. Whenever you commit, you must describe what you have changed in this version of the code. How this version is different from previous.
 * In real work environment, many people can work together within the same project.
 * But if project is on my computer, how other people can access it?
 * For this, we use github. Github - it’s a storage for projects. Every collaborator (project contributor) has a copy of the project. Then, github has a main copy.
 * In case of google drive, everyone works on the same document.
 * In case of github (based on git) - everyone has a copy of the project.
 * If you are getting warning: cannot open this file because it’s from unidentified developer...
 * go to security & privacy --> general --> click on open anyway.
 * Then, try to install again.
 * GitHub is a Web-based hosting service
 * It uses hosts/stores repositories
 * It uses git
 * GitHub - it’s like a warehouse for git projects.
 * Let’s setup git username, email and password
 * How to setup?
 * Open terminal/powershell/git bash and write following command:
 * please use your github email here
 * This command is needed for git, know which account to use when you gonna work with github. Otherwise, it will ask you username/password every time.
 * git config --global user.email “github@email.com”
 * git config --global user.name “githubname”
 * git config --global user.password “githubpassword”
 * We need to setup git credentials, to easily push/pull changes to/from github.
 * once you enter this command, you will not see anything. If you see FATAL, something wen wrong.....
 * To change it, run it again.
 * How to see config? IF you want to see....
 * Just enter: git config -l , and then use arrows on your keyboard to scroll over git config settings. To exit from the log press ‘q’.
 * -l - stands for list
 * git config -l or git config --list
 * On mac, you can find .gitconfig under user directory file and open it with sublime. All .smth files are hidden. To see these kind of files, in terminal, you can use following command:
 * #####For mac (optional)###
 * How you can find that config file:
 * ls -a
 * Or, just open users directory with a finder and press command + shift + .
 * To see hidden files.
 * ###########################
 * Now, let’s create a project.
 * Project name: GitPracticeFall2019
 * git local repository and remote repository
 * local - on your computer. We create local repository for specific project. Then, we create remote repository on github. Last step - connect them.
 * Any git project starts with one command:
 *  git init - this command will create local repository for your java project.
 * Studio-2-Teacher:GitPracticeFall2019 studio2$ git init
 * Initialized empty Git repository in /Users/studio2/IdeaProjects/GitPracticeFall2019/.git/
 * init - it’s a shortening for initialize
 * We run this command only once per project. Then, what’s next?
 * run command git status to see what files can be committed.
 * To permanently exclude certain files/packages from commit we use .gitignore file.
 * .idea and *.iml - intellij auto-generated stuff. Specific to your computer.
 * Anything that is very specific you your computer should be ignored.
 * Content:
 * .idea
 * *.iml
 * * - to match any name.
 * close file.
 * what does it means “staged?”
 * staging - preparation for commit. Any new file in intellij, will look red first (untracked).
 * what are the steps to commit the code?
 * stage changes (prepare files for commit)
 * git add /path/to the file
 * or, if you want to stage all of them, just put .
 * git add .
 * next step, commit it and don’t forget about message.
 * git commit -m “my first commit”
 * if didn’t ignore some files/folder, it’s not too late to fix it.
 * execute following command:
 * git rm --cached <file>...
 * for example
 * git rm --cached .idea
 * and
 * git rm --cached *.iml
 * Once we staged files, it’s time to commit them:
 * git commit -m “commit message”
 * -m - stands for message and will be followed by “message”
 * commit message has to describe changes in a nutshell. AAt work, I usually was specifying Jira issue number, for example:
 * git commit -m “VYT-4122 User should be able to reset password”
 * If you committed .idea folder - don’t worry, it’s just a practice. Next time, you will know what to do. We learn from mistakes.
 * Then, we need to create remote repository.
 * #####Repository - creates only once.
 * This line of code, connects local repository with remote.
 * local - your computer
 * remote - github
 * git remote add origin https://github.com/CybertekSchool/GitPracticeFall2019.git
 * Following command should be executed only once at the beginning.
 * Last command to send your code to the github:
 * git push -u origin master
 * If, you are getting popup, that is asking username and password, please enter your github username and password. You should get this popup only once.
 * IF you are getting... remote: Invalid username or password.
 * your credentials are wrong:(
 * if, you have enter username and password, password will be INVISIBLE
 * In UNIX systems (Mac OS, Linux) and Windows password is always INVISIBLE
 * Your terminal is asking for password:
 * Enter your password: (any kind of input will be invisible)
 * It’s not only about git. It’s for any for any program due to security.
 * If you failed first attempt, push again and try to enter username and password.
 * Steps to create and push git project:
 * git init
 * ~create .gitignore file and ignore .idea and *.iml. Save and close file
 * git add .
 * git commit -m “first commit”
 * git remote add origin https://github.com/CybertekSchool/GitPracticeFall2019.git
 * git push -u origin master
 * master - default branch name
 * origin - refers to name of remote branch
 * ###########################
 * If everything was successful, further you will need just 3 commands:
 * git add .
 * git commit -m “commit message”
 * git push
 * only 3 commands. First time, it’s always more complicated to setup repository and connect it.
 * #####If you are  getting this error: The current branch master has no upstream branch. #####Because, you have missed last step: git push -u origin master
 * Git allows to track multiple versions of the project at the same time. IT calls branching. Currently, we have only 1 - master. We have to map our master local branch with master remote aka origin master, that is located on github.
 * upstream - located on github
 * Studio-2-Teacher:GitPracticeFall2019 studio2$ git status
 * On branch master
 * Your branch is up to date with ‘origin/master’.
 * Changes to be committed:
 *   (use “git reset HEAD <file>...” to unstage)
 *         new file:   src/day1/LoopPractice.java
 * Git shows you difference with last commit
 * How to send this file to github?
 * same steps:
 * git add .  									| prepare all new files for commit
 * git commit -m “Added loop practice file”    | commit (take a snapshot of the project)
 * git push									| send changes to github
 * If you see that everything up-to-date, that means no changes in your project from last commit.

 **/


// if you see that


