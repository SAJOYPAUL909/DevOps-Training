Script started on 2023-01-11 07:40:16+00:00 [TERM="xterm-256color" TTY="/dev/pts/0" COLUMNS="80" LINES="24"]
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ sudo su
]0;root@labvm: /home/devascroot@labvm:/home/devasc# cd e[K/etc/passwd
bash: cd: /etc/passwd: Not a directory
]0;root@labvm: /home/devascroot@labvm:/home/devasc# cd /etc/passwd[1P /etc/passwd[1P /etc/passwd[C[C[C[C[C[C[C[C[C[C[C[C[K[K[K[K[K[K[K[K[K[K[K[Kcd
]0;root@labvm: ~root@labvm:~# cat /etc/passwd
root:x:0:0:root:/root:/bin/bash
daemon:x:1:1:daemon:/usr/sbin:/usr/sbin/nologin
bin:x:2:2:bin:/bin:/usr/sbin/nologin
sys:x:3:3:sys:/dev:/usr/sbin/nologin
sync:x:4:65534:sync:/bin:/bin/sync
games:x:5:60:games:/usr/games:/usr/sbin/nologin
man:x:6:12:man:/var/cache/man:/usr/sbin/nologin
lp:x:7:7:lp:/var/spool/lpd:/usr/sbin/nologin
mail:x:8:8:mail:/var/mail:/usr/sbin/nologin
news:x:9:9:news:/var/spool/news:/usr/sbin/nologin
uucp:x:10:10:uucp:/var/spool/uucp:/usr/sbin/nologin
proxy:x:13:13:proxy:/bin:/usr/sbin/nologin
www-data:x:33:33:www-data:/var/www:/usr/sbin/nologin
backup:x:34:34:backup:/var/backups:/usr/sbin/nologin
list:x:38:38:Mailing List Manager:/var/list:/usr/sbin/nologin
irc:x:39:39:ircd:/var/run/ircd:/usr/sbin/nologin
gnats:x:41:41:Gnats Bug-Reporting System (admin):/var/lib/gnats:/usr/sbin/nologin
nobody:x:65534:65534:nobody:/nonexistent:/usr/sbin/nologin
systemd-network:x:100:102:systemd Network Management,,,:/run/systemd:/usr/sbin/nologin
systemd-resolve:x:101:103:systemd Resolver,,,:/run/systemd:/usr/sbin/nologin
systemd-timesync:x:102:104:systemd Time Synchronization,,,:/run/systemd:/usr/sbin/nologin
messagebus:x:103:106::/nonexistent:/usr/sbin/nologin
syslog:x:104:110::/home/syslog:/usr/sbin/nologin
_apt:x:105:65534::/nonexistent:/usr/sbin/nologin
uuidd:x:106:111::/run/uuidd:/usr/sbin/nologin
tcpdump:x:107:112::/nonexistent:/usr/sbin/nologin
sshd:x:108:65534::/run/sshd:/usr/sbin/nologin
devasc:x:900:900:DevNet Associate,,,:/home/devasc:/bin/bash
systemd-coredump:x:999:999:systemd Core Dumper:/:/usr/sbin/nologin
tss:x:109:116:TPM software stack,,,:/var/lib/tpm:/bin/false
lightdm:x:110:120:Light Display Manager:/var/lib/lightdm:/bin/false
rtkit:x:111:122:RealtimeKit,,,:/proc:/usr/sbin/nologin
dnsmasq:x:112:65534:dnsmasq,,,:/var/lib/misc:/usr/sbin/nologin
avahi-autoipd:x:113:123:Avahi autoip daemon,,,:/var/lib/avahi-autoipd:/usr/sbin/nologin
usbmux:x:114:46:usbmux daemon,,,:/var/lib/usbmux:/usr/sbin/nologin
kernoops:x:115:65534:Kernel Oops Tracking Daemon,,,:/:/usr/sbin/nologin
whoopsie:x:116:124::/nonexistent:/bin/false
avahi:x:117:125:Avahi mDNS daemon,,,:/var/run/avahi-daemon:/usr/sbin/nologin
cups-pk-helper:x:118:114:user for cups-pk-helper service,,,:/home/cups-pk-helper:/usr/sbin/nologin
speech-dispatcher:x:120:29:Speech Dispatcher,,,:/run/speech-dispatcher:/bin/false
saned:x:121:128::/var/lib/saned:/usr/sbin/nologin
hplip:x:122:7:HPLIP system user,,,:/run/hplip:/bin/false
colord:x:123:129:colord colour management daemon,,,:/var/lib/colord:/usr/sbin/nologin
pulse:x:124:130:PulseAudio daemon,,,:/var/run/pulse:/usr/sbin/nologin
stunnel4:x:119:126::/var/run/stunnel4:/usr/sbin/nologin
vboxadd:x:998:1::/var/run/vboxadd:/bin/false
aman:x:1000:1000::/home/aman:/bin/bash
]0;root@labvm: ~root@labvm:~# cut -d\|[K: -f 1 /etc/passwd
root
daemon
bin
sys
sync
games
man
lp
mail
news
uucp
proxy
www-data
backup
list
irc
gnats
nobody
systemd-network
systemd-resolve
systemd-timesync
messagebus
syslog
_apt
uuidd
tcpdump
sshd
devasc
systemd-coredump
tss
lightdm
rtkit
dnsmasq
avahi-autoipd
usbmux
kernoops
whoopsie
avahi
cups-pk-helper
speech-dispatcher
saned
hplip
colord
pulse
stunnel4
vboxadd
aman
]0;root@labvm: ~root@labvm:~# cut -d\: -f 1 /etc/passwd|sort
aman
_apt
avahi
avahi-autoipd
backup
bin
colord
cups-pk-helper
daemon
devasc
dnsmasq
games
gnats
hplip
irc
kernoops
lightdm
list
lp
mail
man
messagebus
news
nobody
proxy
pulse
root
rtkit
saned
speech-dispatcher
sshd
stunnel4
sync
sys
syslog
systemd-coredump
systemd-network
systemd-resolve
systemd-timesync
tcpdump
tss
usbmux
uucp
uuidd
vboxadd
whoopsie
www-data
]0;root@labvm: ~root@labvm:~# ls
[0m[01;34mDD1[0m  [01;34mDD2[0m  [01;34msnap[0m
]0;root@labvm: ~root@labvm:~# vi Number
[?1049h[22;0;0t[>4;2m[?1h=[?2004h[1;24r[?12h[?12l[22;2t[22;1t[27m[23m[29m[m[H[2J[?25l[24;1H"Number" [New File][2;1H▽[6n[2;1H  [1;1H[>c]10;?]11;?[2;1H[94m~                                                                               [3;1H~                                                                               [4;1H~                                                                               [5;1H~                                                                               [6;1H~                                                                               [7;1H~                                                                               [8;1H~                                                                               [9;1H~                                                                               [10;1H~                                                                               [11;1H~                                                                               [12;1H~                                                                               [13;1H~                                                                               [14;1H~                                                                               [15;1H~                                                                               [16;1H~                                                                               [17;1H~                                                                               [18;1H~                                                                               [19;1H~                                                                               [20;1H~                                                                               [21;1H~                                                                               [22;1H~                                                                               [23;1H~                                                                               [m[24;63H0,0-1[9CAll[1;1H[?25hP+q436f\P+q6b75\P+q6b64\P+q6b72\P+q6b6c\P+q2332\P+q2334\P+q2569\P+q2a37\P+q6b31\[27m[23m[29m[m[H[2J[?25l[2;1H[94m~                                                                               [3;1H~                                                                               [4;1H~                                                                               [5;1H~                                                                               [6;1H~                                                                               [7;1H~                                                                               [8;1H~                                                                               [9;1H~                                                                               [10;1H~                                                                               [11;1H~                                                                               [12;1H~                                                                               [13;1H~                                                                               [14;1H~                                                                               [15;1H~                                                                               [16;1H~                                                                               [17;1H~                                                                               [18;1H~                                                                               [19;1H~                                                                               [20;1H~                                                                               [21;1H~                                                                               [22;1H~                                                                               [23;1H~                                                                               [m[24;63H0,0-1[9CAll
[1;24r[23;1H[94m~                                                                               [m[24;63H[K[24;63H9,1[11CAll[9;1H[?25h[?25l[24;63H8[8;1H[?25h[?25l[24;63H7[7;1H[?25h[?25l[24;63H6[6;1H[?25h[?25l[24;63H5[5;1H[?25h[?25l[24;63H4[4;1H[?25h[?25l[24;63H3[3;1H[?25h[?25l[24;63H2[2;1H[?25h[?25l[24;63H1[1;1H[?25h[?25l[24;63H2[2;1H[?25h[?25l[24;63H3[3;1H[?25h[?25l[24;63H4[4;1H[?25h[?25l[24;63H5[5;1H[?25h[?25l[24;63H6[6;1H[?25h[?25l[24;63H7[7;1H[?25h[?25l[24;63H8[8;1H[?25h[?25l[24;63H9[9;1H[?25h[?25l[24;63H10,1[10;1H[?25h[?25l[24;64H1[11;1H[?25h[?25l[24;64H2[12;1H[?25h[?25l[24;64H3[13;1H[?25h[?25l[24;64H4[14;1H[?25h[?25l[24;64H5[15;1H[?25h[?25l[24;64H6[16;1H[?25h[?25l[24;64H7[17;1H[?25h[?25l[24;64H8[18;1H[?25h[?25l[24;64H9[19;1H[?25h[?25l[24;63H20[20;1H[?25h[?25l[24;64H1[21;1H[?25h[24;1H[K[21;1H[?25l[24;53H^[[21;1H[24;53H  [21;1H[24;63H21,0-1[8CAll[21;1H[?25h[?25l[24;53H:[21;1H[24;53H[K[24;1H:[?2004h[?25hwq
[?2004l[?1l>[?25h[>4;m[?1049l[23;0;0t]0;root@labvm: ~root@labvm:~# sort Number

12
135
21
21
21
26
27
4
4
41
413
4135
43
5416
6
7465
76854
8131
84
874
]0;root@labvm: ~root@labvm:~# sort Number[C[C Number[C[C Number[1@-[1@n

4
4
6
12
21
21
21
26
27
41
43
84
135
413
874
4135
5416
7465
8131
76854
]0;root@labvm: ~root@labvm:~# ls
[0m[01;34mDD1[0m  [01;34mDD2[0m  Number  [01;34msnap[0m
]0;root@labvm: ~root@labvm:~# lssort -n  Number[1@ [1P[C[C[C Number[1@-[1@u

4
6
12
21
26
27
41
43
84
135
413
874
4135
5416
7465
8131
76854
]0;root@labvm: ~root@labvm:~# vi student [K_data
[?1049h[22;0;0t[>4;2m[?1h=[?2004h[1;24r[?12h[?12l[22;2t[22;1t[27m[23m[29m[m[H[2J[?25l[24;1H"student_data" [New File][2;1H▽[6n[2;1H  [1;1H[>c]10;?]11;?[2;1H[94m~                                                                               [3;1H~                                                                               [4;1H~                                                                               [5;1H~                                                                               [6;1H~                                                                               [7;1H~                                                                               [8;1H~                                                                               [9;1H~                                                                               [10;1H~                                                                               [11;1H~                                                                               [12;1H~                                                                               [13;1H~                                                                               [14;1H~                                                                               [15;1H~                                                                               [16;1H~                                                                               [17;1H~                                                                               [18;1H~                                                                               [19;1H~                                                                               [20;1H~                                                                               [21;1H~                                                                               [22;1H~                                                                               [23;1H~                                                                               [m[24;63H0,0-1[9CAll[1;1H[?25hP+q436f\P+q6b75\P+q6b64\P+q6b72\P+q6b6c\P+q2332\P+q2334\P+q2569\P+q2a37\P+q6b31\[27m[23m[29m[m[H[2J[?25l[2;1H[94m~                                                                               [3;1H~                                                                               [4;1H~                                                                               [5;1H~                                                                               [6;1H~                                                                               [7;1H~                                                                               [8;1H~                                                                               [9;1H~                                                                               [10;1H~                                                                               [11;1H~                                                                               [12;1H~                                                                               [13;1H~                                                                               [14;1H~                                                                               [15;1H~                                                                               [16;1H~                                                                               [17;1H~                                                                               [18;1H~                                                                               [19;1H~                                                                               [20;1H~                                                                               [21;1H~                                                                               [22;1H~                                                                               [23;1H~                                                                               [m[24;63H0,0-1[9CAll
[?2004l[?1l>[?25h[>4;m[?1049l[23;0;0t]0;root@labvm: ~root@labvm:~# grep "CSE" studeb[Knt_data
Amit Sharma     [01;31m[KCSE[m[K        C
Sandeep Patel   [01;31m[KCSE[m[K        B+
]0;root@labvm: ~root@labvm:~# cat grep "CSE" student_data
Name            Branch   Grade
Amit Sharma     CSE        C
Sandeep Patel   CSE        B+
Vikas Patel     MECH       D
Mahavir Kumar   IT         A
Satendra Patel  ECE        B-
Aman Kushwaha   IT         B+
Sarthak Kosta   ECE        A

]0;root@labvm: ~root@labvm:~# cut -d " " -f 1 student_data
Name
Amit
Sandeep
Vikas
Mahavir
Satendra
Aman
Sarthak

]0;root@labvm: ~root@labvm:~# cut -d " " -f 1 student_data, student_data4 student_data
Name 
Amit 
Sandeep 
Vikas 
Mahavir 
Satendra ECE
Aman 
Sarthak 

]0;root@labvm: ~root@labvm:~# grep "A" student_data
[01;31m[KA[m[Kmit Sharma     CSE        C
Mahavir Kumar   IT         [01;31m[KA[m[K
[01;31m[KA[m[Kman Kushwaha   IT         B+
Sarthak Kosta   ECE        [01;31m[KA[m[K
]0;root@labvm: ~root@labvm:~# grep "A" student_data[C[1P[1P student_data[C" student_data[1@C[1@S[1@E[C[1@ [1@-[1@v
Name            Branch   Grade
Vikas Patel     MECH       D
Mahavir Kumar   IT         A
Satendra Patel  ECE        B-
Aman Kushwaha   IT         B+
Sarthak Kosta   ECE        A

]0;root@labvm: ~root@labvm:~# grep -v "CSE" student_data[C[C[C[C[C[1P[1P[1P[1@c[1@s[1@e[1P[1P
]0;root@labvm: ~root@labvm:~# grep  "cse" student_data[C[C[1@ [1@-[1@i
Amit Sharma     [01;31m[KCSE[m[K        C
Sandeep Patel   [01;31m[KCSE[m[K        B+
]0;root@labvm: ~root@labvm:~# grep -i  "cse" student_data[C[C[C[1P[1@n
]0;root@labvm: ~root@labvm:~# 1[Kgrep -n  "cse" student_data[1P[1P[1P[1@C[1@S[1@E
[32m[K2[m[K[36m[K:[m[KAmit Sharma     [01;31m[KCSE[m[K        C
[32m[K3[m[K[36m[K:[m[KSandeep Patel   [01;31m[KCSE[m[K        B+
]0;root@labvm: ~root@labvm:~# grep -n  "CSE" student_data[1P[1@c
2
]0;root@labvm: ~root@labvm:~# cat [K>m1
bheja khol good
]0;root@labvm: ~root@labvm:~# cat>m1[K2
^[[A^[[A        gooo d is good
]0;root@labvm: ~root@labvm:~# cat>m2[K3
sir is good matlab
good hai]0;root@labvm: ~root@labvm:~# 
]0;root@labvm: ~root@labvm:~# grep -l "good
> 
> '[Kgrep -l "good


> 
> 
> exit
> ii[K[Kgrep -l "good










> 
> 
> qqgrep -l "good
























^[[A    
[35m[K(standard input)[m[K
[32m[K2[m[K[36m[K:[m[KAmit Sharma     [01;31m[KCSE[m[K        C
[32m[K3[m[K[36m[K:[m[KSandeep Patel   [01;31m[KCSE[m[K        B+
exit
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ sudo su[Kgrep -l ""g"p"[1P"o"o"d"[C m*
grep: m*: No such file or directory
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ sudo su 
]0;root@labvm: /home/devascroot@labvm:/home/devasc# cd
]0;root@labvm: ~root@labvm:~# cdexitgrep -n  "CSE" student_data[14Pl "good[K[K[K[K[K[K[K[K[K[K[K[K[Kgrep -l "good" m*
[35m[Km1[m[K
[35m[Km2[m[K
[35m[Km3[m[K
]0;root@labvm: ~root@labvm:~# cat [K>n
good
]0;root@labvm: ~root@labvm:~# cat>ngrep -l "good" m*
[35m[Km1[m[K
[35m[Km2[m[K
[35m[Km3[m[K
]0;root@labvm: ~root@labvm:~# ls
[0m[01;34mDD1[0m  [01;34mDD2[0m  m1  m2  m3  n  Number  [01;34msnap[0m  student_data
]0;root@labvm: ~root@labvm:~# grep -e "CSE" -e "A" student_data
[01;31m[KA[m[Kmit Sharma     [01;31m[KCSE[m[K        C
Sandeep Patel   [01;31m[KCSE[m[K        B+
Mahavir Kumar   IT         [01;31m[KA[m[K
[01;31m[KA[m[Kman Kushwaha   IT         B+
Sarthak Kosta   ECE        [01;31m[KA[m[K
]0;root@labvm: ~root@labvm:~# grep "CSE" student_data|grep "C"[K[Kb[KB++"
]0;root@labvm: ~root@labvm:~# grep "CSE" student_data|grep "B++"[1P[1@|
]0;root@labvm: ~root@labvm:~# grep "CSE" student_data|grep "B++"[1P"
Sandeep Patel   CSE        [01;31m[KB+[m[K
]0;root@labvm: ~root@labvm:~# ls
[0m[01;34mDD1[0m  [01;34mDD2[0m  m1  m2  m3  n  Number  [01;34msnap[0m  student_data
]0;root@labvm: ~root@labvm:~# ls -l|grep "^d"
[01;31m[Kd[m[Kr-xr-xr-x 4 root root 4096 Jan 10 08:44 DD1
[01;31m[Kd[m[Krwxr-xr-x 2 root root 4096 Jan 10 08:41 DD2
[01;31m[Kd[m[Krwx------ 3 root root 4096 Jan 10 09:31 snap
]0;root@labvm: ~root@labvm:~# ls -l|grep "^d"[C[1P[1P
]0;root@labvm: ~root@labvm:~# ls |grep "^d"[C[C[1@ [1@-[1@l[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C | cut -d " " -f 9
DD1
DD2
snap
]0;root@labvm: ~root@labvm:~# x = 10 ;[1P;[1P10;[C[1P=10;[C[C[C[Cy=20
]0;root@labvm: ~root@labvm:~# x
x: command not found
]0;root@labvm: ~root@labvm:~# echo $x
10
]0;root@labvm: ~root@labvm:~# expr $x +4
expr: syntax error: unexpected argument ‘+4’
]0;root@labvm: ~root@labvm:~# expr $x +4[K $ [Ky
30
]0;root@labvm: ~root@labvm:~# expr $x + $y[1P$y[1P+$y
10+20
]0;root@labvm: ~root@labvm:~# expr $x+$y + $y[1P $y* $y
expr: syntax error: unexpected argument ‘DD1’
]0;root@labvm: ~root@labvm:~# expr $x * $y[1P $y- $y
-10
]0;root@labvm: ~root@labvm:~# expr $x - $y*[C[C[C[1@\
200
]0;root@labvm: ~root@labvm:~# expr $x \* $y[C[1P $y[1P $y/ $y
0
]0;root@labvm: ~root@labvm:~# expr $x / $y
0
]0;root@labvm: ~root@labvm:~# expr $x / $y[1P $y\ $y
expr: syntax error: unexpected argument ‘ 20’
]0;root@labvm: ~root@labvm:~# expr $x \ $y[1P[1@y[C[C[C[C[C[Kx
expr: syntax error: unexpected argument ‘ 10’
]0;root@labvm: ~root@labvm:~# expr $y \ $x\ $x
expr: syntax error: unexpected argument ‘\\’
]0;root@labvm: ~root@labvm:~# expr $y \\ $x[1P $x/ $x
2
]0;root@labvm: ~root@labvm:~# expr $y \/ $x\[C[C[C[1P $xx \ $y[1@/
expr: syntax error: unexpected argument ‘/ 20’
]0;root@labvm: ~root@labvm:~# ls
[0m[01;34mDD1[0m  [01;34mDD2[0m  m1  m2  m3  n  Number  [01;34msnap[0m  student_data
]0;root@labvm: ~root@labvm:~# echo $?
0
]0;root@labvm: ~root@labvm:~# &[K$?
0: command not found
]0;root@labvm: ~root@labvm:~# $?echo $?
127
]0;root@labvm: ~root@labvm:~# echo $x
10
]0;root@labvm: ~root@labvm:~# test $x -ed [K[Kq $y
]0;root@labvm: ~root@labvm:~# echo $/[K?
1
]0;root@labvm: ~root@labvm:~# echo $?test $x -eq $y;echo $?
1
]0;root@labvm: ~root@labvm:~# test $x -eq $y;echo $?[C[C[C[C[1P[1P[1@g[1@t
1
]0;root@labvm: ~root@labvm:~# test $x -gt $y;echo $?[C[1P[1@y[C[C[C[C[C[C[C[1P[1@x
0
]0;root@labvm: ~root@labvm:~# test $y -gt $x;echo $?[1P[1@e
0
]0;root@labvm: ~root@labvm:~# test $y -ge $x;echo $?[1P[1@n
0
]0;root@labvm: ~root@labvm:~# test $y -ne $x;echo $?[C[1P[1@l
1
]0;root@labvm: ~root@labvm:~# ca[K[Kvi Myscript.sh
[?1049h[22;0;0t[>4;2m[?1h=[?2004h[1;24r[?12h[?12l[22;2t[22;1t[27m[23m[29m[m[H[2J[?25l[24;1H"Myscript.sh" [New File][2;1H▽[6n[2;1H  [1;1H[>c]10;?]11;?[2;1H[94m~                                                                               [3;1H~                                                                               [4;1H~                                                                               [5;1H~                                                                               [6;1H~                                                                               [7;1H~                                                                               [8;1H~                                                                               [9;1H~                                                                               [10;1H~                                                                               [11;1H~                                                                               [12;1H~                                                                               [13;1H~                                                                               [14;1H~                                                                               [15;1H~                                                                               [16;1H~                                                                               [17;1H~                                                                               [18;1H~                                                                               [19;1H~                                                                               [20;1H~                                                                               [21;1H~                                                                               [22;1H~                                                                               [23;1H~                                                                               [m[24;63H0,0-1[9CAll[1;1H[?25hP+q436f\P+q6b75\P+q6b64\P+q6b72\P+q6b6c\P+q2332\P+q2334\P+q2569\P+q2a37\P+q6b31\[27m[23m[29m[m[H[2J[?25l[2;1H[94m~                                                                               [3;1H~                                                                               [4;1H~                                                                               [5;1H~                                                                               [6;1H~                                                                               [7;1H~                                                                               [8;1H~                                                                               [9;1H~                                                                               [10;1H~                                                                               [11;1H~                                                                               [12;1H~                                                                               [13;1H~                                                                               [14;1H~                                                                               [15;1H~                                                                               [16;1H~                                                                               [17;1H~                                                                               [18;1H~                                                                               [19;1H~                                                                               [20;1H~                                                                               [21;1H~                                                                               [22;1H~                                                                               [23;1H~                                                                               [m[24;63H0,0-1[9CAll
[?2004l[?1l>[?25h[>4;m[?1049l[23;0;0t]0;root@labvm: ~root@labvm:~# sh Myscript.sh
    January 2023      
Su Mo Tu We Th Fr Sa  
 1  2  3  4  5  6  7  
 8  9 10 [7m11[27m 12 13 14  
15 16 17 18 19 20 21  
22 23 24 25 26 27 28  
29 30 31              
                      
Wed 11 Jan 2023 09:38:57 AM UTC
devasc   tty7         2023-01-11 04:44 (:0)
/root
]0;root@labvm: ~root@labvm:~# vi merescript.sh
[?1049h[22;0;0t[>4;2m[?1h=[?2004h[1;24r[?12h[?12l[22;2t[22;1t[27m[23m[29m[m[H[2J[?25l[24;1H"merescript.sh" [New File][2;1H▽[6n[2;1H  [1;1H[>c]10;?]11;?[2;1H[94m~                                                                               [3;1H~                                                                               [4;1H~                                                                               [5;1H~                                                                               [6;1H~                                                                               [7;1H~                                                                               [8;1H~                                                                               [9;1H~                                                                               [10;1H~                                                                               [11;1H~                                                                               [12;1H~                                                                               [13;1H~                                                                               [14;1H~                                                                               [15;1H~                                                                               [16;1H~                                                                               [17;1H~                                                                               [18;1H~                                                                               [19;1H~                                                                               [20;1H~                                                                               [21;1H~                                                                               [22;1H~                                                                               [23;1H~                                                                               [m[24;63H0,0-1[9CAll[1;1H[?25hP+q436f\P+q6b75\P+q6b64\P+q6b72\P+q6b6c\P+q2332\P+q2334\P+q2569\P+q2a37\P+q6b31\[27m[23m[29m[m[H[2J[?25l[2;1H[94m~                                                                               [3;1H~                                                                               [4;1H~                                                                               [5;1H~                                                                               [6;1H~                                                                               [7;1H~                                                                               [8;1H~                                                                               [9;1H~                                                                               [10;1H~                                                                               [11;1H~                                                                               [12;1H~                                                                               [13;1H~                                                                               [14;1H~                                                                               [15;1H~                                                                               [16;1H~                                                                               [17;1H~                                                                               [18;1H~                                                                               [19;1H~                                                                               [20;1H~                                                                               [21;1H~                                                                               [22;1H~                                                                               [23;1H~                                                                               [m[24;63H0,0-1[9CAll
[?2004l[?1l>[?25h[>4;m[?1049l[23;0;0t]0;root@labvm: ~root@labvm:~# sh mera[Kescript.sh
Enter first number
5
Enter second number
12
Addition is 17
]0;root@labvm: ~root@labvm:~# cat merascript.sh
cat: merascript.sh: No such file or directory
]0;root@labvm: ~root@labvm:~# cat merascript.sh[1Pscript.shescript.sh
echo  "Enter first number"
read x
echo  "Enter second number"
read y
z=`expr $x + $y`
echo "Addition is $z"

]0;root@labvm: ~root@labvm:~# cat merescript.shascript.sh
Enter first number
25
Enter second number
36
Addition is 61
]0;root@labvm: ~root@labvm:~# sh merescript.sh
[?1049h[22;0;0t[>4;2m[?1h=[?2004h[1;24r[?12h[?12l[22;2t[22;1t[27m[23m[29m[m[H[2J[?25l[24;1H"merescript.sh" 7L, 109C[2;1H▽[6n[2;1H  [1;1H[>c]10;?]11;?[1;1H[38;5;130mecho[m[31m  [m[38;5;130m"[m[31mEnter first number[m[38;5;130m"
read[m x
[38;5;130mecho[m[31m  [m[38;5;130m"[m[31mEnter second number[m[38;5;130m"
read[m y
[36mz[m=[35m`[m[38;5;130mexpr[m[35m [m[35m$x[m[35m + [m[35m$y[m[35m`[m
[38;5;130mecho[m[31m [m[38;5;130m"[m[31mAddition is [m[35m$z[m[38;5;130m"[m

[94m~                                                                               [9;1H~                                                                               [10;1H~                                                                               [11;1H~                                                                               [12;1H~                                                                               [13;1H~                                                                               [14;1H~                                                                               [15;1H~                                                                               [16;1H~                                                                               [17;1H~                                                                               [18;1H~                                                                               [19;1H~                                                                               [20;1H~                                                                               [21;1H~                                                                               [22;1H~                                                                               [23;1H~                                                                               [m[24;63H7,0-1[9CAll[7;1H[?25hP+q436f\P+q6b75\P+q6b64\P+q6b72\P+q6b6c\P+q2332\P+q2334\P+q2569\P+q2a37\P+q6b31\[27m[23m[29m[m[H[2J[?25l[1;1H[93mecho[m[95m  [m[93m"[m[95mEnter first number[m[93m"
read[m x
[93mecho[m[95m  [m[93m"[m[95mEnter second number[m[93m"
read[m y
[1m[96mz[m=[38;5;224m`[m[93mexpr[m[38;5;224m [m[38;5;81m$x[m[38;5;224m + [m[38;5;81m$y[m[38;5;224m`[m
[93mecho[m[95m [m[93m"[m[95mAddition is [m[38;5;81m$z[m[93m"[m

[94m~                                                                               [9;1H~                                                                               [10;1H~                                                                               [11;1H~                                                                               [12;1H~                                                                               [13;1H~                                                                               [14;1H~                                                                               [15;1H~                                                                               [16;1H~                                                                               [17;1H~                                                                               [18;1H~                                                                               [19;1H~                                                                               [20;1H~                                                                               [21;1H~                                                                               [22;1H~                                                                               [23;1H~                                                                               [m[24;63H7,0-1[9CAll
[0m[01;34mDD1[0m  [01;34mDD2[0m  m1  m2  m3  merescript.sh  Myscript.sh  n  Number  [01;34msnap[0m  student_data
]0;root@labvm: ~root@labvm:~# cat Number
4
4135
874
21
84
21
27
8131
76854
12
6
7465
413
21
4
5416
26
41
135
43

]0;root@labvm: ~root@labvm:~# ls
[0m[01;34mDD1[0m  [01;34mDD2[0m  m1  m2  m3  merescript.sh  Myscript.sh  n  Number  [01;34msnap[0m  student_data
]0;root@labvm: ~root@labvm:~# cat student_data
Name            Branch   Grade
Amit Sharma     CSE        C
Sandeep Patel   CSE        B+
Vikas Patel     MECH       D
Mahavir Kumar   IT         A
Satendra Patel  ECE        B-
Aman Kushwaha   IT         B+
Sarthak Kosta   ECE        A

]0;root@labvm: ~root@labvm:~# ls
[0m[01;34mDD1[0m  [01;34mDD2[0m  m1  m2  m3  merescript.sh  Myscript.sh  n  Number  [01;34msnap[0m  student_data
]0;root@labvm: ~root@labvm:~# s[Kc[Kcat Myscript.sh
cal
date
who
pwd
]0;root@labvm: ~root@labvm:~# ls
[0m[01;34mDD1[0m  [01;34mDD2[0m  m1  m2  m3  merescript.sh  Myscript.sh  n  Number  [01;34msnap[0m  student_data
]0;root@labvm: ~root@labvm:~# vi swap.sh
[?1049h[22;0;0t[>4;2m[?1h=[?2004h[1;24r[?12h[?12l[22;2t[22;1t[27m[23m[29m[m[H[2J[?25l[24;1H"swap.sh" [New File][2;1H▽[6n[2;1H  [1;1H[>c]10;?]11;?[2;1H[94m~                                                                               [3;1H~                                                                               [4;1H~                                                                               [5;1H~                                                                               [6;1H~                                                                               [7;1H~                                                                               [8;1H~                                                                               [9;1H~                                                                               [10;1H~                                                                               [11;1H~                                                                               [12;1H~                                                                               [13;1H~                                                                               [14;1H~                                                                               [15;1H~                                                                               [16;1H~                                                                               [17;1H~                                                                               [18;1H~                                                                               [19;1H~                                                                               [20;1H~                                                                               [21;1H~                                                                               [22;1H~                                                                               [23;1H~                                                                               [m[24;63H0,0-1[9CAll[1;1H[?25hP+q436f\P+q6b75\P+q6b64\P+q6b72\P+q6b6c\P+q2332\P+q2334\P+q2569\P+q2a37\P+q6b31\[27m[23m[29m[m[H[2J[?25l[2;1H[94m~                                                                               [3;1H~                                                                               [4;1H~                                                                               [5;1H~                                                                               [6;1H~                                                                               [7;1H~                                                                               [8;1H~                                                                               [9;1H~                                                                               [10;1H~                                                                               [11;1H~                                                                               [12;1H~                                                                               [13;1H~                                                                               [14;1H~                                                                               [15;1H~                                                                               [16;1H~                                                                               [17;1H~                                                                               [18;1H~                                                                               [19;1H~                                                                               [20;1H~                                                                               [21;1H~                                                                               [22;1H~                                                                               [23;1H~                                                                               [m[24;63H0,0-1[9CAll
[?2004l[?1l>[?25h[>4;m[?1049l[23;0;0t]0;root@labvm: ~root@labvm:~# vi swap.sh[C[1P swap.sh[1P swap.shs swap.shh swap.sh
enter first number
25
enter second number
65
swap.sh: 1: 65: not found
x is  y is 
]0;root@labvm: ~root@labvm:~# sh swap.shvi[C[C[C[C[C[C[C[C
[?1049h[22;0;0t[>4;2m[?1h=[?2004h[1;24r[?12h[?12l[22;2t[22;1t[27m[23m[29m[m[H[2J[?25l[24;1H"swap.sh" 9L, 106C[2;1H▽[6n[2;1H  [1;1H[>c]10;?]11;?[1;1H[38;5;130mecho[m[31m [m[38;5;130m"[m[31menter first number[m[38;5;130m"
read[m x

[38;5;130mecho[m[31m [m[38;5;130m"[m[31menter second number[m[38;5;130m"
read[m y

[36mx[m=[35m`[m[35m$y[m[35m`[m
[36my[m=[35m`[m[35m$x[m[35m`[m
[38;5;130mecho[m[31m [m[38;5;130m"[m[31mx is [m[35m$x[m[31m y is [m[35m$y[m[38;5;130m"[m
[94m~                                                                               [11;1H~                                                                               [12;1H~                                                                               [13;1H~                                                                               [14;1H~                                                                               [15;1H~                                                                               [16;1H~                                                                               [17;1H~                                                                               [18;1H~                                                                               [19;1H~                                                                               [20;1H~                                                                               [21;1H~                                                                               [22;1H~                                                                               [23;1H~                                                                               [m[24;63H9,22[10CAll[9;22H[?25hP+q436f\P+q6b75\P+q6b64\P+q6b72\P+q6b6c\P+q2332\P+q2334\P+q2569\P+q2a37\P+q6b31\[27m[23m[29m[m[H[2J[?25l[1;1H[93mecho[m[95m [m[93m"[m[95menter first number[m[93m"
read[m x

[93mecho[m[95m [m[93m"[m[95menter second number[m[93m"
read[m y

[1m[96mx[m=[38;5;224m`[m[38;5;81m$y[m[38;5;224m`[m
[1m[96my[m=[38;5;224m`[m[38;5;81m$x[m[38;5;224m`[m
[93mecho[m[95m [m[93m"[m[95mx is [m[38;5;81m$x[m[95m y is [m[38;5;81m$y[m[93m"[m
[94m~                                                                               [11;1H~                                                                               [12;1H~                                                                               [13;1H~                                                                               [14;1H~                                                                               [15;1H~                                                                               [16;1H~                                                                               [17;1H~                                                                               [18;1H~                                                                               [19;1H~                                                                               [20;1H~                                                                               [21;1H~                                                                               [22;1H~                                                                               [23;1H~                                                                               [m[24;63H9,22[10CAll
[95mecho "x is $x y is $y"[m[24;65H4[9;4H[?25h[?25l[9;3H[K[10;1H[93mecho[1C"[m[5C[38;5;81m$x[6C$y[m[93m"[m[24;65H3[9;3H[?25h[?25l[38;5;224m`[m[24;65H4[9;4H[?25h[?25l[38;5;224me[m[24;65H5[9;5H[?25h[?25l[38;5;224mx[m[24;65H6[9;6H[?25h[?25l[38;5;224mp[m[24;65H7[9;7H[?25h[?25l[93mexpr[m[24;65H8[9;8H[?25h[?25l[38;5;224m [m[24;65H9[9;9H[?25h[?25l[38;5;224m$[m[24;65H10[9;10H[?25h[?25l[38;5;81m$x[m[24;66H1[9;11H[?25h[?25l[38;5;224m [m[24;66H2[9;12H[?25h[?25l[38;5;224m-[m[24;66H3[9;13H[?25h[?25l[38;5;224m [m[24;66H4[9;14H[?25h[?25l[38;5;224m$[m[24;66H5[9;15H[?25h[?25l[38;5;81m$y[m[24;66H6[9;16H[?25h[?25l[38;5;224m`[m[24;66H7[9;17H[?25h[24;1H[K[9;16H[?25l[24;53H^[[9;16H[24;53H  [9;17H[24;63H9,16[10CAll[9;16H[?25h[?25l[24;53H:[9;16H[24;53H[K[24;1H:[?2004h[?25hwq
[?2004l[?1l>[?25h[>4;m[?1049l[23;0;0t]0;root@labvm: ~root@labvm:~# vi swap.shsh[C[C[C[C[C[C[C[C
enter first number
25
enter second number
64
x is 64 y is 25
]0;root@labvm: ~root@labvm:~# sh swap.shvi[C[C[C[C[C[C[C[C
[?1049h[22;0;0t[>4;2m[?1h=[?2004h[1;24r[?12h[?12l[22;2t[22;1t[27m[23m[29m[m[H[2J[?25l[24;1H"swap.sh" 10L, 143C[2;1H▽[6n[2;1H  [1;1H[>c]10;?]11;?[1;1H[38;5;130mecho[m[31m [m[38;5;130m"[m[31menter first number[m[38;5;130m"
read[m x

[38;5;130mecho[m[31m [m[38;5;130m"[m[31menter second number[m[38;5;130m"
read[m y

[36mx[m=[35m`[m[38;5;130mexpr[m[35m [m[35m$x[m[35m + [m[35m$y[m[35m`[m
[36my[m=[35m`[m[38;5;130mexpr[m[35m [m[35m$x[m[35m - [m[35m$y[m[35m`[m
[36mx[m=[35m`[m[38;5;130mexpr[m[35m [m[35m$x[m[35m - [m[35m$y[m[35m`[m
[38;5;130mecho[m[31m [m[38;5;130m"[m[31mx is [m[35m$x[m[31m y is [m[35m$y[m[38;5;130m"[m
[94m~                                                                               [12;1H~                                                                               [13;1H~                                                                               [14;1H~                                                                               [15;1H~                                                                               [16;1H~                                                                               [17;1H~                                                                               [18;1H~                                                                               [19;1H~                                                                               [20;1H~                                                                               [21;1H~                                                                               [22;1H~                                                                               [23;1H~                                                                               [m[24;63H9,16[10CAll[9;16H[?25hP+q436f\P+q6b75\P+q6b64\P+q6b72\P+q6b6c\P+q2332\P+q2334\P+q2569\P+q2a37\P+q6b31\[27m[23m[29m[m[H[2J[?25l[1;1H[93mecho[m[95m [m[93m"[m[95menter first number[m[93m"
read[m x

[93mecho[m[95m [m[93m"[m[95menter second number[m[93m"
read[m y

[1m[96mx[m=[38;5;224m`[m[93mexpr[m[38;5;224m [m[38;5;81m$x[m[38;5;224m + [m[38;5;81m$y[m[38;5;224m`[m
[1m[96my[m=[38;5;224m`[m[93mexpr[m[38;5;224m [m[38;5;81m$x[m[38;5;224m - [m[38;5;81m$y[m[38;5;224m`[m
[1m[96mx[m=[38;5;224m`[m[93mexpr[m[38;5;224m [m[38;5;81m$x[m[38;5;224m - [m[38;5;81m$y[m[38;5;224m`[m
[93mecho[m[95m [m[93m"[m[95mx is [m[38;5;81m$x[m[95m y is [m[38;5;81m$y[m[93m"[m
[94m~                                                                               [12;1H~                                                                               [13;1H~                                                                               [14;1H~                                                                               [15;1H~                                                                               [16;1H~                                                                               [17;1H~                                                                               [18;1H~                                                                               [19;1H~                                                                               [20;1H~                                                                               [21;1H~                                                                               [22;1H~                                                                               [23;1H~                                                                               [m[24;63H9,16[10CAll
[1;24r[23;1H[94m~                                                                               [m[24;63H[K[24;63H3,1[11CAll[3;1H[?25h[?25l[24;65H2[3;2H[?25h[?25l[24;63H4[4;2H[?25h[?25l[24;63H5,1[5;1H[?25h[?25l[24;63H6,2[6;2H[?25h[?25l[24;63H7[7;2H[?25h[?25l[24;63H6[6;2H[?25h[?25l[24;63H5,1[5;1H[?25h[?25le[24;65H2[5;2H[?25h[?25lc[24;65H3[5;3H[?25h[?25lh[24;65H4[5;4H[?25h[?25l
[95mx=
y=
x=
echo[m[24;65H7[5;7H[?25h[?25l[95mb[m[24;65H8[5;8H[?25h[?25l[95me[m[24;65H9[5;9H[?25h[?25l[95mf[m[24;65H10[5;10H[?25h[?25l[95mo[m[24;66H1[5;11H[?25h[?25l[95mr[m[24;66H2[5;12H[?25h[?25l[95me[m[24;66H3[5;13H[?25h[?25l[95m [m[24;66H4[5;14H[?25h[?25l[95ms[m[24;66H5[5;15H[?25h[?25l[95mw[m[24;66H6[5;16H[?25h[?25l[95ma[m[24;66H7[5;17H[?25h[?25l[95mp[m[24;66H8[5;18H[?25h[?25l[95mi[m[24;66H9[5;19H[?25h[?25l[95mn[m[24;65H20[5;20H[?25h[?25l[95mg[m[24;66H1[5;21H[?25h[?25l[95m [m[24;66H2[5;22H[?25h[?25l[95mx[m[24;66H3[5;23H[?25h[?25l[95mi[m[24;66H4[5;24H[?25h[?25l[5;23H[K[24;66H3[5;23H[?25h[?25l[95m [m[24;66H4[5;24H[?25h[?25l[95mi[m[24;66H5[5;25H[?25h[?25l[95ms[m[24;66H6[5;26H[?25h[?25l[95m [m[24;66H7[5;27H[?25h[?25l[95m$[m[24;66H8[5;28H[?25h[?25l[38;5;81m$x[m[24;66H9[5;29H[?25h[?25l[95m [m[24;65H30[5;30H[?25h[?25l[95my[m[24;66H1[5;31H[?25h[?25l[95m [m[24;66H2[5;32H[?25h[?25l[95mi[m[24;66H3[5;33H[?25h[?25l[95ms[m[24;66H4[5;34H[?25h[?25l[95m [m[24;66H5[5;35H[?25h[?25l[95m$[m[24;66H6[5;36H[?25h[?25l[38;5;81m$y[m[24;66H7[5;37H[?25h[?25l[93m"[m
[1m[96mx[m=
[1m[96my[m=
[1m[96mx[m=
[93mecho[m[24;66H8[5;38H[?25h[?25l[24;63H6,17[6;17H[?25h[?25l[24;63H7[7;17H[?25h[?25l[24;63H8[8;17H[?25h[?25l[24;63H9,23[9;23H[?25h[?25l[24;66H2[9;22H[?25h[?25l[24;66H1[9;21H[?25h[?25l[24;66H0[9;20H[?25h[?25l[24;65H19[9;19H[?25h[?25l[24;66H8[9;18H[?25h[?25l[24;66H7[9;17H[?25h[?25l[24;66H6[9;16H[?25h[?25l[24;66H5[9;15H[?25h[?25l[24;66H4[9;14H[?25h[?25l[24;66H3[9;13H[?25h[?25l[24;66H2[9;12H[?25h[?25l[24;66H1[9;11H[?25h[?25l[24;66H0[9;10H[?25h[?25l[24;65H9 [9;9H[?25h[?25l[24;65H8[9;8H[?25h[?25l[24;65H7[9;7H[?25h[?25l[95max is [m[38;5;81m$x[m[95m y is [m[38;5;81m$y[m[93m"[m[24;65H8[9;8H[?25h[?25l[95mpx is [m[38;5;81m$x[m[95m y is [m[38;5;81m$y[m[93m"[m[24;65H9[9;9H[?25h[?25l[95mx is [m[38;5;81m$x[m[95m y is [m[38;5;81m$y[m[93m"[m[9;24H[K[24;65H8[9;8H[?25h[?25l[95mx is [m[38;5;81m$x[m[95m y is [m[38;5;81m$y[m[93m"[m[9;23H[K[24;65H7[9;7H[?25h[?25l[95mfx is [m[38;5;81m$x[m[95m y is [m[38;5;81m$y[m[93m"[m[24;65H8[9;8H[?25h[?25l[95mx is [m[38;5;81m$x[m[95m y is [m[38;5;81m$y[m[93m"[m[9;23H[K[24;65H7[9;7H[?25h[?25l[95max is [m[38;5;81m$x[m[95m y is [m[38;5;81m$y[m[93m"[m[24;65H8[9;8H[?25h[?25l[95mfx is [m[38;5;81m$x[m[95m y is [m[38;5;81m$y[m[93m"[m[24;65H9[9;9H[?25h[?25l[95mtx is [m[38;5;81m$x[m[95m y is [m[38;5;81m$y[m[93m"[m[24;65H10[9;10H[?25h[?25l[95mex is [m[38;5;81m$x[m[95m y is [m[38;5;81m$y[m[93m"[m[24;66H1[9;11H[?25h[?25l[95mrx is [m[38;5;81m$x[m[95m y is [m[38;5;81m$y[m[93m"[m[24;66H2[9;12H[?25h[?25l[95m x is [m[38;5;81m$x[m[95m y is [m[38;5;81m$y[m[93m"[m[24;66H3[9;13H[?25h[?25l[95msx is [m[38;5;81m$x[m[95m y is [m[38;5;81m$y[m[93m"[m[24;66H4[9;14H[?25h[?25l[95mwx is [m[38;5;81m$x[m[95m y is [m[38;5;81m$y[m[93m"[m[24;66H5[9;15H[?25h[?25l[95max is [m[38;5;81m$x[m[95m y is [m[38;5;81m$y[m[93m"[m[24;66H6[9;16H[?25h[?25l[95mpx is [m[38;5;81m$x[m[95m y is [m[38;5;81m$y[m[93m"[m[24;66H7[9;17H[?25h[?25l[95mix is [m[38;5;81m$x[m[95m y is [m[38;5;81m$y[m[93m"[m[24;66H8[9;18H[?25h[?25l[95mnx is [m[38;5;81m$x[m[95m y is [m[38;5;81m$y[m[93m"[m[24;66H9[9;19H[?25h[?25l[95mgx is [m[38;5;81m$x[m[95m y is [m[38;5;81m$y[m[93m"[m[24;65H20[9;20H[?25h[?25l[95m x is [m[38;5;81m$x[m[95m y is [m[38;5;81m$y[m[93m"[m[24;66H1[9;21H[?25h[24;1H[K[9;20H[?25l[24;53H^[[9;20H[24;53H  [9;21H[24;63H9,20[10CAll[9;20H[?25h[?25l[24;53H:[9;20H[24;53H[K[24;1H:[?2004h[?25hwq
[?2004l[?1l>[?25h[>4;m[?1049l[23;0;0t]0;root@labvm: ~root@labvm:~# vi swap.shsh[C[C[C[C[C[C[C[Cvi[C[C[C[C[C[C[C[Csh[C[C[C[C[C[C[C[Cvi[C[C[C[C[C[C[C[C[1P swap.sh[1P swap.shc swap.sha swap.sht swap.sh
echo "enter first number"
read x
echo "enter second number"
read y
echo "before swaping x is $x y is $y"
x=`expr $x + $y`
y=`expr $x - $y`
x=`expr $x - $y`
echo "after swaping x is $x y is $y"
]0;root@labvm: ~root@labvm:~# cat swap.sh[C[C[1P swap.sh[1P swap.sh[1P swap.shs swap.shh swap.sh
enter first number
25
enter second number
64
before swaping x is 25 y is 64
after swaping x is 64 y is 25
]0;root@labvm: ~root@labvm:~# ls
[0m[01;34mDD1[0m  m1  m3             Myscript.sh  Number  student_data
[01;34mDD2[0m  m2  merescript.sh  n            [01;34msnap[0m    swap.sh
]0;root@labvm: ~root@labvm:~# grep "CSE" student_data && echo "pate[Ktern found"
Amit Sharma     [01;31m[KCSE[m[K        C
Sandeep Patel   [01;31m[KCSE[m[K        B+
pattern found
]0;root@labvm: ~root@labvm:~# grep "CSE" student_data && echo "pattern found"[1P[1P[1P[1@M[1@B[1@A
]0;root@labvm: ~root@labvm:~# ls'[K
[0m[01;34mDD1[0m  m1  m3             Myscript.sh  Number  student_data
[01;34mDD2[0m  m2  merescript.sh  n            [01;34msnap[0m    swap.sh
]0;root@labvm: ~root@labvm:~# lsgrep "MBA" student_data && echo "pattern found"[C[C[1P[1P[1@|[1@|
pattern found
]0;root@labvm: ~root@labvm:~# grep "MBA" student_data || echo "pattern found"
pattern found
]0;root@labvm: ~root@labvm:~# grep "MBA" student_data || echo "pattern found"
Amit Sharma     [01;31m[KCSE[m[K        C
Sandeep Patel   [01;31m[KCSE[m[K        B+
]0;root@labvm: ~root@labvm:~# vi ifdemo.sh
[?1049h[22;0;0t[>4;2m[?1h=[?2004h[1;24r[?12h[?12l[22;2t[22;1t[27m[23m[29m[m[H[2J[?25l[24;1H"ifdemo.sh" [New File][2;1H▽[6n[2;1H  [1;1H[>c]10;?]11;?[2;1H[94m~                                                                               [3;1H~                                                                               [4;1H~                                                                               [5;1H~                                                                               [6;1H~                                                                               [7;1H~                                                                               [8;1H~                                                                               [9;1H~                                                                               [10;1H~                                                                               [11;1H~                                                                               [12;1H~                                                                               [13;1H~                                                                               [14;1H~                                                                               [15;1H~                                                                               [16;1H~                                                                               [17;1H~                                                                               [18;1H~                                                                               [19;1H~                                                                               [20;1H~                                                                               [21;1H~                                                                               [22;1H~                                                                               [23;1H~                                                                               [m[24;63H0,0-1[9CAll[1;1H[?25hP+q436f\P+q6b75\P+q6b64\P+q6b72\P+q6b6c\P+q2332\P+q2334\P+q2569\P+q2a37\P+q6b31\[27m[23m[29m[m[H[2J[?25l[2;1H[94m~                                                                               [3;1H~                                                                               [4;1H~                                                                               [5;1H~                                                                               [6;1H~                                                                               [7;1H~                                                                               [8;1H~                                                                               [9;1H~                                                                               [10;1H~                                                                               [11;1H~                                                                               [12;1H~                                                                               [13;1H~                                                                               [14;1H~                                                                               [15;1H~                                                                               [16;1H~                                                                               [17;1H~                                                                               [18;1H~                                                                               [19;1H~                                                                               [20;1H~                                                                               [21;1H~                                                                               [22;1H~                                                                               [23;1H~                                                                               [m[24;63H0,0-1[9CAll
        [2;9H[K[24;63H2,2-9[2;9H[?25h[?25l[24;65H1  [2;1H[?25h[?25lt[24;65H2[2;2H[?25h[?25lh[24;65H3[2;3H[?25h[?25le[24;65H4[2;4H[?25h[?25l
        [3;9H[K[24;63H3,2-9[3;9H[?25h[?25le[24;65H3-10[3;10H[?25h[?25lc[24;65H4-11[3;11H[?25h[?25lh[24;65H5-12[3;12H[?25h[?25l[93mecho[m[24;65H6-13[3;13H[?25h[?25l[95m [m[24;65H7-14[3;14H[?25h[?25l[93m"[m[24;65H8-15[3;15H[?25h[?25l[95mp[m[24;65H9-16[3;16H[?25h[?25l[95ma[m[24;65H10-17[3;17H[?25h[?25l[95mt[m[24;66H1-18[3;18H[?25h[?25l[95mt[m[24;66H2-19[3;19H[?25h[?25l[95me[m[24;66H3-20[3;20H[?25h[?25l[95mr[m[24;66H4-21[3;21H[?25h[?25l[95mn[m[24;66H5-22[3;22H[?25h[?25l[95m [m[24;66H6-23[3;23H[?25h[?25l[95mf[m[24;66H7-24[3;24H[?25h[?25l[95mo[m[24;66H8-25[3;25H[?25h[?25l[95mu[m[24;66H9-26[3;26H[?25h[?25l[95mn[m[24;65H20-27[3;27H[?25h[?25l[95md[m[24;66H1-28[3;28H[?25h[?25l[93m"[m[24;66H2-29[3;29H[?25h[?25l
        [4;9H[K[24;63H4,2-9  [4;9H[?25h[?25l[24;65H1  [4;1H[?25h[?25le[24;65H2[4;2H[?25h[?25ll[24;65H3[4;3H[?25h[?25ls[24;65H4[4;4H[?25h[?25l
        [5;9H[K[24;63H5,2-9[5;9H[?25h[?25le[24;65H3-10[5;10H[?25h[?25lc[24;65H4-11[5;11H[?25h[?25lh[24;65H5-12[5;12H[?25h[?25l[93mecho[m[24;65H6-13[5;13H[?25h[?25l[95m [m[24;65H7-14[5;14H[?25h[?25l[93m"[m[24;65H8-15[5;15H[?25h[?25l[95mp[m[24;65H9-16[5;16H[?25h[?25l[95ma[m[24;65H10-17[5;17H[?25h[?25l[95mt[m[24;66H1-18[5;18H[?25h[?25l[95mt[m[24;66H2-19[5;19H[?25h[?25l[95me[m[24;66H3-20[5;20H[?25h[?25l[95mr[m[24;66H4-21[5;21H[?25h[?25l[95mn[m[24;66H5-22[5;22H[?25h[?25l[95m [m[24;66H6-23[5;23H[?25h[?25l[95mn[m[24;66H7-24[5;24H[?25h[?25l[95ma[m[24;66H8-25[5;25H[?25h[?25l[5;24H[K[24;66H7-24[5;24H[?25h[?25l[95mo[m[24;66H8-25[5;25H[?25h[?25l[95mt[m[24;66H9-26[5;26H[?25h[?25l[95m [m[24;65H20-27[5;27H[?25h[?25l[95mf[m[24;66H1-28[5;28H[?25h[?25l[95mo[m[24;66H2-29[5;29H[?25h[?25l[95mu[m[24;66H3-30[5;30H[?25h[?25l[95mn[m[24;66H4-31[5;31H[?25h[?25l[95md[m[24;66H5-32[5;32H[?25h[?25l[93m"[m[24;66H6-33[5;33H[?25h[?25l
        [6;9H[K[24;63H6,2-9  [6;9H[?25h[?25l[24;65H1  [6;1H[?25h[?25lf[24;65H2[6;2H[?25h[?25l[93mfi[m[24;65H3[6;3H[?25h[24;1H[K[6;2H[?25l[24;53H^[[6;2H[24;53H  [6;3H[24;63H6,2[11CAll[6;2H[?25h[?25l[24;53H:[6;2H[24;53H[K[24;1H:[?2004h[?25hwq
[?2004l[?1l>[?25h[>4;m[?1049l[23;0;0t]0;root@labvm: ~root@labvm:~# cat id[Kfdemo.sh
if grep "$1" student_data>/dev/null
then
	echo "pattern found"
else
	echo "pattern not found"
fi
]0;root@labvm: ~root@labvm:~# cat ifdemo.sh[1P ifdemo.sh[1P ifdemo.sh[1P ifdemo.shs ifdemo.shh ifdemo.sh[C[C[C[C[C[C[C[C[C[C CSE
pattern found
]0;root@labvm: ~root@labvm:~# sh ifdemo.sh CSE[K[K[KMBA
pattern not found
]0;root@labvm: ~root@labvm:~# sh ifdemo.sh MBACSE
[?1049h[22;0;0t[>4;2m[?1h=[?2004h[1;24r[?12h[?12l[22;2t[22;1t[27m[23m[29m[m[H[2J[?25l[24;1H"ifdemo.sh" 6L, 97C[2;1H▽[6n[2;1H  [1;1H[>c]10;?]11;?[1;1H[38;5;130mif grep[m [38;5;130m"[m[35m$1[m[38;5;130m"[m student_data[38;5;130m>[m/dev/null
[38;5;130mthen[3;9Hecho[m[31m [m[38;5;130m"[m[31mpattern found[m[38;5;130m"
else[5;9Hecho[m[31m [m[38;5;130m"[m[31mpattern not found[m[38;5;130m"
fi[m
[94m~                                                                               [8;1H~                                                                               [9;1H~                                                                               [10;1H~                                                                               [11;1H~                                                                               [12;1H~                                                                               [13;1H~                                                                               [14;1H~                                                                               [15;1H~                                                                               [16;1H~                                                                               [17;1H~                                                                               [18;1H~                                                                               [19;1H~                                                                               [20;1H~                                                                               [21;1H~                                                                               [22;1H~                                                                               [23;1H~                                                                               [m[24;63H6,2[11CAll[6;2H[?25hP+q436f\P+q6b75\P+q6b64\P+q6b72\P+q6b6c\P+q2332\P+q2334\P+q2569\P+q2a37\P+q6b31\[27m[23m[29m[m[H[2J[?25l[1;1H[93mif grep[m [93m"[m[38;5;81m$1[m[93m"[m student_data[93m>[m/dev/null
[93mthen[3;9Hecho[m[95m [m[93m"[m[95mpattern found[m[93m"
else[5;9Hecho[m[95m [m[93m"[m[95mpattern not found[m[93m"
fi[m
[94m~                                                                               [8;1H~                                                                               [9;1H~                                                                               [10;1H~                                                                               [11;1H~                                                                               [12;1H~                                                                               [13;1H~                                                                               [14;1H~                                                                               [15;1H~                                                                               [16;1H~                                                                               [17;1H~                                                                               [18;1H~                                                                               [19;1H~                                                                               [20;1H~                                                                               [21;1H~                                                                               [22;1H~                                                                               [23;1H~                                                                               [m[24;63H6,2[11CAll
[?2004l[?1l>[?25h[>4;m[?1049l[23;0;0t]0;root@labvm: ~root@labvm:~# c[Kvi ifdemo.sh[C[1P ifdemo.sh[1P ifdemo.shc ifdemo.sha ifdemo.sht ifdemo.sh
if grep "$1" student_data>/dev/null
then
	echo "pattern found"
else
	echo "pattern not found"
fi
]0;root@labvm: ~root@labvm:~# cat ifdemo.sh[1Pvi[C[C[C[C[C[C[C[C[C[Csh ifdemo.sh MBACSE
pattern found
]0;root@labvm: ~root@labvm:~# sh ifdemo.sh CSE
[?1049h[22;0;0t[>4;2m[?1h=[?2004h[1;24r[?12h[?12l[22;2t[22;1t[27m[23m[29m[m[H[2J[?25l[24;1H"ifdemo.sh" 6L, 97C[2;1H▽[6n[2;1H  [1;1H[>c]10;?]11;?[1;1H[38;5;130mif grep[m [38;5;130m"[m[35m$1[m[38;5;130m"[m student_data[38;5;130m>[m/dev/null
[38;5;130mthen[3;9Hecho[m[31m [m[38;5;130m"[m[31mpattern found[m[38;5;130m"
else[5;9Hecho[m[31m [m[38;5;130m"[m[31mpattern not found[m[38;5;130m"
fi[m
[94m~                                                                               [8;1H~                                                                               [9;1H~                                                                               [10;1H~                                                                               [11;1H~                                                                               [12;1H~                                                                               [13;1H~                                                                               [14;1H~                                                                               [15;1H~                                                                               [16;1H~                                                                               [17;1H~                                                                               [18;1H~                                                                               [19;1H~                                                                               [20;1H~                                                                               [21;1H~                                                                               [22;1H~                                                                               [23;1H~                                                                               [m[24;63H6,2[11CAll[6;2H[?25hP+q436f\P+q6b75\P+q6b64\P+q6b72\P+q6b6c\P+q2332\P+q2334\P+q2569\P+q2a37\P+q6b31\[27m[23m[29m[m[H[2J[?25l[1;1H[93mif grep[m [93m"[m[38;5;81m$1[m[93m"[m student_data[93m>[m/dev/null
[93mthen[3;9Hecho[m[95m [m[93m"[m[95mpattern found[m[93m"
else[5;9Hecho[m[95m [m[93m"[m[95mpattern not found[m[93m"
fi[m
[94m~                                                                               [8;1H~                                                                               [9;1H~                                                                               [10;1H~                                                                               [11;1H~                                                                               [12;1H~                                                                               [13;1H~                                                                               [14;1H~                                                                               [15;1H~                                                                               [16;1H~                                                                               [17;1H~                                                                               [18;1H~                                                                               [19;1H~                                                                               [20;1H~                                                                               [21;1H~                                                                               [22;1H~                                                                               [23;1H~                                                                               [m[24;63H6,2[11CAll
[?2004l[?1l>[?25h[>4;m[?1049l[23;0;0t]0;root@labvm: ~root@labvm:~# vi ifdemo.shsh ifdemo.sh CSE[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[Kcat ifdemo.sh[1Pvi[C[C[C[C[C[C[C[C[C[Csh ifdemo.sh MBACSE
if grep "$1" student_data>
then
	echo "pattern found"
else
	echo "pattern not found"
fi
]0;root@labvm: ~root@labvm:~# cat ifdemo.sh[1Pvi[C[C[C[C[C[C[C[C[C[C[Kcat ifdemo.sh[1Pvi[C[C[C[C[C[C[C[C[C[Csh ifdemo.sh MBACSE
ifdemo.sh: 2: Syntax error: newline unexpected
]0;root@labvm: ~root@labvm:~# sh ifdemo.sh CSE
[?1049h[22;0;0t[>4;2m[?1h=[?2004h[1;24r[?12h[?12l[22;2t[22;1t[27m[23m[29m[m[H[2J[?25l[24;1H"ifdemo.sh" 6L, 88C[2;1H▽[6n[2;1H  [1;1H[>c]10;?]11;?[1;1H[38;5;130mif grep[m [38;5;130m"[m[35m$1[m[38;5;130m"[m student_data[38;5;130m>
then[3;9Hecho[m[31m [m[38;5;130m"[m[31mpattern found[m[38;5;130m"
else[5;9Hecho[m[31m [m[38;5;130m"[m[31mpattern not found[m[38;5;130m"
fi[m
[94m~                                                                               [8;1H~                                                                               [9;1H~                                                                               [10;1H~                                                                               [11;1H~                                                                               [12;1H~                                                                               [13;1H~                                                                               [14;1H~                                                                               [15;1H~                                                                               [16;1H~                                                                               [17;1H~                                                                               [18;1H~                                                                               [19;1H~                                                                               [20;1H~                                                                               [21;1H~                                                                               [22;1H~                                                                               [23;1H~                                                                               [m[24;63H1,26[10CAll[1;26H[?25hP+q436f\P+q6b75\P+q6b64\P+q6b72\P+q6b6c\P+q2332\P+q2334\P+q2569\P+q2a37\P+q6b31\[27m[23m[29m[m[H[2J[?25l[1;1H[93mif grep[m [93m"[m[38;5;81m$1[m[93m"[m student_data[93m>
then[3;9Hecho[m[95m [m[93m"[m[95mpattern found[m[93m"
else[5;9Hecho[m[95m [m[93m"[m[95mpattern not found[m[93m"
fi[m
[94m~                                                                               [8;1H~                                                                               [9;1H~                                                                               [10;1H~                                                                               [11;1H~                                                                               [12;1H~                                                                               [13;1H~                                                                               [14;1H~                                                                               [15;1H~                                                                               [16;1H~                                                                               [17;1H~                                                                               [18;1H~                                                                               [19;1H~                                                                               [20;1H~                                                                               [21;1H~                                                                               [22;1H~                                                                               [23;1H~                                                                               [m[24;63H1,26[10CAll
[1;24r[1;1H[93mif grep[m [93m"[m[38;5;81m$1[m[93m"[m student_data[93m>then[m[23;1H[94m~                                                                               [m[24;63H[K[24;63H1,27[10CAll[1;27H[?25h[?25lthen[1;30H[K[24;66H6[1;26H[?25h[?25l[2;23r[2;1H[L[1;24r[1;26H[K[2;1H[93mthen[m[24;63H[K[24;63H2,1[11CAll[2;1H[?25h[24;1H[K[2;1H[?25l[24;53H^[[2;1H[24;53H  [2;1H[24;63H2,1[11CAll[2;1H[?25h[?25l[24;53H:[2;1H[24;53H[K[24;1H:[?2004h[?25hwq
[?2004l[?1l>[?25h[>4;m[?1049l[23;0;0t]0;root@labvm: ~root@labvm:~# vi ifdemo.shsh ifdemo.sh CSE
if grep "$1" student_data
then
	echo "pattern found"
else
	echo "pattern not found"
fi
]0;root@labvm: ~root@labvm:~# cat ifdemo.sh[1Pvi[C[C[C[C[C[C[C[C[C[Csh ifdemo.sh CSE
Amit Sharma     CSE        C
Sandeep Patel   CSE        B+
pattern found
]0;root@labvm: ~root@labvm:~# sh ifdemo.sh CSE
[?1049h[22;0;0t[>4;2m[?1h=[?2004h[1;24r[?12h[?12l[22;2t[22;1t[27m[23m[29m[m[H[2J[?25l[24;1H"ifdemo.sh" 6L, 87C[2;1H▽[6n[2;1H  [1;1H[>c]10;?]11;?[1;1H[38;5;130mif grep[m [38;5;130m"[m[35m$1[m[38;5;130m"[m student_data
[38;5;130mthen[3;9Hecho[m[31m [m[38;5;130m"[m[31mpattern found[m[38;5;130m"
else[5;9Hecho[m[31m [m[38;5;130m"[m[31mpattern not found[m[38;5;130m"
fi[m
[94m~                                                                               [8;1H~                                                                               [9;1H~                                                                               [10;1H~                                                                               [11;1H~                                                                               [12;1H~                                                                               [13;1H~                                                                               [14;1H~                                                                               [15;1H~                                                                               [16;1H~                                                                               [17;1H~                                                                               [18;1H~                                                                               [19;1H~                                                                               [20;1H~                                                                               [21;1H~                                                                               [22;1H~                                                                               [23;1H~                                                                               [m[24;63H2,1[11CAll[2;1H[?25hP+q436f\P+q6b75\P+q6b64\P+q6b72\P+q6b6c\P+q2332\P+q2334\P+q2569\P+q2a37\P+q6b31\[27m[23m[29m[m[H[2J[?25l[1;1H[93mif grep[m [93m"[m[38;5;81m$1[m[93m"[m student_data
[93mthen[3;9Hecho[m[95m [m[93m"[m[95mpattern found[m[93m"
else[5;9Hecho[m[95m [m[93m"[m[95mpattern not found[m[93m"
fi[m
[94m~                                                                               [8;1H~                                                                               [9;1H~                                                                               [10;1H~                                                                               [11;1H~                                                                               [12;1H~                                                                               [13;1H~                                                                               [14;1H~                                                                               [15;1H~                                                                               [16;1H~                                                                               [17;1H~                                                                               [18;1H~                                                                               [19;1H~                                                                               [20;1H~                                                                               [21;1H~                                                                               [22;1H~                                                                               [23;1H~                                                                               [m[24;63H2,1[11CAll
[?2004l[?1l>[?25h[>4;m[?1049l[23;0;0t]0;root@labvm: ~root@labvm:~# vi ifdemo.shsh ifdemo.sh CSE
pattern found
]0;root@labvm: ~root@labvm:~# ls >/dev/tty
[0m[01;34mDD1[0m  ifdemo.sh  m2  merescript.sh  n       [01;34msnap[0m          swap.sh
[01;34mDD2[0m  m1         m3  Myscript.sh    Number  student_data
]0;root@labvm: ~root@labvm:~# ls
[0m[01;34mDD1[0m  ifdemo.sh  m2  merescript.sh  n       [01;34msnap[0m          swap.sh
[01;34mDD2[0m  m1         m3  Myscript.sh    Number  student_data
]0;root@labvm: ~root@labvm:~# ls >/dev/tty[K[K[K[K[K[K[K[K[K[K[K[Kexit
exit
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ exit
exit

Script done on 2023-01-11 10:23:47+00:00 [COMMAND_EXIT_CODE="0"]