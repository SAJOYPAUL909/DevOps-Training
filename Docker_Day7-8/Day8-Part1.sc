Script started on 2023-01-18 05:16:44+00:00 [TERM="xterm-256color" TTY="/dev/pts/0" COLUMNS="111" LINES="24"]
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ d[Kls[K[Kmkdir DVol
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ cd Dv[KVol
]0;devasc@labvm: ~/DVol[01;32mdevasc@labvm[00m:[01;34m~/DVol[00m$ vi Docker fil[K[K[K[K[Krfile
[?1049h[22;0;0t[>4;2m[?1h=[?2004h[1;24r[?12h[?12l[22;2t[22;1t[27m[23m[29m[m[H[2J[?25l[24;1H"Dockerfile" [New File][2;1H▽[6n[2;1H  [1;1H[>c]10;?]11;?[2;1H[94m~                                                                                                              [3;1H~                                                                                                              [4;1H~                                                                                                              [5;1H~                                                                                                              [6;1H~                                                                                                              [7;1H~                                                                                                              [8;1H~                                                                                                              [9;1H~                                                                                                              [10;1H~                                                                                                              [11;1H~                                                                                                              [12;1H~                                                                                                              [13;1H~                                                                                                              [14;1H~                                                                                                              [15;1H~                                                                                                              [16;1H~                                                                                                              [17;1H~                                                                                                              [18;1H~                                                                                                              [19;1H~                                                                                                              [20;1H~                                                                                                              [21;1H~                                                                                                              [22;1H~                                                                                                              [23;1H~                                                                                                              [m[24;94H0,0-1[9CAll[1;1H[?25hP+q436f\P+q6b75\P+q6b64\P+q6b72\P+q6b6c\P+q2332\P+q2334\P+q2569\P+q2a37\P+q6b31\[27m[23m[29m[m[H[2J[?25l[2;1H[94m~                                                                                                              [3;1H~                                                                                                              [4;1H~                                                                                                              [5;1H~                                                                                                              [6;1H~                                                                                                              [7;1H~                                                                                                              [8;1H~                                                                                                              [9;1H~                                                                                                              [10;1H~                                                                                                              [11;1H~                                                                                                              [12;1H~                                                                                                              [13;1H~                                                                                                              [14;1H~                                                                                                              [15;1H~                                                                                                              [16;1H~                                                                                                              [17;1H~                                                                                                              [18;1H~                                                                                                              [19;1H~                                                                                                              [20;1H~                                                                                                              [21;1H~                                                                                                              [22;1H~                                                                                                              [23;1H~                                                                                                              [m[24;94H0,0-1[9CAll
[?2004l[?1l>[?25h[>4;m[?1049l[23;0;0t]0;devasc@labvm: ~/DVol[01;32mdevasc@labvm[00m:[01;34m~/DVol[00m$ service docker status
[?1h=
     Loaded: loaded (/lib/systemd/system/docker.service; disabled; vendor preset: enabled)[m
     Active: [0;1;32mactive (running)[0m since Tue 2023-01-17 05:23:26 UTC; 23h ago[m
TriggeredBy: [0;1;32m●[0m docker.socket[m
       Docs: https://docs.docker.com[m
   Main PID: 59547 (dockerd)[m
      Tasks: 13[m
     Memory: 346.4M[m
     CGroup: /system.slice/docker.service[m
             └─59547 /usr/bin/dockerd -H fd:// --containerd=/run/containerd/containerd.sock[m

Dockerfile
]0;devasc@labvm: ~/DVol[01;32mdevasc@labvm[00m:[01;34m~/DVol[00m$ touch f1 f2 f3 f4 [K[K[K
]0;devasc@labvm: ~/DVol[01;32mdevasc@labvm[00m:[01;34m~/DVol[00m$ ls
Dockerfile  f1  f2  f3
]0;devasc@labvm: ~/DVol[01;32mdevasc@labvm[00m:[01;34m~/DVol[00m$ vi Dockerfile
[?1049h[22;0;0t[>4;2m[?1h=[?2004h[1;24r[?12h[?12l[22;2t[22;1t[27m[23m[29m[m[H[2J[?25l[24;1H"Dockerfile" 1L, 6C[2;1H▽[6n[2;1H  [1;1H[>c]10;?]11;?[1;1H[38;5;130mFROM [m
[94m~                                                                                                              [3;1H~                                                                                                              [4;1H~                                                                                                              [5;1H~                                                                                                              [6;1H~                                                                                                              [7;1H~                                                                                                              [8;1H~                                                                                                              [9;1H~                                                                                                              [10;1H~                                                                                                              [11;1H~                                                                                                              [12;1H~                                                                                                              [13;1H~                                                                                                              [14;1H~                                                                                                              [15;1H~                                                                                                              [16;1H~                                                                                                              [17;1H~                                                                                                              [18;1H~                                                                                                              [19;1H~                                                                                                              [20;1H~                                                                                                              [21;1H~                                                                                                              [22;1H~                                                                                                              [23;1H~                                                                                                              [m[24;94H1,5[11CAll[1;5H[?25hP+q436f\P+q6b75\P+q6b64\P+q6b72\P+q6b6c\P+q2332\P+q2334\P+q2569\P+q2a37\P+q6b31\[27m[23m[29m[m[H[2J[?25l[1;1H[93mFROM [m
[94m~                                                                                                              [3;1H~                                                                                                              [4;1H~                                                                                                              [5;1H~                                                                                                              [6;1H~                                                                                                              [7;1H~                                                                                                              [8;1H~                                                                                                              [9;1H~                                                                                                              [10;1H~                                                                                                              [11;1H~                                                                                                              [12;1H~                                                                                                              [13;1H~                                                                                                              [14;1H~                                                                                                              [15;1H~                                                                                                              [16;1H~                                                                                                              [17;1H~                                                                                                              [18;1H~                                                                                                              [19;1H~                                                                                                              [20;1H~                                                                                                              [21;1H~                                                                                                              [22;1H~                                                                                                              [23;1H~                                                                                                              [m[24;94H1,5[11CAll
 [2;2H[K[24;94H2,1 [2;1H[?25h[?25lV[24;96H2[2;2H[?25h[?25lO[24;96H3[2;3H[?25h[?25lL[24;96H4[2;4H[?25h[?25lU[24;96H5[2;5H[?25h[?25lM[24;96H6[2;6H[?25h[?25l
 [3;2H[K[2;8H{[8C}[24;94H3,1 [3;1H[?25h[24;1H[K[3;1H[?25l[24;84H^[[3;1H[24;84H  [3;1H[24;94H3,1[11CAll[3;1H[?25h[?25l[24;84H:[3;1H[24;84H[K[24;1H:[?2004h[?25hwq
[?2004l[?1l>[?25h[>4;m[?1049l[23;0;0t]0;devasc@labvm: ~/DVol[01;32mdevasc@labvm[00m:[01;34m~/DVol[00m$ vat [K[K[K[Kcat F[KDockerfile
FROM ubuntu
VOLUME {"/myvol"}
 
]0;devasc@labvm: ~/DVol[01;32mdevasc@labvm[00m:[01;34m~/DVol[00m$ docker bi[Kuild -t todayimg .
Sending build context to Docker daemon  3.584kB
Step 1/2 : FROM ubuntu
 ---> 6b7dfa7e8fdb
Step 2/2 : VOLUME {"/myvol"}
 ---> Running in 6eb5f651912d
Removing intermediate container 6eb5f651912d
 ---> b84eeee71389
Successfully built b84eeee71389
Successfully tagged todayimg:latest
]0;devasc@labvm: ~/DVol[01;32mdevasc@labvm[00m:[01;34m~/DVol[00m$ docker images
REPOSITORY              TAG                 IMAGE ID            CREATED             SIZE
todayimg                latest              b84eeee71389        18 seconds ago      77.8MB
newimage                latest              68fb1a389c98        19 hours ago        77.8MB
test                    latest              0fe8137ddb66        20 hours ago        77.8MB
upimg                   latest              ea612e5f2652        21 hours ago        77.8MB
chef/chef               latest              f4d3b21da2d1        13 days ago         120MB
ubuntu                  latest              6b7dfa7e8fdb        5 weeks ago         77.8MB
containrrr/watchtower   latest              d6b5c7ec581c        2 months ago        14.5MB
packetstream/psclient   latest              88f4ac9ff9c8        3 months ago        30.9MB
centos                  latest              5d0da3dc9764        16 months ago       231MB
]0;devasc@labvm: ~/DVol[01;32mdevasc@labvm[00m:[01;34m~/DVol[00m$ docker run -it --name --container[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[Kdocker ps -a
CONTAINER ID        IMAGE                          COMMAND                   CREATED             STATUS                      PORTS               NAMES
103c0fdb0c8d        newimage                       "/bin/bash"               19 hours ago        Exited (0) 19 hours ago                         nayacontainer
b815064f409a        test                           "/bin/bash"               20 hours ago        Exited (0) 20 hours ago                         testcontainer
72429d92e87d        6b7dfa7e8fdb                   "/bin/sh -c 'echo \"W…"   20 hours ago        Exited (2) 20 hours ago                         mystifying_wiles
672333bca403        upimg                          "/bin/bash"               21 hours ago        Exited (100) 20 hours ago                       spcontainer
3bbafa16c40d        ubuntu                         "/bin/bash"               21 hours ago        Exited (0) 21 hours ago                         mycontainer
7dff5807dbe8        centos                         "/bin/bash"               21 hours ago        Exited (0) 21 hours ago                         vigilant_khorana
b8982642b8c9        chef/chef                      "/bin/bash"               21 hours ago        Created                                         hello
d25ccac0bcf3        ubuntu                         "/bin/bash"               23 hours ago        Exited (0) 23 hours ago                         affectionate_ardinghelli
548dd3570a9e        containrrr/watchtower          "/watchtower --clean…"    24 hours ago        Up 24 hours                 8080/tcp            watchtower
64b7cbcfdf19        packetstream/psclient:latest   "/bin/sh -c psrun"        24 hours ago        Up 24 hours                                     psclient
]0;devasc@labvm: ~/DVol[01;32mdevasc@labvm[00m:[01;34m~/DVol[00m$ 
[?2004h]0;root@a01d983894ed: /root@a01d983894ed:/# 
[?2004l
[?2004h]0;root@a01d983894ed: /root@a01d983894ed:/# exit
[?2004l
]0;devasc@labvm: ~/DVol[01;32mdevasc@labvm[00m:[01;34m~/DVol[00m$ ls
Dockerfile  f1  f2  f3
]0;devasc@labvm: ~/DVol[01;32mdevasc@labvm[00m:[01;34m~/DVol[00m$ vi Docker [Kfile
[?1049h[22;0;0t[>4;2m[?1h=[?2004h[1;24r[?12h[?12l[22;2t[22;1t[27m[23m[29m[m[H[2J[?25l[24;1H"Dockerfile" 3L, 32C[2;1H▽[6n[2;1H  [1;1H[>c]10;?]11;?[1;1H[38;5;130mFROM [mubuntu
[38;5;130mVOLUME [m{[31m"/myvol"[m}

[94m~                                                                                                                                                                            [5;1H~                                                                                                                                                                            [6;1H~                                                                                                                                                                            [7;1H~                                                                                                                                                                            [8;1H~                                                                                                                                                                            [9;1H~                                                                                                                                                                            [10;1H~                                                                                                                                                                            [11;1H~                                                                                                                                                                            [12;1H~                                                                                                                                                                            [13;1H~                                                                                                                                                                            [14;1H~                                                                                                                                                                            [15;1H~                                                                                                                                                                            [16;1H~                                                                                                                                                                            [17;1H~                                                                                                                                                                            [18;1H~                                                                                                                                                                            [19;1H~                                                                                                                                                                            [20;1H~                                                                                                                                                                            [21;1H~                                                                                                                                                                            [22;1H~                                                                                                                                                                            [23;1H~                                                                                                                                                                            [m[24;156H3,1[11CAll[3;1H[?25hP+q436f\P+q6b75\P+q6b64\P+q6b72\P+q6b6c\P+q2332\P+q2334\P+q2569\P+q2a37\P+q6b31\[27m[23m[29m[m[H[2J[?25l[1;1H[93mFROM [mubuntu
[93mVOLUME [m{[95m"/myvol"[m}

[94m~                                                                                                                                                                            [5;1H~                                                                                                                                                                            [6;1H~                                                                                                                                                                            [7;1H~                                                                                                                                                                            [8;1H~                                                                                                                                                                            [9;1H~                                                                                                                                                                            [10;1H~                                                                                                                                                                            [11;1H~                                                                                                                                                                            [12;1H~                                                                                                                                                                            [13;1H~                                                                                                                                                                            [14;1H~                                                                                                                                                                            [15;1H~                                                                                                                                                                            [16;1H~                                                                                                                                                                            [17;1H~                                                                                                                                                                            [18;1H~                                                                                                                                                                            [19;1H~                                                                                                                                                                            [20;1H~                                                                                                                                                                            [21;1H~                                                                                                                                                                            [22;1H~                                                                                                                                                                            [23;1H~                                                                                                                                                                            [m[24;156H3,1[11CAll
[?2004l[?1l>[?25h[>4;m[?1049l[23;0;0t]0;devasc@labvm: ~/DVol[01;32mdevasc@labvm[00m:[01;34m~/DVol[00m$ vi Dockerfilels[Kvi Dockerfilels[Kdocker run -it --name container1 todayimg /bin/bash
Sending build context to Docker daemon  3.584kB
Step 1/2 : FROM ubuntu
 ---> 6b7dfa7e8fdb
Step 2/2 : VOLUME /myvol
 ---> Running in dcf903cae8c9
Removing intermediate container dcf903cae8c9
 ---> d4923ed597f8
Successfully built d4923ed597f8
Successfully tagged todayimg:latest
]0;devasc@labvm: ~/DVol[01;32mdevasc@labvm[00m:[01;34m~/DVol[00m$ docker build -t todayimg .
REPOSITORY              TAG                 IMAGE ID            CREATED             SIZE
todayimg                latest              d4923ed597f8        8 seconds ago       77.8MB
<none>                  <none>              b84eeee71389        4 minutes ago       77.8MB
newimage                latest              68fb1a389c98        20 hours ago        77.8MB
test                    latest              0fe8137ddb66        20 hours ago        77.8MB
upimg                   latest              ea612e5f2652        21 hours ago        77.8MB
chef/chef               latest              f4d3b21da2d1        13 days ago         120MB
ubuntu                  latest              6b7dfa7e8fdb        5 weeks ago         77.8MB
containrrr/watchtower   latest              d6b5c7ec581c        2 months ago        14.5MB
packetstream/psclient   latest              88f4ac9ff9c8        3 months ago        30.9MB
centos                  latest              5d0da3dc9764        16 months ago       231MB
]0;devasc@labvm: ~/DVol[01;32mdevasc@labvm[00m:[01;34m~/DVol[00m$ docker imagesbuild -t todayimg .images[Kbuild -t todayimg .
docker: Error response from daemon: Conflict. The container name "/container1" is already in use by container "a01d983894ed35c27e953413b399fa17459cf01a1bc63deced6475023abf2166". You have to remove (or rename) that container to be able to reuse that name.
See 'docker run --help'.
]0;devasc@labvm: ~/DVol[01;32mdevasc@labvm[00m:[01;34m~/DVol[00m$ docker run -it --name container1 todayimg /bin/bash
docker: Error response from daemon: Conflict. The container name "/container1" is already in use by container "a01d983894ed35c27e953413b399fa17459cf01a1bc63deced6475023abf2166". You have to remove (or rename) that container to be able to reuse that name.
See 'docker run --help'.
]0;devasc@labvm: ~/DVol[01;32mdevasc@labvm[00m:[01;34m~/DVol[00m$ docker run -it --name container1 todayimg /bin/bash[1P[1P[1P[1P[1P[1P
[?2004h]0;root@a8295342d009: /root@a8295342d009:/# 
[?2004l
[?2004h]0;root@a8295342d009: /root@a8295342d009:/# cd myvol
[?2004l
[?2004l
[?2004l
[?2004l
[?2004h]0;root@a8295342d009: /myvolroot@a8295342d009:/myvol# exit
[?2004l
]0;devasc@labvm: ~/DVol[01;32mdevasc@labvm[00m:[01;34m~/DVol[00m$ ls'[K
Dockerfile  f1  f2  f3
]0;devasc@labvm: ~/DVol[01;32mdevasc@labvm[00m:[01;34m~/DVol[00m$ 
unknown flag: --privleged
See 'docker run --help'.
]0;devasc@labvm: ~/DVol[01;32mdevasc@labvm[00m:[01;34m~/DVol[00m$ docker run -it --name con2 --privleged=true --volumes-from con1 ubuntu /bin/bash[C[C[C[C[1@i
[?2004h]0;root@88a70bf629c1: /root@88a70bf629c1:/# 
[?2004l
[?2004h]0;root@88a70bf629c1: /root@88a70bf629c1:/# cd myvol
[?2004l
[?2004l
[?2004h]0;root@88a70bf629c1: /myvolroot@88a70bf629c1:/myvol# touch fnew
[?2004l
[?2004l
]0;devasc@labvm: ~/DVol[01;32mdevasc@labvm[00m:[01;34m~/DVol[00m$ docker attach [K[K[K[K[K[K[Kstart com[Kn1
con1
]0;devasc@labvm: ~/DVol[01;32mdevasc@labvm[00m:[01;34m~/DVol[00m$ docker attach con1

[?2004l
[?2004h]0;root@a8295342d009: /root@a8295342d009:/# cd mu yvol
[?2004l
[?2004l
[?2004h]0;root@a8295342d009: /myvolroot@a8295342d009:/myvol# touv ch newcon1file
[?2004l
[?2004l
]0;devasc@labvm: ~/DVol[01;32mdevasc@labvm[00m:[01;34m~/DVol[00m$ docker cons[K[K[K[Kstart con2
con2
]0;devasc@labvm: ~/DVol[01;32mdevasc@labvm[00m:[01;34m~/DVol[00m$ docker attach con2

[?2004l
[?2004h]0;root@88a70bf629c1: /root@88a70bf629c1:/# cd mu yvol
[?2004l
[?2004l
[?2004h]0;root@88a70bf629c1: /myvolroot@88a70bf629c1:/myvol# exit  
[?2004l
]0;devasc@labvm: ~/DVol[01;32mdevasc@labvm[00m:[01;34m~/DVol[00m$ docker run -it --name com[Kn3 -v vol[K[K[K/vol2 ubuntu /bin/bash
[?2004h]0;root@eeb967003e26: /root@eeb967003e26:/# 
[?2004l
[?2004h]0;root@eeb967003e26: /root@eeb967003e26:/# cd vol2
[?2004l
[?2004l
<body>^[[A         head><title>hello</title>
</head>
<body>
<p>this is file</p>
</body>
</html? >
[?2004h]0;root@eeb967003e26: /vol2root@eeb967003e26:/vol2# ls
[?2004l
[?2004h]0;root@eeb967003e26: /vol2root@eeb967003e26:/vol2# exit
[?2004l
]0;devasc@labvm: ~/DVol[01;32mdevasc@labvm[00m:[01;34m~/DVol[00m$ docker run i[K-it --name con4 --priviled[K[K[K[K[K[K[K[K3 -v /vol2 ubuntu /bin/bash
[?2004h]0;root@99fee2c76d31: /root@99fee2c76d31:/# 
[?2004l
[?2004h]0;root@99fee2c76d31: /root@99fee2c76d31:/# cd col2
[?2004l
[?2004h]0;root@99fee2c76d31: /root@99fee2c76d31:/# cd col2[1P[1@v
[?2004l
[?2004l
[?2004h]0;root@99fee2c76d31: /vol2root@99fee2c76d31:/vol2# cat hello.html
[?2004l
<head><title>hello</title>
</head>
<body>
<p>this is file</p>
</body>
</html>
[?2004h]0;root@99fee2c76d31: /vol2root@99fee2c76d31:/vol2# ls
[?2004l
[?2004h]0;root@99fee2c76d31: /vol2root@99fee2c76d31:/vol2# cat  <<  <<  >>hi.py
[?2004l
[?2004h]0;root@99fee2c76d31: /vol2root@99fee2c76d31:/vol2# ls
[?2004l
[?2004h]0;root@99fee2c76d31: /vol2root@99fee2c76d31:/vol2# exit
[?2004l
]0;devasc@labvm: ~/DVol[01;32mdevasc@labvm[00m:[01;34m~/DVol[00m$ docker ps
CONTAINER ID        IMAGE                          COMMAND                  CREATED             STATUS              PORTS               NAMES
548dd3570a9e        containrrr/watchtower          "/watchtower --clean…"   25 hours ago        Up 25 hours         8080/tcp            watchtower
64b7cbcfdf19        packetstream/psclient:latest   "/bin/sh -c psrun"       25 hours ago        Up 25 hours                             psclient
]0;devasc@labvm: ~/DVol[01;32mdevasc@labvm[00m:[01;34m~/DVol[00m$ docker start con3
con3
]0;devasc@labvm: ~/DVol[01;32mdevasc@labvm[00m:[01;34m~/DVol[00m$ docker attach con3

[?2004l
[?2004h]0;root@eeb967003e26: /root@eeb967003e26:/# cd vol2
[?2004l
[?2004l
[?2004h]0;root@eeb967003e26: /vol2root@eeb967003e26:/vol2# cat hi.py
[?2004l
[?2004h]0;root@eeb967003e26: /vol2root@eeb967003e26:/vol2# exit
[?2004l
]0;devasc@labvm: ~/DVol[01;32mdevasc@labvm[00m:[01;34m~/DVol[00m$ exit
exit

Script done on 2023-01-18 06:26:42+00:00 [COMMAND_EXIT_CODE="0"]