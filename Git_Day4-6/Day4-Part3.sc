Script started on 2023-01-12 08:43:21+00:00 [TERM="xterm-256color" TTY="/dev/pts/0" COLUMNS="80" LINES="36"]
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ 
/usr/bin/git
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ git --version
git version 2.25.1
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ sudo a[[Kpt-get n[Kinstall -y



0 upgraded, 0 newly installed, 0 to remove and 0 not upgraded.
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ sudo apt-get install -y[K[K[K[K[K[K[K[K[K[Kget update -y
E: Invalid operation get
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ sudo apt-get get update -y[1P[1P[1P[1P

























































]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ ls -a
[0m[01;34m.[0m              [01;32mfile1[0m        [01;34m.ssh[0m
[01;34m..[0m             file2        .sudo_as_admin_successful
.bash_history  file3        t1
.bash_logout   file5        t2
.bashrc        [01;34mfilelist[0m     Table
[01;34m.cache[0m         forjio       Theory.imp
[01;34m.config[0m        .gitconfig   [01;32mTODAY_IS_SECOND_DAY[0m
count_file     [01;34m.gnupg[0m       untill
[01;32mDay2[0m           .hidden      .vboxclient-clipboard.pid
Day3-Part1     infiloop     .vboxclient-display-svga-x11.pid
Day3-Part2     [01;34mlabs[0m         .vboxclient-draganddrop.pid
Day4-Part1     list1        .vboxclient-seamless.pid
Day4-Part2     list2        .vbox_version
Day4-Part3     list3        .viminfo
[01;34mDesktop[0m        list4        [01;34m.vscode[0m
[01;34mDocuments[0m      [01;34m.local[0m       while
[01;34mDownloads[0m      .profile     .while.swp
even           .pylintrc    .Xauthority
exam           smallest.sh  .xsession-errors
fac            [01;34msnap[0m         .xsession-errors.old
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ git init
Initialized empty Git repository in /home/devasc/.git/
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ ls -a
[0m[01;34m.[0m              file2        .sudo_as_admin_successful
[01;34m..[0m             file3        t1
.bash_history  file5        t2
.bash_logout   [01;34mfilelist[0m     Table
.bashrc        forjio       Theory.imp
[01;34m.cache[0m         [01;34m.git[0m         [01;32mTODAY_IS_SECOND_DAY[0m
[01;34m.config[0m        .gitconfig   untill
count_file     [01;34m.gnupg[0m       .vboxclient-clipboard.pid
[01;32mDay2[0m           .hidden      .vboxclient-display-svga-x11.pid
Day3-Part1     infiloop     .vboxclient-draganddrop.pid
Day3-Part2     [01;34mlabs[0m         .vboxclient-seamless.pid
Day4-Part1     list1        .vbox_version
Day4-Part2     list2        .viminfo
Day4-Part3     list3        [01;34m.vscode[0m
[01;34mDesktop[0m        list4        while
[01;34mDocuments[0m      [01;34m.local[0m       .while.swp
[01;34mDownloads[0m      .profile     .Xauthority
even           .pylintrc    .xsession-errors
exam           smallest.sh  .xsession-errors.old
fac            [01;34msnap[0m
[01;32mfile1[0m          [01;34m.ssh[0m
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ touch file1.1
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ ls
count_file  Day4-Part3  fac      [0m[01;34mfilelist[0m  list3        Table
[01;32mDay2[0m        [01;34mDesktop[0m     [01;32mfile1[0m    forjio    list4        Theory.imp
Day3-Part1  [01;34mDocuments[0m   file1.1  infiloop  smallest.sh  [01;32mTODAY_IS_SECOND_DAY[0m
Day3-Part2  [01;34mDownloads[0m   file2    [01;34mlabs[0m      [01;34msnap[0m         untill
Day4-Part1  even        file3    list1     t1           while
Day4-Part2  exam        file5    list2     t2
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ cat>>file1.1
yeh mera phela line of code hai
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ cat>>file1.1[1Pfile1.1[1Pfile1.1 file1.1
yeh mera phela line of code hai
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ git status
On branch master

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
	[31m.Xauthority[m
	[31m.bash_history[m
	[31m.bash_logout[m
	[31m.bashrc[m
	[31m.cache/[m
	[31m.config/[m
	[31m.gitconfig[m
	[31m.hidden[m
	[31m.local/[m
	[31m.profile[m
	[31m.pylintrc[m
	[31m.ssh/[m
	[31m.sudo_as_admin_successful[m
	[31m.vbox_version[m
	[31m.vboxclient-clipboard.pid[m
	[31m.vboxclient-display-svga-x11.pid[m
	[31m.vboxclient-draganddrop.pid[m
	[31m.vboxclient-seamless.pid[m
	[31m.viminfo[m
	[31m.vscode/[m
	[31m.while.swp[m
	[31m.xsession-errors[m
	[31m.xsession-errors.old[m
	[31mDay2[m
	[31mDay3-Part1[m
	[31mDay3-Part2[m
	[31mDay4-Part1[m
	[31mDay4-Part2[m
	[31mDay4-Part3[m
	[31mDesktop/[m
	[31mTODAY_IS_SECOND_DAY[m
	[31mTable[m
	[31mTheory.imp[m
	[31mcount_file[m
	[31meven[m
	[31mexam[m
	[31mfac[m
	[31mfile1[m
	[31mfile1.1[m
	[31mfile2[m
	[31mfile3[m
	[31mfile5[m
	[31mfilelist/[m
	[31mforjio[m
	[31minfiloop[m
	[31mlabs/[m
	[31mlist1[m
	[31mlist2[m
	[31mlist3[m
	[31mlist4[m
	[31msmallest.sh[m
	[31msnap/[m
	[31mt1[m
	[31mt2[m
	[31muntill[m
	[31mwhile[m

nothing added to commit but untracked files present (use "git add" to track)
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ git status[K[K[K[K[K[K[K[K[K[Kgit add .
error: open("file1"): Permission denied
error: unable to index file 'file1'
fatal: adding files failed
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ git add .status
On branch master

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
	[31m.Xauthority[m
	[31m.bash_history[m
	[31m.bash_logout[m
	[31m.bashrc[m
	[31m.cache/[m
	[31m.config/[m
	[31m.gitconfig[m
	[31m.hidden[m
	[31m.local/[m
	[31m.profile[m
	[31m.pylintrc[m
	[31m.ssh/[m
	[31m.sudo_as_admin_successful[m
	[31m.vbox_version[m
	[31m.vboxclient-clipboard.pid[m
	[31m.vboxclient-display-svga-x11.pid[m
	[31m.vboxclient-draganddrop.pid[m
	[31m.vboxclient-seamless.pid[m
	[31m.viminfo[m
	[31m.vscode/[m
	[31m.while.swp[m
	[31m.xsession-errors[m
	[31m.xsession-errors.old[m
	[31mDay2[m
	[31mDay3-Part1[m
	[31mDay3-Part2[m
	[31mDay4-Part1[m
	[31mDay4-Part2[m
	[31mDay4-Part3[m
	[31mDesktop/[m
	[31mTODAY_IS_SECOND_DAY[m
	[31mTable[m
	[31mTheory.imp[m
	[31mcount_file[m
	[31meven[m
	[31mexam[m
	[31mfac[m
	[31mfile1[m
	[31mfile1.1[m
	[31mfile2[m
	[31mfile3[m
	[31mfile5[m
	[31mfilelist/[m
	[31mforjio[m
	[31minfiloop[m
	[31mlabs/[m
	[31mlist1[m
	[31mlist2[m
	[31mlist3[m
	[31mlist4[m
	[31msmallest.sh[m
	[31msnap/[m
	[31mt1[m
	[31mt2[m
	[31muntill[m
	[31mwhile[m

nothing added to commit but untracked files present (use "git add" to track)
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ git status[K[K[K[K[K[K[K[K[K[Kgit config --global user.name "aman"
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ git config --global user.name "aman"[1P"[1P"[1P"[1P"[1P ""[1P ""[1P ""[1P ""e ""[1P ""n ""a ""m ""e ""[C[C[C[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[Kls -a
[0m[01;34m.[0m              file1.1      [01;34m.ssh[0m
[01;34m..[0m             file2        .sudo_as_admin_successful
.bash_history  file3        t1
.bash_logout   file5        t2
.bashrc        [01;34mfilelist[0m     Table
[01;34m.cache[0m         forjio       Theory.imp
[01;34m.config[0m        [01;34m.git[0m         [01;32mTODAY_IS_SECOND_DAY[0m
count_file     .gitconfig   untill
[01;32mDay2[0m           [01;34m.gnupg[0m       .vboxclient-clipboard.pid
Day3-Part1     .hidden      .vboxclient-display-svga-x11.pid
Day3-Part2     infiloop     .vboxclient-draganddrop.pid
Day4-Part1     [01;34mlabs[0m         .vboxclient-seamless.pid
Day4-Part2     list1        .vbox_version
Day4-Part3     list2        .viminfo
[01;34mDesktop[0m        list3        [01;34m.vscode[0m
[01;34mDocuments[0m      list4        while
[01;34mDownloads[0m      [01;34m.local[0m       .while.swp
even           .profile     .Xauthority
exam           .pylintrc    .xsession-errors
fac            smallest.sh  .xsession-errors.old
[01;32mfile1[0m          [01;34msnap[0m
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ touch[K[K[K[K[Kcd Documents
]0;devasc@labvm: ~/Documents[01;32mdevasc@labvm[00m:[01;34m~/Documents[00m$ ls
]0;devasc@labvm: ~/Documents[01;32mdevasc@labvm[00m:[01;34m~/Documents[00m$ git init
Initialized empty Git repository in /home/devasc/Documents/.git/
]0;devasc@labvm: ~/Documents[01;32mdevasc@labvm[00m:[01;34m~/Documents[00m$ cat [K>file1
yeh mera phela line of code hai !
chal jhutha:;^[[D^[[D        
]0;devasc@labvm: ~/Documents[01;32mdevasc@labvm[00m:[01;34m~/Documents[00m$ git status
On branch master

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
	[31mfile1[m

nothing added to commit but untracked files present (use "git add" to track)
]0;devasc@labvm: ~/Documents[01;32mdevasc@labvm[00m:[01;34m~/Documents[00m$ gitt [K[K add .
]0;devasc@labvm: ~/Documents[01;32mdevasc@labvm[00m:[01;34m~/Documents[00m$ git add .status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
	[32mnew file:   file1[m

]0;devasc@labvm: ~/Documents[01;32mdevasc@labvm[00m:[01;34m~/Documents[00m$ git commit -m "1st commit fo[K[Kchall c[Kjhuta kitna bolega"
[master (root-commit) 9f89ad0] 1st commit chall jhuta kitna bolega
 1 file changed, 2 insertions(+)
 create mode 100644 file1
]0;devasc@labvm: ~/Documents[01;32mdevasc@labvm[00m:[01;34m~/Documents[00m$ git commit -m "1st commit chall jhuta kitna bolega"
On branch master
nothing to commit, working tree clean
]0;devasc@labvm: ~/Documents[01;32mdevasc@labvm[00m:[01;34m~/Documents[00m$ git log
[?1h=
Author: aman <changeme@example.com>[m
Date:   Thu Jan 12 09:35:45 2023 +0000[m
[m
    1st commit chall jhuta kitna bolega[m

]0;devasc@labvm: ~/Documents[01;32mdevasc@labvm[00m:[01;34m~/Documents[00m$ git logstatus[3Plog[K[K[Kshow 9f89ad05e09ce4d055ab28cfbd1cc3b21839391b
[?1h=
Author: aman <changeme@example.com>[m
Date:   Thu Jan 12 09:35:45 2023 +0000[m
[m
    1st commit chall jhuta kitna bolega[m
[m
[1mdiff --git a/file1 b/file1[m[m
[1mnew file mode 100644[m[m
[1mindex 0000000..69615af[m[m
[1m--- /dev/null[m[m
[1m+++ b/file1[m[m
[36m@@ -0,0 +1,2 @@[m[m
[32m+[m[32myeh mera phela line of code hai ![m[m
[32m+[m[32mchal jhutha:;[m[m

git: 'remort' is not a git command. See 'git --help'.

The most similar commands are
	remote
	revert
]0;devasc@labvm: ~/Documents[01;32mdevasc@labvm[00m:[01;34m~/Documents[00m$ git remort add origin https://github.com/SAJOYPAUL909/Simplewalarepo2023.git[A


]0;devasc@labvm: ~/Documents[01;32mdevasc@labvm[00m:[01;34m~/Documents[00m$ git pud[Ksh -u origin master
Username for 'https://github.com': sajoypaul909@gmail.com
Password for 'https://sajoypaul909@gmail.com@github.com': 
remote: Support for password authentication was removed on August 13, 2021.
remote: Please see https://docs.github.com/en/get-started/getting-started-with-git/about-remote-repositories#cloning-with-https-urls for information on currently recommended modes of authentication.
fatal: Authentication failed for 'https://github.com/SAJOYPAUL909/Simplewalarepo2023.git/'
]0;devasc@labvm: ~/Documents[01;32mdevasc@labvm[00m:[01;34m~/Documents[00m$ git push -u origin master
Username for 'https://github.com': Sajoy    AJOYPAUL909
Password for 'https://SAJOYPAUL909@github.com': 
Enumerating objects: 3, done.
Counting objects:  33% (1/3)
Writing objects:  33% (1/3)
Total 3 (delta 0), reused 0 (delta 0)
remote: 
remote: Create a pull request for 'master' on GitHub by visiting:[K
remote:      https://github.com/SAJOYPAUL909/Simplewalarepo2023/pull/new/master[K
remote: 
To https://github.com/SAJOYPAUL909/Simplewalarepo2023.git
 * [new branch]      master -> master
Branch 'master' set up to track remote branch 'master' from 'origin'.
]0;devasc@labvm: ~/Documents[01;32mdevasc@labvm[00m:[01;34m~/Documents[00m$ ls
file1
]0;devasc@labvm: ~/Documents[01;32mdevasc@labvm[00m:[01;34m~/Documents[00m$ cat[K[K[Kcat >>[K[K[K>>file1
chal bhout jaga  h hai nahi jagah hai
soo raha hai
]0;devasc@labvm: ~/Documents[01;32mdevasc@labvm[00m:[01;34m~/Documents[00m$ cat>>file1[1Pfile1[1Pfile1 file1
yeh mera phela line of code hai !
chal jhutha:;
chal bhout jagah hai nahi jagah hai
soo raha hai
]0;devasc@labvm: ~/Documents[01;32mdevasc@labvm[00m:[01;34m~/Documents[00m$ git status
On branch master
Your branch is up to date with 'origin/master'.

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
	[31mmodified:   file1[m

no changes added to commit (use "git add" and/or "git commit -a")
]0;devasc@labvm: ~/Documents[01;32mdevasc@labvm[00m:[01;34m~/Documents[00m$ git status[1Pcat file1>>file1ls[Kgit push -u origin masterremote add origin https://github.com/SAJOYPAUL909/Simplewalarepo2023.git[A


]0;devasc@labvm: ~/Documents[01;32mdevasc@labvm[00m:[01;34m~/Documents[00m$ git add .status
On branch master
Your branch is up to date with 'origin/master'.

Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
	[32mmodified:   file1[m

]0;devasc@labvm: ~/Documents[01;32mdevasc@labvm[00m:[01;34m~/Documents[00m$ git status[1Padd .status[1Pcat file1>>file1ls[Kgit push -u origin masterremote add origin https://github.com/SAJOYPAUL909/Simplewalarepo2023.git[A


[master 4f4cbb3] 2nd commit chall jhuta kitna bolega user 2
 1 file changed, 2 insertions(+)
]0;devasc@labvm: ~/Documents[01;32mdevasc@labvm[00m:[01;34m~/Documents[00m$ git commit -m "2nd commit chall jhuta kitna bolega user 2"[A

Username for 'https://github.com': SAJOU YPAUL909
Password for 'https://SAJOYPAUL909@github.com': 
Enumerating objects: 5, done.
Counting objects:  20% (1/5)
Delta compression using up to 2 threads
Compressing objects:  50% (1/2)
Writing objects:  33% (1/3)
Total 3 (delta 0), reused 0 (delta 0)
To https://github.com/SAJOYPAUL909/Simplewalarepo2023.git
   9f89ad0..4f4cbb3  master -> master
Branch 'master' set up to track remote branch 'master' from 'origin'.
]0;devasc@labvm: ~/Documents[01;32mdevasc@labvm[00m:[01;34m~/Documents[00m$ git log
[?1h=
Author: aman <changeme@example.com>[m
Date:   Thu Jan 12 10:11:01 2023 +0000[m
[m
    2nd commit chall jhuta kitna bolega user 2[m
[m
[33mcommit 9f89ad05e09ce4d055ab28cfbd1cc3b21839391b[m[m
Author: aman <changeme@example.com>[m
Date:   Thu Jan 12 09:35:45 2023 +0000[m
[m
    1st commit chall jhuta kitna bolega[m

[?1h=
Author: aman <changeme@example.com>[m
Date:   Thu Jan 12 10:11:01 2023 +0000[m
[m
    2nd commit chall jhuta kitna bolega user 2[m
[m
[1mdiff --git a/file1 b/file1[m[m
[1mindex 69615af..139f59e 100644[m[m
[1m--- a/file1[m[m
[1m+++ b/file1[m[m
[36m@@ -1,2 +1,4 @@[m[m
 yeh mera phela line of code hai ![m[m
 chal jhutha:;[m[m
[32m+[m[32mchal bhout jagah hai nahi jagah hai[m[m
[32m+[m[32msoo raha hai[m[m

exit

Script done on 2023-01-12 10:21:36+00:00 [COMMAND_EXIT_CODE="0"]