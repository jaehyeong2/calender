package jjfactory.calender.department

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class CompanyService(
    private val companyRepository: CompanyRepository
) {
    @Transactional(readOnly = true)
    fun getDetail(id: Long): CompanyDto.Response {
        val company = companyRepository.findByIdOrNull(id) ?: throw NotFoundException()
        return CompanyDto.Response(company)
    }

    @Transactional
    fun createOrganization(request: CompanyDto.CreateRequest): Long {
        val initCompany = request.toEntity()
        return companyRepository.save(initCompany).id!!
    }

}