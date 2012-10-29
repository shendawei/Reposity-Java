source file package : com.jar;

# 1 : javac -d . *.java						编译
# 2 : java com.jar.*						运行
# 3 : jar cvf classes.jar <source.class>			制作普通class.jar包
# 4 : jar cvf sources.jar <source.java>				制作普通source.jar包
# 5 : jar cvfm classes_exec.jar my_manifest.mf <source.class>	制作可执行class.jar包，即可执行java程序。