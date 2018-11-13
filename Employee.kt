package day2d
public class Employee(empId:Int, empName:String, empSalary:Double, empAge:Int) {
  var empId:Int = 0
  var empName:String
  var empSalary:Double = 0.toDouble()
  var empAge:Int = 0

  init{
    this.empId = empId
    this.empName = empName
    this.empSalary = empSalary
    this.empAge = empAge
  }
	
	public fun getSalary():Double{
		return this.empSalary
	}
	
	public fun setSalary(empSalary:Double){
		this.empSalary=empSalary
	}
	
	public fun getId():Int{
		return this.empId
	}
	
	public fun setId(id:Int){
		this.empId=id
	}
	
	override public fun toString():String{
		return "Name :"+this.empName+"ID : " + this.empId+" Salary "+this.empSalary+" age" +this.empAge
	}
}

