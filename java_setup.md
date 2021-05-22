# Setup

 - JDK
   - Oracle JDK
   - Oracle OpenJDK
   - AdoptOpenJDK
   - Azul zulu
   - https://en.wikipedia.org/wiki/OpenJDK
 - Versions
   - java_versions
 - IDE
   - Eclipse
   - STS (Curated specifically for Spring development with Eclipse at base)
   - Intellij Idea
 - Maven (Optional)
   - Different versions
   - M2_HOME vs MAVEN_HOME

Note: Make sure you download the correct bit version i.e 64 bit or 32 bit version depending on the operating system that you are using.

What Next: https://docs.oracle.com/en/java/javase/15/index.html

### Intellij Idea

Download:
 - Google Intellij Idea and go to downloads link or go to https://www.jetbrains.com/idea/download/#section=windows
 - You can Ultimate edition(PAID) or Community edition(FREE)
 - Detail comparison of both is given on the site. We download Community edition 
 - You can download .zip or .exe version. 
 - If you have downloaded zip you can install it directly and will be available for you
 - If you have downloaded zip, you have to extract the same and go to bin folder and click on idea.exe or idea64.exe depending on the operating system you are using.
 - On first startup, it will give you the option to import intellij Idea settings in case you have or select "Do not import settings option"

Customization at start:
 - Select theme (Dark or light) depending on your preference
 - Customize default plugins (keep defaults for starter unless you need anything specific from start)
 - Select featured plugins

Initial Setup:
 - You will be prompted with a default screen with 3 options:
    - + new Project
    - Open or import
    - Get from version control
 - Before doing any of above steps, we do 
 - Configure -> Structure for new project -> Project settings -> Project -> SDK -> Either select if available or add new by providing the path to JDK
 - Editor -> General 
   - Autoimport
     - Tick Checkbox
     - Tick Checkbox
   - Appearance
     - Tick Checkbox "Show line numbers"