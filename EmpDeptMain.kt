package day2d
import java.util.Date
fun main(args:Array<String>){
	//empId:Int, empName:String, empSalary:Double, empAge:Int
	val empObj=Employee(123,"gopi",50000.00,28)
	println(empObj.toString())
	
	  //constructor(deptName:String, deptID:Int, hOD:String)
	
	val empObjArray=arrayOf(Employee(213,"Narmadha",8900.00,28),Employee(456,"harinath",7889.00,30))
	
	val deptObj=Department("Training",1001,"Jayasree",empObjArray)
	println(deptObj.toString())
	
	 //override fun addSalary(eid:Int, amount:Int):Boolean
	
	deptObj.addSalary(213,6000)
	println(deptObj.toString())
	
	deptObj.deductSalary(456,5000)
	println(deptObj.toString())
	
	
	val newEmpObj=arrayOf(Employee(1,"Viswa",5000.00,22),Employee(2,"chandrasekar",897.00,45))
	  //constructor(name:String, id:Int, Hod:String, e:Array<Employee>, doj:Date, noj:Int) : super(name, id, Hod, e
	val hrObj=HrDepartment("Mobile app dev",1001,"Jayasree",newEmpObj,Date("09/08/2018"),20)
	println(hrObj.toString())
	
}