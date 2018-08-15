# WiFiAutoLogin
Provides single click login in Ruckus Managed LAN 

This is limited to Linux OS now.

<b>Prerequisite:</b>

1.Python

2.Pip

3.Selenium web driver

4.Firefox Web Browser (Ubunutu generally comes with Firefox pre-installed)  

<b>Installation of Prerequisites:</b>

Open terminal by pressing ctrl+alt+T keys combination

Type the following three commands and hit enter one by one:-

1.sudo apt-get install python

2.sudo apt-get install python-pip

3.sudo pip install selenium

Once above tools are installed, download this <a href="https://github.com/abhimanyuZ/WiFiAutoLogin/archive/master.zip">File</a>

After downloading, extract the zip file.

Open wifi.py file and search for "CS16B1001" and "your password", then replace it with your registration number and password respectively. (e.g value="CS16B1001" will become value="CS16B1002" and value="your password" will be value="Mypass")

<b>Note:</b> Don't edit any other field. Don't even add an extra space in the file.

Save and exit.

Copy wifi.sh and wifi.py file to Desktop.

Once again open terminal and enter the command "cd ~/Desktop;sudo chmod +x wifi.sh;"    (without double quotes!)

<b>Last step :</b>

visit the link and follow the answer https://askubuntu.com/a/286651   (Nautilus in the answer means your file manager)

<b>That's all!</b>

Do this whenever your are logged out of wifi:

If wifi is connected, go to desktop(shortcut: windows/super key + D) , double click wifi.sh and wait for a firefox popup.

You will be logged in to wifi in no time and with just a double click.


I hope that it will save your time and reduce the irritation :)

