package jjfactory.calender.career

import jakarta.persistence.*
import jjfactory.calender.BaseEntity

@Table(name = "career")
@Entity
class Career(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    val userId: Long,

    val companyName: String,
    val departmentName: String,
): BaseEntity() {

}