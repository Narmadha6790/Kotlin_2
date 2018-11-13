package day2d


import java.util.Arrays

open class Department:IDepartmentProcess {
  var deptName:String=""
  var deptID:Int = 0
  var hod:String=""
  var emp=emptyArray<Employee>()
		  
  constructor() : super() {
    // TODO Auto-generated constructor stub
  }
  constructor(deptName:String, deptID:Int, hOD:String) : this() {
    this.deptName = deptName
    this.deptID = deptID
    hod = hOD
  }
  constructor(deptName:String, deptID:Int, hOD:String, e:Array<Employee>) : this() {
    this.deptName = deptName
    this.deptID = deptID
    this.emp = e
    hod = hOD
  }

  public override fun toString():String {
    return ("Department [deptName=" + deptName + ", deptID=" + deptID + ", HOD=" + hod + ", emp="
            + Arrays.toString(emp) + "]")
  }
 override fun addSalary(eid:Int, amount:Int):Boolean {
    var sucessFlag = false
    for (i in emp.indices)
    {
		if(emp[i].getId()==eid)
			{
        emp[i].setSalary(emp[i].getSalary() + amount)
        sucessFlag = true
      }
    }
    return sucessFlag
  }
 override fun deductSalary(eid:Int, amount:Int):Boolean {
    var sucessFlag = false
    for (i in emp.indices)
    {
      if (eid == emp[i].getId())
      {
        emp[i].setSalary(emp[i].getSalary() - amount)
      }
      sucessFlag = true
    }
    return sucessFlag
  }
}