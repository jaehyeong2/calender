package jjfactory.calender.career

import org.springframework.data.jpa.repository.JpaRepository

interface CareerRepository: JpaRepository<Career, Long> {
}