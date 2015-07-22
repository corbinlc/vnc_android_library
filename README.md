# vnc_android_library
VNC Client for Android

This library is based entirely on bVNC by iiordanov.

# Using

Its a faily easy process to get to work using this library in eclipse (because that's the format it is provided in).
To get started simply follow the instructons below.
Any variable in $UPPERCASE and starting with a dollar sign ($) should be replaced with sensible paths.

Note: These instructions assume you are working in a linux environment, and already have all the nessesary android-sdk and eclipse plugins downloaded.
Make sure you have installed/updated the sqlitegen plugin v0.1.19 into Eclipse from:
https://github.com/iiordanov/sqlitegen-secure/releases/download/v0.1.19/sqlitegen_eclipse_site_0.1.19.jar

Note: Using an older version of the plugin may not work because of the switch to the sqlcipher release of sqlite.

Instructions for building eclipse workspace and importing projects:

1. Make an eclipse workspace and import the library into it:
git clone https://github.com/drelleum/vnc_android_library

2. Start Eclipse

3. Import the github repository projects using:
   File->import
   Android->Existing Android Code into Workspace
   Select the github repository as the root
   Make sure all four projects are present and checked for import: LaunchExample, bVNC, ZoomerWithKeys, and PubkeyGenerator
   Click Finish to import the projects

4. Import the android support libraries:
   File->import
   Android->Existing Android Code into Workspace
   Browse to the location of your Android SDK, selecting the support folder under $SDK/extras/android/support as the root
   Deselect all the projects except v7/appcompat
   Check the box labeled "copy porject to workspace"
   Click Finish to import the support library

5. You Eclipse workspace now contains the bVNC android library.
   You can either run the provibed launcher to see how the library works, or you can remove the launcher and use the library in your own project.


