source file package : com.jar;

## date : 2012/10/29

# 1 : javac -d . *.java						���� (ps:�������package����������ָ������Ŀ¼�����������currentĿ¼��Ȼ�����оͻ��Ҳ���MainClass)
# 2 : java com.jar.*						���� (ps:�������package����������class�ļ��������������package��������left as��packagename.classFile)
# 3 : jar cvf classes.jar <source.class>			������ͨclass.jar��
# 4 : jar cvf sources.jar <source.java>				������ͨsource.jar��
# 5 : jar cvfm classes_exec.jar my_manifest.mf <source.class>	������ִ��class.jar��������ִ��java����

## date : 2012/10/31

# Append ~
# 1 : java -jar classes_exec.jar			���ز������ⲿ��ִ��*.jar�� (ps:���jar�����ڵ�ǰĿ¼������Ҫoption��-classpath)
# 2 ��new finds -- cmd�µĲ�������git bash��ͬ��������ɡ�(ǰ�᣺���߶����밲װ��jdk)