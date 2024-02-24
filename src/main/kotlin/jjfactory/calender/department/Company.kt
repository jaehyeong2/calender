package jjfactory.calender.department

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import jjfactory.calender.BaseEntity
import java.time.LocalDateTime

@Table(name = "company")
@Entity
class Company(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    val name: String,
    var leaderName: String,
    var businessNumber: String,
    var establishmentAt: LocalDateTime,

): BaseEntity() {

}