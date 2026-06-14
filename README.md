# GraalVMAndQuarkus - NativeImage

This is a proof of concept (POC) using Quarkus and GraalVM to test the generation of native executable files for Windows, Linux or other operating systems. The following steps outline how to build and run the application.

1. Install MongoDB
2. Configure the details of MongoDB in properties file

    quarkus.mongodb.connection-string=mongodb://localhost:27017/
    quarkus.mongodb.database=SampleDB
    quarkus.mongodb.username=myuser
    quarkus.mongodb.password=**********
3. You can create a native executable using: mvn package -Dnative Or, if you don't have GraalVM installed, you can run the native executable build in a container using: mvn package -Dnative -Dquarkus.native.container-build=true
4. If your build fails on Window OS then you might need to install visual studio, it fulfill the requirements of 
      1. C Runtime Libraries: GraalVM native images rely on Microsoft’s runtime libraries (like msvcrt.dll) for basic C functions.
      2. System APIs: Functions for file handling, sockets, and threading are exposed via Windows DLLs such as kernel32.dll, ws2_32.dll, and user32.dll.
5. Now do the build again it will get succeeded




# Proof of Concept: Quarkus + GraalVM Native Executables

This project is a **proof of concept (POC)** using Quarkus and GraalVM to generate native executables for **Windows, Linux, and other operating systems**. Follow the steps below to build and run the application.

---

## 🚀 Setup Instructions

1. **Install MongoDB**  
   Ensure MongoDB is installed and running locally or accessible remotely.

2. **Configure MongoDB properties**  
   Add the following to your `application.properties` file:

   ```properties
   quarkus.mongodb.connection-string=mongodb://localhost:27017/
   quarkus.mongodb.database=SampleDB
   quarkus.mongodb.username=myuser
   quarkus.mongodb.password=**********
   ```

3. **Build a native executable**  
   - With GraalVM installed:  
     ```bash
     mvn package -Dnative
     ```
   - Without GraalVM (using container build):  
     ```bash
     mvn package -Dnative -Dquarkus.native.container-build=true
     ```

4. **Resolve Windows build issues**  
   If your build fails on Windows, install **Visual Studio** to provide required runtime libraries:
   - **C Runtime Libraries**: GraalVM native images rely on Microsoft’s runtime libraries (e.g., `msvcrt.dll`) for basic C functions.  
   - **System APIs**: Functions for file handling, sockets, and threading are exposed via Windows DLLs such as `kernel32.dll`, `ws2_32.dll`, and `user32.dll`.

5. **Rebuild the application**  
   After installing the dependencies, run the build again. It should succeed.

---

## ✅ Key Notes
- Use environment variables for sensitive credentials instead of hardcoding them.  
- On Linux/macOS, equivalent system libraries (`.so`, `.dylib`) are required.  
- For production, consider containerizing the native executable for portability.  

---

This version is concise, professional, and GitHub-friendly — with headings, code blocks, and bullet points for readability.  

Would you like me to also add a **Quick Start section** with commands to run the app after building (like `./target/myapp`), so new users can immediately test it?
