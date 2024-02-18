package jjfactory.calender.department

import jakarta.persistence.*

@Table(name = "department")
@Entity
class Department(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    val departmentId: Long,
    val name: String,
) {

}