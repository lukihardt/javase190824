package sopo.cn.advancedse;

import java.util.Date;

@MyAnnotation(	color = "red", 
				value = "play", 
				arrAttr = { 1, 3, 5 }, 
				lamp = EnumTrafficLamp.GREEN, 
				annotationAttr = @MetaAnnotation("freestyle")
)
public class AnnotationTest {

	@MyAnnotation("将MyAnnotation注解标注到main方法上")
	public static void main(String[] args) throws ClassNotFoundException {
		if (AnnotationTest.class.isAnnotationPresent(MyAnnotation.class)) {
			MyAnnotation myAnnotation = AnnotationTest.class.getAnnotation(MyAnnotation.class);
			System.out.println(myAnnotation.color());
			System.out.println(myAnnotation.value());
			System.out.println(myAnnotation.arrAttr().length);
			System.out.println(myAnnotation.lamp());
			System.out.println(myAnnotation.annotationAttr().value());
			
			MetaAnnotation ma = myAnnotation.annotationAttr();
			System.out.println("==============");
			System.out.println(ma);
		}
	}

	@Deprecated
	void deprecated() {
	}

	@SuppressWarnings("deprecation")
	void demo1() {
		System.out.println(new Date().getSeconds());
	}
}
