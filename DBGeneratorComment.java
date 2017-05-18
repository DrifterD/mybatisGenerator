

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.internal.DefaultCommentGenerator;

public class DBGeneratorComment  extends DefaultCommentGenerator {

	public DBGeneratorComment(){
		super();
	}
	
	@Override
	public void addFieldComment(Field field, IntrospectedTable introspectedTable,
			IntrospectedColumn introspectedColumn) {
		
		 if (introspectedColumn.getRemarks() != null && !introspectedColumn.getRemarks().equals("")) {
		        field.addJavaDocLine("/**");
		        field.addJavaDocLine(" * " + introspectedColumn.getRemarks());
		        System.out.println("comment: "+introspectedColumn.getRemarks());
		        addJavadocTag(field, false);
		        field.addJavaDocLine(" */");
		    }
	}
	
}
