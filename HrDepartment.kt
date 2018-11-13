package day2d
import java.util.Date
import java.util.Arrays
class HrDepartment:Department {
  var upcomingDrive:Date
  var noOfnewJoinees:Int = 0
  fun showDetails() {
    println(" upcoming Driver :" + upcomingDrive + "\n No of new joiness:" + noOfnewJoinees)
  }
  constructor(upcomingDrive:Date, noOfnewJoinees:Int) : super() {
    this.upcomingDrive = upcomingDrive
    this.noOfnewJoinees = noOfnewJoinees
  }
  constructor(name:String, id:Int, Hod:String, doj:Date, noj:Int) : super(name, id, Hod) {
    this.upcomingDrive = doj
    this.noOfnewJoinees = noj
  }
  constructor(name:String, id:Int, Hod:String, e:Array<Employee>, doj:Date, noj:Int) : super(name, id, Hod, e) {
    this.upcomingDrive = doj
    this.noOfnewJoinees = noj
  }
	
	
	  /*public override fun toString():String {
    return ("Department [deptName=" + deptName + ", deptID=" + deptID + ", HOD=" + hod + ", emp="
            + Arrays.toString(emp) + "]")
		*/  
		  
  override fun toString():String {
    return  ("HrDepartment [upcomingDrive=" + upcomingDrive + ", noOfnewJoinees=" + noOfnewJoinees + ", deptName="
            + deptName + "  getEmp()=" + Arrays.toString(emp) + ", getDeptName()=" + deptName
            + ", DeptID=" + deptID + ", HOD" + hod+
             "]")
  }
}