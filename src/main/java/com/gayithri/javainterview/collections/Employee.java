package com.gayithri.javainterview.collections;

public class Employee{
        private Long employeeId;
        private String employeeName;
        private String department;

        public Employee(Long employeeId, String employeeName, String department){
            this.employeeId = employeeId;
            this.employeeName = employeeName;
            this.department = department;
        }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId){
            this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName){
            this.employeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}