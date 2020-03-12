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
 * git push                                     | send changes to github
 *
 * if you see that everyghing up-to-date ,that means no changes in your project from last commit
 * It was small introduction , we will have at least 3 more dedicated classes where we will recap
 * and learn more things. The best way to master git-----use it every day. Create a git project for your group and work together on it
 * maybe not now ,later
 *
 * =================================================================================
 * lets switch the topic and start selenium
 *
 * at the end of class ,we gonna create git repo for selenium project as well, so it's another round of git practice
 *
 * Not everything can be automated yet, but industry keep improving...technologies are getting smarter every day.
 * So why do we need test automation ? Why we cannot just test everything manually ?
 * of course we can test manually, but it can take a lot of time. Especially, when it comes to big sets of data, like
 * thousands of rows in excel spread sheet. Verifying numbers can be very tricky. You missed one dot---and that's it. it can
 * trigger some issue further.............
 *
 * Tests scripts can be executed 24/7, also can be executed all at once( parallel test execution). To achieve same in
 * manual testing,you need to hire more manual testers.
 *
 * Testing is an essential stage of SDLC
 * You don't want to drive the car, that didn't pass crash test.
 * Same thing apply to software: it must be tested as well
 * Our job is to ensure quality of the software
 *
 * Selenium --its actually suite of tools . RC, IDE,WebDriver and Grid
 * IDE AND RC have been deprecated  -- deprecated means something old that not recommended to use,
 * because there is a new better alternative (something outdated)
 * WebDriver--this is what we will use in our java project
 * Grid--this is what we will use , at the end of selenium course to connect couple servers for better performance in parallel
 * test exectuion + for cross-browsing testing.
 *
 * To use selenium webdriver we need 3 things:
 * 1. add selenium library into your project
 * 2.get webdriver (browser driver) for every browser there is a different webdriver
 * 3.browser itself
 *
 * before , we were creating regular java project ,Today,we gonna create maven project. Its java code,
 * but project will look a little different .
 *
 * Maven----build automation tool
 * why do we use maven in test automation project ?
 * First reason : dependencies.
 * Whenever you want to add some library to your java/maven project, you just need to add dependency. It's like instruction for
 * maven that specifies library name and its version. Then maven will automatically download that library.
 * First library that we gonna add is a Selenium.
 *
 * Every project has pom.xml file. This file is the main file in every maven project. It has information about project
 * ,developers ,dependencies and other useful info.
 * pom--means Project Object Model. This document is written on XML. Language, that is similar to HTML, Also has tags and attributes..
 *
 * maven can be installed as CLI tool, but Intellij also has it by default.
 * java is language ,selenium is a library, maven is build automation tool
 * selenium ---its a library, that we will add
 *
 *
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
    /**
     * Today is February 29, 2020
     *     Agenda: Git/Github
     *             1 hour break
     *             First maven project and introduction to test automation with selenium webdriver.
     *             Basic navigation: get(url), navigateTo(), close()....
     * #######################################
     * Today we gonna use terminal/powershell a lot. If you are windows user, please use powershell. Just to search and type PowerShell. Any windows has it by default.
     * #don't worry about git version, as long as you have it you are good to go. If you don't have a git yet, please download it from official website or use brew(for mac).
     * To check if you have a git, you need to run following command.
     * git --version
     * If you are not getting any errors, you are fine:)
     * git version 2.21.1
     * git - VCS (Version Control System)
     * SCM - Source Code Management
     * You can use git in intellij without even installing it. It's because intellij has git too. But, even we want to use git via a CLI (Command Line Interface) we need to install it first.
     * What is VSC in action?
     * MyProject --- let's say it's your java project
     * public class MyFirstTest{
     *
     *     public void test1(){
     *         go to google.com
     *         get the text
     *         assert that title is equals to "Google"
     *     }
     * }
     * Once you decide that this is a first version of your project, you can commit changes.
     * commit changes - means take a snapshot of the project at some point.
     * I would say git it's kind of time machine for your project.
     * The main role of git is to track changes. Why tracking changes is so important?
     * Because, if something will go wrong, we can find what change in the code broke it.
     * version 2:::
     * public class MyFirstTest{
     *
     *     public void test1(){
     *         go to google.com
     *         get the text and print it
     *         assert that title is equals to "Google"
     *     }
     *     public void test2(){
     *         go to facebook.com
     *         get the text and print it
     *         assert that title is equals to "Facebook"
     *     }
     * }
     * Once you have completed your test #2, commit this changes, just in case.
     * Git can show you the difference from version to version. When (date, time) what file, what line was added, modified or deleted. And the most important - by whom! Also, why?
     * How you can figure out why? There is something that calls "commit message".
     * Every single commit must be followed by commit message. Whenever you commit, you must describe what you have changed in this version of the code. How this version is different from previous.
     * In real work environment, many people can work together within the same project.
     * But if project is on my computer, how other people can access it?
     * For this, we use github. Github - it's a storage for projects. Every collaborator (project contributor) has a copy of the project. Then, github has a main copy.
     * In case of google drive, everyone works on the same document.
     * In case of github (based on git) - everyone has a copy of the project.
     * If you are getting warning: cannot open this file because it's from unidentified developer...
     * go to security & privacy --> general --> click on open anyway.
     * Then, try to install again.
     * GitHub is a Web-based hosting service
     * It uses hosts/stores repositories
     * It uses git
     * GitHub - it's like a warehouse for git projects.
     * Let's setup git username, email and password
     * How to setup?
     * Open terminal/powershell/git bash and write following command:
     * please use your github email here
     * This command is needed for git, know which account to use when you gonna work with github. Otherwise, it will ask you username/password every time.
     * git config --global user.email "github@email.com"
     * git config --global user.name "githubname"
     * git config --global user.password "githubpassword"
     * We need to setup git credentials, to easily push/pull changes to/from github.
     * once you enter this command, you will not see anything. If you see FATAL, something wen wrong.....
     * To change it, run it again.
     * How to see config? IF you want to see....
     * Just enter: git config -l , and then use arrows on your keyboard to scroll over git config settings. To exit from the log press 'q'.
     * -l - stands for list
     * git config -l or git config --list
     * On mac, you can find .gitconfig under user directory file and open it with sublime. All .smth files are hidden. To see these kind of files, in terminal, you can use following command:
     * #####For mac (optional)###
     * How you can find that config file:
     * ls -a
     * Or, just open users directory with a finder and press command + shift + .
     * To see hidden files.
     * ###########################
     * Now, let's create a project.
     * Project name: GitPracticeFall2019
     * git local repository and remote repository
     * local - on your computer. We create local repository for specific project. Then, we create remote repository on github. Last step - connect them.
     * Any git project starts with one command:
     *  git init - this command will create local repository for your java project.
     * Studio-2-Teacher:GitPracticeFall2019 studio2$ git init
     * Initialized empty Git repository in /Users/studio2/IdeaProjects/GitPracticeFall2019/.git/
     * init - it's a shortening for initialize
     * We run this command only once per project. Then, what's next?
     * run command git status to see what files can be committed.
     * To permanently exclude certain files/packages from commit we use .gitignore file.
     * .idea and *.iml - intellij auto-generated stuff. Specific to your computer.
     * Anything that is very specific you your computer should be ignored.
     * Content:
     * .idea
     * *.iml
     * * - to match any name.
     * close file.
     * what does it means "staged?"
     * staging - preparation for commit. Any new file in intellij, will look red first (untracked).
     * what are the steps to commit the code?
     * stage changes (prepare files for commit)
     * git add /path/to the file
     * or, if you want to stage all of them, just put .
     * git add .
     * next step, commit it and don't forget about message.
     * git commit -m "my first commit"
     * if didn't ignore some files/folder, it's not too late to fix it.
     * execute following command:
     * git rm --cached <file>...
     * for example
     * git rm --cached .idea
     * and
     * git rm --cached *.iml
     * Once we staged files, it's time to commit them:
     * git commit -m "commit message"
     * -m - stands for message and will be followed by "message"
     * commit message has to describe changes in a nutshell. AAt work, I usually was specifying Jira issue number, for example:
     * git commit -m "VYT-4122 User should be able to reset password"
     * If you committed .idea folder - don't worry, it's just a practice. Next time, you will know what to do. We learn from mistakes.
     * Then, we need to create remote repository.
     *
     *
     *
     */



}
