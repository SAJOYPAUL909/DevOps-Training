Script started on 2023-01-17 05:51:27+00:00 [TERM="xterm-256color" TTY="/dev/pts/0" COLUMNS="148" LINES="24"]
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ sudo apt-[K[K[K[K[K[K[K[K[Kmkdir Docker
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ ls
[0m[01;34massignment[0m  Day3-Part2  Day5-Part1  Day7-Part1  [01;34mDownloads[0m  [01;32mfile1[0m    file5     infiloop  list3        t1     Theory.imp           while
count_file  Day4-Part1  Day5-Part2  [01;34mDesktop[0m     even       file1.1  [01;34mfilelist[0m  [01;34mlabs[0m      list4        t2     [01;32mTODAY_IS_SECOND_DAY[0m
[01;32mDay2[0m        Day4-Part2  Day6-Part1  [01;34mDocker[0m      exam       file2    forjio    list1     smallest.sh  Table  untill
Day3-Part1  Day4-Part3  Day6-Part2  [01;34mDocuments[0m   fac        file3    [01;34mgit[0m       list2     [01;34msnap[0m         [01;34mtask[0m   [01;34musdie[0m
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ cd D\[K
Desktop/   Docker/    Documents/ Downloads/ 
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ cd D[2Plsmkdir Dockerls[Kcd Docker/
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ ls
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ sudo apt-get insatal[K[K[K[Kall docker -[K
E: Invalid operation insall
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ sudo apt-get insall docker -y
E: Invalid operation insall
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ sudo apt-get insall docker -y
E: Invalid operation insall
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ sudo apt-get insall docker -y[C[C[1@t



The following additional packages will be installed:
  wmdocker
The following NEW packages will be installed:
  docker wmdocker
0 upgraded, 2 newly installed, 0 to remove and 578 not upgraded.
Need to get 14.3 kB of archives.
After this operation, 58.4 kB of additional disk space will be used.



Selecting previously unselected package wmdocker.
(Reading database ... 
Preparing to unpack .../wmdocker_1.5-2_amd64.deb ...
Unpacking wmdocker (1.5-2) ...
Selecting previously unselected package docker.
Preparing to unpack .../archives/docker_1.5-2_all.deb ...
Unpacking docker (1.5-2) ...
Setting up wmdocker (1.5-2) ...
Setting up docker (1.5-2) ...
Processing triggers for menu (2.1.47ubuntu4) ...
Processing triggers for man-db (2.9.1-1) ...
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ which docker
/usr/bin/docker
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker -v
Docker version 19.03.8, build afacb8b7f0
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker -v-v[Cersiob[Kn
Docker version 19.03.8, build afacb8b7f0
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ service docker status
[?1h=
     Loaded: loaded (/lib/systemd/system/docker.service; disabled; vendor preset: enabled)[m
     Active: [0;1;32mactive (running)[0m since Tue 2023-01-17 05:23:26 UTC; 35min ago[m
TriggeredBy: [0;1;32m●[0m docker.socket[m
       Docs: https://docs.docker.com[m
   Main PID: 59547 (dockerd)[m
      Tasks: 13[m
     Memory: 187.6M[m
     CGroup: /system.slice/docker.service[m
             └─59547 /usr/bin/dockerd -H fd:// --containerd=/run/containerd/containerd.sock[m

Client:
 Debug Mode: false

Server:
 Containers: 2
  Running: 2
  Paused: 0
  Stopped: 0
 Images: 2
 Server Version: 19.03.8
 Storage Driver: overlay2
  Backing Filesystem: <unknown>
  Supports d_type: true
  Native Overlay Diff: true
 Logging Driver: json-file
 Cgroup Driver: cgroupfs
 Plugins:
  Volume: local
  Network: bridge host ipvlan macvlan null overlay
  Log: awslogs fluentd gcplogs gelf journald json-file local logentries splunk syslog
 Swarm: inactive
 Runtimes: runc
 Default Runtime: runc
 Init Binary: docker-init
 containerd version: 
 runc version: 
 init version: 
 Security Options:
  apparmor
  seccomp
   Profile: default
 Kernel Version: 5.4.0-37-generic
 Operating System: Ubuntu 20.04 LTS
 OSType: linux
 Architecture: x86_64
 CPUs: 2
 Total Memory: 3.844GiB
 Name: labvm
 ID: 5NBL:G23E:JGWW:YIFM:T5IS:76H3:VSNQ:OCVJ:J7QP:S25J:CIMR:3HKZ
 Docker Root Dir: /var/lib/docker
 Debug Mode: false
 Registry: https://index.docker.io/v1/
 Labels:
 Experimental: false
 Insecure Registries:
  127.0.0.0/8
 Live Restore Enabled: false

WARNING: No swap limit support
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ service docker star[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[Kdocker images
REPOSITORY              TAG                 IMAGE ID            CREATED             SIZE
containrrr/watchtower   latest              d6b5c7ec581c        2 months ago        14.5MB
packetstream/psclient   latest              88f4ac9ff9c8        3 months ago        30.9MB
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docer [K[K[Kkerv[K ps
CONTAINER ID        IMAGE                          COMMAND                  CREATED             STATUS              PORTS               NAMES
548dd3570a9e        containrrr/watchtower          "/watchtower --clean…"   26 minutes ago      Up 26 minutes       8080/tcp            watchtower
64b7cbcfdf19        packetstream/psclient:latest   "/bin/sh -c psrun"       26 minutes ago      Up 26 minutes                           psclient
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker ps -a
CONTAINER ID        IMAGE                          COMMAND                  CREATED             STATUS              PORTS               NAMES
548dd3570a9e        containrrr/watchtower          "/watchtower --clean…"   26 minutes ago      Up 26 minutes       8080/tcp            watchtower
64b7cbcfdf19        packetstream/psclient:latest   "/bin/sh -c psrun"       26 minutes ago      Up 26 minutes                           psclient
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ 
Unable to find image 'ubuntu:latest' locally
latest: Pulling from library/ubuntu

[1A[2K
Status: Downloaded newer image for ubuntu:latest
[?2004h]0;root@d25ccac0bcf3: /root@d25ccac0bcf3:/# 
[?2004l
[?2004h]0;root@d25ccac0bcf3: /root@d25ccac0bcf3:/# exit
[?2004l
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docke[K[K[K[K[Kls
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker images
REPOSITORY              TAG                 IMAGE ID            CREATED             SIZE
ubuntu                  latest              6b7dfa7e8fdb        5 weeks ago         77.8MB
containrrr/watchtower   latest              d6b5c7ec581c        2 months ago        14.5MB
packetstream/psclient   latest              88f4ac9ff9c8        3 months ago        30.9MB
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker ri[Kun -it centos /bin/bash
Unable to find image 'centos:latest' locally
latest: Pulling from library/centos

[1A[2K
Status: Downloaded newer image for centos:latest
]0;@d576cdeef25a:/[root@d576cdeef25a /]# ls
bin  dev  etc  home  lib  lib64  lost+found  media  mnt  opt  proc  root  run  sbin  srv  sys  tmp  usr  var
]0;@d576cdeef25a:/[root@d576cdeef25a /]# exit
exit
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker run -it centos /bin/bashimages[Kls[Kdocker run -it ubuntu /bin/bash
[?2004h]0;root@b207ccdae116: /root@b207ccdae116:/# 
[?2004l
[?2004h]0;root@b207ccdae116: /root@b207ccdae116:/# exit
[?2004l
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker image

Usage:	docker image COMMAND

Manage images

Commands:
  build       Build an image from a Dockerfile
  history     Show the history of an image
  import      Import the contents from a tarball to create a filesystem image
  inspect     Display detailed information on one or more images
  load        Load an image from a tar archive or STDIN
  ls          List images
  prune       Remove unused images
  pull        Pull an image or a repository from a registry
  push        Push an image or a repository to a registry
  rm          Remove one or more images
  save        Save one or more images to a tar archive (streamed to STDOUT by default)
  tag         Create a tag TARGET_IMAGE that refers to SOURCE_IMAGE

Run 'docker image COMMAND --help' for more information on a command.
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker images
REPOSITORY              TAG                 IMAGE ID            CREATED             SIZE
ubuntu                  latest              6b7dfa7e8fdb        5 weeks ago         77.8MB
containrrr/watchtower   latest              d6b5c7ec581c        2 months ago        14.5MB
packetstream/psclient   latest              88f4ac9ff9c8        3 months ago        30.9MB
centos                  latest              5d0da3dc9764        16 months ago       231MB
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker images[Krun -it ubuntu /bin/bashcentos[C[C[C[C[C[C[C[C[C[C
]0;@f830e8496b6a:/[root@f830e8496b6a /]# ls
bin  dev  etc  home  lib  lib64  lost+found  media  mnt  opt  proc  root  run  sbin  srv  sys  tmp  usr  var
]0;@f830e8496b6a:/[root@f830e8496b6a /]# exit
exit
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker run -it centos /bin/bashimages[K[Ks
REPOSITORY              TAG                 IMAGE ID            CREATED             SIZE
ubuntu                  latest              6b7dfa7e8fdb        5 weeks ago         77.8MB
containrrr/watchtower   latest              d6b5c7ec581c        2 months ago        14.5MB
packetstream/psclient   latest              88f4ac9ff9c8        3 months ago        30.9MB
centos                  latest              5d0da3dc9764        16 months ago       231MB
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker imagesrun -it centos /bin/bashimages[Krun -it centos /bin/bash[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[Kps -a
CONTAINER ID        IMAGE                          COMMAND                  CREATED              STATUS                          PORTS               NAMES
f830e8496b6a        centos                         "/bin/bash"              About a minute ago   Exited (0) 53 seconds ago                           modest_bhaskara
b207ccdae116        ubuntu                         "/bin/bash"              About a minute ago   Exited (0) About a minute ago                       jovial_haslett
d576cdeef25a        centos                         "/bin/bash"              About an hour ago    Exited (0) About a minute ago                       stupefied_sammet
d25ccac0bcf3        ubuntu                         "/bin/bash"              2 hours ago          Exited (0) About an hour ago                        affectionate_ardinghelli
548dd3570a9e        containrrr/watchtower          "/watchtower --clean…"   2 hours ago          Up 2 hours                      8080/tcp            watchtower
64b7cbcfdf19        packetstream/psclient:latest   "/bin/sh -c psrun"       2 hours ago          Up 2 hours                                          psclient
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ cat /etc
Error response from daemon: No such container: packetstream/psclient
Error: failed to start containers: packetstream/psclient
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker start packetstream/psclient:latest
Error response from daemon: No such container: packetstream/psclient:latest
Error: failed to start containers: packetstream/psclient:latest
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ Docker rm --all[K[K[K[K[Kcentos

Command 'Docker' not found, did you mean:

  command 'docker' from snap docker (19.03.11)
  command 'docker' from deb docker.io (20.10.12-0ubuntu2~20.04.1)

See 'snap info <snapname>' for additional versions.

]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ Docker rm centos[C[1P[1@d
Error: No such container: centos
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm centos[K[K[K[K[K[K
CONTAINER ID        IMAGE                          COMMAND                  CREATED             STATUS                      PORTS               NAMES
f830e8496b6a        centos                         "/bin/bash"              14 minutes ago      Exited (0) 14 minutes ago                       modest_bhaskara
b207ccdae116        ubuntu                         "/bin/bash"              15 minutes ago      Exited (0) 14 minutes ago                       jovial_haslett
d576cdeef25a        centos                         "/bin/bash"              About an hour ago   Exited (0) 15 minutes ago                       stupefied_sammet
d25ccac0bcf3        ubuntu                         "/bin/bash"              2 hours ago         Exited (0) 2 hours ago                          affectionate_ardinghelli
548dd3570a9e        containrrr/watchtower          "/watchtower --clean…"   2 hours ago         Up 2 hours                  8080/tcp            watchtower
64b7cbcfdf19        packetstream/psclient:latest   "/bin/sh -c psrun"       2 hours ago         Up 2 hours                                      psclient
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker ps -a[2Prm Docker rm centosdocker start packetstream/psclient:latest^C
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker ps -a[2Prm Docker rm centosdocker start packetstream/psclient:latest[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[Kpsclient
psclient
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker start psclient[9Pps -a
CONTAINER ID        IMAGE                          COMMAND                  CREATED             STATUS                      PORTS               NAMES
f830e8496b6a        centos                         "/bin/bash"              15 minutes ago      Exited (0) 14 minutes ago                       modest_bhaskara
b207ccdae116        ubuntu                         "/bin/bash"              15 minutes ago      Exited (0) 15 minutes ago                       jovial_haslett
d576cdeef25a        centos                         "/bin/bash"              About an hour ago   Exited (0) 15 minutes ago                       stupefied_sammet
d25ccac0bcf3        ubuntu                         "/bin/bash"              2 hours ago         Exited (0) 2 hours ago                          affectionate_ardinghelli
548dd3570a9e        containrrr/watchtower          "/watchtower --clean…"   2 hours ago         Up 2 hours                  8080/tcp            watchtower
64b7cbcfdf19        packetstream/psclient:latest   "/bin/sh -c psrun"       2 hours ago         Up 2 hours                                      psclient
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker pull chef [K/chef
Using default tag: latest
latest: Pulling from chef/chef

[1A[2K
[1A[2K
Status: Downloaded newer image for chef/chef:latest
docker.io/chef/chef:latest
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker pull chef/chefs -a[K
CONTAINER ID        IMAGE                          COMMAND                  CREATED             STATUS                      PORTS               NAMES
f830e8496b6a        centos                         "/bin/bash"              17 minutes ago      Exited (0) 17 minutes ago                       modest_bhaskara
b207ccdae116        ubuntu                         "/bin/bash"              17 minutes ago      Exited (0) 17 minutes ago                       jovial_haslett
d576cdeef25a        centos                         "/bin/bash"              About an hour ago   Exited (0) 17 minutes ago                       stupefied_sammet
d25ccac0bcf3        ubuntu                         "/bin/bash"              2 hours ago         Exited (0) 2 hours ago                          affectionate_ardinghelli
548dd3570a9e        containrrr/watchtower          "/watchtower --clean…"   2 hours ago         Up 2 hours                  8080/tcp            watchtower
64b7cbcfdf19        packetstream/psclient:latest   "/bin/sh -c psrun"       2 hours ago         Up 2 hours                                      psclient
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker images
REPOSITORY              TAG                 IMAGE ID            CREATED             SIZE
chef/chef               latest              f4d3b21da2d1        12 days ago         120MB
ubuntu                  latest              6b7dfa7e8fdb        5 weeks ago         77.8MB
containrrr/watchtower   latest              d6b5c7ec581c        2 months ago        14.5MB
packetstream/psclient   latest              88f4ac9ff9c8        3 months ago        30.9MB
centos                  latest              5d0da3dc9764        16 months ago       231MB
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker images[1Pps -a[K[K[K
CONTAINER ID        IMAGE                          COMMAND                  CREATED             STATUS              PORTS               NAMES
548dd3570a9e        containrrr/watchtower          "/watchtower --clean…"   2 hours ago         Up 2 hours          8080/tcp            watchtower
64b7cbcfdf19        packetstream/psclient:latest   "/bin/sh -c psrun"       2 hours ago         Up 2 hours                              psclient
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ which chef
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker run --[Kit  --name spcontainer ubuntu /bin/basd[Kh
[?2004h]0;root@7c069d48ca9d: /root@7c069d48ca9d:/# ls
[?2004l
[?2004h]0;root@7c069d48ca9d: /root@7c069d48ca9d:/# w exit  
[?2004l
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker ps -a
CONTAINER ID        IMAGE                          COMMAND                  CREATED             STATUS                      PORTS               NAMES
7c069d48ca9d        ubuntu                         "/bin/bash"              48 seconds ago      Exited (0) 7 seconds ago                        spcontainer
f830e8496b6a        centos                         "/bin/bash"              21 minutes ago      Exited (0) 21 minutes ago                       modest_bhaskara
b207ccdae116        ubuntu                         "/bin/bash"              21 minutes ago      Exited (0) 21 minutes ago                       jovial_haslett
d576cdeef25a        centos                         "/bin/bash"              2 hours ago         Exited (0) 21 minutes ago                       stupefied_sammet
d25ccac0bcf3        ubuntu                         "/bin/bash"              2 hours ago         Exited (0) 2 hours ago                          affectionate_ardinghelli
548dd3570a9e        containrrr/watchtower          "/watchtower --clean…"   3 hours ago         Up 3 hours                  8080/tcp            watchtower
64b7cbcfdf19        packetstream/psclient:latest   "/bin/sh -c psrun"       3 hours ago         Up 3 hours                                      psclient
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ dockr[Ker starr[Kt spcontainer
spcontainer
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker ps
CONTAINER ID        IMAGE                          COMMAND                  CREATED             STATUS              PORTS               NAMES
7c069d48ca9d        ubuntu                         "/bin/bash"              2 minutes ago       Up 8 seconds                            spcontainer
548dd3570a9e        containrrr/watchtower          "/watchtower --clean…"   3 hours ago         Up 3 hours          8080/tcp            watchtower
64b7cbcfdf19        packetstream/psclient:latest   "/bin/sh -c psrun"       3 hours ago         Up 3 hours                              psclient
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker psstart spcontainer[K[K[K[K[K[K[K[K[K[K[Kjovial_haslett
jovial_haslett
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker start jovial_haslettps[K
CONTAINER ID        IMAGE                          COMMAND                  CREATED             STATUS              PORTS               NAMES
7c069d48ca9d        ubuntu                         "/bin/bash"              3 minutes ago       Up About a minute                       spcontainer
b207ccdae116        ubuntu                         "/bin/bash"              24 minutes ago      Up 2 seconds                            jovial_haslett
548dd3570a9e        containrrr/watchtower          "/watchtower --clean…"   3 hours ago         Up 3 hours          8080/tcp            watchtower
64b7cbcfdf19        packetstream/psclient:latest   "/bin/sh -c psrun"       3 hours ago         Up 3 hours                              psclient
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker attas[Kch jovial_haslettps[Kattach jovial_haslett[K[K[K[K[K[K[K[K[K[K[K[K[K[Kspcontainer

[?2004l
[?2004h]0;root@7c069d48ca9d: /root@7c069d48ca9d:/# exit
[?2004l
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker stop spconts[Kainer
spcontainer
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ ps
    PID TTY          TIME CMD
  61950 pts/1    00:00:00 bash
  64615 pts/1    00:00:00 ps
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ psdpsopscpskpsepsrps ps
CONTAINER ID        IMAGE                          COMMAND                  CREATED             STATUS              PORTS               NAMES
b207ccdae116        ubuntu                         "/bin/bash"              27 minutes ago      Up 2 minutes                            jovial_haslett
548dd3570a9e        containrrr/watchtower          "/watchtower --clean…"   3 hours ago         Up 3 hours          8080/tcp            watchtower
64b7cbcfdf19        packetstream/psclient:latest   "/bin/sh -c psrun"       3 hours ago         Up 3 hours                              psclient
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker ps -a
CONTAINER ID        IMAGE                          COMMAND                  CREATED             STATUS                          PORTS               NAMES
7c069d48ca9d        ubuntu                         "/bin/bash"              6 minutes ago       Exited (0) About a minute ago                       spcontainer
f830e8496b6a        centos                         "/bin/bash"              27 minutes ago      Exited (0) 27 minutes ago                           modest_bhaskara
b207ccdae116        ubuntu                         "/bin/bash"              27 minutes ago      Up 3 minutes                                        jovial_haslett
d576cdeef25a        centos                         "/bin/bash"              2 hours ago         Exited (0) 27 minutes ago                           stupefied_sammet
d25ccac0bcf3        ubuntu                         "/bin/bash"              2 hours ago         Exited (0) 2 hours ago                              affectionate_ardinghelli
548dd3570a9e        containrrr/watchtower          "/watchtower --clean…"   3 hours ago         Up 3 hours                      8080/tcp            watchtower
64b7cbcfdf19        packetstream/psclient:latest   "/bin/sh -c psrun"       3 hours ago         Up 3 hours                                          psclient
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ 
spcontainer
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm spcontainer[9Pps -a
CONTAINER ID        IMAGE                          COMMAND                  CREATED             STATUS                      PORTS               NAMES
f830e8496b6a        centos                         "/bin/bash"              29 minutes ago      Exited (0) 29 minutes ago                       modest_bhaskara
b207ccdae116        ubuntu                         "/bin/bash"              30 minutes ago      Up 5 minutes                                    jovial_haslett
d576cdeef25a        centos                         "/bin/bash"              2 hours ago         Exited (0) 30 minutes ago                       stupefied_sammet
d25ccac0bcf3        ubuntu                         "/bin/bash"              2 hours ago         Exited (0) 2 hours ago                          affectionate_ardinghelli
548dd3570a9e        containrrr/watchtower          "/watchtower --clean…"   3 hours ago         Up 3 hours                  8080/tcp            watchtower
64b7cbcfdf19        packetstream/psclient:latest   "/bin/sh -c psrun"       3 hours ago         Up 3 hours                                      psclient
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker ps -arm spcontainer[K[K[K[K[K[K[K[K[K[K[Kjovial_haslett
Error response from daemon: You cannot remove a running container b207ccdae116d6f9041e80ca543e7b38cdce0692047325d9697d3591f81b87b0. Stop the container before attempting removal or force remove
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm jovial_haslett[1P jovial_haslett[1P jovial_hasletts jovial_haslettt jovial_hasletto jovial_haslettp jovial_haslett
jovial_haslett
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker stop jovial_haslett[2Prm[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C
jovial_haslett
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ dov[Kcker ps -a
CONTAINER ID        IMAGE                          COMMAND                  CREATED             STATUS                      PORTS               NAMES
f830e8496b6a        centos                         "/bin/bash"              30 minutes ago      Exited (0) 30 minutes ago                       modest_bhaskara
d576cdeef25a        centos                         "/bin/bash"              2 hours ago         Exited (0) 31 minutes ago                       stupefied_sammet
d25ccac0bcf3        ubuntu                         "/bin/bash"              2 hours ago         Exited (0) 2 hours ago                          affectionate_ardinghelli
548dd3570a9e        containrrr/watchtower          "/watchtower --clean…"   3 hours ago         Up 3 hours                  8080/tcp            watchtower
64b7cbcfdf19        packetstream/psclient:latest   "/bin/sh -c psrun"       3 hours ago         Up 3 hours                                      psclient
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker ps -arm jovial_haslett[K[K[K[K[K[K[K[K[K[K[K[K[K[Kstupefied_sammet
stupefied_sammet
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm stupefied_sammetps -a[K
CONTAINER ID        IMAGE                          COMMAND                  CREATED             STATUS                      PORTS               NAMES
f830e8496b6a        centos                         "/bin/bash"              31 minutes ago      Exited (0) 31 minutes ago                       modest_bhaskara
d25ccac0bcf3        ubuntu                         "/bin/bash"              2 hours ago         Exited (0) 2 hours ago                          affectionate_ardinghelli
548dd3570a9e        containrrr/watchtower          "/watchtower --clean…"   3 hours ago         Up 3 hours                  8080/tcp            watchtower
64b7cbcfdf19        packetstream/psclient:latest   "/bin/sh -c psrun"       3 hours ago         Up 3 hours                                      psclient
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker ps -arm stupefied_sammet[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[Kmodest_bhaskara
modest_bhaskara
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm modest_bhaskaraps -a[K
CONTAINER ID        IMAGE                          COMMAND                  CREATED             STATUS                   PORTS               NAMES
d25ccac0bcf3        ubuntu                         "/bin/bash"              2 hours ago         Exited (0) 2 hours ago                       affectionate_ardinghelli
548dd3570a9e        containrrr/watchtower          "/watchtower --clean…"   3 hours ago         Up 3 hours               8080/tcp            watchtower
64b7cbcfdf19        packetstream/psclient:latest   "/bin/sh -c psrun"       3 hours ago         Up 3 hours                                   psclient
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker ps -a[K[K[K[K[K[K attach affectionate_ardinghelli
You cannot attach to a stopped container, start it first
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker attach affectionate_ardinghellips -a[Krm modest_bhaskaraps -a[Krm stupefied_sammetps -a[Krm jovial_haslett[2@stop[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[2Prm[C[C[C[C[C[C[C[C[C[C[C[C[C[C[Cps -a[Krm spcontainer[9Pps -a[Kps[Kdocker stop spcontainer[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[Kdocker pull -[Kjenkins
Using default tag: latest
Error response from daemon: manifest for jenkins:latest not found: manifest unknown: manifest unknown
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker images
REPOSITORY              TAG                 IMAGE ID            CREATED             SIZE
chef/chef               latest              f4d3b21da2d1        12 days ago         120MB
ubuntu                  latest              6b7dfa7e8fdb        5 weeks ago         77.8MB
containrrr/watchtower   latest              d6b5c7ec581c        2 months ago        14.5MB
packetstream/psclient   latest              88f4ac9ff9c8        3 months ago        30.9MB
centos                  latest              5d0da3dc9764        16 months ago       231MB
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker run -it chef/cj[Kchef/chef[Kf[C[1Phef/chef[1Pchef/chef[1Pchef/chef[1Pchef/chef[1Pchef/chef[1Phef/chef[1Pchef/chef chef/chef[C[C[C[C[C[C[C[C[C /bin [K/bash[C[C[1@ [1P[C[1@ [1@-[1@-[1@n[1@a[1@m[1@e[C[1@ [1@h[1@e[1@l[1@l[1@o
docker: Error response from daemon: OCI runtime create failed: container_linux.go:349: starting container process caused "exec: \"/bin/bash\": stat /bin/bash: no such file or directory": unknown.
[31mERRO[0m[0001] error waiting for container: context canceled 
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker run -it --name hello chef/chef /bin/bash[1P[1P[1P[1P[1P[1P[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[Kell[K[K[K[K--name hello centos /bin/bash
docker: Error response from daemon: Conflict. The container name "/hello" is already in use by container "b8982642b8c99869888162dfd4c75fd1f40ce6228b0ea836816832717c3f23de". You have to remove (or rename) that container to be able to reuse that name.
See 'docker run --help'.
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker run -it  --name hello centos /bin/bash[1P[1P[1P[1P[1P[1P[1P[1P[1P[1P[1P[1P[1P[1P
]0;@7dff5807dbe8:/[root@7dff5807dbe8 /]# ls
bin  dev  etc  home  lib  lib64  lost+found  media  mnt  opt  proc  root  run  sbin  srv  sys  tmp  usr  var
]0;@7dff5807dbe8:/[root@7dff5807dbe8 /]# exit
exit
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker search ubuntu
NAME                             DESCRIPTION                                     STARS               OFFICIAL            AUTOMATED
ubuntu                           Ubuntu is a Debian-based Linux operating sys…   15463               [OK]                
websphere-liberty                WebSphere Liberty multi-architecture images …   291                 [OK]                
ubuntu-upstart                   DEPRECATED, as is Upstart (find other proces…   111                 [OK]                
neurodebian                      NeuroDebian provides neuroscience research s…   98                  [OK]                
ubuntu/nginx                     Nginx, a high-performance reverse proxy & we…   75                                      
open-liberty                     Open Liberty multi-architecture images based…   56                  [OK]                
ubuntu/apache2                   Apache, a secure & extensible open-source HT…   52                                      
ubuntu-debootstrap               DEPRECATED; use "ubuntu" instead                50                  [OK]                
ubuntu/squid                     Squid is a caching proxy for the Web. Long-t…   49                                      
ubuntu/bind9                     BIND 9 is a very flexible, full-featured DNS…   43                                      
ubuntu/mysql                     MySQL open source fast, stable, multi-thread…   41                                      
ubuntu/prometheus                Prometheus is a systems and service monitori…   35                                      
ubuntu/postgres                  PostgreSQL is an open source object-relation…   23                                      
ubuntu/kafka                     Apache Kafka, a distributed event streaming …   20                                      
ubuntu/redis                     Redis, an open source key-value store. Long-…   16                                      
ubuntu/prometheus-alertmanager   Alertmanager handles client alerts from Prom…   8                                       
ubuntu/dotnet-deps               Chiselled Ubuntu for self-contained .NET & A…   6                                       
ubuntu/grafana                   Grafana, a feature rich metrics dashboard & …   6                                       
ubuntu/memcached                 Memcached, in-memory keyvalue store for smal…   5                                       
ubuntu/zookeeper                 ZooKeeper maintains configuration informatio…   5                                       
ubuntu/dotnet-runtime            Chiselled Ubuntu runtime image for .NET apps…   5                                       
ubuntu/telegraf                  Telegraf collects, processes, aggregates & w…   4                                       
ubuntu/cortex                    Cortex provides storage for Prometheus. Long…   3                                       
ubuntu/dotnet-aspnet             Chiselled Ubuntu runtime image for ASP.NET a…   3                                       
ubuntu/cassandra                 Cassandra, an open source NoSQL distributed …   2                                       
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ di[Kocker ps -a
CONTAINER ID        IMAGE                          COMMAND                  CREATED             STATUS                      PORTS               NAMES
7dff5807dbe8        centos                         "/bin/bash"              53 seconds ago      Exited (0) 48 seconds ago                       vigilant_khorana
b8982642b8c9        chef/chef                      "/bin/bash"              2 minutes ago       Created                                         hello
d25ccac0bcf3        ubuntu                         "/bin/bash"              2 hours ago         Exited (0) 2 hours ago                          affectionate_ardinghelli
548dd3570a9e        containrrr/watchtower          "/watchtower --clean…"   3 hours ago         Up 3 hours                  8080/tcp            watchtower
64b7cbcfdf19        packetstream/psclient:latest   "/bin/sh -c psrun"       3 hours ago         Up 3 hours                                      psclient
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker ps -asearch ubuntu[K[K[K[K[K[Kkinshuc[Kl[Kk
NAME                                         DESCRIPTION                             STARS               OFFICIAL            AUTOMATED
kinshuk4/techtrends                                                                  0                                       
kinshuksen/first-app                                                                 0                                       
kinshuk4/cnand-md-trial                                                              0                                       
kinshuk4/cnand-md-backend                                                            0                                       
kinshukm88/kinshuk_imagetag                                                          0                                       
kinshuk4/cnand-md-frontend                                                           0                                       
kinshuksen/helloworld                                                                0                                       
kinshuk4/udaconnect-api-connection                                                   0                                       
kinshuk4/udaconnect-consumer-location                                                0                                       
kinshuk4/udaconnect-grpc-producer-location                                           0                                       
kinshuk4/udaconnect-app                                                              0                                       
kinshuk4/udaconnect-grpc-person                                                      0                                       
kinshukb/python-hello-world                                                          0                                       
kinshuk4/udaconnect-api-location                                                     0                                       
kinshuk4/udaconnect-api                                                              0                                       
kinshuk4/udaconnect-api-person                                                       0                                       
kinshuk619/website                           website                                 0                                       
kinshukbanerjee/kbnginximage                                                         0                                       
kinshuk644/my-apache2                        A web server to run and view webpages   0                                       
kjuneja/kinshuk                                                                      0                                       
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker search kinshuk[9Pps -a
CONTAINER ID        IMAGE                          COMMAND                  CREATED             STATUS                     PORTS               NAMES
7dff5807dbe8        centos                         "/bin/bash"              2 minutes ago       Exited (0) 2 minutes ago                       vigilant_khorana
b8982642b8c9        chef/chef                      "/bin/bash"              3 minutes ago       Created                                        hello
d25ccac0bcf3        ubuntu                         "/bin/bash"              2 hours ago         Exited (0) 2 hours ago                         affectionate_ardinghelli
548dd3570a9e        containrrr/watchtower          "/watchtower --clean…"   3 hours ago         Up 3 hours                 8080/tcp            watchtower
64b7cbcfdf19        packetstream/psclient:latest   "/bin/sh -c psrun"       3 hours ago         Up 3 hours                                     psclient
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker start hello
Error response from daemon: OCI runtime create failed: container_linux.go:349: starting container process caused "exec: \"/bin/bash\": stat /bin/bash: no such file or directory": unknown
Error: failed to start containers: hello
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker start hello[K[K[K[K[Kvigilant_khorana
vigilant_khorana
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ ps
    PID TTY          TIME CMD
  61950 pts/1    00:00:00 bash
  65398 pts/1    00:00:00 ps
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ psdpsopscpskpsepsrps ps
CONTAINER ID        IMAGE                          COMMAND                  CREATED             STATUS              PORTS               NAMES
7dff5807dbe8        centos                         "/bin/bash"              3 minutes ago       Up 10 seconds                           vigilant_khorana
548dd3570a9e        containrrr/watchtower          "/watchtower --clean…"   3 hours ago         Up 3 hours          8080/tcp            watchtower
64b7cbcfdf19        packetstream/psclient:latest   "/bin/sh -c psrun"       3 hours ago         Up 3 hours                              psclient
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ dockw[Ke r[K[Kr attach vigilant_khorana

bin  dev  etc  home  lib  lib64  lost+found  media  mnt  opt  proc  root  run  sbin  srv  sys  tmp  usr  var
]0;@7dff5807dbe8:/[root@7dff5807dbe8 /]# c exiit  t
exit
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker e[Kstop vigilant_khorana
vigilant_khorana
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker stop vigilant_khorana[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[Kps
CONTAINER ID        IMAGE                          COMMAND                  CREATED             STATUS              PORTS               NAMES
548dd3570a9e        containrrr/watchtower          "/watchtower --clean…"   3 hours ago         Up 3 hours          8080/tcp            watchtower
64b7cbcfdf19        packetstream/psclient:latest   "/bin/sh -c psrun"       3 hours ago         Up 3 hours                              psclient
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker psstop vigilant_khoranaps[K -a
CONTAINER ID        IMAGE                          COMMAND                  CREATED             STATUS                      PORTS               NAMES
7dff5807dbe8        centos                         "/bin/bash"              4 minutes ago       Exited (0) 36 seconds ago                       vigilant_khorana
b8982642b8c9        chef/chef                      "/bin/bash"              6 minutes ago       Created                                         hello
d25ccac0bcf3        ubuntu                         "/bin/bash"              2 hours ago         Exited (0) 2 hours ago                          affectionate_ardinghelli
548dd3570a9e        containrrr/watchtower          "/watchtower --clean…"   3 hours ago         Up 3 hours                  8080/tcp            watchtower
64b7cbcfdf19        packetstream/psclient:latest   "/bin/sh -c psrun"       3 hours ago         Up 3 hours                                      psclient
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker search bipin
NAME                                                  DESCRIPTION         STARS               OFFICIAL            AUTOMATED
bipins/rabbitmq                                       my rabbitmq         0                                       [OK]
bipingslab/flask-api                                                      0                                       
bipinsharmaregmi/com.wwex.container.streamprocessor                       0                                       
bipinsk2911/devopstutorial                            devopstutorial      0                                       
bipink/hello-kube                                                         0                                       
bipin115/html-server-image                                                0                                       
bipins/rpi-aspnetcore                                                     0                                       
bipinkrish/file-converter                                                 0                                       
bipinalchetti/foodtruck                                                   0                                       
bipinjz/strapi-docker                                                     0                                       
bipin1086/mkdocs-ci-test                                                  0                                       
bipincsa/cmad5-blog                                                       0                                       
bipinm/co_metadata                                                        0                                       
bipinrajvk/dockerdemo                                                     0                                       
bipinalchetti/foodtrucks-web                                              0                                       
bipintiwari234/node-hello-app                                             0                                       
bipinthite/nodejs-sample-auto                         automated build     0                                       [OK]
bipinbipin/kubelab                                                        0                                       
bipinm/javaupload                                                         0                                       
bipins/rpi-rabbitmq                                                       0                                       
bipincsa/vote-worker                                                      0                                       
bipingowda/sysfoo                                                         0                                       
bipin89/addressbook                                                       0                                       
bipinm/azure-dar-inference                                                0                                       
bipincsa/sonarqube                                                        0                                       
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker images
REPOSITORY              TAG                 IMAGE ID            CREATED             SIZE
chef/chef               latest              f4d3b21da2d1        12 days ago         120MB
ubuntu                  latest              6b7dfa7e8fdb        5 weeks ago         77.8MB
containrrr/watchtower   latest              d6b5c7ec581c        2 months ago        14.5MB
packetstream/psclient   latest              88f4ac9ff9c8        3 months ago        30.9MB
centos                  latest              5d0da3dc9764        16 months ago       231MB
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ cd ..
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ mkdir dockerdur1
]0;devasc@labvm: ~[01;32mdevasc@labvm[00m:[01;34m~[00m$ cd dockerdur1/
]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ ls
]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ g[Ksudo apy[Kt-get ap[K[Kinstall docker -y



docker is already the newest version (1.5-2).
0 upgraded, 0 newly installed, 0 to remove and 578 not upgraded.
]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ whix[Kch docker
/usr/bin/docker
]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ docker [K[K[K[K[K[K[Kservice docker status
[?1h=
     Loaded: loaded (/lib/systemd/system/docker.service; disabled; vendor preset: enabled)[m
     Active: [0;1;32mactive (running)[0m since Tue 2023-01-17 05:23:26 UTC; 3h 22min ago[m
TriggeredBy: [0;1;32m●[0m docker.socket[m
       Docs: https://docs.docker.com[m
   Main PID: 59547 (dockerd)[m
      Tasks: 13[m
     Memory: 592.0M[m
     CGroup: /system.slice/docker.service[m
             └─59547 /usr/bin/dockerd -H fd:// --containerd=/run/containerd/containerd.sock[m

CONTAINER ID        IMAGE                          COMMAND                  CREATED             STATUS              PORTS               NAMES
548dd3570a9e        containrrr/watchtower          "/watchtower --clean…"   3 hours ago         Up 3 hours          8080/tcp            watchtower
64b7cbcfdf19        packetstream/psclient:latest   "/bin/sh -c psrun"       3 hours ago         Up 3 hours                              psclient
]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ docker run --name me[Kt[Kycontainer -it ubantu[1Pntuuntu[C[C[C /bin [K/bad[Ksh
[?2004h]0;root@3bbafa16c40d: /root@3bbafa16c40d:/# ls
[?2004l
[?2004h]0;root@3bbafa16c40d: /root@3bbafa16c40d:/# cd tmp
[?2004l
[?2004l
[?2004l
[?2004l
[?2004h]0;root@3bbafa16c40d: /tmproot@3bbafa16c40d:/tmp# exit
[?2004l
]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ docker diff mycontainer
C /tmp
A /tmp/spfile
C /root
A /root/.bash_history
]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ docker commit mycontainer uba[Kuntu[K[K[K[K[K[Kupima[Kg
sha256:ea612e5f2652f5adc91a4ccb07663ba538ffcf64b64a317a7ff7e296b639e815
]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ docker images
REPOSITORY              TAG                 IMAGE ID            CREATED             SIZE
upimg                   latest              ea612e5f2652        25 seconds ago      77.8MB
chef/chef               latest              f4d3b21da2d1        12 days ago         120MB
ubuntu                  latest              6b7dfa7e8fdb        5 weeks ago         77.8MB
containrrr/watchtower   latest              d6b5c7ec581c        2 months ago        14.5MB
packetstream/psclient   latest              88f4ac9ff9c8        3 months ago        30.9MB
centos                  latest              5d0da3dc9764        16 months ago       231MB
]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ docker run -it ii[K[K--name spcontainer upimg [K
[?2004h]0;root@672333bca403: /root@672333bca403:/# 
[?2004l
[?2004h]0;root@672333bca403: /root@672333bca403:/# cd tmp
[?2004l
[?2004l
[?2004h]0;root@672333bca403: /tmproot@672333bca403:/tmp# exit
[?2004l
]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ docker run -it --name spcontainer upimgimages[Kcommit mycontainer upimg[8Pdiff mycontainerrun --name mycontainer -it ubuntu /bin/bash
REPOSITORY              TAG                 IMAGE ID            CREATED             SIZE
upimg                   latest              ea612e5f2652        4 minutes ago       77.8MB
chef/chef               latest              f4d3b21da2d1        12 days ago         120MB
ubuntu                  latest              6b7dfa7e8fdb        5 weeks ago         77.8MB
containrrr/watchtower   latest              d6b5c7ec581c        2 months ago        14.5MB
packetstream/psclient   latest              88f4ac9ff9c8        3 months ago        30.9MB
centos                  latest              5d0da3dc9764        16 months ago       231MB
]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ docker ps -a
CONTAINER ID        IMAGE                          COMMAND                  CREATED             STATUS                          PORTS               NAMES
672333bca403        upimg                          "/bin/bash"              2 minutes ago       Exited (0) About a minute ago                       spcontainer
3bbafa16c40d        ubuntu                         "/bin/bash"              9 minutes ago       Exited (0) 7 minutes ago                            mycontainer
7dff5807dbe8        centos                         "/bin/bash"              32 minutes ago      Exited (0) 27 minutes ago                           vigilant_khorana
b8982642b8c9        chef/chef                      "/bin/bash"              33 minutes ago      Created                                             hello
d25ccac0bcf3        ubuntu                         "/bin/bash"              3 hours ago         Exited (0) 2 hours ago                              affectionate_ardinghelli
548dd3570a9e        containrrr/watchtower          "/watchtower --clean…"   3 hours ago         Up 3 hours                      8080/tcp            watchtower
64b7cbcfdf19        packetstream/psclient:latest   "/bin/sh -c psrun"       3 hours ago         Up 3 hours                                          psclient
]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ docker attach spcontainer
You cannot attach to a stopped container, start it first
]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ docker attach spcontainerps -a[Kimagesrun -it --name spcontainer upimg
docker: Error response from daemon: Conflict. The container name "/spcontainer" is already in use by container "672333bca403fbd23e40c4ef996a1af8a803876d9228c01dbba352477a366c0a". You have to remove (or rename) that container to be able to reuse that name.
See 'docker run --help'.
]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ docker run -it --name spcontainer upimg[C[1P upimg[1P upimg[1P upimg[1P upimg[1P upimg[1P upimg[1P upimg[1P upimg[1P upimg[1P upimg[1P upimg[1Pupimg[1P upimg[1P upimg[1P upimg[1P upimg[1P upimg[1P upimg[C[C[C[C[C[C[K[K[K[K[K[K[K[K[K[K[K[K[K[Ksy[Ktart spcontainer
spcontainer
]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ docker attach spcontainer

[?2004l
[?2004h]0;root@672333bca403: /root@672333bca403:/# cd tmp
[?2004l
[?2004l
[?2004h]0;root@672333bca403: /tmproot@672333bca403:/tmp# vi i hello
[?2004l
[?2004h]0;root@672333bca403: /tmproot@672333bca403:/tmp# get-apt install vi
[?2004l
[?2004h]0;root@672333bca403: /tmproot@672333bca403:/tmp# get-apt install vi[1P[1P[1P[1P[1P[1P[1P[1@s[1@u[1@d[1@o [1@ [1@g[1@e[1@t[1@-[1@a[1@p[1P[1P[1P[1P[1P[1P[1@a[1@p[1@t[1@-[1@g[1@e[1@t i
[?2004l
[?2004h]0;root@672333bca403: /tmproot@672333bca403:/tmp# sudo apt-get install vi [1P[1P[1P[1P[1P
[?2004l


E: Unable to locate package vi
[?2004h]0;root@672333bca403: /tmproot@672333bca403:/tmp# vi hello
[?2004l
[?2004h]0;root@672333bca403: /tmproot@672333bca403:/tmp# vi helloapt-get install vi[5@sudo apt-get install vi[5Papt-get install vim
[?2004l


E: Unable to locate package vim
[?2004h]0;root@672333bca403: /tmproot@672333bca403:/tmp# ls
[?2004l
[?2004h]0;root@672333bca403: /tmproot@672333bca403:/tmp# exit
[?2004l
]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ ls
]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ docker ps -a 
CONTAINER ID        IMAGE                          COMMAND                  CREATED             STATUS                      PORTS               NAMES
672333bca403        upimg                          "/bin/bash"              6 minutes ago       Exited (0) 7 seconds ago                        spcontainer
3bbafa16c40d        ubuntu                         "/bin/bash"              12 minutes ago      Exited (0) 11 minutes ago                       mycontainer
7dff5807dbe8        centos                         "/bin/bash"              35 minutes ago      Exited (0) 31 minutes ago                       vigilant_khorana
b8982642b8c9        chef/chef                      "/bin/bash"              37 minutes ago      Created                                         hello
d25ccac0bcf3        ubuntu                         "/bin/bash"              3 hours ago         Exited (0) 3 hours ago                          affectionate_ardinghelli
548dd3570a9e        containrrr/watchtower          "/watchtower --clean…"   3 hours ago         Up 3 hours                  8080/tcp            watchtower
64b7cbcfdf19        packetstream/psclient:latest   "/bin/sh -c psrun"       3 hours ago         Up 3 hours                                      psclient
]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ docker starty[K spcontainer
spcontainer
]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ docker attach spci[Kontainer

[?2004l
[?2004h]0;root@672333bca403: /root@672333bca403:/# cd    [7msudo apt-get install vim  [27msudo apt-get install vim  
[?2004l
[?2004h]0;root@672333bca403: /root@672333bca403:/# [Ksudo apt-get install vim   [1P[1P[1P[1P[1P
[?2004l


E: Unable to locate package vim
[?2004h]0;root@672333bca403: /root@672333bca403:/# apt-get install vim    -runtime
[?2004l


E: Unable to locate package vim-runtime
[?2004h]0;root@672333bca403: /root@672333bca403:/# [Kapt-get install vim-runtime        
[?2004l


E: Unable to locate package vim
[?2004h]0;root@672333bca403: /root@672333bca403:/# [Kapt  -get update
[?2004l


  The following signatures couldn't be verified because the public key is not available: NO_PUBKEY 871920D1991BC93C

  The following signatures couldn't be verified because the public key is not available: NO_PUBKEY 871920D1991BC93C


  The following signatures couldn't be verified because the public key is not available: NO_PUBKEY 871920D1991BC93C


  The following signatures couldn't be verified because the public key is not available: NO_PUBKEY 871920D1991BC93C

W: http://security.ubuntu.com/ubuntu/dists/jammy-security/InRelease: The key(s) in the keyring /etc/apt/trusted.gpg.d/ubuntu-keyring-2012-cdimage.gpg are ignored as the file is not readable by user '_apt' executing apt-key.
W: http://security.ubuntu.com/ubuntu/dists/jammy-security/InRelease: The key(s) in the keyring /etc/apt/trusted.gpg.d/ubuntu-keyring-2018-archive.gpg are ignored as the file is not readable by user '_apt' executing apt-key.
W: GPG error: http://security.ubuntu.com/ubuntu jammy-security InRelease: The following signatures couldn't be verified because the public key is not available: NO_PUBKEY 871920D1991BC93C
E: The repository 'http://security.ubuntu.com/ubuntu jammy-security InRelease' is not signed.
N: Updating from such a repository can't be done securely, and is therefore disabled by default.
N: See apt-secure(8) manpage for repository creation and user configuration details.
W: http://archive.ubuntu.com/ubuntu/dists/jammy/InRelease: The key(s) in the keyring /etc/apt/trusted.gpg.d/ubuntu-keyring-2012-cdimage.gpg are ignored as the file is not readable by user '_apt' executing apt-key.
W: http://archive.ubuntu.com/ubuntu/dists/jammy/InRelease: The key(s) in the keyring /etc/apt/trusted.gpg.d/ubuntu-keyring-2018-archive.gpg are ignored as the file is not readable by user '_apt' executing apt-key.
W: GPG error: http://archive.ubuntu.com/ubuntu jammy InRelease: The following signatures couldn't be verified because the public key is not available: NO_PUBKEY 871920D1991BC93C
E: The repository 'http://archive.ubuntu.com/ubuntu jammy InRelease' is not signed.
N: Updating from such a repository can't be done securely, and is therefore disabled by default.
N: See apt-secure(8) manpage for repository creation and user configuration details.
W: http://archive.ubuntu.com/ubuntu/dists/jammy-updates/InRelease: The key(s) in the keyring /etc/apt/trusted.gpg.d/ubuntu-keyring-2012-cdimage.gpg are ignored as the file is not readable by user '_apt' executing apt-key.
W: http://archive.ubuntu.com/ubuntu/dists/jammy-updates/InRelease: The key(s) in the keyring /etc/apt/trusted.gpg.d/ubuntu-keyring-2018-archive.gpg are ignored as the file is not readable by user '_apt' executing apt-key.
W: GPG error: http://archive.ubuntu.com/ubuntu jammy-updates InRelease: The following signatures couldn't be verified because the public key is not available: NO_PUBKEY 871920D1991BC93C
E: The repository 'http://archive.ubuntu.com/ubuntu jammy-updates InRelease' is not signed.
N: Updating from such a repository can't be done securely, and is therefore disabled by default.
N: See apt-secure(8) manpage for repository creation and user configuration details.
W: http://archive.ubuntu.com/ubuntu/dists/jammy-backports/InRelease: The key(s) in the keyring /etc/apt/trusted.gpg.d/ubuntu-keyring-2012-cdimage.gpg are ignored as the file is not readable by user '_apt' executing apt-key.
W: http://archive.ubuntu.com/ubuntu/dists/jammy-backports/InRelease: The key(s) in the keyring /etc/apt/trusted.gpg.d/ubuntu-keyring-2018-archive.gpg are ignored as the file is not readable by user '_apt' executing apt-key.
W: GPG error: http://archive.ubuntu.com/ubuntu jammy-backports InRelease: The following signatures couldn't be verified because the public key is not available: NO_PUBKEY 871920D1991BC93C
E: The repository 'http://archive.ubuntu.com/ubuntu jammy-backports InRelease' is not signed.
N: Updating from such a repository can't be done securely, and is therefore disabled by default.
N: See apt-secure(8) manpage for repository creation and user configuration details.
E: Problem executing scripts APT::Update::Post-Invoke 'rm -f /var/cache/apt/archives/*.deb /var/cache/apt/archives/partial/*.deb /var/cache/apt/*.bin || true'
E: Sub-process returned an error code
[?2004h]0;root@672333bca403: /root@672333bca403:/# apt-get updateinstall vim[5Pupdate      install apt-file
[?2004l


E: Unable to locate package apt-file
[?2004h]0;root@672333bca403: /root@672333bca403:/# exit
[?2004l
]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ ls
]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ do[K[Klsdocker attach spcontainer[1Pstart[C[C[C[C[C[C[C[C[C[C[C[C[11Pps -a 
CONTAINER ID        IMAGE                          COMMAND                  CREATED             STATUS                       PORTS               NAMES
672333bca403        upimg                          "/bin/bash"              31 minutes ago      Exited (100) 9 minutes ago                       spcontainer
3bbafa16c40d        ubuntu                         "/bin/bash"              37 minutes ago      Exited (0) 36 minutes ago                        mycontainer
7dff5807dbe8        centos                         "/bin/bash"              About an hour ago   Exited (0) 56 minutes ago                        vigilant_khorana
b8982642b8c9        chef/chef                      "/bin/bash"              About an hour ago   Created                                          hello
d25ccac0bcf3        ubuntu                         "/bin/bash"              3 hours ago         Exited (0) 3 hours ago                           affectionate_ardinghelli
548dd3570a9e        containrrr/watchtower          "/watchtower --clean…"   4 hours ago         Up 4 hours                   8080/tcp            watchtower
64b7cbcfdf19        packetstream/psclient:latest   "/bin/sh -c psrun"       4 hours ago         Up 4 hours                                       psclient
]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ docker ps -a [K[K[K
CONTAINER ID        IMAGE                          COMMAND                  CREATED             STATUS              PORTS               NAMES
548dd3570a9e        containrrr/watchtower          "/watchtower --clean…"   4 hours ago         Up 4 hours          8080/tcp            watchtower
64b7cbcfdf19        packetstream/psclient:latest   "/bin/sh -c psrun"       4 hours ago         Up 4 hours                              psclient
]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ vi Dockerfile
[?1049h[22;0;0t[>4;2m[?1h=[?2004h[1;24r[?12h[?12l[22;2t[22;1t[27m[23m[29m[m[H[2J[?25l[24;1H"Dockerfile" [New File][2;1H▽[6n[2;1H  [1;1H[>c]10;?]11;?[2;1H[94m~                                                                                                                                                                            [3;1H~                                                                                                                                                                            [4;1H~                                                                                                                                                                            [5;1H~                                                                                                                                                                            [6;1H~                                                                                                                                                                            [7;1H~                                                                                                                                                                            [8;1H~                                                                                                                                                                            [9;1H~                                                                                                                                                                            [10;1H~                                                                                                                                                                            [11;1H~                                                                                                                                                                            [12;1H~                                                                                                                                                                            [13;1H~                                                                                                                                                                            [14;1H~                                                                                                                                                                            [15;1H~                                                                                                                                                                            [16;1H~                                                                                                                                                                            [17;1H~                                                                                                                                                                            [18;1H~                                                                                                                                                                            [19;1H~                                                                                                                                                                            [20;1H~                                                                                                                                                                            [21;1H~                                                                                                                                                                            [22;1H~                                                                                                                                                                            [23;1H~                                                                                                                                                                            [m[24;156H0,0-1[9CAll[1;1H[?25hP+q436f\P+q6b75\P+q6b64\P+q6b72\P+q6b6c\P+q2332\P+q2334\P+q2569\P+q2a37\P+q6b31\[27m[23m[29m[m[H[2J[?25l[2;1H[94m~                                                                                                                                                                            [3;1H~                                                                                                                                                                            [4;1H~                                                                                                                                                                            [5;1H~                                                                                                                                                                            [6;1H~                                                                                                                                                                            [7;1H~                                                                                                                                                                            [8;1H~                                                                                                                                                                            [9;1H~                                                                                                                                                                            [10;1H~                                                                                                                                                                            [11;1H~                                                                                                                                                                            [12;1H~                                                                                                                                                                            [13;1H~                                                                                                                                                                            [14;1H~                                                                                                                                                                            [15;1H~                                                                                                                                                                            [16;1H~                                                                                                                                                                            [17;1H~                                                                                                                                                                            [18;1H~                                                                                                                                                                            [19;1H~                                                                                                                                                                            [20;1H~                                                                                                                                                                            [21;1H~                                                                                                                                                                            [22;1H~                                                                                                                                                                            [23;1H~                                                                                                                                                                            [m[24;156H0,0-1[9CAll
[?2004l[?1l>[?25h[>4;m[?1049l[23;0;0t]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ cat[K[K[Kvi Dockerfile[C[C[1P Dockerfile[1P Dockerfilec Dockerfilea Dockerfilet Dockerfile[C Dockerfile
FROM ubuntu
RUN echo "Welcome to docker bhai"> /.tmp/testfile
]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ docker build -t tsd[K[Kest .
Sending build context to Docker daemon  2.048kB
Step 1/2 : FROM ubuntu
 ---> 6b7dfa7e8fdb
Step 2/2 : RUN echo "Welcome to docker bhai"> /.tmp/testfile
 ---> Running in 72429d92e87d
[91m/bin/sh: 1: cannot create /.tmp/testfile: Directory nonexistent
[0mThe command '/bin/sh -c echo "Welcome to docker bhai"> /.tmp/testfile' returned a non-zero code: 2
]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ docker build -t test .[7Pcat  Dockerfile[2Pvi[C[C[C[C[C[C[C[C[C[C[C
[?1049h[22;0;0t[>4;2m[?1h=[?2004h[1;24r[?12h[?12l[22;2t[22;1t[27m[23m[29m[m[H[2J[?25l[24;1H"Dockerfile" 2L, 62C[2;1H▽[6n[2;1H  [1;1H[>c]10;?]11;?[1;1H[38;5;130mFROM [mubuntu
[38;5;130mRUN [mecho [31m"Welcome to docker bhai"[m> /.tmp/testfile
[94m~                                                                                                                                                                            [4;1H~                                                                                                                                                                            [5;1H~                                                                                                                                                                            [6;1H~                                                                                                                                                                            [7;1H~                                                                                                                                                                            [8;1H~                                                                                                                                                                            [9;1H~                                                                                                                                                                            [10;1H~                                                                                                                                                                            [11;1H~                                                                                                                                                                            [12;1H~                                                                                                                                                                            [13;1H~                                                                                                                                                                            [14;1H~                                                                                                                                                                            [15;1H~                                                                                                                                                                            [16;1H~                                                                                                                                                                            [17;1H~                                                                                                                                                                            [18;1H~                                                                                                                                                                            [19;1H~                                                                                                                                                                            [20;1H~                                                                                                                                                                            [21;1H~                                                                                                                                                                            [22;1H~                                                                                                                                                                            [23;1H~                                                                                                                                                                            [m[24;156H2,49[10CAll[2;49H[?25hP+q436f\P+q6b75\P+q6b64\P+q6b72\P+q6b6c\P+q2332\P+q2334\P+q2569\P+q2a37\P+q6b31\[27m[23m[29m[m[H[2J[?25l[1;1H[93mFROM [mubuntu
[93mRUN [mecho [95m"Welcome to docker bhai"[m> /.tmp/testfile
[94m~                                                                                                                                                                            [4;1H~                                                                                                                                                                            [5;1H~                                                                                                                                                                            [6;1H~                                                                                                                                                                            [7;1H~                                                                                                                                                                            [8;1H~                                                                                                                                                                            [9;1H~                                                                                                                                                                            [10;1H~                                                                                                                                                                            [11;1H~                                                                                                                                                                            [12;1H~                                                                                                                                                                            [13;1H~                                                                                                                                                                            [14;1H~                                                                                                                                                                            [15;1H~                                                                                                                                                                            [16;1H~                                                                                                                                                                            [17;1H~                                                                                                                                                                            [18;1H~                                                                                                                                                                            [19;1H~                                                                                                                                                                            [20;1H~                                                                                                                                                                            [21;1H~                                                                                                                                                                            [22;1H~                                                                                                                                                                            [23;1H~                                                                                                                                                                            [m[24;156H2,49[10CAll
[?2004l[?1l>[?25h[>4;m[?1049l[23;0;0t]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ vi Dockerfiledocker build -t test .
Sending build context to Docker daemon  2.048kB
Step 1/2 : FROM ubuntu
 ---> 6b7dfa7e8fdb
Step 2/2 : RUN echo "Welcome to docker bhai"> /tmp/testfile
 ---> Running in 08c848212106
Removing intermediate container 08c848212106
 ---> 0fe8137ddb66
Successfully built 0fe8137ddb66
Successfully tagged test:latest
]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ docker build -t test .[9Pvi Dockerfiledocker build -t test .[7Pcat  Dockerfile
FROM ubuntu
RUN echo "Welcome to docker bhai"> /tmp/testfile
]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ ima[K[K[Kd[Kdocker images
REPOSITORY              TAG                 IMAGE ID            CREATED              SIZE
test                    latest              0fe8137ddb66        About a minute ago   77.8MB
upimg                   latest              ea612e5f2652        39 minutes ago       77.8MB
chef/chef               latest              f4d3b21da2d1        12 days ago          120MB
ubuntu                  latest              6b7dfa7e8fdb        5 weeks ago          77.8MB
containrrr/watchtower   latest              d6b5c7ec581c        2 months ago         14.5MB
packetstream/psclient   latest              88f4ac9ff9c8        3 months ago         30.9MB
centos                  latest              5d0da3dc9764        16 months ago        231MB
]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ docker run -iy[Kt --name testcontainer test /bin [K/bash
[?2004h]0;root@b815064f409a: /root@b815064f409a:/# 
[?2004l
[?2004h]0;root@b815064f409a: /root@b815064f409a:/# cd tmp
[?2004l
[?2004l
[?2004h]0;root@b815064f409a: /tmproot@b815064f409a:/tmp# cat testfile
[?2004l
[?2004h]0;root@b815064f409a: /tmproot@b815064f409a:/tmp# exit
[?2004l
]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ ps[K[Kdocker ps
CONTAINER ID        IMAGE                          COMMAND                  CREATED             STATUS              PORTS               NAMES
548dd3570a9e        containrrr/watchtower          "/watchtower --clean…"   4 hours ago         Up 4 hours          8080/tcp            watchtower
64b7cbcfdf19        packetstream/psclient:latest   "/bin/sh -c psrun"       4 hours ago         Up 4 hours                              psclient
]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ docker ps -a
CONTAINER ID        IMAGE                          COMMAND                   CREATED             STATUS                         PORTS               NAMES
b815064f409a        test                           "/bin/bash"               2 minutes ago       Exited (0) 55 seconds ago                          testcontainer
72429d92e87d        6b7dfa7e8fdb                   "/bin/sh -c 'echo \"W…"   4 minutes ago       Exited (2) 4 minutes ago                           mystifying_wiles
672333bca403        upimg                          "/bin/bash"               40 minutes ago      Exited (100) 18 minutes ago                        spcontainer
3bbafa16c40d        ubuntu                         "/bin/bash"               46 minutes ago      Exited (0) 45 minutes ago                          mycontainer
7dff5807dbe8        centos                         "/bin/bash"               About an hour ago   Exited (0) About an hour ago                       vigilant_khorana
b8982642b8c9        chef/chef                      "/bin/bash"               About an hour ago   Created                                            hello
d25ccac0bcf3        ubuntu                         "/bin/bash"               3 hours ago         Exited (0) 3 hours ago                             affectionate_ardinghelli
548dd3570a9e        containrrr/watchtower          "/watchtower --clean…"    4 hours ago         Up 4 hours                     8080/tcp            watchtower
64b7cbcfdf19        packetstream/psclient:latest   "/bin/sh -c psrun"        4 hours ago         Up 4 hours                                         psclient
]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ ls
Dockerfile
]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ vi DO[Kocuer[K[K[Kkerfir[Kle
[?1049h[22;0;0t[>4;2m[?1h=[?2004h[1;24r[?12h[?12l[22;2t[22;1t[27m[23m[29m[m[H[2J[?25l[24;1H"Dockerfile" 2L, 61C[2;1H▽[6n[2;1H  [1;1H[>c]10;?]11;?[1;1H[38;5;130mFROM [mubuntu
[38;5;130mRUN [mecho [31m"Welcome to docker bhai"[m> /tmp/testfile
[94m~                                                                                                                                                                            [4;1H~                                                                                                                                                                            [5;1H~                                                                                                                                                                            [6;1H~                                                                                                                                                                            [7;1H~                                                                                                                                                                            [8;1H~                                                                                                                                                                            [9;1H~                                                                                                                                                                            [10;1H~                                                                                                                                                                            [11;1H~                                                                                                                                                                            [12;1H~                                                                                                                                                                            [13;1H~                                                                                                                                                                            [14;1H~                                                                                                                                                                            [15;1H~                                                                                                                                                                            [16;1H~                                                                                                                                                                            [17;1H~                                                                                                                                                                            [18;1H~                                                                                                                                                                            [19;1H~                                                                                                                                                                            [20;1H~                                                                                                                                                                            [21;1H~                                                                                                                                                                            [22;1H~                                                                                                                                                                            [23;1H~                                                                                                                                                                            [m[24;156H2,36[10CAll[2;36H[?25hP+q436f\P+q6b75\P+q6b64\P+q6b72\P+q6b6c\P+q2332\P+q2334\P+q2569\P+q2a37\P+q6b31\[27m[23m[29m[m[H[2J[?25l[1;1H[93mFROM [mubuntu
[93mRUN [mecho [95m"Welcome to docker bhai"[m> /tmp/testfile
[94m~                                                                                                                                                                            [4;1H~                                                                                                                                                                            [5;1H~                                                                                                                                                                            [6;1H~                                                                                                                                                                            [7;1H~                                                                                                                                                                            [8;1H~                                                                                                                                                                            [9;1H~                                                                                                                                                                            [10;1H~                                                                                                                                                                            [11;1H~                                                                                                                                                                            [12;1H~                                                                                                                                                                            [13;1H~                                                                                                                                                                            [14;1H~                                                                                                                                                                            [15;1H~                                                                                                                                                                            [16;1H~                                                                                                                                                                            [17;1H~                                                                                                                                                                            [18;1H~                                                                                                                                                                            [19;1H~                                                                                                                                                                            [20;1H~                                                                                                                                                                            [21;1H~                                                                                                                                                                            [22;1H~                                                                                                                                                                            [23;1H~                                                                                                                                                                            [m[24;156H2,36[10CAll
[1;24r[2;1H[93mWORKDIR [m/tmp[23;1H[94m~                                                                                                                                                                            [m[24;156H[K[24;156H2,13[10CAll[2;13H[?25h[?25l[24;156H3[3;13H[?25h[?25l[24;159H4[3;14H[?25h[?25l[24;159H5[3;15H[?25h[?25l[24;159H6[3;16H[?25h[?25l[24;159H7[3;17H[?25h[?25l[24;159H8[3;18H[?25h[?25l[24;159H9[3;19H[?25h[?25l[24;158H20[3;20H[?25h[?25l[24;159H1[3;21H[?25h[?25l[24;159H2[3;22H[?25h[?25l[24;159H3[3;23H[?25h[?25l[24;159H4[3;24H[?25h[?25l[24;159H5[3;25H[?25h[?25l[24;159H6[3;26H[?25h[?25l[24;159H7[3;27H[?25h[?25l[24;159H8[3;28H[?25h[?25l[24;159H9[3;29H[?25h[?25l[24;158H30[3;30H[?25h[?25l[24;159H1[3;31H[?25h[?25l[24;159H2[3;32H[?25h[?25l[24;159H3[3;33H[?25h[?25l[24;159H4[3;34H[?25h[?25l[24;159H5[3;35H[?25h[?25l[24;159H4[3;34H[?25h[?25l[24;159H3[3;33H[?25h[?25l[24;159H2[3;32H[?25h[?25l[24;159H1[3;31H[?25h[?25l[24;159H0[3;30H[?25h[?25l[24;158H29[3;29H[?25h[?25l[24;159H8[3;28H[?25h[?25l[24;159H7[3;27H[?25h[?25l[24;159H6[3;26H[?25h[?25l[24;159H5[3;25H[?25h[?25l[24;159H4[3;24H[?25h[?25l[24;159H3[3;23H[?25h[?25l[24;159H2[3;22H[?25h[?25l[24;159H1[3;21H[?25h[?25l[24;159H0[3;20H[?25h[?25l[24;158H19[3;19H[?25h[?25l[24;159H8[3;18H[?25h[?25l[24;159H7[3;17H[?25h[?25l[24;159H6[3;16H[?25h[?25l[24;159H5[3;15H[?25h[?25l[24;159H4[3;14H[?25h[?25l[24;159H3[3;13H[?25h[?25l[24;159H2[3;12H[?25h[?25l[24;159H1[3;11H[?25h[?25l[24;159H0[3;10H[?25h[?25l[24;159H1[3;11H[?25h[?25l[95m Welcome to docker bhai"[m> /tmp/testfile[24;159H2[3;12H[?25h[?25l[95mWelcome to docker bhai"[m> /tmp/testfile[3;49H[K[24;159H1[3;11H[?25h[?25l[95myWelcome to docker bhai"[m> /tmp/testfile[24;159H2[3;12H[?25h[?25l[95meWelcome to docker bhai"[m> /tmp/testfile[24;159H3[3;13H[?25h[?25l[95mhWelcome to docker bhai"[m> /tmp/testfile[24;159H4[3;14H[?25h[?25l[95m Welcome to docker bhai"[m> /tmp/testfile[24;159H5[3;15H[?25h[?25l[95mdWelcome to docker bhai"[m> /tmp/testfile[24;159H6[3;16H[?25h[?25l[95moWelcome to docker bhai"[m> /tmp/testfile[24;159H7[3;17H[?25h[?25l[95mcWelcome to docker bhai"[m> /tmp/testfile[24;159H8[3;18H[?25h[?25l[95mkWelcome to docker bhai"[m> /tmp/testfile[24;159H9[3;19H[?25h[?25l[95meWelcome to docker bhai"[m> /tmp/testfile[24;158H20[3;20H[?25h[?25l[95mrWelcome to docker bhai"[m> /tmp/testfile[24;159H1[3;21H[?25h[?25l[95m Welcome to docker bhai"[m> /tmp/testfile[24;159H2[3;22H[?25h[?25l[95mnWelcome to docker bhai"[m> /tmp/testfile[24;159H3[3;23H[?25h[?25l[95maWelcome to docker bhai"[m> /tmp/testfile[24;159H4[3;24H[?25h[?25l[95mhWelcome to docker bhai"[m> /tmp/testfile[24;159H5[3;25H[?25h[?25l[95miWelcome to docker bhai"[m> /tmp/testfile[24;159H6[3;26H[?25h[?25l[95m Welcome to docker bhai"[m> /tmp/testfile[24;159H7[3;27H[?25h[?25l[95mhWelcome to docker bhai"[m> /tmp/testfile[24;159H8[3;28H[?25h[?25l[95maWelcome to docker bhai"[m> /tmp/testfile[24;159H9[3;29H[?25h[?25l[95miWelcome to docker bhai"[m> /tmp/testfile[24;158H30[3;30H[?25h[?25l[95m Welcome to docker bhai"[m> /tmp/testfile[24;159H1[3;31H[?25h[?25l[95mbWelcome to docker bhai"[m> /tmp/testfile[24;159H2[3;32H[?25h[?25l[95mhWelcome to docker bhai"[m> /tmp/testfile[24;159H3[3;33H[?25h[?25l[95miWelcome to docker bhai"[m> /tmp/testfile[24;159H4[3;34H[?25h[?25l[95maWelcome to docker bhai"[m> /tmp/testfile[24;159H5[3;35H[?25h[?25l[95m=Welcome to docker bhai"[m> /tmp/testfile[24;159H6[3;36H[?25h[?25l[95mWelcome to docker bhai"[m> /tmp/testfile[3;73H[K[24;159H5[3;35H[?25h[?25l[95mWelcome to docker bhai"[m> /tmp/testfile[3;72H[K[24;159H4[3;34H[?25h[?25l[95mWelcome to docker bhai"[m> /tmp/testfile[3;71H[K[24;159H3[3;33H[?25h[?25l[95mWelcome to docker bhai"[m> /tmp/testfile[3;70H[K[24;159H2[3;32H[?25h[?25l[95mWelcome to docker bhai"[m> /tmp/testfile[3;69H[K[24;159H1[3;31H[?25h[?25l[95mWelcome to docker bhai"[m> /tmp/testfile[3;68H[K[24;159H0[3;30H[?25h[?25l[95m.Welcome to docker bhai"[m> /tmp/testfile[24;159H1[3;31H[?25h[?25l[24;159H2[3;32H[?25h[?25l[24;159H3[3;33H[?25h[?25l[24;159H4[3;34H[?25h[?25l[24;159H5[3;35H[?25h[?25l[24;159H6[3;36H[?25h[?25l[24;159H7[3;37H[?25h[?25l[24;159H8[3;38H[?25h[?25l[24;159H9[3;39H[?25h[?25l[24;158H40[3;40H[?25h[?25l[24;159H1[3;41H[?25h[?25l[24;159H2[3;42H[?25h[?25l[24;159H3[3;43H[?25h[?25l[24;159H4[3;44H[?25h[?25l[24;159H5[3;45H[?25h[?25l[24;159H6[3;46H[?25h[?25l[24;159H7[3;47H[?25h[?25l[24;159H8[3;48H[?25h[?25l[24;159H9[3;49H[?25h[?25l[24;158H50[3;50H[?25h[?25l[24;159H1[3;51H[?25h[?25l[24;159H2[3;52H[?25h[?25l[24;159H3[3;53H[?25h[?25l[24;159H4[3;54H[?25h[?25l[24;159H5[3;55H[?25h[?25l[24;159H6[3;56H[?25h[?25l[24;159H7[3;57H[?25h[?25l[24;159H8[3;58H[?25h[?25l[24;159H9[3;59H[?25h[?25l[24;158H60[3;60H[?25h[?25l[24;159H1[3;61H[?25h[?25l[24;159H2[3;62H[?25h[?25l[24;159H3[3;63H[?25h[?25l[24;159H4[3;64H[?25h[?25l[24;159H5[3;65H[?25h[?25l[24;159H6[3;66H[?25h[?25l[24;159H7[3;67H[?25h[?25l[24;159H8[3;68H[?25h[?25l[24;159H9[3;69H[?25h[?25l[4;1H[K[24;156H4,1 [4;1H[?25h[?25lE[24;158H2[4;2H[?25h[?25lN[24;158H3[4;3H[?25h[?25lV[24;158H4[4;4H[?25h[?25l
[?2004l[?1l>[?25h[>4;m[?1049l[23;0;0t]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ vi Dockerfile[1P Dockerfile[1P Dockerfilec Dockerfilea Dockerfilet Dockerfile
FROM ubuntu
WORKDIR /tmp
RUN echo "yeh docker nahi hai.Welcome to docker bhai"> /tmp/testfile
ENV myname sajoy
COPY testfile1 /tmp
ADD test.tar.gz /tmp

]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ ls
Dockerfile
]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ touch testfile1 test
]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ ls
Dockerfile  test  testfile1
]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ tar -cvf tsed[K[K[Kest.tar test
test
]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ ls
Dockerfile  test  testfile1  [0m[01;31mtest.tar[0m
]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ gzip -rf test.tar
]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ ls
Dockerfile  test  testfile1  [0m[01;31mtest.tar.gz[0m
]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ docker bul[Kilt -t newimage .
unknown shorthand flag: 't' in -t
See 'docker --help'.

Usage:	docker [OPTIONS] COMMAND

A self-sufficient runtime for containers

Options:
      --config string      Location of client config files (default "/home/devasc/.docker")
  -c, --context string     Name of the context to use to connect to the daemon (overrides DOCKER_HOST env var and default context set with "docker context use")
  -D, --debug              Enable debug mode
  -H, --host list          Daemon socket(s) to connect to
  -l, --log-level string   Set the logging level ("debug"|"info"|"warn"|"error"|"fatal") (default "info")
      --tls                Use TLS; implied by --tlsverify
      --tlscacert string   Trust certs signed only by this CA (default "/home/devasc/.docker/ca.pem")
      --tlscert string     Path to TLS certificate file (default "/home/devasc/.docker/cert.pem")
      --tlskey string      Path to TLS key file (default "/home/devasc/.docker/key.pem")
      --tlsverify          Use TLS and verify the remote
  -v, --version            Print version information and quit

Management Commands:
  builder     Manage builds
  config      Manage Docker configs
  container   Manage containers
  context     Manage contexts
  engine      Manage the docker engine
  image       Manage images
  network     Manage networks
  node        Manage Swarm nodes
  plugin      Manage plugins
  secret      Manage Docker secrets
  service     Manage services
  stack       Manage Docker stacks
  swarm       Manage Swarm
  system      Manage Docker
  trust       Manage trust on Docker images
  volume      Manage volumes

Commands:
  attach      Attach local standard input, output, and error streams to a running container
  build       Build an image from a Dockerfile
  commit      Create a new image from a container's changes
  cp          Copy files/folders between a container and the local filesystem
  create      Create a new container
  diff        Inspect changes to files or directories on a container's filesystem
  events      Get real time events from the server
  exec        Run a command in a running container
  export      Export a container's filesystem as a tar archive
  history     Show the history of an image
  images      List images
  import      Import the contents from a tarball to create a filesystem image
  info        Display system-wide information
  inspect     Return low-level information on Docker objects
  kill        Kill one or more running containers
  load        Load an image from a tar archive or STDIN
  login       Log in to a Docker registry
  logout      Log out from a Docker registry
  logs        Fetch the logs of a container
  pause       Pause all processes within one or more containers
  port        List port mappings or a specific mapping for the container
  ps          List containers
  pull        Pull an image or a repository from a registry
  push        Push an image or a repository to a registry
  rename      Rename a container
  restart     Restart one or more containers
  rm          Remove one or more containers
  rmi         Remove one or more images
  run         Run a command in a new container
  save        Save one or more images to a tar archive (streamed to STDOUT by default)
  search      Search the Docker Hub for images
  start       Start one or more stopped containers
  stats       Display a live stream of container(s) resource usage statistics
  stop        Stop one or more running containers
  tag         Create a tag TARGET_IMAGE that refers to SOURCE_IMAGE
  top         Display the running processes of a container
  unpause     Unpause all processes within one or more containers
  update      Update configuration of one or more containers
  version     Show the Docker version information
  wait        Block until one or more containers stop, then print their exit codes

Run 'docker COMMAND --help' for more information on a command.

]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ docker built -t newimage .
unknown shorthand flag: 't' in -t
See 'docker --help'.

Usage:	docker [OPTIONS] COMMAND

A self-sufficient runtime for containers

Options:
      --config string      Location of client config files (default "/home/devasc/.docker")
  -c, --context string     Name of the context to use to connect to the daemon (overrides DOCKER_HOST env var and default context set with "docker context use")
  -D, --debug              Enable debug mode
  -H, --host list          Daemon socket(s) to connect to
  -l, --log-level string   Set the logging level ("debug"|"info"|"warn"|"error"|"fatal") (default "info")
      --tls                Use TLS; implied by --tlsverify
      --tlscacert string   Trust certs signed only by this CA (default "/home/devasc/.docker/ca.pem")
      --tlscert string     Path to TLS certificate file (default "/home/devasc/.docker/cert.pem")
      --tlskey string      Path to TLS key file (default "/home/devasc/.docker/key.pem")
      --tlsverify          Use TLS and verify the remote
  -v, --version            Print version information and quit

Management Commands:
  builder     Manage builds
  config      Manage Docker configs
  container   Manage containers
  context     Manage contexts
  engine      Manage the docker engine
  image       Manage images
  network     Manage networks
  node        Manage Swarm nodes
  plugin      Manage plugins
  secret      Manage Docker secrets
  service     Manage services
  stack       Manage Docker stacks
  swarm       Manage Swarm
  system      Manage Docker
  trust       Manage trust on Docker images
  volume      Manage volumes

Commands:
  attach      Attach local standard input, output, and error streams to a running container
  build       Build an image from a Dockerfile
  commit      Create a new image from a container's changes
  cp          Copy files/folders between a container and the local filesystem
  create      Create a new container
  diff        Inspect changes to files or directories on a container's filesystem
  events      Get real time events from the server
  exec        Run a command in a running container
  export      Export a container's filesystem as a tar archive
  history     Show the history of an image
  images      List images
  import      Import the contents from a tarball to create a filesystem image
  info        Display system-wide information
  inspect     Return low-level information on Docker objects
  kill        Kill one or more running containers
  load        Load an image from a tar archive or STDIN
  login       Log in to a Docker registry
  logout      Log out from a Docker registry
  logs        Fetch the logs of a container
  pause       Pause all processes within one or more containers
  port        List port mappings or a specific mapping for the container
  ps          List containers
  pull        Pull an image or a repository from a registry
  push        Push an image or a repository to a registry
  rename      Rename a container
  restart     Restart one or more containers
  rm          Remove one or more containers
  rmi         Remove one or more images
  run         Run a command in a new container
  save        Save one or more images to a tar archive (streamed to STDOUT by default)
  search      Search the Docker Hub for images
  start       Start one or more stopped containers
  stats       Display a live stream of container(s) resource usage statistics
  stop        Stop one or more running containers
  tag         Create a tag TARGET_IMAGE that refers to SOURCE_IMAGE
  top         Display the running processes of a container
  unpause     Unpause all processes within one or more containers
  update      Update configuration of one or more containers
  version     Show the Docker version information
  wait        Block until one or more containers stop, then print their exit codes

Run 'docker COMMAND --help' for more information on a command.

]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ docker built -t newimage .
unknown shorthand flag: 't' in -t
See 'docker --help'.

Usage:	docker [OPTIONS] COMMAND

A self-sufficient runtime for containers

Options:
      --config string      Location of client config files (default "/home/devasc/.docker")
  -c, --context string     Name of the context to use to connect to the daemon (overrides DOCKER_HOST env var and default context set with "docker context use")
  -D, --debug              Enable debug mode
  -H, --host list          Daemon socket(s) to connect to
  -l, --log-level string   Set the logging level ("debug"|"info"|"warn"|"error"|"fatal") (default "info")
      --tls                Use TLS; implied by --tlsverify
      --tlscacert string   Trust certs signed only by this CA (default "/home/devasc/.docker/ca.pem")
      --tlscert string     Path to TLS certificate file (default "/home/devasc/.docker/cert.pem")
      --tlskey string      Path to TLS key file (default "/home/devasc/.docker/key.pem")
      --tlsverify          Use TLS and verify the remote
  -v, --version            Print version information and quit

Management Commands:
  builder     Manage builds
  config      Manage Docker configs
  container   Manage containers
  context     Manage contexts
  engine      Manage the docker engine
  image       Manage images
  network     Manage networks
  node        Manage Swarm nodes
  plugin      Manage plugins
  secret      Manage Docker secrets
  service     Manage services
  stack       Manage Docker stacks
  swarm       Manage Swarm
  system      Manage Docker
  trust       Manage trust on Docker images
  volume      Manage volumes

Commands:
  attach      Attach local standard input, output, and error streams to a running container
  build       Build an image from a Dockerfile
  commit      Create a new image from a container's changes
  cp          Copy files/folders between a container and the local filesystem
  create      Create a new container
  diff        Inspect changes to files or directories on a container's filesystem
  events      Get real time events from the server
  exec        Run a command in a running container
  export      Export a container's filesystem as a tar archive
  history     Show the history of an image
  images      List images
  import      Import the contents from a tarball to create a filesystem image
  info        Display system-wide information
  inspect     Return low-level information on Docker objects
  kill        Kill one or more running containers
  load        Load an image from a tar archive or STDIN
  login       Log in to a Docker registry
  logout      Log out from a Docker registry
  logs        Fetch the logs of a container
  pause       Pause all processes within one or more containers
  port        List port mappings or a specific mapping for the container
  ps          List containers
  pull        Pull an image or a repository from a registry
  push        Push an image or a repository to a registry
  rename      Rename a container
  restart     Restart one or more containers
  rm          Remove one or more containers
  rmi         Remove one or more images
  run         Run a command in a new container
  save        Save one or more images to a tar archive (streamed to STDOUT by default)
  search      Search the Docker Hub for images
  start       Start one or more stopped containers
  stats       Display a live stream of container(s) resource usage statistics
  stop        Stop one or more running containers
  tag         Create a tag TARGET_IMAGE that refers to SOURCE_IMAGE
  top         Display the running processes of a container
  unpause     Unpause all processes within one or more containers
  update      Update configuration of one or more containers
  version     Show the Docker version information
  wait        Block until one or more containers stop, then print their exit codes

Run 'docker COMMAND --help' for more information on a command.

]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ docker built -t newimage .[1P.[1P.[1P.[1P.[1P.[1P.[1P.[1P.[1P.[1P. .n.e.w. .
unknown shorthand flag: 't' in -t
See 'docker --help'.

Usage:	docker [OPTIONS] COMMAND

A self-sufficient runtime for containers

Options:
      --config string      Location of client config files (default "/home/devasc/.docker")
  -c, --context string     Name of the context to use to connect to the daemon (overrides DOCKER_HOST env var and default context set with "docker context use")
  -D, --debug              Enable debug mode
  -H, --host list          Daemon socket(s) to connect to
  -l, --log-level string   Set the logging level ("debug"|"info"|"warn"|"error"|"fatal") (default "info")
      --tls                Use TLS; implied by --tlsverify
      --tlscacert string   Trust certs signed only by this CA (default "/home/devasc/.docker/ca.pem")
      --tlscert string     Path to TLS certificate file (default "/home/devasc/.docker/cert.pem")
      --tlskey string      Path to TLS key file (default "/home/devasc/.docker/key.pem")
      --tlsverify          Use TLS and verify the remote
  -v, --version            Print version information and quit

Management Commands:
  builder     Manage builds
  config      Manage Docker configs
  container   Manage containers
  context     Manage contexts
  engine      Manage the docker engine
  image       Manage images
  network     Manage networks
  node        Manage Swarm nodes
  plugin      Manage plugins
  secret      Manage Docker secrets
  service     Manage services
  stack       Manage Docker stacks
  swarm       Manage Swarm
  system      Manage Docker
  trust       Manage trust on Docker images
  volume      Manage volumes

Commands:
  attach      Attach local standard input, output, and error streams to a running container
  build       Build an image from a Dockerfile
  commit      Create a new image from a container's changes
  cp          Copy files/folders between a container and the local filesystem
  create      Create a new container
  diff        Inspect changes to files or directories on a container's filesystem
  events      Get real time events from the server
  exec        Run a command in a running container
  export      Export a container's filesystem as a tar archive
  history     Show the history of an image
  images      List images
  import      Import the contents from a tarball to create a filesystem image
  info        Display system-wide information
  inspect     Return low-level information on Docker objects
  kill        Kill one or more running containers
  load        Load an image from a tar archive or STDIN
  login       Log in to a Docker registry
  logout      Log out from a Docker registry
  logs        Fetch the logs of a container
  pause       Pause all processes within one or more containers
  port        List port mappings or a specific mapping for the container
  ps          List containers
  pull        Pull an image or a repository from a registry
  push        Push an image or a repository to a registry
  rename      Rename a container
  restart     Restart one or more containers
  rm          Remove one or more containers
  rmi         Remove one or more images
  run         Run a command in a new container
  save        Save one or more images to a tar archive (streamed to STDOUT by default)
  search      Search the Docker Hub for images
  start       Start one or more stopped containers
  stats       Display a live stream of container(s) resource usage statistics
  stop        Stop one or more running containers
  tag         Create a tag TARGET_IMAGE that refers to SOURCE_IMAGE
  top         Display the running processes of a container
  unpause     Unpause all processes within one or more containers
  update      Update configuration of one or more containers
  version     Show the Docker version information
  wait        Block until one or more containers stop, then print their exit codes

Run 'docker COMMAND --help' for more information on a command.

]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ docker built -t new .image .ls[Kdocker built -t newimage .ls[Kgzip -rf test.tarls[Kdocker built -t newimage .[1P .[1P .[1P .[1P .[1P .[1P .[1P .[1P .t .e .s .t .
unknown shorthand flag: 't' in -t
See 'docker --help'.

Usage:	docker [OPTIONS] COMMAND

A self-sufficient runtime for containers

Options:
      --config string      Location of client config files (default "/home/devasc/.docker")
  -c, --context string     Name of the context to use to connect to the daemon (overrides DOCKER_HOST env var and default context set with "docker context use")
  -D, --debug              Enable debug mode
  -H, --host list          Daemon socket(s) to connect to
  -l, --log-level string   Set the logging level ("debug"|"info"|"warn"|"error"|"fatal") (default "info")
      --tls                Use TLS; implied by --tlsverify
      --tlscacert string   Trust certs signed only by this CA (default "/home/devasc/.docker/ca.pem")
      --tlscert string     Path to TLS certificate file (default "/home/devasc/.docker/cert.pem")
      --tlskey string      Path to TLS key file (default "/home/devasc/.docker/key.pem")
      --tlsverify          Use TLS and verify the remote
  -v, --version            Print version information and quit

Management Commands:
  builder     Manage builds
  config      Manage Docker configs
  container   Manage containers
  context     Manage contexts
  engine      Manage the docker engine
  image       Manage images
  network     Manage networks
  node        Manage Swarm nodes
  plugin      Manage plugins
  secret      Manage Docker secrets
  service     Manage services
  stack       Manage Docker stacks
  swarm       Manage Swarm
  system      Manage Docker
  trust       Manage trust on Docker images
  volume      Manage volumes

Commands:
  attach      Attach local standard input, output, and error streams to a running container
  build       Build an image from a Dockerfile
  commit      Create a new image from a container's changes
  cp          Copy files/folders between a container and the local filesystem
  create      Create a new container
  diff        Inspect changes to files or directories on a container's filesystem
  events      Get real time events from the server
  exec        Run a command in a running container
  export      Export a container's filesystem as a tar archive
  history     Show the history of an image
  images      List images
  import      Import the contents from a tarball to create a filesystem image
  info        Display system-wide information
  inspect     Return low-level information on Docker objects
  kill        Kill one or more running containers
  load        Load an image from a tar archive or STDIN
  login       Log in to a Docker registry
  logout      Log out from a Docker registry
  logs        Fetch the logs of a container
  pause       Pause all processes within one or more containers
  port        List port mappings or a specific mapping for the container
  ps          List containers
  pull        Pull an image or a repository from a registry
  push        Push an image or a repository to a registry
  rename      Rename a container
  restart     Restart one or more containers
  rm          Remove one or more containers
  rmi         Remove one or more images
  run         Run a command in a new container
  save        Save one or more images to a tar archive (streamed to STDOUT by default)
  search      Search the Docker Hub for images
  start       Start one or more stopped containers
  stats       Display a live stream of container(s) resource usage statistics
  stop        Stop one or more running containers
  tag         Create a tag TARGET_IMAGE that refers to SOURCE_IMAGE
  top         Display the running processes of a container
  unpause     Unpause all processes within one or more containers
  update      Update configuration of one or more containers
  version     Show the Docker version information
  wait        Block until one or more containers stop, then print their exit codes

Run 'docker COMMAND --help' for more information on a command.

]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ docker built -t test .[1P[1@d[C[C[C[C[C[C[C[C[1P .[1P .[1P .[1P .n .e .w .i .m .a .g .e .
Sending build context to Docker daemon  4.096kB
Step 1/6 : FROM ubuntu
 ---> 6b7dfa7e8fdb
Step 2/6 : WORKDIR /tmp
 ---> Running in da2907d2de94
Removing intermediate container da2907d2de94
 ---> 3c0a963e844a
Step 3/6 : RUN echo "yeh docker nahi hai.Welcome to docker bhai"> /tmp/testfile
 ---> Running in c73858e40c0c
Removing intermediate container c73858e40c0c
 ---> e7e381879d4b
Step 4/6 : ENV myname sajoy
 ---> Running in a88db6227ff5
Removing intermediate container a88db6227ff5
 ---> 9cf1e3016ada
Step 5/6 : COPY testfile1 /tmp
 ---> 301aef1b03c0
Step 6/6 : ADD test.tar.gz /tmp
 ---> 68fb1a389c98
Successfully built 68fb1a389c98
Successfully tagged newimage:latest
]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ docker image

Usage:	docker image COMMAND

Manage images

Commands:
  build       Build an image from a Dockerfile
  history     Show the history of an image
  import      Import the contents from a tarball to create a filesystem image
  inspect     Display detailed information on one or more images
  load        Load an image from a tar archive or STDIN
  ls          List images
  prune       Remove unused images
  pull        Pull an image or a repository from a registry
  push        Push an image or a repository to a registry
  rm          Remove one or more images
  save        Save one or more images to a tar archive (streamed to STDOUT by default)
  tag         Create a tag TARGET_IMAGE that refers to SOURCE_IMAGE

Run 'docker image COMMAND --help' for more information on a command.
]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ docker images
REPOSITORY              TAG                 IMAGE ID            CREATED             SIZE
newimage                latest              68fb1a389c98        15 seconds ago      77.8MB
test                    latest              0fe8137ddb66        27 minutes ago      77.8MB
upimg                   latest              ea612e5f2652        About an hour ago   77.8MB
chef/chef               latest              f4d3b21da2d1        12 days ago         120MB
ubuntu                  latest              6b7dfa7e8fdb        5 weeks ago         77.8MB
containrrr/watchtower   latest              d6b5c7ec581c        2 months ago        14.5MB
packetstream/psclient   latest              88f4ac9ff9c8        3 months ago        30.9MB
centos                  latest              5d0da3dc9764        16 months ago       231MB
]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ ls
Dockerfile  test  testfile1  [0m[01;31mtest.tar.gz[0m
]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ docker run -it --name nayacontainer newimage /bin/bash
[?2004h]0;root@103c0fdb0c8d: /tmproot@103c0fdb0c8d:/tmp# 
[?2004l
[?2004h]0;root@103c0fdb0c8d: /tmproot@103c0fdb0c8d:/tmp# cat testfile
[?2004l
[?2004h]0;root@103c0fdb0c8d: /tmproot@103c0fdb0c8d:/tmp# echo $myname
[?2004l
[?2004h]0;root@103c0fdb0c8d: /tmproot@103c0fdb0c8d:/tmp# exit
[?2004l
]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ exit
exit

Script done on 2023-01-17 10:02:20+00:00 [COMMAND_EXIT_CODE="0"]