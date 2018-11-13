package day2d


interface IDepartmentProcess {
  fun addSalary(eid:Int, amount:Int):Boolean
  fun deductSalary(eid:Int, amount:Int):Boolean
}