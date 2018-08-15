from selenium import webdriver
import time
driver =webdriver.Firefox()

driver.get("https://scg.ruckuswireless.com:9998/SubscriberPortal/login")
driver.execute_script('document.getElementById("UE-Username").value="CS16B1001";document.getElementById("UE-Password").value="your password";document.forms["loginForm"].submit();')
time.sleep(4)
driver.quit()
