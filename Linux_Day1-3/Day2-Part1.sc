Script started on 2023-01-10 04:48:46+00:00 [TERM="xterm-256color" TTY="/dev/pts/0" COLUMNS="80" LINES="24"]
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ cat>t[Kfile1
today is a very disaterous day
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ wc file1
 1  6 31 file1
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ wc -l[Kc
^[[A^[[A        
1
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ wc -cfile1cat>file1[1Pwc file1[3P-c file1
31 file1
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ wc -c file1[1P file1l file1
1 file1
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ wc -l file1[C[1P file1w file1
6 file1
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ cat [K>file2
today is not a good day to start
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ cmp file1 file2
file1 file2 differ: byte 10, line 1
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ cat>file3
today is not a goog d day to start
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ cat>file3mp file1 file2[C[C[1P file23 file2
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ cat>?[Kto[K1>t2
the   is will save im n t2 file and ti   1 file will create empty
cat>t1>t2
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ cat>>t1>>t2
this willonly ^[[D^[[D^[[D^[[D                      l only append to t2 file and t1 file will be w empty
cat>>t1>>t2
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ cat [K>list [K1
aman
baman
caman    hman   aman
dog
fisg h
god
lord 
hev   nobody
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ cat>list2
baman
fish
lord
nobody
orange
rabbit
star
television
^Ccat>list2[K
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ comm lisy[Kt1 list2
aman
		baman
chaman
dog
		fish
god
	lord
lord 
		nobody
	orange
	rabbit
	star
	television
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ comm list1 list2[C[1@ [1@-[1@1[C[1@ [1@-[1@2[C[1@ 
baman
fish
nobody
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ comm -1 -2  list1 list2[1P[1P
	baman
	fish
lord
	nobody
orange
rabbit
star
television
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ comm -1   list1 list2[1P[1@2[C[C[1P
aman
	baman
chaman
dog
	fish
god
lord 
	nobody
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ comm -2  list1 list2[1P[1@3
aman
chaman
dog
god
	lord
lord 
	orange
	rabbit
	star
	television
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ comm -3  list1 list2[C[1P[1@1[C[C[C[1@ [1@-[1@2[C[C[1@ [1@-[1@3
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ list[K[K[K[Kcat>lid[Kst3
jkfdh     kaman l
gagan
patel
sahu
aman
yaman
k ravan
chaapal
couple
magan
havan
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ sort list3>list4
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ cat list4
aman
chaapal
couple
gagan
havan
kamal
magan
patel
ravan
sahu
yaman
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ cat list4sort list3>list4[K[K[K[K[K[K
aman
chaapal
couple
gagan
havan
kamal
magan
patel
ravan
sahu
yaman
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ cat>[K list3
kamal
gagan
patel
sahu
aman
yaman
ravan
chaapal
couple
magan
havan
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ size list4
size: list4: file format not recognized
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ size list4[1Pcat list3[1@sor[C[C[C[C[C[C[C[1Pcat list4sort list3>list4[7Pcat>list3omm -1 -2 -3  list1 list2[6P[C[C[C[C[C[C[C[C[C[C[C[C[C[C2[C[C[C[C[C[C[C[C[C[C[C[C[C[1@1 [C[C[C[C[C[C[C[C[C[C[C[C[C[2@-2[C[C[C[C[C[C[C[C[C[C[C[C[C[7P[C[C[C[C[C[C[C[C[C[C[C[7Pat>list21>t1>>t2[2Pt1>t2mp file3 file2[6Pat>file3mp file1 file2[6Pat>file2wc -w file1l[C[C[C[C[C[Cc[C[C[C[C[C[C[Kfile1cat>file1[K[K[K[K[K[K[K[K[Kcat>filw[Ke5
qwertyuiop
asdfghjkl
zxcvbnm,
qazwsxedc
rfvtgbyhn
ujmik,ol.
azxswedc
rfvtgbyhn
ujmik,ol.
plkmojnuhb
uyhgtdgf
wasdzxcv
gjbhm
sfrhbf
sdtn u
hgkntjhg
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ wc -c file5
147 file5
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ gzip m[Klist[K[K[K[Kfile5
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ ls
[0m[01;34mDesktop[0m    [01;34mDownloads[0m  file2  [01;31mfile5.gz[0m  list1  list3  [01;34msnap[0m  t2
[01;34mDocuments[0m  file1      file3  [01;34mlabs[0m      list2  list4  t1    TODAY_IS_SECOND_DAY
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ lsgzip file5[1@wc -c[C[C[C[C[C[C[C[C.gz
130 file5.gz
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ wc -c file5.gzls[Kgzip file5[C file5[C[C[C file5[1@-[1@d[C[C[C[C[C[C[C.gz
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ ls
[0m[01;34mDesktop[0m    [01;34mDownloads[0m  file2  file5  list1  list3  [01;34msnap[0m  t2
[01;34mDocuments[0m  file1      file3  [01;34mlabs[0m   list2  list4  t1    TODAY_IS_SECOND_DAY
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ lsgzip -d  file5.gz[3Pwc -c[C[C[C[C[C[C[C[C[Cls[Kgzip file5
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ gunzip file5.gz
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ ls
[0m[01;34mDesktop[0m    [01;34mDownloads[0m  file2  file5  list1  list3  [01;34msnap[0m  t2
[01;34mDocuments[0m  file1      file3  [01;34mlabs[0m   list2  list4  t1    TODAY_IS_SECOND_DAY
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ lsgunzip file5.gz[5Pzip file5
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ ls
[0m[01;34mDesktop[0m    [01;34mDownloads[0m  file2  [01;31mfile5.gz[0m  list1  list3  [01;34msnap[0m  t2
[01;34mDocuments[0m  file1      file3  [01;34mlabs[0m      list2  list4  t1    TODAY_IS_SECOND_DAY
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ lsgzip file5ls[Kgzip file5ls[Kgzip file5ls[Kgunzip file5.gz
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ ls
[0m[01;34mDesktop[0m    [01;34mDownloads[0m  file2  file5  list1  list3  [01;34msnap[0m  t2
[01;34mDocuments[0m  file1      file3  [01;34mlabs[0m   list2  list4  t1    TODAY_IS_SECOND_DAY
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ mkdir
mkdir: missing operand
Try 'mkdir --help' for more information.
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ mkdir filelist
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ ls
[0m[01;34mDesktop[0m    file1  file5     list1  list4  t2
[01;34mDocuments[0m  file2  [01;34mfilelist[0m  list2  [01;34msnap[0m   TODAY_IS_SECOND_DAY
[01;34mDownloads[0m  file3  [01;34mlabs[0m      list3  t1
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ fd [K[K[Kcd filelist
]0;devasc@labvm: ~/filelist[01;32mdevasc@labvm[00m:[01;34m~/filelist[00m$ touch f1 f2f[K f3 f4 f5 f6f [C[1P [C f 7 [C f 8 [C f 9 [C f 1 0 
]0;devasc@labvm: ~/filelist[01;32mdevasc@labvm[00m:[01;34m~/filelist[00m$ ls
f1  f10  f2  f3  f4  f5  f6  f7  f8  f9
]0;devasc@labvm: ~/filelist[01;32mdevasc@labvm[00m:[01;34m~/filelist[00m$ lstouch f1 f2 f3 f4 f5 f6 f7 f8 f9 f10 [C[C[1P[1P[1P[1P[1P[1@t[1@a[1@r[C[1@ [1@-[1@c[1@v[1@f[C[1@ [1@f[1@.[1@t[1@a[1@r
f1
f2
f3
f4
f5
f6
f7
f8
f9
f10
]0;devasc@labvm: ~/filelist[01;32mdevasc@labvm[00m:[01;34m~/filelist[00m$ ls
f1  f10  f2  f3  f4  f5  f6  f7  f8  f9  [0m[01;31mf.tar[0m
]0;devasc@labvm: ~/filelist[01;32mdevasc@labvm[00m:[01;34m~/filelist[00m$ lstar -cvf f.tar f1 f2 f3 f4 f5 f6 f7 f8 f9 f10 [1P[1P[1P[1P[1P[1@j[1@a[1@b[1@a[1@l[1@p[1@u[1@r
f1
f2
f3
f4
f5
f6
f7
f8
f9
f10
]0;devasc@labvm: ~/filelist[01;32mdevasc@labvm[00m:[01;34m~/filelist[00m$ ls
f1  f10  f2  f3  f4  f5  f6  f7  f8  f9  [0m[01;31mf.tar[0m  jabalpur
]0;devasc@labvm: ~/filelist[01;32mdevasc@labvm[00m:[01;34m~/filelist[00m$ file jaba;[Klpur
jabalpur: POSIX tar archive (GNU)
]0;devasc@labvm: ~/filelist[01;32mdevasc@labvm[00m:[01;34m~/filelist[00m$ file f.tar
f.tar: POSIX tar archive (GNU)
]0;devasc@labvm: ~/filelist[01;32mdevasc@labvm[00m:[01;34m~/filelist[00m$ ls
f1  f10  f2  f3  f4  f5  f6  f7  f8  f9  [0m[01;31mf.tar[0m  jabalpur
]0;devasc@labvm: ~/filelist[01;32mdevasc@labvm[00m:[01;34m~/filelist[00m$ rm f[1-10]
]0;devasc@labvm: ~/filelist[01;32mdevasc@labvm[00m:[01;34m~/filelist[00m$ ls
f10  f2  f3  f4  f5  f6  f7  f8  f9  [0m[01;31mf.tar[0m  jabalpur
]0;devasc@labvm: ~/filelist[01;32mdevasc@labvm[00m:[01;34m~/filelist[00m$ lsrm f[1-10][C[1P-10]2-10][C[C[C[C[C[1P-10]1-10]0-10][C[C[C[1P][1P]9]
]0;devasc@labvm: ~/filelist[01;32mdevasc@labvm[00m:[01;34m~/filelist[00m$ ls
f10  [0m[01;31mf.tar[0m  jabalpur
]0;devasc@labvm: ~/filelist[01;32mdevasc@labvm[00m:[01;34m~/filelist[00m$ rm f10
]0;devasc@labvm: ~/filelist[01;32mdevasc@labvm[00m:[01;34m~/filelist[00m$ ls
[0m[01;31mf.tar[0m  jabalpur
]0;devasc@labvm: ~/filelist[01;32mdevasc@labvm[00m:[01;34m~/filelist[00m$ tar -tvf f.tar
-rw-rw-r-- devasc/devasc     0 2023-01-10 05:23 f1
-rw-rw-r-- devasc/devasc     0 2023-01-10 05:23 f2
-rw-rw-r-- devasc/devasc     0 2023-01-10 05:23 f3
-rw-rw-r-- devasc/devasc     0 2023-01-10 05:23 f4
-rw-rw-r-- devasc/devasc     0 2023-01-10 05:23 f5
-rw-rw-r-- devasc/devasc     0 2023-01-10 05:23 f6
-rw-rw-r-- devasc/devasc     0 2023-01-10 05:23 f7
-rw-rw-r-- devasc/devasc     0 2023-01-10 05:23 f8
-rw-rw-r-- devasc/devasc     0 2023-01-10 05:23 f9
-rw-rw-r-- devasc/devasc     0 2023-01-10 05:23 f10
]0;devasc@labvm: ~/filelist[01;32mdevasc@labvm[00m:[01;34m~/filelist[00m$ ls
[0m[01;31mf.tar[0m  jabalpur
]0;devasc@labvm: ~/filelist[01;32mdevasc@labvm[00m:[01;34m~/filelist[00m$ lstar -tvf f.tar[C[1P[1@x
f1
f2
f3
f4
f5
f6
f7
f8
f9
f10
]0;devasc@labvm: ~/filelist[01;32mdevasc@labvm[00m:[01;34m~/filelist[00m$ ls
f1  f10  f2  f3  f4  f5  f6  f7  f8  f9  [0m[01;31mf.tar[0m  jabalpur
]0;devasc@labvm: ~/filelist[01;32mdevasc@labvm[00m:[01;34m~/filelist[00m$ lstar -xvf f.tar[K[K[K[K[K[K[K[K[K[K[K[K[K[Kdate;cal
Tue 10 Jan 2023 05:38:35 AM UTC
    January 2023      
Su Mo Tu We Th Fr Sa  
 1  2  3  4  5  6  7  
 8  9 [7m10[27m 11 12 13 14  
15 16 17 18 19 20 21  
22 23 24 25 26 27 28  
29 30 31              
                      
]0;devasc@labvm: ~/filelist[01;32mdevasc@labvm[00m:[01;34m~/filelist[00m$ date;calls[Ktar -xvf f.tarls[Ktar -tvf f.tarls[Krm f10[4Plsrm f[10-9]ls[Krm f[1-10]ls[Kfile f.tarjabalpurls[Ktar -cvf jabalpur f1 f2 f3 f4 f5 f6 f7 f8 f9 f10 [C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[Cls[Ktar -cvf f.tar f1 f2 f3 f4 f5 f6 f7 f8 f9 f10 [C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[Cls[Ktouch f1 f2 f3 f4 f5 f6 f7 f8 f9 f10 [C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[Ccd filelist[Kls[Kmkdir filelist[K[3Plsgunzip file5.gzls[Kgzip file5ls[Kgunzip file5.gz[5Pzip file5ls[Kgzip -d  file5.gz[3Pwc -c[C[C[C[C[C[C[C[C[Cls[Kgzip file5[1@wc -c[C[C[C[C[C[C[2Pcat>file5size list4[1Pcat list3[1@sor[C[C[C[C[C[C[C[1Pcat list4sort list3>list4[7Pcat>list3omm -1 -2 -3  list1 list2[6P[C[C[C[C[C[C[C[C[C[C[C[C[C[C2[C[C[C[C[C[C[C[C[C[C[C[C[C[1@1 [C[C[C[C[C[C[C[C[C[C[C[C[C[2@-2[C[C[C[C[C[C[C[C[C[C[C[C[C[7P[C[C[C[C[C[C[C[C[C[C[C[7Pat>list21>t1>>t2[2Pt1>t2mp file3 file2[6Pat>file3mp file1 file2[6Pat>file2wc -w file1l[C[C[C[C[C[Cc[C[C[C[C[C[C[Kfile1cat>file1[K[K[K[K[K[K[K[K[Kls
f1  f10  f2  f3  f4  f5  f6  f7  f8  f9  [0m[01;31mf.tar[0m  jabalpur
]0;devasc@labvm: ~/filelist[01;32mdevasc@labvm[00m:[01;34m~/filelist[00m$ cate[K>[K[K[K[Ktouch file1;tar ls[K[K[Ktar -cvf kpp[Kop.taz [K[Kr f[1-9];rm f[1-9]
f1
f2
f3
f4
f5
f6
f7
f8
f9
]0;devasc@labvm: ~/filelist[01;32mdevasc@labvm[00m:[01;34m~/filelist[00m$ ls
f10  [0m[01;31mf.tar[0m  jabalpur  [01;31mkpop.tar[0m
]0;devasc@labvm: ~/filelist[01;32mdevasc@labvm[00m:[01;34m~/filelist[00m$ lstar -cvf kpop.tar f[1-9];rm f[1-9][C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[Cls[Kdate;calls[Ktar -xvf f.tarls[Ktar -tvf f.tarls[Krm f10[4Plsrm f[10-9]ls[Krm f[1-10]ls[Kfile f.tarjabalpurls[Ktar -cvf jabalpur f1 f2 f3 f4 f5 f6 f7 f8 f9 f10 [C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[Cls[Ktar -cvf f.tar f1 f2 f3 f4 f5 f6 f7 f8 f9 f10 [C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[Cls[Ktouch f1 f2 f3 f4 f5 f6 f7 f8 f9 f10 [C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[Ccd filelist[Kls[Kmkdir filelist[K filelistls[Kcd filelisttouch f1 f2 f3 f4 f5 f6 f7 f8 f9 f10 
]0;devasc@labvm: ~/filelist[01;32mdevasc@labvm[00m:[01;34m~/filelist[00m$ ls
f1  f10  f2  f3  f4  f5  f6  f7  f8  f9  [0m[01;31mf.tar[0m  jabalpur  [01;31mkpop.tar[0m
]0;devasc@labvm: ~/filelist[01;32mdevasc@labvm[00m:[01;34m~/filelist[00m$ rm f[1-10]
]0;devasc@labvm: ~/filelist[01;32mdevasc@labvm[00m:[01;34m~/filelist[00m$ ls
f10  f2  f3  f4  f5  f6  f7  f8  f9  [0m[01;31mf.tar[0m  jabalpur  [01;31mkpop.tar[0m
]0;devasc@labvm: ~/filelist[01;32mdevasc@labvm[00m:[01;34m~/filelist[00m$ lsrm f[1-10][1P-10][C[1P10][C[C-]9]
]0;devasc@labvm: ~/filelist[01;32mdevasc@labvm[00m:[01;34m~/filelist[00m$ rm f[10-9][K[K[K[K[K[K[K[K[K[Kls
f10  [0m[01;31mf.tar[0m  jabalpur  [01;31mkpop.tar[0m
]0;devasc@labvm: ~/filelist[01;32mdevasc@labvm[00m:[01;34m~/filelist[00m$ rm f10
]0;devasc@labvm: ~/filelist[01;32mdevasc@labvm[00m:[01;34m~/filelist[00m$ ls
[0m[01;31mf.tar[0m  jabalpur  [01;31mkpop.tar[0m
]0;devasc@labvm: ~/filelist[01;32mdevasc@labvm[00m:[01;34m~/filelist[00m$ lsrm f10[4Plsrm f[10-9]ls[Krm f[1-10]ls[Ktouch f1 f2 f3 f4 f5 f6 f7 f8 f9 f10 
]0;devasc@labvm: ~/filelist[01;32mdevasc@labvm[00m:[01;34m~/filelist[00m$ ls>ls_op
]0;devasc@labvm: ~/filelist[01;32mdevasc@labvm[00m:[01;34m~/filelist[00m$ cat ls_op
f1
f10
f2
f3
f4
f5
f6
f7
f8
f9
f.tar
jabalpur
kpop.tar
ls_op
]0;devasc@labvm: ~/filelist[01;32mdevasc@labvm[00m:[01;34m~/filelist[00m$ wc -l ls_op
14 ls_op
]0;devasc@labvm: ~/filelist[01;32mdevasc@labvm[00m:[01;34m~/filelist[00m$ ls[Ks[Ks|wc -l
14
]0;devasc@labvm: ~/filelist[01;32mdevasc@labvm[00m:[01;34m~/filelist[00m$ who|wc -l
1
]0;devasc@labvm: ~/filelist[01;32mdevasc@labvm[00m:[01;34m~/filelist[00m$ echo ""t"h"e"r" "[1P"e" "a"r"e" "`"w"h"o"|"w"c" "-"l"`" "u"s"e"r"s" "w"p"[1P"o"r"k"i"n"h"[1P"g" "o"n"l"i"n"e" "a"n"d" "`" [A]0;devasc@labvm: ~/filelist[01;32mdevasc@labvm[00m:[01;34m~/filelist[00m$ [C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[Cl"s"|"w"c" "-"l"`" "f"i"l"e"s" "i"n" "t"h"e" "p"r"e"s"e"n"t" "d"i"r"e"c"t"o"r"y"
there are 1 users working online and 14 files in the present directory
]0;devasc@labvm: ~/filelist[01;32mdevasc@labvm[00m:[01;34m~/filelist[00m$ [K]0;devasc@labvm: ~/filelist[01;32mdevasc@labvm[00m:[01;34m~/filelist[00m$ [K]0;devasc@labvm: ~/filelist[01;32mdevasc@labvm[00m:[01;34m~/filelist[00m$ ls -l
total 40
-rw-rw-r-- 1 devasc devasc     0 Jan 10 05:48 f1
-rw-rw-r-- 1 devasc devasc     0 Jan 10 05:48 f10
-rw-rw-r-- 1 devasc devasc     0 Jan 10 05:48 f2
-rw-rw-r-- 1 devasc devasc     0 Jan 10 05:48 f3
-rw-rw-r-- 1 devasc devasc     0 Jan 10 05:48 f4
-rw-rw-r-- 1 devasc devasc     0 Jan 10 05:48 f5
-rw-rw-r-- 1 devasc devasc     0 Jan 10 05:48 f6
-rw-rw-r-- 1 devasc devasc     0 Jan 10 05:48 f7
-rw-rw-r-- 1 devasc devasc     0 Jan 10 05:48 f8
-rw-rw-r-- 1 devasc devasc     0 Jan 10 05:48 f9
-rw-rw-r-- 1 devasc devasc 10240 Jan 10 05:27 [0m[01;31mf.tar[0m
-rw-rw-r-- 1 devasc devasc 10240 Jan 10 05:29 jabalpur
-rw-rw-r-- 1 devasc devasc 10240 Jan 10 05:41 [01;31mkpop.tar[0m
-rw-rw-r-- 1 devasc devasc    61 Jan 10 05:48 ls_op
]0;devasc@labvm: ~/filelist[01;32mdevasc@labvm[00m:[01;34m~/filelist[00m$ cd ..
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ ls -ls
total 76
 4 drwxr-xr-x 2 devasc devasc  4096 Jul 21  2020 [0m[01;34mDesktop[0m
 4 drwxr-xr-x 2 devasc devasc  4096 Jan 10 04:46 [01;34mDocuments[0m
 4 drwxr-xr-x 2 devasc devasc  4096 Jan 10 04:46 [01;34mDownloads[0m
 4 -rw-rw-r-- 1 devasc devasc    31 Jan 10 04:49 file1
 4 -rw-rw-r-- 1 devasc devasc    33 Jan 10 04:51 file2
 4 -rw-rw-r-- 1 devasc devasc    33 Jan 10 04:55 file3
 4 -rw-rw-r-- 1 devasc devasc   147 Jan 10 05:16 file5
 4 drwxrwxr-x 2 devasc devasc  4096 Jan 10 05:48 [01;34mfilelist[0m
 4 drwxr-xr-x 3 devasc devasc  4096 Jun 17  2020 [01;34mlabs[0m
 4 -rw-rw-r-- 1 devasc devasc    44 Jan 10 05:03 list1
 4 -rw-rw-r-- 1 devasc devasc    53 Jan 10 05:04 list2
 4 -rw-rw-r-- 1 devasc devasc    67 Jan 10 05:11 list3
 4 -rw-rw-r-- 1 devasc devasc    67 Jan 10 05:12 list4
 4 drwxr-xr-x 5 devasc devasc  4096 Jun 17  2020 [01;34msnap[0m
 0 -rw-rw-r-- 1 devasc devasc     0 Jan 10 04:58 t1
 4 -rw-rw-r-- 1 devasc devasc   137 Jan 10 05:00 t2
16 -rw-rw-r-- 1 devasc devasc 16384 Jan 10 05:48 TODAY_IS_SECOND_DAY
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ exit
exit

Script done on 2023-01-10 06:23:05+00:00 [COMMAND_EXIT_CODE="0"]
