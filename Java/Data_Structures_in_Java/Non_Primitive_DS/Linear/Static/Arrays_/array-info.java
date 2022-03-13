package Java.Data_Structures_in_Java.Non_Primitive_DS.Linear.Static.Arrays_;

/*                                                          Array

     An array is a collection of items stored at contiguous memory locations.
     The idea is to store multiple items of the same type together. This makes it easier to calculate the position of
     each element by simply adding an offset to a base value, i.e., the memory location of the first element of the array


            Method                   Running Time

             size( )                     O(1)
             isEmpty()                   O(1)
             get(i)O(1)                  O(1)
             set(i, e)                   O(n)
             add(i, e)                   O(n)
             remove(i)



                                                                    Arrays of Objects

class Student
{
	public int roll_no;
	public String name;
	Student(int roll_no, String name)
	{
		this.roll_no = roll_no;
		this.name = name;
	}
}

                                                    Elements of the array are objects of a class Student.

          The studentArray contains seven memory spaces each of size of student class in which the address of seven
          Student objects can be stored.The Student objects have to be instantiated using the constructor of the
          Student class and their references should be assigned to the array elements in the following way.

         Student[] arr = new Student[7]; //student is a user-defined class


public class GFG
{
	public static void main (String[] args)
	{
		// declares an Array of integers.
		Student[] arr;

		// allocating memory for 5 objects of type Student.
		arr = new Student[5];

		// initialize elements of the array
		arr[0] = new Student(1,"aman");
		arr[1] = new Student(2,"vaibhav");
		arr[2] = new Student(3,"shikar");
		arr[3] = new Student(4,"dharmesh");
		arr[4] = new Student(5,"mohit");

		// accessing the elements of the specified array
		for (int i = 0; i < arr.length; i++)
			System.out.println("Element at " + i + " : " +
						arr[i].roll_no +" "+ arr[i].name);
	}
}


                                   Print the content of an array


    1.loop around an array using enhanced	for	loop?
        for (int mark : arr)	{
				System.out.println(arr);

    2.using toString method

            Arrays.toString(arr));




* */