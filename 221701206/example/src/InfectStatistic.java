import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.nio.file.*;

/**
 * InfectStatistic
 * TODO
  *  ����ͳ��
 * @author 221701206_�ǾŰ�
 * @version 1.0
 * @since 2020.2.8
 */
class InfectStatistic {
	public static String LogLocation = "D:\\Java\\InfectStatistic-main\\example\\log";
	// LogLoction���������ڱ���Ӧ�ó�������ã������в��Խ���ע�͸�ֵ
    public static void main(String[] args) 
    {
    	DataCompareTool.getFileName("");
        System.out.println("helloworld");
    }
}


/**
 * DataCompareTool
 * TODO
 * @description ���ڹ�����
 * @author 221701206_�ǾŰ�
 * @version 1.0
 * @since 2020.2.10
 */
class DataCompareTool
{
	public static List<String> getFileName(String date)
	{
		List<String> FileName = new ArrayList<String>();
		String[] list=new File(InfectStatistic.LogLocation).list();
		for(int i = 0; i < list.length;i++)
		System.out.println(list[i]);
		
		
		return FileName;
		
	}
}

/**
 * FileControlTool
 * TODO
 * @description �ļ���ȡ����������
 * @author 221701206_�ǾŰ�
 * @version 1.0
 * @since 2020.2.10
 */
class FileControlTool
{
	
}

/**
 * RegexTool
 * TODO
 * @description ������ʽ������
 * @author 221701206_�ǾŰ�
 * @version 1.0
 * @since 2020.2.10
 */
class RegexTool
{
	
}

/**
 * StaticTool
 * TODO
 * @description ����ͳ�ƹ�����
 * @author 221701206_�ǾŰ�
 * @version 1.0
 * @since 2020.2.10
 */
class StaticTool
{
	
}

/**
 * OutputControl
 * TODO
 * @description ���������
 * @author 221701206_�ǾŰ�
 * @version 1.0
 * @since 2020.2.10
 */
class OutputControl
{
	
}










