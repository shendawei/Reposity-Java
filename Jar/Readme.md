source file package : com.jar;

## date : 2012/10/29

# 1 : javac -d . *.java						编译 (ps:如果含有package包名，必须指定编译目录，否则编译在current目录，然后运行就会找不到MainClass)
# 2 : java com.jar.*						运行 (ps:如果含有package包名，运行class文件，必须包含所在package包名，如left as：packagename.classFile)
# 3 : jar cvf classes.jar <source.class>			制作普通class.jar包
# 4 : jar cvf sources.jar <source.java>				制作普通source.jar包
# 5 : jar cvfm classes_exec.jar my_manifest.mf <source.class>	制作可执行class.jar包，即可执行java程序。

## date : 2012/10/31

# Append ~
# 1 : java -jar classes_exec.jar			加载并运行外部可执行*.jar包 (ps:如果jar包不在当前目录，则需要option：-classpath)
# 2 ：new finds -- cmd下的操作，在git bash下同样可以完成。(前提：两者都必须安装好jdk)