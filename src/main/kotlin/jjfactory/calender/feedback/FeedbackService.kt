package jjfactory.calender.feedback

import jjfactory.calender.user.UserRepository
import org.springframework.stereotype.Service

@Service
class FeedbackService(
    private val feedbackRepository: FeedbackRepository,
    private val userRepository: UserRepository
) {
}