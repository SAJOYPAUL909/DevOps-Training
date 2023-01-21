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
Reading package lists... 0%Reading package lists... 100%Reading package lists... Done
Building dependency tree... 0%Building dependency tree... 0%Building dependency tree... 50%Building dependency tree... 50%Building dependency tree       
Reading state information... 0%Reading state information... 0%Reading state information... Done
The following additional packages will be installed:
  wmdocker
The following NEW packages will be installed:
  docker wmdocker
0 upgraded, 2 newly installed, 0 to remove and 578 not upgraded.
Need to get 14.3 kB of archives.
After this operation, 58.4 kB of additional disk space will be used.
0% [Working]            Get:1 http://archive.ubuntu.com/ubuntu focal/universe amd64 wmdocker amd64 1.5-2 [13.0 kB]
7% [1 wmdocker 1,179 B/13.0 kB 9%]                                  83% [Waiting for headers]                         Get:2 http://archive.ubuntu.com/ubuntu focal/universe amd64 docker all 1.5-2 [1,316 B]
                         100% [Working]              Fetched 14.3 kB in 1s (27.9 kB/s)
Selecting previously unselected package wmdocker.
(Reading database ... (Reading database ... 5%(Reading database ... 10%(Reading database ... 15%(Reading database ... 20%(Reading database ... 25%(Reading database ... 30%(Reading database ... 35%(Reading database ... 40%(Reading database ... 45%(Reading database ... 50%(Reading database ... 55%(Reading database ... 60%(Reading database ... 65%(Reading database ... 70%(Reading database ... 75%(Reading database ... 80%(Reading database ... 85%(Reading database ... 90%(Reading database ... 95%(Reading database ... 100%(Reading database ... 212014 files and directories currently installed.)
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
[?1h=[0;1;32m●[0m docker.service - Docker Application Container Engine[m
     Loaded: loaded (/lib/systemd/system/docker.service; disabled; vendor preset: enabled)[m
     Active: [0;1;32mactive (running)[0m since Tue 2023-01-17 05:23:26 UTC; 35min ago[m
TriggeredBy: [0;1;32m●[0m docker.socket[m
       Docs: https://docs.docker.com[m
   Main PID: 59547 (dockerd)[m
      Tasks: 13[m
     Memory: 187.6M[m
     CGroup: /system.slice/docker.service[m
             └─59547 /usr/bin/dockerd -H fd:// --containerd=/run/containerd/containerd.sock[m
[K[?1l>]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docl[Kker info
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
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker run -it ubuntu /bn[Kin/bash
Unable to find image 'ubuntu:latest' locally
latest: Pulling from library/ubuntu

[1A[2K6e3729cf69e0: Pulling fs layer [1B[1A[2K6e3729cf69e0: Downloading [>                                                  ]  310.6kB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [=>                                                 ]  620.9kB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [=>                                                 ]  932.2kB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [==>                                                ]  1.244MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [==>                                                ]  1.555MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [===>                                               ]  1.866MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [===>                                               ]  2.177MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [====>                                              ]  2.489MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [====>                                              ]    2.8MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [=====>                                             ]  3.111MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [=====>                                             ]  3.423MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [======>                                            ]  3.734MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [======>                                            ]  4.045MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [=======>                                           ]  4.356MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [=======>                                           ]  4.668MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [========>                                          ]  4.979MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [========>                                          ]  5.299MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [=========>                                         ]  5.614MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [=========>                                         ]  5.929MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [==========>                                        ]  6.241MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [==========>                                        ]  6.552MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [===========>                                       ]  6.863MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [===========>                                       ]  7.175MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [============>                                      ]  7.486MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [============>                                      ]  7.797MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [=============>                                     ]  8.108MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [=============>                                     ]   8.42MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [==============>                                    ]  8.731MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [==============>                                    ]  9.042MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [===============>                                   ]  9.354MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [===============>                                   ]  9.665MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [================>                                  ]  9.976MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [================>                                  ]  10.29MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [=================>                                 ]   10.6MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [=================>                                 ]  10.91MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [==================>                                ]  11.22MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [==================>                                ]  11.54MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [===================>                               ]  11.85MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [===================>                               ]  12.16MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [====================>                              ]  12.47MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [=====================>                             ]  12.79MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [=====================>                             ]   13.1MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [======================>                            ]  13.41MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [======================>                            ]  13.72MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [=======================>                           ]  14.03MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [=======================>                           ]  14.35MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [========================>                          ]  14.66MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [========================>                          ]  14.97MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [=========================>                         ]  15.28MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [=========================>                         ]  15.59MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [==========================>                        ]   15.9MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [==========================>                        ]  16.22MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [===========================>                       ]  16.53MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [===========================>                       ]  16.84MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [============================>                      ]  17.15MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [============================>                      ]  17.46MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [=============================>                     ]  17.77MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [=============================>                     ]  18.08MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [==============================>                    ]  18.39MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [==============================>                    ]   18.7MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [===============================>                   ]  19.02MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [===============================>                   ]  19.33MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [================================>                  ]  19.64MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [================================>                  ]  19.95MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [=================================>                 ]  20.26MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [=================================>                 ]  20.57MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [==================================>                ]  20.88MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [==================================>                ]   21.2MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [===================================>               ]  21.51MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [===================================>               ]  21.82MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [====================================>              ]  22.13MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [====================================>              ]  22.44MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [=====================================>             ]  22.75MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [=====================================>             ]  23.06MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [======================================>            ]  23.37MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [======================================>            ]  23.68MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [=======================================>           ]  23.99MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [=======================================>           ]   24.3MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [========================================>          ]  24.62MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [========================================>          ]  24.93MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [=========================================>         ]  25.24MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [=========================================>         ]  25.55MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [==========================================>        ]  25.86MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [===========================================>       ]  26.17MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [===========================================>       ]  26.48MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [============================================>      ]  26.79MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [============================================>      ]  27.11MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [=============================================>     ]  27.42MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [=============================================>     ]  27.73MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [==============================================>    ]  28.04MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [==============================================>    ]  28.35MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [===============================================>   ]  28.66MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [===============================================>   ]  28.97MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [================================================>  ]  29.28MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [================================================>  ]   29.6MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [=================================================> ]  29.91MB/30.43MB[1B[1A[2K6e3729cf69e0: Downloading [=================================================> ]  30.22MB/30.43MB[1B[1A[2K6e3729cf69e0: Verifying Checksum [1B[1A[2K6e3729cf69e0: Download complete [1B[1A[2K6e3729cf69e0: Extracting [>                                                  ]  327.7kB/30.43MB[1B[1A[2K6e3729cf69e0: Extracting [========>                                          ]  4.915MB/30.43MB[1B[1A[2K6e3729cf69e0: Extracting [=============>                                     ]  8.192MB/30.43MB[1B[1A[2K6e3729cf69e0: Extracting [==================>                                ]  11.47MB/30.43MB[1B[1A[2K6e3729cf69e0: Extracting [========================>                          ]  15.07MB/30.43MB[1B[1A[2K6e3729cf69e0: Extracting [===============================>                   ]  19.01MB/30.43MB[1B[1A[2K6e3729cf69e0: Extracting [=======================================>           ]  23.92MB/30.43MB[1B[1A[2K6e3729cf69e0: Extracting [===========================================>       ]  26.54MB/30.43MB[1B[1A[2K6e3729cf69e0: Extracting [================================================>  ]  29.49MB/30.43MB[1B[1A[2K6e3729cf69e0: Extracting [==================================================>]  30.43MB/30.43MB[1B[1A[2K6e3729cf69e0: Pull complete [1BDigest: sha256:27cb6e6ccef575a4698b66f5de06c7ecd61589132d5a91d098f7f3f9285415a9
Status: Downloaded newer image for ubuntu:latest
[?2004h]0;root@d25ccac0bcf3: /root@d25ccac0bcf3:/# [K]0;root@d25ccac0bcf3: /root@d25ccac0bcf3:/# ls
[?2004lbin  boot  dev	etc  home  lib	lib32  lib64  libx32  media  mnt  opt  proc  root  run	sbin  srv  sys	tmp  usr  var
[?2004h]0;root@d25ccac0bcf3: /root@d25ccac0bcf3:/# exit
[?2004lexit
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docke[K[K[K[K[Kls
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker images
REPOSITORY              TAG                 IMAGE ID            CREATED             SIZE
ubuntu                  latest              6b7dfa7e8fdb        5 weeks ago         77.8MB
containrrr/watchtower   latest              d6b5c7ec581c        2 months ago        14.5MB
packetstream/psclient   latest              88f4ac9ff9c8        3 months ago        30.9MB
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker ri[Kun -it centos /bin/bash
Unable to find image 'centos:latest' locally
latest: Pulling from library/centos

[1A[2Ka1d0c7532777: Pulling fs layer [1B[1A[2Ka1d0c7532777: Downloading [>                                                  ]  540.7kB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [>                                                  ]  1.081MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [>                                                  ]  1.622MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [=>                                                 ]  2.157MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [=>                                                 ]  2.698MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [=>                                                 ]  3.238MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [==>                                                ]  3.779MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [==>                                                ]   4.32MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [==>                                                ]   4.86MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [===>                                               ]  5.401MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [===>                                               ]  5.942MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [===>                                               ]  6.482MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [====>                                              ]  7.023MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [====>                                              ]  7.564MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [====>                                              ]  8.104MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [=====>                                             ]  8.645MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [=====>                                             ]  9.186MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [=====>                                             ]  9.726MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [======>                                            ]  10.25MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [======>                                            ]   10.8MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [======>                                            ]  11.33MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [=======>                                           ]  11.87MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [=======>                                           ]  12.41MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [=======>                                           ]  12.95MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [========>                                          ]  13.49MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [========>                                          ]  14.03MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [========>                                          ]  14.57MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [=========>                                         ]  15.11MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [=========>                                         ]  15.65MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [=========>                                         ]  16.19MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [==========>                                        ]  16.73MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [==========>                                        ]  17.27MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [==========>                                        ]  17.81MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [==========>                                        ]  18.34MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [===========>                                       ]  18.88MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [===========>                                       ]  19.43MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [===========>                                       ]  19.97MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [============>                                      ]  20.51MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [============>                                      ]  21.05MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [============>                                      ]  21.59MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [=============>                                     ]  22.13MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [=============>                                     ]  22.66MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [=============>                                     ]   23.2MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [==============>                                    ]  23.74MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [==============>                                    ]  24.28MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [==============>                                    ]  24.82MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [===============>                                   ]  25.36MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [===============>                                   ]   25.9MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [===============>                                   ]  26.44MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [================>                                  ]  26.97MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [================>                                  ]  27.52MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [================>                                  ]  28.06MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [=================>                                 ]   28.6MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [=================>                                 ]  29.14MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [=================>                                 ]  29.68MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [==================>                                ]  30.21MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [==================>                                ]  30.76MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [==================>                                ]   31.3MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [===================>                               ]  31.83MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [===================>                               ]  32.37MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [===================>                               ]   32.9MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [====================>                              ]  33.44MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [====================>                              ]  33.98MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [====================>                              ]  34.52MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [====================>                              ]  35.06MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [=====================>                             ]   35.6MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [=====================>                             ]  36.14MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [=====================>                             ]  36.68MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [======================>                            ]  37.21MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [======================>                            ]  37.76MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [======================>                            ]   38.3MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [=======================>                           ]  38.84MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [=======================>                           ]  39.38MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [=======================>                           ]  39.92MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [========================>                          ]  40.45MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [========================>                          ]     41MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [========================>                          ]  41.54MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [=========================>                         ]  42.08MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [=========================>                         ]  42.61MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [=========================>                         ]  43.15MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [==========================>                        ]  43.69MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [==========================>                        ]  44.23MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [==========================>                        ]  44.77MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [===========================>                       ]  45.31MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [===========================>                       ]  45.85MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [===========================>                       ]  46.39MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [============================>                      ]  46.93MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [============================>                      ]  47.47MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [============================>                      ]  48.01MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [=============================>                     ]  48.55MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [=============================>                     ]  49.09MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [=============================>                     ]  49.62MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [==============================>                    ]  50.16MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [==============================>                    ]   50.7MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [==============================>                    ]  51.24MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [===============================>                   ]  51.78MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [===============================>                   ]  52.32MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [===============================>                   ]  52.87MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [===============================>                   ]  53.41MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [================================>                  ]  53.95MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [================================>                  ]  54.49MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [================================>                  ]  55.03MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [=================================>                 ]  55.57MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [=================================>                 ]  56.11MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [=================================>                 ]  56.65MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [==================================>                ]  57.19MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [==================================>                ]  57.73MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [==================================>                ]  58.27MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [===================================>               ]  58.81MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [===================================>               ]  59.35MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [===================================>               ]  59.89MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [====================================>              ]  60.43MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [====================================>              ]  60.98MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [====================================>              ]  61.52MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [=====================================>             ]  62.06MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [=====================================>             ]   62.6MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [=====================================>             ]  63.13MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [======================================>            ]  63.67MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [======================================>            ]  64.21MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [======================================>            ]  64.75MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [=======================================>           ]  65.28MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [=======================================>           ]  65.83MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [=======================================>           ]  66.37MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [========================================>          ]  66.91MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [========================================>          ]  67.45MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [========================================>          ]  67.99MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [=========================================>         ]  68.53MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [=========================================>         ]  69.07MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [=========================================>         ]  69.61MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [=========================================>         ]  70.15MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [==========================================>        ]  70.69MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [==========================================>        ]  71.22MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [==========================================>        ]  71.75MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [===========================================>       ]  72.29MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [===========================================>       ]  72.83MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [===========================================>       ]  73.37MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [============================================>      ]  73.91MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [============================================>      ]  74.44MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [============================================>      ]  74.98MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [=============================================>     ]  75.52MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [=============================================>     ]  76.06MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [=============================================>     ]  76.59MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [==============================================>    ]  77.13MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [==============================================>    ]  77.67MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [==============================================>    ]  78.22MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [===============================================>   ]  78.76MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [===============================================>   ]   79.3MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [===============================================>   ]  79.84MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [================================================>  ]  80.37MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [================================================>  ]  80.91MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [================================================>  ]  81.45MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [=================================================> ]  81.99MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [=================================================> ]  82.53MB/83.52MB[1B[1A[2Ka1d0c7532777: Downloading [=================================================> ]  83.07MB/83.52MB[1B[1A[2Ka1d0c7532777: Verifying Checksum [1B[1A[2Ka1d0c7532777: Download complete [1B[1A[2Ka1d0c7532777: Extracting [>                                                  ]  557.1kB/83.52MB[1B[1A[2Ka1d0c7532777: Extracting [==>                                                ]  4.456MB/83.52MB[1B[1A[2Ka1d0c7532777: Extracting [=====>                                             ]   9.47MB/83.52MB[1B[1A[2Ka1d0c7532777: Extracting [========>                                          ]  13.37MB/83.52MB[1B[1A[2Ka1d0c7532777: Extracting [=========>                                         ]   15.6MB/83.52MB[1B[1A[2Ka1d0c7532777: Extracting [==========>                                        ]  17.83MB/83.52MB[1B[1A[2Ka1d0c7532777: Extracting [============>                                      ]  20.05MB/83.52MB[1B[1A[2Ka1d0c7532777: Extracting [==============>                                    ]  23.95MB/83.52MB[1B[1A[2Ka1d0c7532777: Extracting [================>                                  ]  27.85MB/83.52MB[1B[1A[2Ka1d0c7532777: Extracting [===================>                               ]  32.87MB/83.52MB[1B[1A[2Ka1d0c7532777: Extracting [======================>                            ]  37.32MB/83.52MB[1B[1A[2Ka1d0c7532777: Extracting [=========================>                         ]  42.89MB/83.52MB[1B[1A[2Ka1d0c7532777: Extracting [============================>                      ]  47.35MB/83.52MB[1B[1A[2Ka1d0c7532777: Extracting [===============================>                   ]  51.81MB/83.52MB[1B[1A[2Ka1d0c7532777: Extracting [================================>                  ]  54.03MB/83.52MB[1B[1A[2Ka1d0c7532777: Extracting [=================================>                 ]  55.71MB/83.52MB[1B[1A[2Ka1d0c7532777: Extracting [==================================>                ]  56.82MB/83.52MB[1B[1A[2Ka1d0c7532777: Extracting [===================================>               ]   59.6MB/83.52MB[1B[1A[2Ka1d0c7532777: Extracting [=====================================>             ]  62.39MB/83.52MB[1B[1A[2Ka1d0c7532777: Extracting [=======================================>           ]  65.73MB/83.52MB[1B[1A[2Ka1d0c7532777: Extracting [=========================================>         ]  69.07MB/83.52MB[1B[1A[2Ka1d0c7532777: Extracting [============================================>      ]  73.53MB/83.52MB[1B[1A[2Ka1d0c7532777: Extracting [==============================================>    ]  76.87MB/83.52MB[1B[1A[2Ka1d0c7532777: Extracting [===============================================>   ]  79.66MB/83.52MB[1B[1A[2Ka1d0c7532777: Extracting [================================================>  ]  80.22MB/83.52MB[1B[1A[2Ka1d0c7532777: Extracting [=================================================> ]  82.44MB/83.52MB[1B[1A[2Ka1d0c7532777: Extracting [==================================================>]  83.52MB/83.52MB[1B[1A[2Ka1d0c7532777: Pull complete [1BDigest: sha256:a27fd8080b517143cbbbab9dfb7c8571c40d67d534bbdee55bd6c473f432b177
Status: Downloaded newer image for centos:latest
]0;@d576cdeef25a:/[root@d576cdeef25a /]# ls
bin  dev  etc  home  lib  lib64  lost+found  media  mnt  opt  proc  root  run  sbin  srv  sys  tmp  usr  var
]0;@d576cdeef25a:/[root@d576cdeef25a /]# exit
exit
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker run -it centos /bin/bashimages[Kls[Kdocker run -it ubuntu /bin/bash
[?2004h]0;root@b207ccdae116: /root@b207ccdae116:/# [K]0;root@b207ccdae116: /root@b207ccdae116:/# ls
[?2004lbin  boot  dev	etc  home  lib	lib32  lib64  libx32  media  mnt  opt  proc  root  run	sbin  srv  sys	tmp  usr  var
[?2004h]0;root@b207ccdae116: /root@b207ccdae116:/# exit
[?2004lexit
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
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ cat /etc[K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ cat /etc[K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ cat /etc[K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ cat /etc[K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ cat /etc[K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ cat /etc[K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ cat /etc[K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ cat /etc[K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ cat /etc[K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ cat /etc[K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ cat /etc[K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ cat /etc[K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ cat /etc[K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ cat /etc[K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ cat /etc[K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ cat /etc[K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ cat /etc[K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ cat /etc[K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ cat /etc[K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ cat /etc[K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ cat /etc[K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ cat /etc[K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ cat /etc[K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ cat /etc[K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ cat /etc[K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ cat /etc[K[K[K[K[K[K[K[Kdocker start packetstream/psclient
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
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm centos[K[K[K[K[K[K[K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm Docker rm centosdocker start packetstream/psclient:latest[Kps -a[K
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

[1A[2K2123501b93d4: Pulling fs layer [1B
[1A[2K20b32fa31097: Pulling fs layer [1B[1A[2K20b32fa31097: Downloading [>                                                  ]  408.9kB/39.44MB[1B[2A[2K2123501b93d4: Downloading [>                                                  ]  26.77kB/2.588MB[2B[2A[2K2123501b93d4: Downloading [=>                                                 ]  53.99kB/2.588MB[2B[2A[2K2123501b93d4: Downloading [===>                                               ]  167.4kB/2.588MB[2B[2A[2K2123501b93d4: Downloading [======>                                            ]    327kB/2.588MB[2B[2A[2K2123501b93d4: Downloading [========>                                          ]  462.1kB/2.588MB[2B[2A[2K2123501b93d4: Downloading [=========>                                         ]  494.9kB/2.588MB[2B[1A[2K20b32fa31097: Downloading [=>                                                 ]  818.5kB/39.44MB[1B[2A[2K2123501b93d4: Downloading [===========>                                       ]  593.2kB/2.588MB[2B[2A[2K2123501b93d4: Downloading [=============>                                     ]  691.5kB/2.588MB[2B[2A[2K2123501b93d4: Downloading [===============>                                   ]  789.8kB/2.588MB[2B[2A[2K2123501b93d4: Downloading [=================>                                 ]  920.9kB/2.588MB[2B[1A[2K20b32fa31097: Downloading [=>                                                 ]  1.228MB/39.44MB[1B[2A[2K2123501b93d4: Downloading [===================>                               ]  1.019MB/2.588MB[2B[2A[2K2123501b93d4: Downloading [=====================>                             ]  1.117MB/2.588MB[2B[2A[2K2123501b93d4: Downloading [=======================>                           ]  1.216MB/2.588MB[2B[2A[2K2123501b93d4: Downloading [==========================>                        ]  1.347MB/2.588MB[2B[1A[2K20b32fa31097: Downloading [==>                                                ]  1.633MB/39.44MB[1B[2A[2K2123501b93d4: Downloading [===========================>                       ]  1.445MB/2.588MB[2B[2A[2K2123501b93d4: Downloading [=============================>                     ]  1.543MB/2.588MB[2B[2A[2K2123501b93d4: Downloading [===============================>                   ]  1.642MB/2.588MB[2B[2A[2K2123501b93d4: Downloading [==================================>                ]  1.773MB/2.588MB[2B[1A[2K20b32fa31097: Downloading [==>                                                ]  2.042MB/39.44MB[1B[2A[2K2123501b93d4: Downloading [====================================>              ]  1.871MB/2.588MB[2B[2A[2K2123501b93d4: Downloading [======================================>            ]  1.969MB/2.588MB[2B[2A[2K2123501b93d4: Downloading [========================================>          ]  2.101MB/2.588MB[2B[2A[2K2123501b93d4: Downloading [=========================================>         ]  2.166MB/2.588MB[2B[1A[2K20b32fa31097: Downloading [===>                                               ]  2.452MB/39.44MB[1B[2A[2K2123501b93d4: Downloading [============================================>      ]  2.325MB/2.588MB[2B[2A[2K2123501b93d4: Downloading [==============================================>    ]  2.423MB/2.588MB[2B[2A[2K2123501b93d4: Downloading [=================================================> ]  2.587MB/2.588MB[2B[2A[2K2123501b93d4: Verifying Checksum [2B[2A[2K2123501b93d4: Download complete [2B[2A[2K2123501b93d4: Extracting [>                                                  ]  32.77kB/2.588MB[2B[1A[2K20b32fa31097: Downloading [===>                                               ]  2.861MB/39.44MB[1B[2A[2K2123501b93d4: Extracting [==================================================>]  2.588MB/2.588MB[2B[2A[2K2123501b93d4: Extracting [==================================================>]  2.588MB/2.588MB[2B[2A[2K2123501b93d4: Pull complete [2B[1A[2K20b32fa31097: Downloading [====>                                              ]  3.263MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [====>                                              ]  3.672MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [=====>                                             ]  4.082MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [=====>                                             ]  4.492MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [======>                                            ]  4.901MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [======>                                            ]  5.311MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [=======>                                           ]  5.716MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [=======>                                           ]  6.126MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [========>                                          ]  6.536MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [========>                                          ]  6.945MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [=========>                                         ]  7.355MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [=========>                                         ]  7.764MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [==========>                                        ]  8.174MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [==========>                                        ]  8.584MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [===========>                                       ]  8.993MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [===========>                                       ]  9.403MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [============>                                      ]  9.812MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [============>                                      ]  10.22MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [=============>                                     ]  10.63MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [=============>                                     ]  11.04MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [==============>                                    ]  11.45MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [===============>                                   ]  11.86MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [===============>                                   ]  12.27MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [================>                                  ]  12.68MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [================>                                  ]  13.09MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [=================>                                 ]   13.5MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [=================>                                 ]   13.9MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [==================>                                ]  14.31MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [==================>                                ]  14.71MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [===================>                               ]  15.12MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [===================>                               ]  15.53MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [====================>                              ]  15.94MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [====================>                              ]  16.35MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [=====================>                             ]  16.76MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [=====================>                             ]  17.17MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [======================>                            ]  17.58MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [======================>                            ]  17.99MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [=======================>                           ]   18.4MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [=======================>                           ]  18.81MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [========================>                          ]  19.22MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [========================>                          ]  19.63MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [=========================>                         ]  20.04MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [=========================>                         ]  20.45MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [==========================>                        ]  20.86MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [==========================>                        ]  21.26MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [===========================>                       ]  21.67MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [===========================>                       ]  22.08MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [============================>                      ]  22.49MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [=============================>                     ]   22.9MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [=============================>                     ]  23.31MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [==============================>                    ]  23.72MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [==============================>                    ]  24.13MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [===============================>                   ]  24.54MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [===============================>                   ]  24.95MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [================================>                  ]  25.36MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [================================>                  ]  25.77MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [=================================>                 ]  26.18MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [=================================>                 ]  26.59MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [==================================>                ]  26.99MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [==================================>                ]   27.4MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [===================================>               ]  27.81MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [===================================>               ]  28.22MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [====================================>              ]  28.63MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [====================================>              ]  29.03MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [=====================================>             ]  29.44MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [=====================================>             ]  29.85MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [======================================>            ]  30.26MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [======================================>            ]  30.67MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [=======================================>           ]  31.08MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [=======================================>           ]  31.49MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [========================================>          ]   31.9MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [========================================>          ]  32.31MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [=========================================>         ]  32.72MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [=========================================>         ]  33.13MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [==========================================>        ]  33.54MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [===========================================>       ]  33.95MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [===========================================>       ]  34.36MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [============================================>      ]  34.77MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [============================================>      ]  35.17MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [=============================================>     ]  35.58MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [=============================================>     ]  35.99MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [==============================================>    ]   36.4MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [==============================================>    ]  36.81MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [===============================================>   ]  37.22MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [===============================================>   ]  37.63MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [================================================>  ]  38.04MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [================================================>  ]  38.45MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [=================================================> ]  38.86MB/39.44MB[1B[1A[2K20b32fa31097: Downloading [=================================================> ]  39.27MB/39.44MB[1B[1A[2K20b32fa31097: Verifying Checksum [1B[1A[2K20b32fa31097: Download complete [1B[1A[2K20b32fa31097: Extracting [>                                                  ]    426kB/39.44MB[1B[1A[2K20b32fa31097: Extracting [===>                                               ]  2.982MB/39.44MB[1B[1A[2K20b32fa31097: Extracting [========>                                          ]  6.816MB/39.44MB[1B[1A[2K20b32fa31097: Extracting [==================>                                ]  14.48MB/39.44MB[1B[1A[2K20b32fa31097: Extracting [=====================>                             ]  17.04MB/39.44MB[1B[1A[2K20b32fa31097: Extracting [=======================>                           ]  18.32MB/39.44MB[1B[1A[2K20b32fa31097: Extracting [==============================>                    ]  24.28MB/39.44MB[1B[1A[2K20b32fa31097: Extracting [==================================>                ]  27.26MB/39.44MB[1B[1A[2K20b32fa31097: Extracting [====================================>              ]  28.54MB/39.44MB[1B[1A[2K20b32fa31097: Extracting [=====================================>             ]  29.39MB/39.44MB[1B[1A[2K20b32fa31097: Extracting [=======================================>           ]   31.1MB/39.44MB[1B[1A[2K20b32fa31097: Extracting [=========================================>         ]   32.8MB/39.44MB[1B[1A[2K20b32fa31097: Extracting [===========================================>       ]   34.5MB/39.44MB[1B[1A[2K20b32fa31097: Extracting [=============================================>     ]  35.78MB/39.44MB[1B[1A[2K20b32fa31097: Extracting [===============================================>   ]  37.49MB/39.44MB[1B[1A[2K20b32fa31097: Extracting [================================================>  ]  38.34MB/39.44MB[1B[1A[2K20b32fa31097: Extracting [==================================================>]  39.44MB/39.44MB[1B[1A[2K20b32fa31097: Pull complete [1BDigest: sha256:458e167968057d2b72cc19dc2ccf1efc6fcdcf073f70d00942d74f0dd31728b1
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
[?2004lbin  boot  dev	etc  home  lib	lib32  lib64  libx32  media  mnt  opt  proc  root  run	sbin  srv  sys	tmp  usr  var
[?2004h]0;root@7c069d48ca9d: /root@7c069d48ca9d:/# w exit  
[?2004lexit
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
[K]0;root@7c069d48ca9d: /root@7c069d48ca9d:/# [K]0;root@7c069d48ca9d: /root@7c069d48ca9d:/# ls
[?2004lbin  boot  dev	etc  home  lib	lib32  lib64  libx32  media  mnt  opt  proc  root  run	sbin  srv  sys	tmp  usr  var
[?2004h]0;root@7c069d48ca9d: /root@7c069d48ca9d:/# exit
[?2004lexit
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
]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ [K]0;devasc@labvm: ~/Docker[01;32mdevasc@labvm[00m:[01;34m~/Docker[00m$ docker rm spcontainer
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
[K[root@7dff5807dbe8 /]# [K[root@7dff5807dbe8 /]# ls
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
Reading package lists... 0%Reading package lists... 100%Reading package lists... Done
Building dependency tree... 0%Building dependency tree... 0%Building dependency tree... 50%Building dependency tree... 50%Building dependency tree       
Reading state information... 0%Reading state information... 0%Reading state information... Done
docker is already the newest version (1.5-2).
0 upgraded, 0 newly installed, 0 to remove and 578 not upgraded.
]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ whix[Kch docker
/usr/bin/docker
]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ docker [K[K[K[K[K[K[Kservice docker status
[?1h=[0;1;32m●[0m docker.service - Docker Application Container Engine[m
     Loaded: loaded (/lib/systemd/system/docker.service; disabled; vendor preset: enabled)[m
     Active: [0;1;32mactive (running)[0m since Tue 2023-01-17 05:23:26 UTC; 3h 22min ago[m
TriggeredBy: [0;1;32m●[0m docker.socket[m
       Docs: https://docs.docker.com[m
   Main PID: 59547 (dockerd)[m
      Tasks: 13[m
     Memory: 592.0M[m
     CGroup: /system.slice/docker.service[m
             └─59547 /usr/bin/dockerd -H fd:// --containerd=/run/containerd/containerd.sock[m
[K[?1l>]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ docker ps
CONTAINER ID        IMAGE                          COMMAND                  CREATED             STATUS              PORTS               NAMES
548dd3570a9e        containrrr/watchtower          "/watchtower --clean…"   3 hours ago         Up 3 hours          8080/tcp            watchtower
64b7cbcfdf19        packetstream/psclient:latest   "/bin/sh -c psrun"       3 hours ago         Up 3 hours                              psclient
]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ docker run --name me[Kt[Kycontainer -it ubantu[1Pntuuntu[C[C[C /bin [K/bad[Ksh
[?2004h]0;root@3bbafa16c40d: /root@3bbafa16c40d:/# ls
[?2004lbin  boot  dev	etc  home  lib	lib32  lib64  libx32  media  mnt  opt  proc  root  run	sbin  srv  sys	tmp  usr  var
[?2004h]0;root@3bbafa16c40d: /root@3bbafa16c40d:/# cd tmp
[?2004l[?2004h]0;root@3bbafa16c40d: /tmproot@3bbafa16c40d:/tmp# ls
[?2004l[?2004h]0;root@3bbafa16c40d: /tmproot@3bbafa16c40d:/tmp# touch spfile
[?2004l[?2004h]0;root@3bbafa16c40d: /tmproot@3bbafa16c40d:/tmp# la s
[?2004lspfile
[?2004h]0;root@3bbafa16c40d: /tmproot@3bbafa16c40d:/tmp# exit
[?2004lexit
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
[?2004h]0;root@672333bca403: /root@672333bca403:/# [K]0;root@672333bca403: /root@672333bca403:/# ls
[?2004lbin  boot  dev	etc  home  lib	lib32  lib64  libx32  media  mnt  opt  proc  root  run	sbin  srv  sys	tmp  usr  var
[?2004h]0;root@672333bca403: /root@672333bca403:/# cd tmp
[?2004l[?2004h]0;root@672333bca403: /tmproot@672333bca403:/tmp# ls
[?2004lspfile
[?2004h]0;root@672333bca403: /tmproot@672333bca403:/tmp# exit
[?2004lexit
]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ docker run -it --name spcontainer upimgimages[Kcommit mycontainer upimg[8Pdiff mycontainerrun --name mycontainer -it ubuntu /bin/bash[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[27Pdiff mycontainerrun --name mycontainer -it ubuntu /bin/bash[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[Kimages
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
[K]0;root@672333bca403: /root@672333bca403:/# [K]0;root@672333bca403: /root@672333bca403:/# ls
[?2004lbin  boot  dev	etc  home  lib	lib32  lib64  libx32  media  mnt  opt  proc  root  run	sbin  srv  sys	tmp  usr  var
[?2004h]0;root@672333bca403: /root@672333bca403:/# cd tmp
[?2004l[?2004h]0;root@672333bca403: /tmproot@672333bca403:/tmp# ls
[?2004lspfile
[?2004h]0;root@672333bca403: /tmproot@672333bca403:/tmp# vi i hello
[?2004lbash: vi: command not found
[?2004h]0;root@672333bca403: /tmproot@672333bca403:/tmp# get-apt install vi
[?2004lbash: get-apt: command not found
[?2004h]0;root@672333bca403: /tmproot@672333bca403:/tmp# get-apt install vi[1P[1P[1P[1P[1P[1P[1P[1@s[1@u[1@d[1@o [1@ [1@g[1@e[1@t[1@-[1@a[1@p[1P[1P[1P[1P[1P[1P[1@a[1@p[1@t[1@-[1@g[1@e[1@t i
[?2004lbash: sudo: command not found
[?2004h]0;root@672333bca403: /tmproot@672333bca403:/tmp# sudo apt-get install vi [1P[1P[1P[1P[1P
[?2004lReading package lists... 0%Reading package lists... 0%Reading package lists... 97%Reading package lists... Done
Building dependency tree... 0%Building dependency tree... 0%Building dependency tree... 50%Building dependency tree... 50%Building dependency tree... Done
Reading state information... 0% Reading state information... 0%Reading state information... Done
E: Unable to locate package vi
[?2004h]0;root@672333bca403: /tmproot@672333bca403:/tmp# vi hello
[?2004lbash: vi: command not found
[?2004h]0;root@672333bca403: /tmproot@672333bca403:/tmp# vi helloapt-get install vi[5@sudo apt-get install vi[5Papt-get install vim
[?2004lReading package lists... 0%Reading package lists... 0%Reading package lists... 97%Reading package lists... Done
Building dependency tree... 0%Building dependency tree... 0%Building dependency tree... 50%Building dependency tree... 50%Building dependency tree... Done
Reading state information... 0% Reading state information... 0%Reading state information... Done
E: Unable to locate package vim
[?2004h]0;root@672333bca403: /tmproot@672333bca403:/tmp# ls
[?2004lspfile
[?2004h]0;root@672333bca403: /tmproot@672333bca403:/tmp# exit
[?2004lexit
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
[K]0;root@672333bca403: /root@672333bca403:/# [K]0;root@672333bca403: /root@672333bca403:/# ls
[?2004lbin  boot  dev	etc  home  lib	lib32  lib64  libx32  media  mnt  opt  proc  root  run	sbin  srv  sys	tmp  usr  var
[?2004h]0;root@672333bca403: /root@672333bca403:/# cd    [7msudo apt-get install vim  [27msudo apt-get install vim  
[?2004lbash: sudo: command not found
[?2004h]0;root@672333bca403: /root@672333bca403:/# [Ksudo apt-get install vim   [1P[1P[1P[1P[1P
[?2004lReading package lists... 0%Reading package lists... 0%Reading package lists... 97%Reading package lists... Done
Building dependency tree... 0%Building dependency tree... 0%Building dependency tree... 50%Building dependency tree... 50%Building dependency tree... Done
Reading state information... 0% Reading state information... 0%Reading state information... Done
E: Unable to locate package vim
[?2004h]0;root@672333bca403: /root@672333bca403:/# apt-get install vim    -runtime
[?2004lReading package lists... 0%Reading package lists... 0%Reading package lists... 97%Reading package lists... Done
Building dependency tree... 0%Building dependency tree... 0%Building dependency tree... 50%Building dependency tree... 50%Building dependency tree... Done
Reading state information... 0% Reading state information... 0%Reading state information... Done
E: Unable to locate package vim-runtime
[?2004h]0;root@672333bca403: /root@672333bca403:/# [Kapt-get install vim-runtime        
[?2004lReading package lists... 0%Reading package lists... 0%Reading package lists... 97%Reading package lists... Done
Building dependency tree... 0%Building dependency tree... 0%Building dependency tree... 50%Building dependency tree... 50%Building dependency tree... Done
Reading state information... 0% Reading state information... 0%Reading state information... Done
E: Unable to locate package vim
[?2004h]0;root@672333bca403: /root@672333bca403:/# [Kapt  -get update
[?2004l0% [Working]            Get:1 http://archive.ubuntu.com/ubuntu jammy InRelease [270 kB]
0% [1 InRelease 1167 B/270 kB 0%] [Waiting for headers]                                                       Get:2 http://security.ubuntu.com/ubuntu jammy-security InRelease [110 kB]
0% [1 InRelease 14.3 kB/270 kB 5%] [2 InRelease 0 B/110 kB 0%]0% [1 InRelease 140 kB/270 kB 52%] [2 InRelease 96.0 kB/110 kB 87%]                                                                   0% [1 InRelease 166 kB/270 kB 62%]                                  Err:2 http://security.ubuntu.com/ubuntu jammy-security InRelease
  The following signatures couldn't be verified because the public key is not available: NO_PUBKEY 871920D1991BC93C
0% [1 InRelease 179 kB/270 kB 66%]                                  0% [Waiting for headers]                        Err:1 http://archive.ubuntu.com/ubuntu jammy InRelease
  The following signatures couldn't be verified because the public key is not available: NO_PUBKEY 871920D1991BC93C
0% [Waiting for headers]                        Get:3 http://archive.ubuntu.com/ubuntu jammy-updates InRelease [114 kB]
0% [3 InRelease 2625 B/114 kB 2%]                                 0% [Working]            Err:3 http://archive.ubuntu.com/ubuntu jammy-updates InRelease
  The following signatures couldn't be verified because the public key is not available: NO_PUBKEY 871920D1991BC93C
0% [Waiting for headers]                        Get:4 http://archive.ubuntu.com/ubuntu jammy-backports InRelease [99.8 kB]
0% [4 InRelease 2626 B/99.8 kB 3%]                                  0% [Working]            Err:4 http://archive.ubuntu.com/ubuntu jammy-backports InRelease
  The following signatures couldn't be verified because the public key is not available: NO_PUBKEY 871920D1991BC93C
0% [Working]            Reading package lists... 0%Reading package lists... 0%Reading package lists... 97%Reading package lists... Done
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
[?2004lReading package lists... 0%Reading package lists... 0%Reading package lists... 97%Reading package lists... Done
Building dependency tree... 0%Building dependency tree... 0%Building dependency tree... 50%Building dependency tree... 50%Building dependency tree... Done
Reading state information... 0% Reading state information... 0%Reading state information... Done
E: Unable to locate package apt-file
[?2004h]0;root@672333bca403: /root@672333bca403:/# exit
[?2004lexit
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
[?1049h[22;0;0t[>4;2m[?1h=[?2004h[1;24r[?12h[?12l[22;2t[22;1t[27m[23m[29m[m[H[2J[?25l[24;1H"Dockerfile" [New File][2;1H▽[6n[2;1H  [1;1H[>c]10;?]11;?[2;1H[94m~                                                                                                                                                                            [3;1H~                                                                                                                                                                            [4;1H~                                                                                                                                                                            [5;1H~                                                                                                                                                                            [6;1H~                                                                                                                                                                            [7;1H~                                                                                                                                                                            [8;1H~                                                                                                                                                                            [9;1H~                                                                                                                                                                            [10;1H~                                                                                                                                                                            [11;1H~                                                                                                                                                                            [12;1H~                                                                                                                                                                            [13;1H~                                                                                                                                                                            [14;1H~                                                                                                                                                                            [15;1H~                                                                                                                                                                            [16;1H~                                                                                                                                                                            [17;1H~                                                                                                                                                                            [18;1H~                                                                                                                                                                            [19;1H~                                                                                                                                                                            [20;1H~                                                                                                                                                                            [21;1H~                                                                                                                                                                            [22;1H~                                                                                                                                                                            [23;1H~                                                                                                                                                                            [m[24;156H0,0-1[9CAll[1;1H[?25hP+q436f\P+q6b75\P+q6b64\P+q6b72\P+q6b6c\P+q2332\P+q2334\P+q2569\P+q2a37\P+q6b31\[27m[23m[29m[m[H[2J[?25l[2;1H[94m~                                                                                                                                                                            [3;1H~                                                                                                                                                                            [4;1H~                                                                                                                                                                            [5;1H~                                                                                                                                                                            [6;1H~                                                                                                                                                                            [7;1H~                                                                                                                                                                            [8;1H~                                                                                                                                                                            [9;1H~                                                                                                                                                                            [10;1H~                                                                                                                                                                            [11;1H~                                                                                                                                                                            [12;1H~                                                                                                                                                                            [13;1H~                                                                                                                                                                            [14;1H~                                                                                                                                                                            [15;1H~                                                                                                                                                                            [16;1H~                                                                                                                                                                            [17;1H~                                                                                                                                                                            [18;1H~                                                                                                                                                                            [19;1H~                                                                                                                                                                            [20;1H~                                                                                                                                                                            [21;1H~                                                                                                                                                                            [22;1H~                                                                                                                                                                            [23;1H~                                                                                                                                                                            [m[24;156H0,0-1[9CAll"Dockerfile" [New File][1;1H[?25h[?25l[24;146Hi[1;1H[24;146H [1;1H[24;1H[1m-- INSERT --[m[24;14H[K[24;156H0,1[11CAll[1;1H[?25h[?25lF[24;156H1,2[1;2H[?25h[?25lR[24;158H3[1;3H[?25h[?25lO[24;158H4[1;4H[?25h[?25lM[24;158H5[1;5H[?25h[?25l[93mFROM [m[24;158H6[1;6H[?25h[?25lu[24;158H7[1;7H[?25h[?25lb[24;158H8[1;8H[?25h[?25lu[24;158H9[1;9H[?25h[?25ln[24;158H10[1;10H[?25h[?25lt[24;159H1[1;11H[?25h[?25lu[24;159H2[1;12H[?25h[?25l[2;1H[K[24;156H2,1 [2;1H[?25h[?25lR[24;158H2[2;2H[?25h[?25lU[24;158H3[2;3H[?25h[?25lN[24;158H4[2;4H[?25h[?25l[93mRUN [m[24;158H5[2;5H[?25h[?25le[24;158H6[2;6H[?25h[?25lc[24;158H7[2;7H[?25h[?25lh[24;158H8[2;8H[?25h[?25lo[24;158H9[2;9H[?25h[?25l[24;158H10[2;10H[?25h[?25l[95m"[m[24;159H1[2;11H[?25h[?25l[95m"[m[24;159H2[2;12H[?25h[?25l[24;159H1[2;11H[?25h[?25l[95mW"[m[24;159H2[2;12H[?25h[?25l[95me"[m[24;159H3[2;13H[?25h[?25l[95ml"[m[24;159H4[2;14H[?25h[?25l[95mo"[m[24;159H5[2;15H[?25h[?25l[95m"[m[2;15H[K[24;159H4[2;14H[?25h[?25l[95mc"[m[24;159H5[2;15H[?25h[?25l[95mo"[m[24;159H6[2;16H[?25h[?25l[95mm"[m[24;159H7[2;17H[?25h[?25l[95me"[m[24;159H8[2;18H[?25h[?25l[95m "[m[24;159H9[2;19H[?25h[?25l[95mt"[m[24;158H20[2;20H[?25h[?25l[95mo"[m[24;159H1[2;21H[?25h[?25l[95m "[m[24;159H2[2;22H[?25h[?25l[95md"[m[24;159H3[2;23H[?25h[?25l[95mo"[m[24;159H4[2;24H[?25h[?25l[95mc"[m[24;159H5[2;25H[?25h[?25l[95mk"[m[24;159H6[2;26H[?25h[?25l[95me"[m[24;159H7[2;27H[?25h[?25l[95mr"[m[24;159H8[2;28H[?25h[?25l[95m "[m[24;159H9[2;29H[?25h[?25l[95mb"[m[24;158H30[2;30H[?25h[?25l[95mh"[m[24;159H1[2;31H[?25h[?25l[95ma"[m[24;159H2[2;32H[?25h[?25l[95mi"[m[24;159H3[2;33H[?25h[?25l[24;159H4[2;34H[?25h[?25l>[24;159H5[2;35H[?25h[?25l[24;159H6[2;36H[?25h[?25l.[24;159H7[2;37H[?25h[?25l[2;36H[K[24;159H6[2;36H[?25h[?25l/[24;159H7[2;37H[?25h[?25lt[24;159H8[2;38H[?25h[?25lm[24;159H9[2;39H[?25h[?25lp[24;158H40[2;40H[?25h[?25l/[24;159H1[2;41H[?25h[?25lt[24;159H2[2;42H[?25h[?25le[24;159H3[2;43H[?25h[?25ls[24;159H4[2;44H[?25h[?25lt[24;159H5[2;45H[?25h[?25ld[24;159H6[2;46H[?25h[?25l[2;45H[K[24;159H5[2;45H[?25h[?25li[24;159H6[2;46H[?25h[?25l[2;45H[K[24;159H5[2;45H[?25h[?25lf[24;159H6[2;46H[?25h[?25li[24;159H7[2;47H[?25h[?25ll[24;159H8[2;48H[?25h[?25le[24;159H9[2;49H[?25h[?25l[24;159H8[2;48H[?25h[?25l[24;159H7[2;47H[?25h[?25l[24;159H6[2;46H[?25h[?25l[24;159H5[2;45H[?25h[?25l[24;159H4[2;44H[?25h[?25l[24;159H3[2;43H[?25h[?25l[24;159H2[2;42H[?25h[?25l[24;159H1[2;41H[?25h[?25l[24;159H0[2;40H[?25h[?25l[24;158H39[2;39H[?25h[?25l[24;159H8[2;38H[?25h[?25l[24;159H7[2;37H[?25h[?25l[24;159H6[2;36H[?25h[?25l[24;159H7[2;37H[?25h[?25ltmp/testfile[2;48H[K[24;159H6[2;36H[?25h[?25l.tmp/testfile[24;159H7[2;37H[?25h[?25l[24;159H6[2;36H[?25h[?25l/.tmp/testfile[24;159H7[2;37H[?25h[?25l[24;159H8[2;38H[?25h[?25l[24;159H9[2;39H[?25h[?25l[24;158H40[2;40H[?25h[?25l[24;159H1[2;41H[?25h[?25l[24;159H2[2;42H[?25h[?25l[24;159H3[2;43H[?25h[?25l[24;159H4[2;44H[?25h[?25l[24;159H5[2;45H[?25h[?25l[24;159H6[2;46H[?25h[?25l[24;159H7[2;47H[?25h[?25l[24;159H8[2;48H[?25h[?25l[24;159H9[2;49H[?25h[?25l[24;158H50[2;50H[?25h[24;1H[K[2;49H[?25l[24;146H^[[2;49H[24;146H  [2;50H[24;156H2,49[10CAll[2;49H[?25h[?25l[24;146H:[2;49H[24;146H[K[24;1H:[?2004h[?25hwq[?25l[?2004l"Dockerfile" [New] 2L, 62C written[23;2t[23;1t
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
[94m~                                                                                                                                                                            [4;1H~                                                                                                                                                                            [5;1H~                                                                                                                                                                            [6;1H~                                                                                                                                                                            [7;1H~                                                                                                                                                                            [8;1H~                                                                                                                                                                            [9;1H~                                                                                                                                                                            [10;1H~                                                                                                                                                                            [11;1H~                                                                                                                                                                            [12;1H~                                                                                                                                                                            [13;1H~                                                                                                                                                                            [14;1H~                                                                                                                                                                            [15;1H~                                                                                                                                                                            [16;1H~                                                                                                                                                                            [17;1H~                                                                                                                                                                            [18;1H~                                                                                                                                                                            [19;1H~                                                                                                                                                                            [20;1H~                                                                                                                                                                            [21;1H~                                                                                                                                                                            [22;1H~                                                                                                                                                                            [23;1H~                                                                                                                                                                            [m[24;156H2,49[10CAll"Dockerfile" 2L, 62C[2;49H[?25h[?25l[24;146H~@k[2;49H[24;146H   [2;48H[24;159H8[2;48H[?25h[?25l[24;146H~@k[2;48H[24;146H   [2;47H[24;159H7[2;47H[?25h[?25l[24;146H~@k[2;47H[24;146H   [2;46H[24;159H6[2;46H[?25h[?25l[24;146H~@k[2;46H[24;146H   [2;45H[24;159H5[2;45H[?25h[?25l[24;146H~@k[2;45H[24;146H   [2;44H[24;159H4[2;44H[?25h[?25l[24;146H~@k[2;44H[24;146H   [2;43H[24;159H3[2;43H[?25h[?25l[24;146H~@k[2;43H[24;146H   [2;42H[24;159H2[2;42H[?25h[?25l[24;146H~@k[2;42H[24;146H   [2;41H[24;159H1[2;41H[?25h[?25l[24;146H~@k[2;41H[24;146H   [2;40H[24;159H0[2;40H[?25h[?25l[24;146Hi[2;40H[24;146H [2;40H[24;1H[1m-- INSERT --[m[24;14H[K[24;156H2,40[10CAll[2;40H[?25h[?25l[24;158H39[2;39H[?25h[?25l[24;159H8[2;38H[?25h[?25ltmp/testfile[2;49H[K[24;159H7[2;37H[?25h[24;1H[K[2;36H[?25l[24;146H^[[2;36H[24;146H  [2;37H[24;156H2,36[10CAll[2;36H[?25h[?25l[24;146H:[2;36H[24;146H[K[24;1H:[?2004h[?25hwq[?25l[?2004l"Dockerfile" 2L, 61C written[23;2t[23;1t
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
[?2004h]0;root@b815064f409a: /root@b815064f409a:/# [K]0;root@b815064f409a: /root@b815064f409a:/# ls
[?2004lbin  boot  dev	etc  home  lib	lib32  lib64  libx32  media  mnt  opt  proc  root  run	sbin  srv  sys	tmp  usr  var
[?2004h]0;root@b815064f409a: /root@b815064f409a:/# cd tmp
[?2004l[?2004h]0;root@b815064f409a: /tmproot@b815064f409a:/tmp# ls
[?2004ltestfile
[?2004h]0;root@b815064f409a: /tmproot@b815064f409a:/tmp# cat testfile
[?2004lWelcome to docker bhai
[?2004h]0;root@b815064f409a: /tmproot@b815064f409a:/tmp# exit
[?2004lexit
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
[94m~                                                                                                                                                                            [4;1H~                                                                                                                                                                            [5;1H~                                                                                                                                                                            [6;1H~                                                                                                                                                                            [7;1H~                                                                                                                                                                            [8;1H~                                                                                                                                                                            [9;1H~                                                                                                                                                                            [10;1H~                                                                                                                                                                            [11;1H~                                                                                                                                                                            [12;1H~                                                                                                                                                                            [13;1H~                                                                                                                                                                            [14;1H~                                                                                                                                                                            [15;1H~                                                                                                                                                                            [16;1H~                                                                                                                                                                            [17;1H~                                                                                                                                                                            [18;1H~                                                                                                                                                                            [19;1H~                                                                                                                                                                            [20;1H~                                                                                                                                                                            [21;1H~                                                                                                                                                                            [22;1H~                                                                                                                                                                            [23;1H~                                                                                                                                                                            [m[24;156H2,36[10CAll"Dockerfile" 2L, 61C[2;36H[?25h[?25l[24;146Hi[2;36H[24;146H [2;36H[24;1H[1m-- INSERT --[m[24;14H[K[24;156H2,36[10CAll[2;36H[?25h[?25l[24;159H7[2;37H[?25h[?25l[24;159H8[2;38H[?25h[?25l[24;159H9[2;39H[?25h[?25l[24;158H40[2;40H[?25h[?25l[24;159H1[2;41H[?25h[?25l[24;159H2[2;42H[?25h[?25l[24;159H3[2;43H[?25h[?25l[24;159H4[2;44H[?25h[?25l[24;159H5[2;45H[?25h[?25l[24;159H6[2;46H[?25h[?25l[24;159H7[2;47H[?25h[?25l[24;159H8[2;48H[?25h[?25l[24;159H9[2;49H[?25h[?25l[24;156H1,12[1;12H[?25h[?25l[2;23r[2;1H[L[1;24r[24;156H[K[24;156H2,1[11CAll[2;1H[?25h[?25lW[24;158H2[2;2H[?25h[?25lO[24;158H3[2;3H[?25h[?25lr[24;158H4[2;4H[?25h[?25l[2;3H[K[24;158H3[2;3H[?25h[?25lR[24;158H4[2;4H[?25h[?25lK[24;158H5[2;5H[?25h[?25lD[24;158H6[2;6H[?25h[?25lI[24;158H7[2;7H[?25h[?25lR[24;158H8[2;8H[?25h[?25l[93mWORKDIR [m[24;158H9[2;9H[?25h[?25l/[24;158H10[2;10H[?25h[?25lt[24;159H1[2;11H[?25h[?25lm[24;159H2[2;12H[?25h[?25lp[24;159H3[2;13H[?25h[?25l[3;23r[3;1H[L[1;24r[24;156H[K[24;156H3,1[11CAll[3;1H[?25h[?25l[2;23r[23;1H
[1;24r[2;1H[93mWORKDIR [m/tmp[23;1H[94m~                                                                                                                                                                            [m[24;156H[K[24;156H2,13[10CAll[2;13H[?25h[?25l[24;156H3[3;13H[?25h[?25l[24;159H4[3;14H[?25h[?25l[24;159H5[3;15H[?25h[?25l[24;159H6[3;16H[?25h[?25l[24;159H7[3;17H[?25h[?25l[24;159H8[3;18H[?25h[?25l[24;159H9[3;19H[?25h[?25l[24;158H20[3;20H[?25h[?25l[24;159H1[3;21H[?25h[?25l[24;159H2[3;22H[?25h[?25l[24;159H3[3;23H[?25h[?25l[24;159H4[3;24H[?25h[?25l[24;159H5[3;25H[?25h[?25l[24;159H6[3;26H[?25h[?25l[24;159H7[3;27H[?25h[?25l[24;159H8[3;28H[?25h[?25l[24;159H9[3;29H[?25h[?25l[24;158H30[3;30H[?25h[?25l[24;159H1[3;31H[?25h[?25l[24;159H2[3;32H[?25h[?25l[24;159H3[3;33H[?25h[?25l[24;159H4[3;34H[?25h[?25l[24;159H5[3;35H[?25h[?25l[24;159H4[3;34H[?25h[?25l[24;159H3[3;33H[?25h[?25l[24;159H2[3;32H[?25h[?25l[24;159H1[3;31H[?25h[?25l[24;159H0[3;30H[?25h[?25l[24;158H29[3;29H[?25h[?25l[24;159H8[3;28H[?25h[?25l[24;159H7[3;27H[?25h[?25l[24;159H6[3;26H[?25h[?25l[24;159H5[3;25H[?25h[?25l[24;159H4[3;24H[?25h[?25l[24;159H3[3;23H[?25h[?25l[24;159H2[3;22H[?25h[?25l[24;159H1[3;21H[?25h[?25l[24;159H0[3;20H[?25h[?25l[24;158H19[3;19H[?25h[?25l[24;159H8[3;18H[?25h[?25l[24;159H7[3;17H[?25h[?25l[24;159H6[3;16H[?25h[?25l[24;159H5[3;15H[?25h[?25l[24;159H4[3;14H[?25h[?25l[24;159H3[3;13H[?25h[?25l[24;159H2[3;12H[?25h[?25l[24;159H1[3;11H[?25h[?25l[24;159H0[3;10H[?25h[?25l[24;159H1[3;11H[?25h[?25l[95m Welcome to docker bhai"[m> /tmp/testfile[24;159H2[3;12H[?25h[?25l[95mWelcome to docker bhai"[m> /tmp/testfile[3;49H[K[24;159H1[3;11H[?25h[?25l[95myWelcome to docker bhai"[m> /tmp/testfile[24;159H2[3;12H[?25h[?25l[95meWelcome to docker bhai"[m> /tmp/testfile[24;159H3[3;13H[?25h[?25l[95mhWelcome to docker bhai"[m> /tmp/testfile[24;159H4[3;14H[?25h[?25l[95m Welcome to docker bhai"[m> /tmp/testfile[24;159H5[3;15H[?25h[?25l[95mdWelcome to docker bhai"[m> /tmp/testfile[24;159H6[3;16H[?25h[?25l[95moWelcome to docker bhai"[m> /tmp/testfile[24;159H7[3;17H[?25h[?25l[95mcWelcome to docker bhai"[m> /tmp/testfile[24;159H8[3;18H[?25h[?25l[95mkWelcome to docker bhai"[m> /tmp/testfile[24;159H9[3;19H[?25h[?25l[95meWelcome to docker bhai"[m> /tmp/testfile[24;158H20[3;20H[?25h[?25l[95mrWelcome to docker bhai"[m> /tmp/testfile[24;159H1[3;21H[?25h[?25l[95m Welcome to docker bhai"[m> /tmp/testfile[24;159H2[3;22H[?25h[?25l[95mnWelcome to docker bhai"[m> /tmp/testfile[24;159H3[3;23H[?25h[?25l[95maWelcome to docker bhai"[m> /tmp/testfile[24;159H4[3;24H[?25h[?25l[95mhWelcome to docker bhai"[m> /tmp/testfile[24;159H5[3;25H[?25h[?25l[95miWelcome to docker bhai"[m> /tmp/testfile[24;159H6[3;26H[?25h[?25l[95m Welcome to docker bhai"[m> /tmp/testfile[24;159H7[3;27H[?25h[?25l[95mhWelcome to docker bhai"[m> /tmp/testfile[24;159H8[3;28H[?25h[?25l[95maWelcome to docker bhai"[m> /tmp/testfile[24;159H9[3;29H[?25h[?25l[95miWelcome to docker bhai"[m> /tmp/testfile[24;158H30[3;30H[?25h[?25l[95m Welcome to docker bhai"[m> /tmp/testfile[24;159H1[3;31H[?25h[?25l[95mbWelcome to docker bhai"[m> /tmp/testfile[24;159H2[3;32H[?25h[?25l[95mhWelcome to docker bhai"[m> /tmp/testfile[24;159H3[3;33H[?25h[?25l[95miWelcome to docker bhai"[m> /tmp/testfile[24;159H4[3;34H[?25h[?25l[95maWelcome to docker bhai"[m> /tmp/testfile[24;159H5[3;35H[?25h[?25l[95m=Welcome to docker bhai"[m> /tmp/testfile[24;159H6[3;36H[?25h[?25l[95mWelcome to docker bhai"[m> /tmp/testfile[3;73H[K[24;159H5[3;35H[?25h[?25l[95mWelcome to docker bhai"[m> /tmp/testfile[3;72H[K[24;159H4[3;34H[?25h[?25l[95mWelcome to docker bhai"[m> /tmp/testfile[3;71H[K[24;159H3[3;33H[?25h[?25l[95mWelcome to docker bhai"[m> /tmp/testfile[3;70H[K[24;159H2[3;32H[?25h[?25l[95mWelcome to docker bhai"[m> /tmp/testfile[3;69H[K[24;159H1[3;31H[?25h[?25l[95mWelcome to docker bhai"[m> /tmp/testfile[3;68H[K[24;159H0[3;30H[?25h[?25l[95m.Welcome to docker bhai"[m> /tmp/testfile[24;159H1[3;31H[?25h[?25l[24;159H2[3;32H[?25h[?25l[24;159H3[3;33H[?25h[?25l[24;159H4[3;34H[?25h[?25l[24;159H5[3;35H[?25h[?25l[24;159H6[3;36H[?25h[?25l[24;159H7[3;37H[?25h[?25l[24;159H8[3;38H[?25h[?25l[24;159H9[3;39H[?25h[?25l[24;158H40[3;40H[?25h[?25l[24;159H1[3;41H[?25h[?25l[24;159H2[3;42H[?25h[?25l[24;159H3[3;43H[?25h[?25l[24;159H4[3;44H[?25h[?25l[24;159H5[3;45H[?25h[?25l[24;159H6[3;46H[?25h[?25l[24;159H7[3;47H[?25h[?25l[24;159H8[3;48H[?25h[?25l[24;159H9[3;49H[?25h[?25l[24;158H50[3;50H[?25h[?25l[24;159H1[3;51H[?25h[?25l[24;159H2[3;52H[?25h[?25l[24;159H3[3;53H[?25h[?25l[24;159H4[3;54H[?25h[?25l[24;159H5[3;55H[?25h[?25l[24;159H6[3;56H[?25h[?25l[24;159H7[3;57H[?25h[?25l[24;159H8[3;58H[?25h[?25l[24;159H9[3;59H[?25h[?25l[24;158H60[3;60H[?25h[?25l[24;159H1[3;61H[?25h[?25l[24;159H2[3;62H[?25h[?25l[24;159H3[3;63H[?25h[?25l[24;159H4[3;64H[?25h[?25l[24;159H5[3;65H[?25h[?25l[24;159H6[3;66H[?25h[?25l[24;159H7[3;67H[?25h[?25l[24;159H8[3;68H[?25h[?25l[24;159H9[3;69H[?25h[?25l[4;1H[K[24;156H4,1 [4;1H[?25h[?25lE[24;158H2[4;2H[?25h[?25lN[24;158H3[4;3H[?25h[?25lV[24;158H4[4;4H[?25h[?25l[93mENV [m[24;158H5[4;5H[?25h[?25lm[24;158H6[4;6H[?25h[?25ly[24;158H7[4;7H[?25h[?25ln[24;158H8[4;8H[?25h[?25la[24;158H9[4;9H[?25h[?25lm[24;158H10[4;10H[?25h[?25le[24;159H1[4;11H[?25h[?25l[24;159H2[4;12H[?25h[?25ls[24;159H3[4;13H[?25h[?25la[24;159H4[4;14H[?25h[?25lj[24;159H5[4;15H[?25h[?25lo[24;159H6[4;16H[?25h[?25ly[24;159H7[4;17H[?25h[?25l[5;1H[K[24;156H5,1 [5;1H[?25h[?25lC[24;158H2[5;2H[?25h[?25lO[24;158H3[5;3H[?25h[?25lP[24;158H4[5;4H[?25h[?25lY[24;158H5[5;5H[?25h[?25l[93mCOPY [m[24;158H6[5;6H[?25h[?25lt[24;158H7[5;7H[?25h[?25le[24;158H8[5;8H[?25h[?25ls[24;158H9[5;9H[?25h[?25lt[24;158H10[5;10H[?25h[?25lf[24;159H1[5;11H[?25h[?25li[24;159H2[5;12H[?25h[?25ll[24;159H3[5;13H[?25h[?25le[24;159H4[5;14H[?25h[?25l1[24;159H5[5;15H[?25h[?25l[24;159H6[5;16H[?25h[?25l/[24;159H7[5;17H[?25h[?25lt[24;159H8[5;18H[?25h[?25lm[24;159H9[5;19H[?25h[?25lp[24;158H20[5;20H[?25h[?25l[6;1H[K[24;156H6,1 [6;1H[?25h[?25lA[24;158H2[6;2H[?25h[?25lD[24;158H3[6;3H[?25h[?25lD[24;158H4[6;4H[?25h[?25l[93mADD [m[24;158H5[6;5H[?25h[?25lt[24;158H6[6;6H[?25h[?25ls[24;158H7[6;7H[?25h[?25lr[24;158H8[6;8H[?25h[?25l[6;7H[K[24;158H7[6;7H[?25h[?25le[24;158H8[6;8H[?25h[?25l[6;7H[K[24;158H7[6;7H[?25h[?25l[6;6H[K[24;158H6[6;6H[?25h[?25le[24;158H7[6;7H[?25h[?25ls[24;158H8[6;8H[?25h[?25lt[24;158H9[6;9H[?25h[?25l,[24;158H10[6;10H[?25h[?25l[6;9H[K[24;158H9 [6;9H[?25h[?25l.[24;158H10[6;10H[?25h[?25lt[24;159H1[6;11H[?25h[?25la[24;159H2[6;12H[?25h[?25lr[24;159H3[6;13H[?25h[?25l.[24;159H4[6;14H[?25h[?25lg[24;159H5[6;15H[?25h[?25lz[24;159H6[6;16H[?25h[?25l[24;159H7[6;17H[?25h[?25l/[24;159H8[6;18H[?25h[?25lt[24;159H9[6;19H[?25h[?25lm[24;158H20[6;20H[?25h[?25lp[24;159H1[6;21H[?25h[?25l[7;1H[K[24;156H7,1 [7;1H[?25h[24;1H[K[7;1H[?25l[24;146H^[[7;1H[24;146H  [7;1H[24;156H7,0-1[9CAll[7;1H[?25h[?25l[24;146H:[7;1H[24;146H[K[24;1H:[?2004h[?25hwq[?25l[?2004l"Dockerfile" 7L, 153C written[23;2t[23;1t
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
[?2004h]0;root@103c0fdb0c8d: /tmproot@103c0fdb0c8d:/tmp# [K]0;root@103c0fdb0c8d: /tmproot@103c0fdb0c8d:/tmp# ls
[?2004ltest  testfile	testfile1
[?2004h]0;root@103c0fdb0c8d: /tmproot@103c0fdb0c8d:/tmp# cat testfile
[?2004lyeh docker nahi hai.Welcome to docker bhai
[?2004h]0;root@103c0fdb0c8d: /tmproot@103c0fdb0c8d:/tmp# echo $myname
[?2004lsajoy
[?2004h]0;root@103c0fdb0c8d: /tmproot@103c0fdb0c8d:/tmp# exit
[?2004lexit
]0;devasc@labvm: ~/dockerdur1[01;32mdevasc@labvm[00m:[01;34m~/dockerdur1[00m$ exit
exit

Script done on 2023-01-17 10:02:20+00:00 [COMMAND_EXIT_CODE="0"]
