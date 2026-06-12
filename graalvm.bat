@echo off
REM Set GraalVM installation directory
set JAVA_HOME=C:\POC\graalvm\graalvm-jdk-25.0.2+10.1

REM Add GraalVM bin directory to PATH
set PATH=%JAVA_HOME%\bin;%PATH%

REM Add visual studio path
set PATH=C:\Program Files (x86)\Microsoft Visual Studio\Installer;%PATH%

REM Verify settings
echo JAVA_HOME is set to %JAVA_HOME%
echo PATH is set to 