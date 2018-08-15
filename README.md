# WiFiAutoLogin
Provides single click login in Ruckus Managed LAN 

This is limited to Linux OS now.

Prerequisite:

1.Python
2.Pip
3.Selenium web driver
4.Firefox Web Browser (Ubunutu generally comes with Firefox pre-installed)  

Installation of Prerequisites:

Open terminal by pressing ctrl+alt+T keys combination
Type the following three commands and hit enter one by one:-

1.sudo apt-get install python
2.sudo apt-get install python-pip
3.sudo pip install selenium

After downloading, extract the zip file.

Open wifi.py file and search for "your id" and "your password", then replace it with you registration number and password respectively. (e.g value="your id" will become value="CS16B1001" and value="your password" will be value="Mypass")

Save and exit.

Copy wifi.sh and wifi.py file to preferably Desktop.

Once again open terminal and enter the command "cd ~/Desktop;sudo chmod +x wifi.sh;"    (without double quotes!)

Last step :
visit the link and follow the answer https://askubuntu.com/a/286651   (Nautilus in the answer means your file manager)

That's all!

Do this whenever your are logged out of wifi:

If wifi is connected, go to desktop(shortcut: windows/super key + D) , double click wifi.sh and wait for a firefox popup.
You will be logged in to wifi in no time and with just a double click.


I hope that it will save your time and reduce the irritation :)

