Preconditions:
- should to be installed Java 8;
- should to be installed Maven;
- should to be downloaded browser drivers.

Dependencies:
Browser driver need to download for current OS and put to folder /resources.
Also need to change veriable [BROWSER]_DRIVER_FILE_NAME with driver file name with extention.
By default "resources" folder include drivers for Linux. If yuo will use it don`t forget to change permitions to execude this files.

Use:
- to run all test use mvn clean -Dbrowser_name=[BROWSER NAME] test
- to run one class use mvn clean -Dtest=[TEST CLASS] -Dbrowser_name=[BROWSER NAME] test
- to run one test use mvn clean -Dtest=[TEST CLASS]#[TEST METHOD] -Dbrowser_name=[BROWSER NAME] test

