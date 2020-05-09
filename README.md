# public

Version 1803 (OS Build 17134.706)
Microsoft Windows [Version 10.0.17134.706]
(c) 2018 Microsoft Corporation. All rights reserved.

C:\Users\IEUser>git --version
git version 2.26.2.windows.1

C:\Users\IEUser>


```
ssh-keygen  -t ed25519 -N "" -f ~/.ssh/id_ed25519
```


ls -l ~/.ssh/


```
cat ~/.ssh/id_ed25519.pub
```
```
cat <<EOF | tee >>~/.ssh/config
Host github.com
    HostName ssh.github.com
    Port 443
    ProxyCommand connect -H 192.168.56.1:3128 %h %p

EOF
```

```
ssh git -T git@github.com
```

```
IEUser@MSEDGEWIN10 MINGW64 ~/Desktop/git
$ ssh -T git@github.com
The authenticity of host '[ssh.github.com]:443 (<no hostip for proxy command>)' can't be established.
RSA key fingerprint is SHA256:nThbg6kXUpJWGl7E1IGOCspRomTxdCARLviKw6E5SY8.
Are you sure you want to continue connecting (yes/no/[fingerprint])? yes
Warning: Permanently added '[ssh.github.com]:443' (RSA) to the list of known hosts.
Hi okcoder! You've successfully authenticated, but GitHub does not provide shell access.

IEUser@MSEDGEWIN10 MINGW64 ~/Desktop/git


git clone git@github.com:okcoder/private.git

```
```
C:\Users\IEUser\Desktop>git clone git@github.com:okcoder/private.git
Cloning into 'private'...
remote: Enumerating objects: 3, done.
remote: Counting objects: 100% (3/3), done.
remote: Total 3 (delta 0), reused 0 (delta 0), pack-reused 0
Receiving objects: 100% (3/3), done.
```





  147  sudo -E apt update
  148  sudo -E apt install connect-proxy
  149  ssh -T git@github.com
  
```
  user@ubuntu:~$ ssh -T git@github.com
The authenticity of host '[ssh.github.com]:443 (<no hostip for proxy command>)' can't be established.
RSA key fingerprint is SHA256:nThbg6kXUpJWGl7E1IGOCspRomTxdCARLviKw6E5SY8.
Are you sure you want to continue connecting (yes/no)? yes
Warning: Permanently added '[ssh.github.com]:443' (RSA) to the list of known hosts.
Hi okcoder! You've successfully authenticated, but GitHub does not provide shell access.
```
    
    
```
    user@ubuntu:~$ git clone git@github.com:okcoder/private.git
Cloning into 'private'...
remote: Enumerating objects: 3, done.
remote: Counting objects: 100% (3/3), done.
Receiving objects: 100% (3/3), done.
remote: Total 3 (delta 0), reused 0 (delta 0), pack-reused 0

```
