package jjfactory.calender.feedback

import jakarta.persistence.*

@Table(name = "feedback")
@Entity
class Feedback(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    val sendUserId: Long,
    val receiveUserId: Long,

) {

}