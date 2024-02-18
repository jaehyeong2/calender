package jjfactory.calender.reveiw

import jakarta.persistence.*
import jjfactory.calender.BaseEntity

@Table(name = "review")
@Entity
class Review(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Enumerated(EnumType.STRING)
    val type: ReviewType
): BaseEntity() {


}