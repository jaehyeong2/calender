package jjfactory.calender.reveiw

import jakarta.persistence.*

@Table(name = "review")
@Entity
class Review(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Enumerated(EnumType.STRING)
    val type: ReviewType
) {


}