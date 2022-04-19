* [Home](https://jal054.github.io/cse15l-lab-reports)
* [Test Page](https://jal054.github.io/cse15l-lab-reports/test-page)

# Lab Report 1 Week 2

* Installing VScode
    1. Download and install [VSCode](https://code.visualstudio.com).
    2. Follow the prompts, go with all default installations, nothing fancy.
    3. Open VSCode, select the Terminal header, and Open New Terminal. You'll see a shortcut there too, you can memorize and use that later.
    4. You should see something like this:
    ![Screenshot](https://jal054.github.io/cse15l-lab-reports/installing-vscode.png)
* Remotely Connecting
    1. VSCode allows access to multiple terminals, any will do, let's use Windows Powershell, because I think it's the default.
    2. Enter the command **ssh cs15lsp22___@ieng6.ucsd.edu** where "___" is your unqiue 3-letter student identifier. You can find this [here](https://sdacs.ucsd.edu/~icc/index.php).
    3. You'll probably wait a while, then it might fail, just enter the command again. Hopefully now you're prompted for your password. It's your student password for SSO. It probably won't show what you're typing, so just don't make any mistakes.
    4. Once you're "in" you should see something like this:
    ![Screenshot](https://jal054.github.io/cse15l-lab-reports/remotely-connecting.png)
* Trying Some Commands
    1. Now that we're "in" let's try some commands. These are all [Linux commands](https://maker.pro/linux/tutorial/basic-linux-commands-for-beginners).
    2. Let's try typing **ls** into the terminal. This command shows you the contents of the directory you are currently in. It'll look like this:
    ![Screenshot](https://jal054.github.io/cse15l-lab-reports/trying-commands.png)
    3. Let's try typing **cd ..** into the terminal. This command changes the current directory you are in to the parent directory. If you **ls** now, you'll see the 3-letter identifiers of all students enrolled in the course. A lot of blue...
* Moving Files with scp
    1. We also want to move files between our local machine and the machine (server) that we're ssh-ed into.
    2. First we need a file to transfer, so let's create a file called "WhereAmI.java" in our current local directory.
    3. Let's try typing **scp Main.java cs15lsp22___@ieng6.ucsd.edu:~/** into the terminal. You'll be prompted for your password again. Then you'll see the file has been transfered to the server.
    ![Screenshot](https://jal054.github.io/cse15l-lab-reports/moving-files-scp.png)
* Setting an SSH Key
    1. Entering your password everytime is annoying, luckily there's a better way. SSH Keys allow us to sign in without typing in our password.
    2. First we need to create the keys. Run the command **ssh-keygen** to generate the keys.
    3. Enter nothing for the file and passphrase, they will default.
    4. If you're on Windows open Powershell as Admin and run this command **ssh-keygen -t ed25519** then repeat step 3.
    5. Now run **ssh cs15lsp22___@ieng6.ucsd.edu** and enter your password for the last time!
    6. Run **logout** then **ssh cs15lsp22___@ieng6.ucsd.edu** and you'll notice you're no longer prompted for your password.
    ![Screenshot](https://jal054.github.io/cse15l-lab-reports/ssh.png)
* Optimizing Remote Running
    1. There's a few more tips and tricks, one is to run commands without ssh-ing into the server via the terminal.
    2. Run **ssh cs15lsp22zz@ieng6.ucsd.edu "ls"** to view the directory contents.
    3. Run **cp WhereAmI.java OtherMain.java** to create a copy of "WhereAmI.java" renamed as "OtherMain.java"
    ![Screenshot](https://jal054.github.io/cse15l-lab-reports/efficiency.png)