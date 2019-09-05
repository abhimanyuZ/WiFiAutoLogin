# WiFiAutoLogin
Provides single click login functionality in Ruckus Managed LAN in NIT Puducherry Campus.

<b>For Android Phones download this app <a href="https://github.com/abhimanyuZ/WiFiAutoLogin/blob/master/LazyFi.apk?raw=true">LazyFi.apk</a></b>
 
<b>Update:</b> I realized on linux based operating systems we can use the <code>curl</code> command to achieve the same thing(without installing any additional packages). So I have added two methods below. Use the one which suits you.<br><br>
<b>Method 1</b><br>
<ul>
<li>Download this script file <a href="https://github.com/abhimanyuZ/WiFiAutoLogin/blob/master/wifiLogin.sh?raw=true">WifiLogin.sh</a>. 
<li>Edit the username and password in the file.
<li>Give it execution right using <code>chmod +x script.sh</code>  in the terminal.
<li>Double click on it and it'll login for you. 
 </ul>
  
<b>Note:</b> The following method aims to encourage people for exploring browser automation techniques. There are several possible ways to automate the login process. Like using Tampermonkey/Greasemonkey to run JS when login portal opens (I prefer this for it's speed!).

<b>Method 2</b><br>
  
<b>For Ubuntu :</b>

Set up may take 15 mins and this is limited to Ubuntu(Linux OS).

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

Once above tools are installed, download this <a href="https://github.com/abhimanyuZ/WiFiAutoLogin/raw/master/WiFi.zip">File</a>

After downloading, extract the zip file.

Open wifi.py file and search for "CS16B1001" and "your password", then replace it with your registration number and password respectively. (e.g value="CS16B1001" will become value="CS16B1002" and value="your password" will be value="Mypass")

<b>Note:</b> Don't edit any other field. Don't add even an extra space in the file.

Save and exit.

Copy wifi.sh and wifi.py file to Desktop.

Once again open terminal and enter the command "cd ~/Desktop;sudo chmod +x wifi.sh;"    (without double quotes!)

<b>Last step :</b>

visit the link and follow the answer https://askubuntu.com/a/286651   (Nautilus in the answer means your file manager)

<b>That's all!</b>

Do this whenever your are logged out of wifi:

If wifi is connected, go to desktop(shortcut: windows/super key + D) , double click wifi.sh and wait for a firefox popup.

You will be logged in to wifi in no time with just a double click.


I hope that it will save your time and reduce the irritation :)

