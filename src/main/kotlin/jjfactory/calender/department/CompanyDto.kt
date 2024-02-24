package jjfactory.calender.department

import java.time.LocalDateTime

class CompanyDto {
    data class CreateRequest(
        val name: String,
        val leaderName: String,
        val businessNumber: String,
        val establishmentAt: LocalDateTime
    ){
        fun toEntity(): Company{
            return Company(
                name = name,
                leaderName = leaderName,
                businessNumber = businessNumber,
                establishmentAt = establishmentAt
            )
        }
    }


    data class Response(
        val company: Company
    ){
        val name: String = company.name
        val leaderName = company.leaderName
        val businessNumber = company.businessNumber
        val establishmentAt = company.establishmentAt
    }

}