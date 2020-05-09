# public

ssh-keygen  -t ed25519 -N "" -f ~/.ssh/id_ed25519


ls -l ~/.ssh/


cat ~/.ssh/id_ed25519.pub

cat <<EOF | tee >>~/.ssh/config
Host github.com
    HostName ssh.github.com
    Port 443
    ProxyCommand connect-proxy -H 192.168.56.1:3128 %h %p

EOF

ssh git -T git@github.com

git clone git@github.com:okcoder/what-happened-to-browse-rakuten-site.git

