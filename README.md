# olap-dispatcher
基于presto的统一sql入口的管理工具,主要功能包括 动态catalog管理 权限管理 日志管理 数据动态脱敏等功能

##Running Dispatcher in IDEA

After opening the project in IntelliJ, double check that the Java SDK is properly configured for the project:

Open the File menu and select Project Structure
In the SDKs section, ensure that a 1.8 JDK is selected 
    
>1. Main Class: com.sczhaoqi.olap.Dispatcher
>1. VM Options: -ea -XX:+UseG1GC -XX:G1HeapRegionSize=32M -XX:+UseGCOverheadLimit -XX:+ExplicitGCInvokesConcurrent -Xmx2G -Dconfig=etc/config.properties -Dlog.levels-file=etc/log.properties
>1. Working directory: $MODULE_DIR$
>1. Use classpath of module: olap-dispatcher

The working directory should be the olap-dispatcher subdirectory. In IntelliJ, using $MODULE_DIR$ accomplishes this automatically.
