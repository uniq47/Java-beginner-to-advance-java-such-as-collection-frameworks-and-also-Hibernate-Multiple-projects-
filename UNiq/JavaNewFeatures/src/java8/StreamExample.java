package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> stuList = new ArrayList<Student>();
		// addding student 
		stuList.add(new Student(1,"uniq", "usa", 3300));
		stuList.add(new Student(2,"aayam", "usa", 3000));
		stuList.add(new Student(3,"aadim", "usa", 2800));
		stuList.add(new Student(4,"shanti", "usa", 9000));
		stuList.add(new Student(5,"upendra", "usa", 1500));
	
//		List<Double> stuFeeList= new ArrayList<Double>();
//	
//		for(Student stu : stuList)
//		{
//			if(stu.getSfee()> 1500)
//			{
//				stuFeeList.add(stu.getSfee());
//			}
//			
//			System.out.println(stu.getSno()+ "\t"+ stu.getSname() + "\t" + stu.getSadd());
//		}
//	
//		System.out.println(stuFeeList);
//	
		
//		
//		List<Double>stuFeeList =  stuList.stream().filter(s->s.getSfee()>1500)// filter the data 
//					.map(s->s.getSfee()) // fetching student feel
//					.collect(Collectors.toList());// Collectiong as a list 
//		System.out.println(stuFeeList);
		
		
//stuList.stream().filter(s->s.getSfee()> 1500)
//				.forEach(s->System.out.println(s.getSfee()));
//
//List<Student> collect = stuList.stream().filter(s->s.getSfee()> 1500)
//								.collect(Collectors.toList());
//collect.forEach(s->System.out.print(s.getSno()+ "\t" + s.getSname() + "\t" + s.getSfee() ));

//minimum fee // max fee

//Student stu = stuList.stream().max((stu1,stu2)->stu1.getSfee()>stu2.getSfee()?1:-1).get();
//System.out.println(stu.getSfee());
//
//Student stu4 = stuList.stream().min((stu1,stu2)->stu1.getSfee()>stu2.getSfee()?1:-1).get();
//System.out.println(stu4.getSfee());
//
//	

//long count = stuList.stream().filter(s->s.getSfee()>1500).count();
//System.out.println(count);

		
		// converting student to set
		
//		Set<Double> stuFeeList = stuList.stream().filter(s->s.getSfee()>1500)//filter student information based on sfee
//						.map(s->s.getSfee())
//						.collect(Collectors.toSet());// collect it as set(Remove the dublicate selement )
//		System.out.println(stuFeeList);
//						
		
		
		 stuList.stream().filter(s->s.getSfee()>1500)//filter student information based on sfee
				.map(s->s.getSfee())
				.forEach(System.out::println);

				
	}
	

}