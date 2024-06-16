package newproject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaStreams1 {
	
		@Test
		public void regular() {
	
	ArrayList < String > employeeNames = new ArrayList < String > ();{

    /*Adding Strings to the String ArrayList object*/
		//regular method
    employeeNames.add("Metilda");
    employeeNames.add("Renee");
    employeeNames.add("Charan");
    employeeNames.add("Jeci");
    employeeNames.add("Raja");
    int Count=0;
	for(int i =0;i<employeeNames.size();i++) {
		String Actual = employeeNames.get(i);
		if(Actual.startsWith("R")) {
			Count++;
		}
	}
	System.out.println(Count);
	
	}	

}
		//with streams

		@Test
		public void StreamFilter() {
			ArrayList < String > employeeNames = new ArrayList < String > ();{

			    /*Adding Strings to the String ArrayList object*/
			    employeeNames.add("Metilda");
			    employeeNames.add("Renee");
			    employeeNames.add("Charan");
			    employeeNames.add("Jeci");
			    employeeNames.add("Raja");
			    //streams will execute the expression paralelly instead of looping one by one
			    Long c= employeeNames.stream().filter(s->s.startsWith("R")).count();
			    System.out.println(c);
			    //instead of using arraylist collection we can use stream api
			    //long d = Stream.of("renee","jude","charan").filter(s->
			    {
			    	
//			    s.startsWith("R");
//			    //}).count();
//			    System.out.println(d);
//		
//			 
			    
			    
			
		}}
			//print all the names of arraylist
			
			//employeeNames.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
			//printing single name
			//employeeNames.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		
		}		

		@Test
		//print string which has last letter as e
		//map->manupulate string
		public void StreamMap() {
			ArrayList < String > employeeNames = new ArrayList < String > ();{

			    /*Adding Strings to the String ArrayList object*/
			    employeeNames.add("Metilda");
			    employeeNames.add("Jegan");
			Stream.of("renee","jude","charan").filter(s->s.endsWith("e")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		//print names which have first letter as with a upper case and sorted
			//converting array to array list
			List<String> names = Arrays.asList("Renee","Ravi","Raja");
			names.stream().filter(s->s.startsWith("R")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
			//merging two arraylist and combining into single stream using concat method in stream
			
			Stream<String> newStream =Stream.concat(employeeNames.stream(),names.stream());
			newStream.sorted().forEach(s->System.out.println(s));
			//check wether the particular stream is there or not
			Boolean Flag = newStream.anyMatch(s->s.equalsIgnoreCase("Renee"));
		 System.out.println(Flag);
		    Assert.assertTrue(Flag);
			}
			
			
		
}
		
//			@Test
//			//create 
//			public void StreamCollect() {
//				
//				List<String> ls = Stream.of("renee","jude","charan").filter(s->s.endsWith("e")).map(s->s.toUpperCase()).collect(Collectors.toList());
//				System.out.println(ls.get(0));
//			}
		//print unique number from array
		//sort the array
//		List<Integer> values = Arrays.asList(2,5,8,5,23,10);
//		values.stream().distinct().foreach(s->System.out.println(s))
		//unique sorted order and put in new list
//		List<Integer> Li =values.stream().distinct().sorted().collect(collectors.toList());
//		System.out.println(li.get(0));
			
		
		
//			
//			
//			
//}
}

